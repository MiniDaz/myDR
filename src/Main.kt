fun main() {
    val birthDateGenerator = BirthDateGenerator()

    println(birthDateGenerator.generateDate())
}

class BirthDateGenerator {

    fun generateDate(): String {
        var date = ""
        repeat(10){
            when(it){
                0->for (i in 0..3){
                    if (i==2){
                        date+=i
                    }
                }
                1->for (i in 0..2){
                    if (i==1){
                        date+=i
                    }
                }
                2->for (i in 0..2){
                    if (i==0){
                        date+="."
                    }
                }
                3->for(i in 0..1){
                    if (i==0){
                        date+=i
                    }
                }
                4-> for (i in 0..5){
                    if (i==5){
                        date+=i
                    }
                }
                6-> for (i in 0..2){
                    if (i==1){
                        date+=i
                    }
                }
                7-> for(i in 0..10){
                    if(i==9){
                        date+=i
                    }
                }
                5-> date+="."
                8->for (i in 0..10){
                    if (i==9){
                        date+=i
                    }
                }
                9->for (i in 0..3){
                    if (i==2){
                        date+=i
                    }
                }


            }
        }
        return date

    }}