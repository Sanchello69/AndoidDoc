package Observer.Standard

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}