package observer.standard

class CurrentCondition(weatherData: WeatherData) : Observer {

    init {
        weatherData.add(this)
    }

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        println(toString())
    }

    override fun toString(): String {
        return "CurrentCondition(temperature=$temperature, humidity=$humidity)"
    }

}