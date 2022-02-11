package Observer.Standard

class WeatherData : Observable {
    override val observers: ArrayList<Observer> = ArrayList()

    private var temperature: Float = 0.0f
    private var humidity: Float = 0.0f
    private var pressure: Float = 0.0f

    override fun sendUpdateEvent(temperature: Float, humidity: Float, pressure: Float) {
        observers.forEach { it.update(temperature, humidity, pressure) }
    }

    fun measurementsChanged(temperature: Float, humidity: Float, pressure: Float) {
        sendUpdateEvent(temperature, humidity, pressure)
    }

    fun setMeasurements(temperature: Float, humidity: Float, pressure: Float) {
        this.temperature = temperature
        this.humidity = humidity
        this.pressure = pressure
        measurementsChanged(temperature, humidity, pressure)
    }

}