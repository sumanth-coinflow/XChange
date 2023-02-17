package org.knowm.xchange.binance.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.currency.Currency;

import java.math.BigDecimal;
import java.util.List;

public final class BinanceCoinInfo {
    public final String coin;
    public final boolean depositAllEnable;
    public final BigDecimal free;
    public final BigDecimal freeze;
    public final BigDecimal ipoable;
    public final BigDecimal ipoing;
    public final boolean isLegalMoney;
    public final BigDecimal locked;
    public final String name;
    public final BigDecimal storage;
    public final boolean trading;
    public final boolean withdrawAllEnable;
    public final BigDecimal withdrawing;
    public List<BinanceNetworkInfo> networkList;

    public BinanceCoinInfo(@JsonProperty("coin") String coin,
                           @JsonProperty("depositAllEnable") boolean depositAllEnable,
                           @JsonProperty("free") BigDecimal free,
                           @JsonProperty("freeze") BigDecimal freeze,
                           @JsonProperty("ipoable") BigDecimal ipoable,
                           @JsonProperty("ipoing") BigDecimal ipoing,
                           @JsonProperty("isLegalMoney") boolean isLegalMoney,
                           @JsonProperty("locked") BigDecimal locked,
                           @JsonProperty("name") String name,
                           @JsonProperty("storage") BigDecimal storage,
                           @JsonProperty("trading") boolean trading,
                           @JsonProperty("withdrawAllEnable") boolean withdrawAllEnable,
                           @JsonProperty("withdrawing") BigDecimal withdrawing,
                           @JsonProperty("networkList") List<BinanceNetworkInfo> networkList) {
        this.coin = coin;
        this.depositAllEnable = depositAllEnable;
        this.free = free;
        this.freeze = freeze;
        this.ipoable = ipoable;
        this.ipoing = ipoing;
        this.isLegalMoney = isLegalMoney;
        this.locked = locked;
        this.name = name;
        this.storage = storage;
        this.trading = trading;
        this.withdrawAllEnable = withdrawAllEnable;
        this.withdrawing = withdrawing;
        this.networkList = networkList;
    }

    public Currency getCoin() {
        return Currency.getInstance(coin);
    }
}
