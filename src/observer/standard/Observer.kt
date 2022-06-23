package observer.standard

interface Observer {
    fun update(temperature: Float, humidity: Float, pressure: Float)
}