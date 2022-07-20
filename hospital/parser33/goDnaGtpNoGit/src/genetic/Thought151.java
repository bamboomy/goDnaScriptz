package genetic;
import java.util.ArrayList;
class Thought151 extends Thought{
private static ArrayList<Thought151> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 500.22676176642193;
private double fd1 = 176.93880510046858;
private Thought fo0 = null;
private Thought fo1 = null;
Thought151 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought151 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought151 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought151 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought151 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought151 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought151 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought151 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
fd0 = ad1; 
fd1 = ad2; 
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
public static Thought151 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought151 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought151 instance = new Thought151 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
void m1() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought166.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb2 = true;
    Output.points[3][3] -= fd0;
    fd1 = fd0 - fd1;
    Thought lo3 = Thought131.getInstance(fo1, fo0, fo1, fo0);
    lb0 = !lb2;
    boolean lb4 = false;
    lb4 = fb0 || fb1;
    if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        lb2 = !lb4;
        boolean lb5 = true;
        lb4 = fd0 < fd1;
        Thought lo6 = Thought149.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[3][4] -= fd0;
    Thought lo0 = Thought241.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = fd0 > fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
    Output.points[3][5] -= fd0;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    boolean lb0 = true;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
          fd1 = fo1.m3();
}
    lb0 = lb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    Thought lo3 = Thought69.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
    if (lb1) {
        } else if (lb2) {
        double ld4 = 453.9596529099882;
        fb0 = !fb1;
        lb0 = lb1 || lb2;
        boolean lb5 = false;
        boolean lb6 = false;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld4, lb1, lb2, fb0, fb1);
}
        double ld7 = 891.2869535988498;
        ld7 *= -1;
        lb5 = !lb6;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought237.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
}
    double ld1 = 370.5397779831623;
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 = fd1 - ld1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb2 && lb3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    fd1 *= -1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    boolean lb2 = true;
    lb0 = !lb1;
    lb2 = !fb0;
        fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb3 = false;
    boolean lb4 = true;
    boolean lb5 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, lb0, lb1, lb2, lb3);
}
    if (lb4) {
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb5, fb0, fb1, lb0);
}
        boolean lb6 = false;
        Thought lo7 = Thought147.getInstance(ao3, ao4, fo0, fo1, lb0, lb1, lb2, lb3);
        lb4 = lb5 && fb0;
}
Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb1, fb0, fb1);
}
    lb0 = lb1 || fb0;
    fb1 = ad4 > fd0;
    lb0 = !lb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought325.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fb0 = fb1 && lb0;
if(ao4 != null){
      lb1 = ao4.m2(ad3, ad4, fd0, fd1);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 342.9364198707504;
    ab1 = ld0 > fd0;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      ab3 = fo1.m2();
}
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought87.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    double ld0 = 28.407267344320534;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
if(ao2 != null){
      ad4 = ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    double ld2 = 514.8552797576475;
    lb1 = ad4 > fd0;
    ab1 = ab2 || ab3;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought211.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 306.5312035879334;
    boolean lb2 = true;
    if (fb0) {
        double ld3 = 149.79791134345464;
        fb1 = ld1 < fd0;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
        fd1 *= -1;
        Thought lo4 = Thought307.getInstance(fo1, fo0, fo1, fo0);
        fb1 = ld3 > ld1;
if(fo1 != null){
          lb2 = fo1.m2(fd0, fd1, ld3, ld1);
}
        Thought lo5 = Thought331.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld1);
        Output.points[3][6] -= fd0;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
        Output.points[3][7] -= fd0;
        Thought lo0 = Thought122.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = fd1 < fd0;
        double ld1 = 61.12557666898611;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought307.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m2(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        if (fb0) {
}}
Thought.STACK_COUNTER++;
return fb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    double ld0 = 593.4129050170527;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad1 = ad2 - ad3;
    Output.points[3][8] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    fb0 = ad2 > ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 < ad2;
    Thought lo1 = Thought67.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo2 = Thought2.getInstance(fd1, ld0, ad1, ad2);
    double ld3 = 945.6319169931775;
    fb0 = ad2 > ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    double ld4 = 895.2632974382758;
    boolean lb5 = false;
    ld3 *= -1;
    Thought lo6 = Thought386.getInstance();

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m1(lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb1 = ad3 < ad4;
    fd0 = fd1 + ad1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    fb1 = !lb0;
    boolean lb2 = true;
    Output.points[4][0] -= ad2;
    Thought lo3 = Thought363.getInstance(fo0, fo1, fo0, fo1);
    lb1 = lb2 || ab1;
    ab2 = !ab3;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    Thought lo4 = Thought167.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);

Thought.STACK_COUNTER++;
return lb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][1] -= fd1;
    Output.points[4][2] -= fd0;
    Output.points[4][3] += fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 958.8196538849796;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 351.9242185276128;
    Thought lo1 = Thought299.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad4 = ao3.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    Output.points[4][4] += fd1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab1 = !ab2;
    Output.points[4][5] += fd0;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab2 = fd1 < fd0;
    boolean lb2 = false;
    ab2 = fd1 > fd0;
    ab3 = !ab4;
    fb0 = !fb1;
    lb0 = lb1 && lb2;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ao3.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
    Output.points[4][6] += fd0;
    fb1 = lb0 && lb1;
    fd1 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
    Thought lo3 = Thought262.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    lb1 = lb2 && ab1;
    ab2 = !ab3;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought148.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3();
}
    ab1 = ad2 < ad3;
    double ld0 = 962.8463265389097;
    boolean lb1 = true;
    ad3 = ad4 + fd0;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao2.m2(ab4, fb0, fb1, lb1);
}
    Output.points[4][7] -= fd1;
    ld0 = ad1 - ad2;
    Thought lo2 = Thought174.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      ao1.m2(ld0, ad1, ad2, ad3, fb0, fb1, lb1, ab1);
}
    ab2 = ad4 < fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld0 = ad1 + ad2;

