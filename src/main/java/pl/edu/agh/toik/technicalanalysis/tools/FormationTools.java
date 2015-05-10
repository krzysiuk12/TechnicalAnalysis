package pl.edu.agh.toik.technicalanalysis.tools;

import pl.edu.agh.toik.technicalanalysis.domain.Candle;
import pl.edu.agh.toik.technicalanalysis.domain.CandleColor;
import pl.edu.agh.toik.technicalanalysis.domain.CandleType;
import static pl.edu.agh.toik.technicalanalysis.tools.CandleTools.*;

/**
 * Created by Krzysztof Kicinger on 2015-05-10.
 */
public class FormationTools {



    private static boolean isHossaReversion(Candle candle) {
        return (candle.getType() == CandleType.LONG_CORPS && candle.getColor() == CandleColor.WHITE) ||
                candle.getType() == CandleType.HAMMER;
    }

    private static boolean isBessaReversion(Candle candle) {
        return (candle.getType() == CandleType.LONG_CORPS && candle.getColor() == CandleColor.BLACK) ||
                candle.getType() == CandleType.SHOOTING_STAR;
    }

    private static boolean isEngulfingBessaPattern(Candle previousCandle, Candle nextCandle) {
        return  previousCandle.getColor() == CandleColor.WHITE && nextCandle.getColor() == CandleColor.BLACK &&
                isLowerThan(previousCandle.getClosingPrice(), nextCandle.getOpeningPrice()) &&
                isGreaterThan(previousCandle.getOpeningPrice(), nextCandle.getClosingPrice());
    }

    private static boolean isEngulfingHossaPattern(Candle previousCandle, Candle nextCandle) {
        return  previousCandle.getColor() == CandleColor.BLACK && nextCandle.getColor() == CandleColor.WHITE &&
                isLowerThan(previousCandle.getOpeningPrice(), nextCandle.getClosingPrice()) &&
                isGreaterThan(previousCandle.getClosingPrice(), nextCandle.getOpeningPrice());
    }



}
