package WordGenerator;

public class WordGenerator {
    public static void main (String [] args){
//        Создаем генератор случайных слов

//        Создаем три блока строчных элементов для выбора
        String [] WordListOne = {"синий", "белый", "красный", "желтый", "черный", "коричневый", "салатовенький"};
        String [] WordListTwo = {"маленький", "подходящий", "большой", "сдавливающий", "удобный", "в самый раз", "не очень"};
        String [] WordListThree = {"кружевной", "спортивный", "топ", "модный", "легкий", "с большими чашками", "нулевой"};

//        Вычисляем сколько слов в каждом блоке(массиве)
        int OneLength = WordListOne.length;
        int TwoLength = WordListTwo.length;
        int ThreeLength = WordListThree.length;

//        Генерируем три случайных числа
        int rand1 = (int) (Math.random() * OneLength);
        int rand2 = (int) (Math.random() * TwoLength);
        int rand3 = (int) (Math.random() * ThreeLength);

//        Строим фразу
        String phrase = WordListOne[rand1] + " " + WordListTwo[rand2] + " " + WordListThree[rand3];

//        Выводим фразу на экран
        System.out.println("Тебе подойдет этот " + phrase + " лиф" );
    }
}
