package org.knowm.xchange.coinmarketcap.deprecated.v2;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.knowm.xchange.BaseExchange;
import org.knowm.xchange.Exchange;
import org.knowm.xchange.ExchangeSpecification;
import org.knowm.xchange.coinmarketcap.deprecated.v2.service.CoinMarketCapMarketDataService;
import org.knowm.xchange.currency.Currency;
import org.knowm.xchange.currency.CurrencyPair;
import org.knowm.xchange.dto.meta.ExchangeMetaData;
import org.knowm.xchange.exceptions.ExchangeException;
import org.knowm.xchange.instrument.Instrument;
import org.knowm.xchange.service.account.AccountService;
import org.knowm.xchange.service.marketdata.MarketDataService;
import org.knowm.xchange.service.trade.TradeService;

/** @author allenday */
public class CoinMarketCapExchange extends BaseExchange implements Exchange {

  private CoinMarketCapMarketDataService marketDataService;
  private ExchangeSpecification exchangeSpecification;

  public CoinMarketCapExchange() {
    initServices();
  }

  @Override
  public ExchangeSpecification getDefaultExchangeSpecification() {
    final ExchangeSpecification defaultExchangeSpecification =
        new ExchangeSpecification(this.getClass());
    defaultExchangeSpecification.setSslUri("https://api.coinmarketcap.com");
    defaultExchangeSpecification.setHost("coinmarketcap.com");
    defaultExchangeSpecification.setExchangeName("CoinMarketCap");
    defaultExchangeSpecification.setExchangeDescription(
        "Cryptocurrency market cap rankings, charts, and more.");
    return defaultExchangeSpecification;
  }

  @Override
  public ExchangeSpecification getExchangeSpecification() {
    if (exchangeSpecification == null) exchangeSpecification = getDefaultExchangeSpecification();
    return exchangeSpecification;
  }

  @Override
  public void applySpecification(ExchangeSpecification exchangeSpecification) {
    this.exchangeSpecification = exchangeSpecification;
  }

  @Override
  public ExchangeMetaData getExchangeMetaData() {
    return null;
  }

  @Override
  public void remoteInit() throws IOException, ExchangeException {
    initServices();
  }

  @Override
  protected void initServices() {
    if (this.marketDataService == null) {
      this.marketDataService = new CoinMarketCapMarketDataService(this);
    }
  }

  @Override
  public TradeService getTradeService() {
    return null;
  }

  @Override
  public AccountService getAccountService() {
    return null;
  }

  @Override
  public MarketDataService getMarketDataService() {
    return marketDataService;
  }

  @Override
  public List<Instrument> getExchangeInstruments() {
    List<Currency> currencies = marketDataService.getCurrencies();

    List<Instrument> pairs = new ArrayList<>();
    for (Currency currency : currencies) {
      pairs.add(new CurrencyPair(currency, Currency.USD));
      pairs.add(new CurrencyPair(currency, Currency.BTC));
    }
    return pairs;
  }
}
