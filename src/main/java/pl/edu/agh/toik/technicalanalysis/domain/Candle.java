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

    private final BigDecimal maxPrice;
    private final BigDecimal minPrice;
    private final BigDecimal openingPrice;
    private final BigDecimal closingPrice;
    private final Date date;
    private final CandleColor color;
    private final CandleType type;

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

    public BigDecimal getMinPrice() {
        return minPrice;
    }

    public BigDecimal getOpeningPrice() {
        return openingPrice;
    }

    public BigDecimal getClosingPrice() {
        return closingPrice;
    }

    public Date getDate() {
        return date;
    }

    public CandleColor getColor() {
        return color;
    }

    public CandleType getType() {
        return type;
    }
}
