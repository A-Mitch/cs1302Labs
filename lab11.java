public class lab11{
// Done by Alexander Mitchell on March 30, 2017 for CSC 1302
// I turned it in later because of the fire drill and my internet was slow due to inclement weather
public static void main(String [] args) {
  int [] arr1 = {1,2,76,54,95,-1,49,8,12};
  int [] arr2 = {97,42,35,-1,89,100,6,9};
  int [] arr3 = {49,-2,10,9,6};
  selectionSort(arr1);
  System.out.println();

  System.out.println();
  bubbleSort(arr2);

  System.out.println();
  insertionSort(arr3);

}

// What am I doing here?
//
// I am starting form the end of the array then I am comparing
// that element to the first element.
// If the element at the index in j is larger than the index in i
// then the numbers will swap, if not then they will stay in their respective places.

public static void selectionSort(int[] arr) {

  for(int i = arr.length-1; i > 0; i-- ) {

      int max = i;

      for(int j = 0; j < i; j++) {
        if(arr[j]> arr[max]) {
          int temp = arr[i];
          arr[max] = arr[j];
          arr[j] = temp;
        }
      }
      System.out.print(arr[i]+ " ");
  }
  System.out.println(); // After it is sorted
  for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
  }

}

public static void bubbleSort(int[] arr) {
  int temp;

  for(int i = 0; i < arr.length;i++) {
    for(int j = 1; j < arr.length - i; j++){
      if(arr[j-1]>arr[j]) {
        temp = arr[j-1];
        arr[j-1] = arr[j];
        arr[j] = temp;
      }
    }
    System.out.print(arr[i]+ " ");
  }
  System.out.println(); //After it is sorted
  for(int i = 0; i < arr.length; i++) {
    System.out.print(arr[i] + " ");
  }

}


public static void insertionSort(int[] arr) {
int temp;

for(int i = 1; i < arr.length; i++) {
  for(int j = i; j> 0; j--) {
    if(arr[j]< arr[j-1]) {
      temp = arr[j];
      arr[j] = arr[j-1];
      arr[j-1] = temp;

    }
  }
}


for(int i = 0; i < arr.length; i++) {
  System.out.print(arr[i] + " ");
}


}








}
