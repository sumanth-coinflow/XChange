package org.knowm.xchange.kraken.dto.marketdata;

import com.fasterxml.jackson.annotation.JsonProperty;

public class KrakenAsset {

  private final String altName;
  private final String assetClass;
  private final int scale;
  private final int displayScale;
  private final String status;

  /**
   * Constructor
   *
   * @param altName
   * @param assetClass
   * @param scale
   * @param displayScale
   * @param status
   */
  public KrakenAsset(
      @JsonProperty("altname") String altName,
      @JsonProperty("aclass") String assetClass,
      @JsonProperty("decimals") int scale,
      @JsonProperty("display_decimals") int displayScale,
      @JsonProperty("status") String status ) {

    this.altName = altName;
    this.assetClass = assetClass;
    this.scale = scale;
    this.displayScale = displayScale;
    this.status = status;
  }

  public String getAltName() {

    return altName;
  }

  public String getAssetClass() {

    return assetClass;
  }

  public int getScale() {

    return scale;
  }

  public int getDisplayScale() {

    return displayScale;
  }

  public String getStatus() {

    return status;
  }
  @Override
  public String toString() {

    return "KrakenAssetInfo [altName="
        + altName
        + ", assetClass="
        + assetClass
        + ", scale="
        + scale
        + ", displayScale="
        + displayScale
        + ", status="
        + status
        + "]";
  }
}
