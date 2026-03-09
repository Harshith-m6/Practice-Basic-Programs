package com.rc.programs;

public class MainRecursion {
	public static void main(String[] args) {
//		RecursionPower1 r = new RecursionPower1();
//		int val =r.power(2, 2);
//		System.out.println(val);
//		
//		RecursionSumOfArray ar = new RecursionSumOfArray();
//		int[] arr= {1,2,3,4,5};
//		int sum =ar.sum(arr);
//		System.out.println(sum);
//		
//		RecursionPrimeNo prime = new RecursionPrimeNo();
//		boolean pri =prime.prime(7);
//		System.out.println(pri?"Prime number":"Not a prime number");
//		
//		RecursionPerfectNo per = new RecursionPerfectNo();
//		boolean b =per.perfect(6);
//		System.out.println(b?"perfect":"not a perfect");
//		
//		RecursionReverseNumbers rev = new RecursionReverseNumbers();
//		int revs=rev.reverse(8900);
//		System.out.println(revs);
//		
//		RecursionReverseString1 Strev = new RecursionReverseString1();
//		String revStr =Strev.revStr("Harshith");
//		System.out.println(revStr);
//		
//		RecursionReverseStringSubString sub = new RecursionReverseStringSubString();
//		String reverse =sub.rev("Prajju");
//		System.out.println(reverse);
//		
//		RecursionCountSettedBits bits = new RecursionCountSettedBits();
//		int c =bits.countBits(10);
//		System.out.println(c);
//		
//		RecursionDecimalToBinary bin = new RecursionDecimalToBinary();
//		String binary =bin.binary(13);
//		System.out.println(binary);
//		
//		RecursionLinearSearch search = new RecursionLinearSearch();
//		int[] ar = {1,2,3,4,5,6};
//		int index = search.linearSearch(ar,2);
//		System.out.println(index);
//		
//		RecursionLinerSearch ind = new RecursionLinerSearch();
//		int[] arr = {1,2,3,4,6,7,85,4,};
//		int indexx =ind.search(arr, 85);
//		System.out.println(indexx);
//		
//		RecursionArmstrongOrNot arm = new RecursionArmstrongOrNot();
//		System.out.println(arm.checkArm(153)?"Armstrong number":"Not a Armstrong number");
		
		RecursionCountEvenDigits even = new RecursionCountEvenDigits();
		System.out.println(even.countEvenDigits(10));
		
		RecursionBinarySearch binarySearch = new RecursionBinarySearch();
		int[] arr = {1,2,3,4,5,6,7,8,9};
		System.out.println(binarySearch.binarySearch(arr,9));
		
		RecursionGCDofTwoNumbers rec = new RecursionGCDofTwoNumbers();
		System.out.println(rec.gcd(12,24));
		
		
		
		
	}
}