Thought.STACK_COUNTER++;
return lb1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return false;
} 
}
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    boolean lb1 = false;
    double ld2 = 8.452337545749954;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld2, fd0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    ld2 *= -1;
    Thought lo3 = Thought245.getInstance();
    Output.points[4][8] += fd0;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb0, fb1, lb0, lb1);
}

Thought.STACK_COUNTER++;
return ld2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 792.4981223195475;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    Thought lo1 = Thought352.getInstance(fd0, fd1, ld0, fd0);
    fb1 = ab1 || ab2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
if(fo0 != null){
      fo0.m1(fb1, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = !fb0;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 > fd0;
    boolean lb0 = true;
    fb0 = fd1 < ad1;
    boolean lb1 = false;
    ad2 = ad3 + ad4;

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad2 < ad3;
    boolean lb0 = false;
    ab1 = ad4 < fd0;
    ab2 = fd1 > ad1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    fb1 = lb0 || ab1;
    boolean lb1 = true;
    ad1 *= -1;
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    ad2 *= -1;
    boolean lb2 = false;
        Output.points[5][0] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb0, lb1, lb2, ab1);
}
    ab2 = ad2 < ad3;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, lb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}

Thought.STACK_COUNTER++;
return fd1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    boolean lb0 = false;
        lb0 = fd1 < fd0;
    fb0 = fb1 && lb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
    boolean lb1 = false;
if(fo1 != null){
      lb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    double ld2 = 423.4019697471283;
    Thought lo3 = Thought100.getInstance(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
    boolean lb4 = false;
    Thought lo5 = Thought178.getInstance(ao4, fo0, fo1, ao1);

Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
    ad3 *= -1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
    Thought lo0 = Thought44.getInstance();
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo1 = Thought373.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    double ld2 = 580.5277044986793;
    boolean lb3 = true;
    double ld4 = 775.813124913505;
    ad2 *= -1;
    lb3 = ad3 > ad4;
    fd0 = fd1 + ld2;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb3, fb0, fb1);
}
if(ao2 != null){
      lb3 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ld4, ad1, ad2, ad3);
}

Thought.STACK_COUNTER++;
return ad4;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought165.getInstance();
    Thought lo1 = Thought84.getInstance(ab2, ab3, ab4, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Output.points[5][1] -= fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
}
Thought.STACK_COUNTER++;
return fd0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought133.getInstance();
    ab1 = !ab2;
    Thought lo2 = Thought55.getInstance(ab3, ab4, fb0, fb1);
    ad2 *= -1;
    ad3 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
    ab4 = ad2 < ad3;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought1.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, lb0, ab1);
}
}
Thought.STACK_COUNTER++;
return ad2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return 0.0;
} 
}
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[5][2] -= fd0;
    boolean lb0 = false;
    lb0 = !fb0;
    fb1 = !lb0;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld2 = 4.696646954559326;
    if (fb0) {
if(fo1 != null){
          fo1.m2(fd0, fd1, ld2, fd0);
}
        fb1 = fd1 < ld2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(lb0, lb1, fb0, fb1);
}
        Thought lo3 = Thought138.getInstance(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, lb1, fb0, fb1);
        lb0 = !lb1;
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld2, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
        fd1 = ld2 - fd0;
        double ld4 = 909.181178562224;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = fd0 > fd1;
        lb0 = !lb1;
        fb0 = ld4 > ld2;
