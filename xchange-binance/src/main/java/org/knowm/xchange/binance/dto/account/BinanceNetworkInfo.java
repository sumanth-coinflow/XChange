package org.knowm.xchange.binance.dto.account;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.knowm.xchange.currency.Currency;

import java.math.BigDecimal;

public final class BinanceNetworkInfo {
    private final String addressRegex;
    private final String coin;
    private final String depositDesc;
    private final boolean depositEnable;
    private final boolean isDefault;
    private final String memoRegex;
    private final Integer minConfirm;
    private final String name;
    private final String network;
    private final boolean resetAddressStatus;
    private final String specialTips;
    private final Integer unLockConfirm;
    private final String withdrawDesc;
    private final boolean withdrawEnable;
    private final BigDecimal withdrawFee;
    private final BigDecimal withdrawIntegerMultiple;
    private final BigDecimal withdrawMax;
    private final BigDecimal withdrawMin;
    private final boolean sameAddress;
    private final BigDecimal estimatedArrivalTime;
    private final boolean busy;

    public BinanceNetworkInfo(@JsonProperty("addressRegex") String addressRegex,
                              @JsonProperty("coin") String coin,
                              @JsonProperty("depositDesc") String depositDesc,
                              @JsonProperty("depositEnable") boolean depositEnable,
                              @JsonProperty("isDefault") boolean isDefault,
                              @JsonProperty("memoRegex") String memoRegex,
                              @JsonProperty("minConfirm") Integer minConfirm,
                              @JsonProperty("name") String name,
                              @JsonProperty("network") String network,
                              @JsonProperty("resetAddressStatus") boolean resetAddressStatus,
                              @JsonProperty("specialTips") String specialTips,
                              @JsonProperty("unLockConfirm") Integer unLockConfirm,
                              @JsonProperty("withdrawDesc") String withdrawDesc,
                              @JsonProperty("withdrawEnable") boolean withdrawEnable,
                              @JsonProperty("withdrawFee") BigDecimal withdrawFee,
                              @JsonProperty("withdrawIntegerMultiple") BigDecimal withdrawIntegerMultiple,
                              @JsonProperty("withdrawMax") BigDecimal withdrawMax,
                              @JsonProperty("withdrawMin") BigDecimal withdrawMin,
                              @JsonProperty("sameAddress") boolean sameAddress,
                              @JsonProperty("estimatedArrivalTime") BigDecimal estimatedArrivalTime,
                              @JsonProperty("busy") boolean busy) {
        this.addressRegex = addressRegex;
        this.coin = coin;
        this.depositDesc = depositDesc;
        this.depositEnable = depositEnable;
        this.isDefault = isDefault;
        this.memoRegex = memoRegex;
        this.minConfirm = minConfirm;
        this.name = name;
        this.network = network;
        this.resetAddressStatus = resetAddressStatus;
        this.specialTips = specialTips;
        this.unLockConfirm = unLockConfirm;
        this.withdrawDesc = withdrawDesc;
        this.withdrawEnable = withdrawEnable;
        this.withdrawFee = withdrawFee;
        this.withdrawIntegerMultiple = withdrawIntegerMultiple;
        this.withdrawMax = withdrawMax;
        this.withdrawMin = withdrawMin;
        this.sameAddress = sameAddress;
        this.estimatedArrivalTime = estimatedArrivalTime;
        this.busy = busy;
    }

    public String getAddressRegex() {
        return addressRegex;
    }

    public Currency getCoin() {
        return Currency.getInstance(coin);
    }

    public String getDepositDesc() {
        return depositDesc;
    }

    public boolean isDepositEnable() {
        return depositEnable;
    }

    public boolean isDefault() {
        return isDefault;
    }

    public String getMemoRegex() {
        return memoRegex;
    }

    public Integer getMinConfirm() {
        return minConfirm;
    }

    public String getName() {
        return name;
    }

    public String getNetwork() {
        return network;
    }

    public boolean isResetAddressStatus() {
        return resetAddressStatus;
    }

    public String getSpecialTips() {
        return specialTips;
    }

    public Integer getUnLockConfirm() {
        return unLockConfirm;
    }

    public String getWithdrawDesc() {
        return withdrawDesc;
    }

    public boolean isWithdrawEnable() {
        return withdrawEnable;
    }

    public BigDecimal getWithdrawFee() {
        return withdrawFee;
    }

    public BigDecimal getWithdrawIntegerMultiple() {
        return withdrawIntegerMultiple;
    }

    public BigDecimal getWithdrawMax() {
        return withdrawMax;
    }

    public BigDecimal getWithdrawMin() {
        return withdrawMin;
    }

    public boolean isSameAddress() {
        return sameAddress;
    }

    public BigDecimal getEstimatedArrivalTime() {
        return estimatedArrivalTime;
    }

    public boolean isBusy() {
        return busy;
    }

    @Override
    public String toString() {
        return "BinanceNetworkInfo{" +
                "addressRegex='" + addressRegex + '\'' +
                ", coin='" + coin + '\'' +
                ", depositDesc='" + depositDesc + '\'' +
                ", depositEnable=" + depositEnable +
                ", isDefault=" + isDefault +
                ", memoRegex='" + memoRegex + '\'' +
                ", minConfirm=" + minConfirm +
                ", name='" + name + '\'' +
                ", network='" + network + '\'' +
                ", resetAddressStatus=" + resetAddressStatus +
                ", specialTips='" + specialTips + '\'' +
                ", unLockConfirm=" + unLockConfirm +
                ", withdrawDesc='" + withdrawDesc + '\'' +
                ", withdrawEnable=" + withdrawEnable +
                ", withdrawFee=" + withdrawFee +
                ", withdrawIntegerMultiple=" + withdrawIntegerMultiple +
                ", withdrawMax=" + withdrawMax +
                ", withdrawMin=" + withdrawMin +
                ", sameAddress=" + sameAddress +
                ", estimatedArrivalTime=" + estimatedArrivalTime +
                ", busy=" + busy +
                '}';
    }
}
