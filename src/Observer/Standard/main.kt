package Observer.Standard

fun main() {
    val weatherData = WeatherData()
    var currentCondition = CurrentCondition(weatherData)
    var statistics = Statistics(weatherData)

    weatherData.setMeasurements(0.05F, 0.1F, 2F)
    weatherData.setMeasurements(0.1F, 0.3F, 3F)
    weatherData.remove(currentCondition)
    weatherData.setMeasurements(2.1F, 0.2F, 1F)
}