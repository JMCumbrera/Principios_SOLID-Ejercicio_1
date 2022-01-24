interface Car {
    fun accelerate()
}

open class RacingCar(private var remainingFuel: Int) : Car {
    private var power = 0
    override fun accelerate() {
        increasePower()
        decrementFuel()
    }

    protected open fun decrementFuel() {
        remainingFuel--
    }

    protected open fun increasePower() {
        power++
    }
}

open class BMWCar(private var remainingFuel: Int): Car {
    private var power = 0
    override fun accelerate() {
        increasePower()
        decrementFuel()
    }

    protected open fun decrementFuel() {
        remainingFuel--
    }

    protected open fun increasePower() {
        power++
    }
}

class Driver(car: Car) {
    val racingCar: Car = car

    fun increaseSpeed() {
        racingCar.accelerate()
    }
}

fun main() {
    val conductor1 = Driver(RacingCar(100))
    val conductor2 = Driver(BMWCar(100))
    conductor1.increaseSpeed()
    conductor2.increaseSpeed()
}