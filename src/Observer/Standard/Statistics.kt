package Observer.Standard

class Statistics(weatherData: WeatherData) : Observer {

    init {
        weatherData.add(this)
    }

    var temperature: Float = 0.0f
    var humidity: Float = 0.0f
    var pressure: Float = 0.0f

    override fun update(temperature: Float, humidity: Float, pressure: Float) { //выводим максимальные значения
        if (this.temperature < temperature) this.temperature = temperature
        if (this.humidity < humidity) this.humidity = humidity
        if (this.pressure < pressure) this.pressure = pressure
        println(toString())
    }

    override fun toString(): String {
        return "Statistics(max temperature=$temperature, max humidity=$humidity, max pressure=$pressure)"
    }


}