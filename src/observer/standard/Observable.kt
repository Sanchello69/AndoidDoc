package observer.standard

interface Observable {
    val observers: ArrayList<Observer>

    fun add(observer: Observer) { //добавить наблюдателя
        observers.add(observer)
    }

    fun remove(observer: Observer) { //удалить наблюдателя
        observers.remove(observer)
    }

    fun sendUpdateEvent(temperature: Float, humidity: Float, pressure: Float)  //оповещение наблюдателей о появлении новых данных

}