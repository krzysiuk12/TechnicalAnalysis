package pl.edu.agh.toik.technicalanalysis.service;

import pl.edu.agh.toik.technicalanalysis.chart.CandlestickChart;
import pl.edu.agh.toik.technicalanalysis.domain.Candle;
import pl.edu.agh.toik.technicalanalysis.domain.ListedCompany;
import pl.edu.agh.toik.technicalanalysis.serializer.ShareData;

import java.util.List;

/**
 * Created by Krzysztof Kicinger on 2015-05-14.
 */
public interface ITechnicalAnalysisService {

    public List<Candle> getCandles(List<ShareData> shareData);

    public CandlestickChart createCandlestickChart(ListedCompany listedCompany, List<Candle> candles);

}
