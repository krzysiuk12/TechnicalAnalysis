package pl.edu.agh.toik.technicalanalysis.domain;

import pl.edu.agh.toik.technicalanalysis.tools.CandleTools;

import java.math.BigDecimal;
import java.util.Date;

/**
 * Class represents single candle stick, based on Japanese Candlestick Charting Technique. Set of this candles form
 * financial chart used to describe price movements.
 *
 * Created by Krzysztof Kicinger on 2015-05-10.
 */
public class Candle {

    private BigDecimal maxPrice;
    private BigDecimal minPrice;
    private BigDecimal openingPrice;
    private BigDecimal closingPrice;
    private Date date;
    private CandleColor color;
    private CandleType type;

    public Candle() {
    }

    public Candle(BigDecimal maxPrice, BigDecimal minPrice, BigDecimal openingPrice, BigDecimal closingPrice, Date date) {
        this.maxPrice = maxPrice;
        this.minPrice = minPrice;
        this.openingPrice = openingPrice;
        this.closingPrice = closingPrice;
        this.date = date;
        this.color = CandleTools.getCandleColor(this);
        this.type = CandleTools.getCandleType(this);
    }

    public BigDecimal getMaxPrice() {
        return maxPrice;
    }

    public void setMaxPrice(BigDecimal maxPrice) {
        this.maxPrice = maxPrice;
    }

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public void setMinPrice(BigDecimal minPrice) {
        this.minPrice = minPrice;
    }

    public BigDecimal getOpeningPrice() {
        return openingPrice;
    }

    public void setOpeningPrice(BigDecimal openingPrice) {
        this.openingPrice = openingPrice;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public void setClosingPrice(BigDecimal closingPrice) {
        this.closingPrice = closingPrice;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public CandleColor getColor() {
        return color;
    }

    public void setColor(CandleColor color) {
        this.color = color;
    }

    public CandleType getType() {
        return type;
    }

    public void setType(CandleType type) {
        this.type = type;
    }
}