if(fo0 != null){
          fo0.m1(fd0, fd1, ld4, ld2);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld2);
}
}
Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab4 = fo1.m2(fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = !ab1;
    Thought lo0 = Thought106.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fb1 = fd0 < fd1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld1 = 258.34789667374207;
    fb0 = fb1 || ab1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    ab4 = !fb0;

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad1 = ad2 - ad3;
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    lb0 = ad4 < fd0;
    fb0 = !fb1;
    Output.points[5][3] += fd1;
    ad1 *= -1;
    lb0 = !fb0;
    boolean lb1 = true;
    Output.points[5][4] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Output.points[5][5] -= ad1;
    ad2 *= -1;
if(fo0 != null){
      fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
    ad1 = ad2 - ad3;

Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought83.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb1 = ab1 && ab2;
    Output.points[5][6] -= ad3;
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
    double ld1 = 386.3508630397381;
    ad3 = ad4 - fd0;
    Output.points[5][7] += fd1;
    ld1 *= -1;
    Output.points[5][8] += ad1;
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = ab4 || fb0;
        Thought lo2 = Thought254.getInstance(fd1, ld1, ad1, ad2, fb1, ab1, ab2, ab3);
}
Thought.STACK_COUNTER++;
return fo1;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    Thought lo0 = Thought296.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fd1 *= -1;
    double ld1 = 971.4401747005641;
    Output.points[6][0] -= ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
    Thought lo2 = Thought83.getInstance(fd0, fd1, ld1, fd0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
    fb1 = ld1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    Output.points[6][1] -= fd1;
if(fo1 != null){
      ld1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fd1 > ld1;
    boolean lb3 = false;
    fb0 = fb1 || lb3;
    boolean lb4 = false;
    Thought lo5 = Thought91.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0, lb4, fb0, fb1, lb3);
    Thought lo6 = Thought281.getInstance(fd1, ld1, fd0, fd1, lb4, fb0, fb1, lb3);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = ad1 < ad2;
    Thought lo1 = Thought4.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
    Output.points[6][2] += ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    lb0 = fb0 && fb1;
    Thought lo2 = Thought201.getInstance(ad4, fd0, fd1, ad1);
    lb0 = !fb0;
    fb1 = ad2 < ad3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Output.points[6][3] += ad3;
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    double ld4 = 219.59011392620786;
    boolean lb5 = true;
    boolean lb6 = true;
    lb0 = lb3 && lb5;
if(ao3 != null){
      ao2 = ao3.m4(lb6, fb0, fb1, lb0);
}
    lb3 = ad3 > ad4;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld4, ad1, ad2, lb5, lb6, fb0, fb1);
}
    ad3 = ad4 + fd0;
        Output.points[6][4] -= fd1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought51.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || ab1;

Thought.STACK_COUNTER++;
return ao3;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[6][5] += ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        double ld0 = 84.77576782300157;
if(fo1 != null){
          fo1.m3(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
        fd1 = ld0 - ad1;
if(fo0 != null){
          ao4 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, ld0, ad1, ad2);
}
        double ld1 = 235.078871599265;
        ad2 = ad3 - ad4;
        ab2 = fd0 > fd1;
if(fo1 != null){
          ld0 = fo1.m3();
}
        double ld2 = 528.2091592722554;
        ab3 = !ab4;
        Thought lo3 = Thought365.getInstance(fb0, fb1, ab1, ab2);
        } else {
        double ld4 = 639.1924214853985;
        ab3 = ad1 > ad2;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ld4, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        boolean lb5 = false;
        ad4 = fd0 - fd1;
if(ao3 != null){
          ld4 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb5, ab1);
}
}
Thought.STACK_COUNTER++;
return ao2;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
return null;
} 
}
void accept(String color) throws CountDownExc {
switch (color) {
case "e":
empty();
break;
case "own":
own();
break;
case "other":
other();
break;
default:
throw new RuntimeException("Illegal color!!!");
}
}
void empty() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
        fd0 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought175.getInstance(lb0, fb0, fb1, lb0);
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought213.getInstance(fb1, lb0, fb0, fb1);
    boolean lb2 = false;
    fd0 *= -1;
    double ld3 = 654.6309389375322;
    fd0 = fd1 - ld3;
    Thought lo4 = Thought54.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb0, lb2, fb0, fb1);

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    double ld1 = 836.8851134130886;
    fd0 = fd1 - ld1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;
    fb1 = lb0 && lb2;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld1;
    fd0 *= -1;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m3(fd1, ld1, fd0, fd1);
}
    fb0 = !fb1;
    Output.points[6][6] -= ld1;
    lb0 = lb2 && lb3;
    fd0 = fd1 + ld1;
    fb0 = !fb1;
    lb0 = fd0 < fd1;
    lb2 = ld1 > fd0;
    boolean lb4 = false;
    double ld5 = 745.4029599562257;
    lb3 = fd0 < fd1;
    ld1 = ld5 - fd0;
    lb4 = !fb0;
    fb1 = !lb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld5, fd0, fd1);
}
    boolean lb6 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} catch (CountDownExc e) {
if(!e.surfaced()) {
e.dec();
throw e;
}
} 
}
}
