package genetic;
import java.util.ArrayList;
class Thought252 extends Thought{
private static ArrayList<Thought252> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 782.3130783396984;
private double fd1 = 956.777379899254;
private Thought fo0 = null;
private Thought fo1 = null;
Thought252 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought252 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought252 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought252 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought252 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought252 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought252 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought252 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought252 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought252 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought252 instance = new Thought252 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[1][1] -= fd0;
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought155.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        Thought lo1 = Thought285.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb2 = true;
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
        lb2 = fb0 || fb1;
        lb2 = fd1 > fd0;
        Output.points[1][2] -= fd1;
        fd0 *= -1;
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
    Output.points[1][3] += fd1;
    fd0 = fd1 - fd0;
    ab2 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    boolean lb0 = true;
    double ld1 = 82.47863956948463;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        Output.points[1][4] -= fd0;
        Thought lo2 = Thought142.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, ab1, ab2);
        Output.points[1][5] += ld1;
        Thought lo3 = Thought14.getInstance(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
        lb0 = ab1 || ab2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ld1, fd0);
}
        boolean lb4 = false;
        fd1 = ld1 - fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
        Output.points[1][6] += ld1;
        double ld5 = 915.9856581021011;
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
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad2 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 < ad4;
        Output.points[1][7] += fd0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
        ad4 = fd0 - fd1;
        boolean lb0 = false;
        ad1 *= -1;
        Thought lo1 = Thought67.getInstance(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
        boolean lb2 = false;
        lb2 = fb0 && fb1;
        boolean lb3 = true;
        double ld4 = 245.88636796248346;
        lb0 = lb2 || lb3;
        fb0 = fd0 < fd1;
        Output.points[1][8] += ld4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, lb3);
}
        fb0 = fb1 && lb0;
        boolean lb5 = false;
        double ld6 = 745.7686546927312;
        lb2 = lb3 && lb5;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
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
if(fo0 != null){
      ab2 = fo0.m2(ad2, ad3, ad4, fd0);
}
    ab3 = fd1 > ad1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fd1 *= -1;
    boolean lb0 = true;
    ab4 = ad1 < ad2;
    double ld1 = 402.9736001170051;
    fb0 = fb1 || lb0;
    ad2 *= -1;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ld1 = ad1 - ad2;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m3();
}
    boolean lb3 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, lb1, lb2, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought239.getInstance(fd0, fd1, fd0, fd1, lb2, lb3, fb0, fb1);
    boolean lb5 = true;
    lb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb2, lb3, lb5);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    Thought lo6 = Thought296.getInstance(fd0, fd1, fd0, fd1);
        Thought lo7 = Thought188.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(lb0, lb1, lb2, lb3);
}
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
    boolean lb0 = false;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, lb0, fb0, fb1);
}
    lb0 = ad3 > ad4;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
    lb1 = !lb2;
    lb3 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, lb1, lb2, lb3);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 > ad4;
    boolean lb4 = true;
    fd0 *= -1;
    fd1 *= -1;
    fb0 = !fb1;
    boolean lb5 = false;
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[2][0] += ad2;

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
    ab1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab3 = ab4 && fb0;
if(ao4 != null){
      fd1 = ao4.m3(fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought166.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
    ab2 = fd1 < fd0;
    boolean lb1 = false;
if(ao3 != null){
      fd1 = ao3.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo2 = Thought178.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = true;
    fd1 = fd0 + fd1;

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
    Thought lo0 = Thought180.getInstance(ad1, ad2, ad3, ad4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab2 = ad3 > ad4;
if(ao1 != null){
      ao1.m2();
}
if(ao2 != null){
      ao2.m3(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ad3 *= -1;
    if (ab1) {
        ad4 = fd0 - fd1;
        ab2 = ad1 < ad2;
        ad3 = ad4 - fd0;
        fd1 = ad1 + ad2;
        double ld1 = 831.3366098823178;
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 482.79283888256003;
    lb0 = ld1 < fd0;
    fb0 = fb1 || lb0;
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        Output.points[2][1] -= ld1;
        fd0 *= -1;
        fb0 = !fb1;
        lb0 = fb0 && fb1;
        fd1 *= -1;
if(fo1 != null){
          fo1.m1(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        Thought lo2 = Thought120.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
        double ld3 = 738.3772251267809;
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab1 = ab2 || ab3;
    boolean lb1 = false;
    ab3 = fd0 < fd1;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb1, ab1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, lb1, ab1);
}
        ab2 = fd1 > fd0;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        Thought lo2 = Thought155.getInstance(fo0, fo1, fo0, fo1);
        fd0 = fd1 + fd0;
if(fo0 != null){
          fo0.m3(fd1, fd0, fd1, fd0);
}
        lb0 = lb1 && ab1;
        fd1 = fd0 + fd1;
        double ld3 = 889.7039745251637;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3);
}
        Thought lo4 = Thought70.getInstance();
}
Thought.STACK_COUNTER++;
return ab2;
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
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[2][2] -= fd1;
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    fb1 = fb0 || fb1;

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
    ad1 *= -1;
    boolean lb0 = true;
    double ld1 = 371.0231232888096;
    Thought lo2 = Thought273.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
    boolean lb3 = false;
    ab1 = fd0 < fd1;
    boolean lb4 = false;
    double ld5 = 946.4342970847499;
    ab1 = ab2 && ab3;
    if (ab4) {
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld5, ad1, ad2, ab4, fb0, fb1, lb6);
}
        lb0 = !lb3;
        ad3 = ad4 + fd0;
        Thought lo7 = Thought284.getInstance(fo0, fo1, fo0, fo1, lb4, ab1, ab2, ab3);
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
}
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
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 *= -1;
        boolean lb1 = false;
if(ao3 != null){
          lb0 = ao3.m2(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
        Output.points[2][3] += fd0;
        lb1 = fb0 || fb1;
if(ao4 != null){
          ao4.m3(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb0, lb1, fb0, fb1);
}
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        boolean lb2 = false;
        boolean lb3 = false;
        fd0 = fd1 + fd0;
        Thought lo4 = Thought237.getInstance(fd1, fd0, fd1, fd0);
        boolean lb5 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
        }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo6 = Thought101.getInstance();
    fd1 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 812.6695130558243;
    double ld1 = 597.9984641440627;
    Output.points[2][4] -= ld0;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 > ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    Output.points[2][5] += ad4;
    fd0 *= -1;
    fb0 = fd1 < ld0;
    Thought lo2 = Thought133.getInstance(ld1, ad1, ad2, ad3);
    double ld3 = 668.5693356063223;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        double ld0 = 154.1241192984049;
if(ao1 != null){
          ab1 = ao1.m2();
}
if(ao2 != null){
          ld0 = ao2.m3(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        Thought lo1 = Thought392.getInstance(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = ld0 > fd0;
        fd1 *= -1;
        ld0 *= -1;
        boolean lb2 = true;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb2, ab1);
}
        fd0 = fd1 + ld0;
        ab2 = !ab3;
        Output.points[2][6] += fd0;
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ad1 < ad2;
    boolean lb0 = false;
if(ao1 != null){
      ad3 = ao1.m3(ad4, fd0, fd1, ad1);
}
    if (ab3) {
        ad2 = ad3 + ad4;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
        boolean lb1 = false;
if(ao1 != null){
          ao1.m3();
}
        ab3 = ad4 < fd0;
        ab4 = fb0 && fb1;
        Output.points[2][7] -= fd1;
        ad1 = ad2 - ad3;
        lb1 = !lb0;
        ad4 *= -1;
if(ao2 != null){
          ab1 = ao2.m2(ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
        fb1 = !lb1;
        Output.points[2][8] -= fd1;
        lb0 = ad1 > ad2;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought30.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
    double ld2 = 212.75532864195597;
if(fo0 != null){
      fo0.m3(ld2, fd0, fd1, ld2);
}
    fb0 = !fb1;
    Thought lo3 = Thought369.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
if(fo1 != null){
      fd1 = fo1.m3();
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
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    Thought lo1 = Thought322.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
    fd1 = fd0 - fd1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][0] += fd0;
    Output.points[3][1] -= fd1;
    ab1 = fd0 > fd1;
    Thought lo2 = Thought211.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb3 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb4 = false;
if(fo1 != null){
      fo1.m3();
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    Output.points[3][2] -= fd0;
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
    Thought lo5 = Thought363.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, lb3, lb4);
    boolean lb6 = true;
    fd1 *= -1;

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
    ad2 = ad3 + ad4;
    fb1 = fd0 > fd1;
    ad1 *= -1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
    boolean lb0 = false;
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;

Thought.STACK_COUNTER++;
return ad3;
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
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        double ld2 = 849.828640728647;
        ab2 = ab3 || ab4;
        Thought lo3 = Thought15.getInstance();
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(lb1, lb0, ab1, ab2);
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = true;
    Thought lo2 = Thought172.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb0, lb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    lb0 = lb1 && lb3;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad2, ad3, ad4, fd0);
}
    Output.points[3][3] -= fd1;
    fb0 = ad1 < ad2;
        fb1 = !fb0;
    fb1 = ad3 < ad4;
    boolean lb0 = false;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought344.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    double ld2 = 507.1389104408712;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 > ld2;
    boolean lb3 = true;
    ad1 = ad2 - ad3;

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
    double ld0 = 75.5384732986797;
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = fd1 < ld0;
    fd0 = fd1 + ld0;
    Thought lo1 = Thought149.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
    ab3 = fd0 > fd1;
    boolean lb2 = false;
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1);
}
    Output.points[3][4] += ld0;
    ab4 = !fb0;
        double ld3 = 103.94809981424028;
    Thought lo4 = Thought145.getInstance(ld3, fd0, fd1, ld0);
    double ld5 = 637.5304166090283;
    fb1 = ld3 > ld5;
    if (lb2) {
        boolean lb6 = false;
        lb2 = ab1 && ab2;
        ab3 = fd0 > fd1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, ld0, ld3, ld5, fd0);
}
        Thought lo7 = Thought85.getInstance();
if(fo1 != null){
          ab4 = fo1.m2(fb0, fb1, lb6, lb2);
}
        fd1 *= -1;
        boolean lb8 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ld3, ld5, fd0, lb2, ab1, ab2, ab3);
}
        if (ab4) {
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 852.0950525827732;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    Output.points[3][5] -= ld0;
    Output.points[3][6] += ad1;
    ad2 = ad3 - ad4;
    ab1 = ab2 && ab3;
    double ld1 = 119.48856321026571;
    Output.points[3][7] += ad4;
    Output.points[3][8] -= fd0;
    ab4 = fd1 > ld0;
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    ab3 = ld1 > ad1;
    Output.points[4][0] -= ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    Output.points[4][1] -= ad3;
    boolean lb2 = false;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    double ld0 = 526.4920120711259;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 - fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought45.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 + fd0;
        Thought lo2 = Thought154.getInstance();
        fb1 = fb0 || fb1;
if(fo1 != null){
          fo1.m2(fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
        boolean lb3 = false;
        fd1 = ld0 + fd0;
        fd1 = ld0 - fd0;
        lb3 = fd1 < ld0;
        fd0 = fd1 - ld0;
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
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    if (ab2) {
        Thought lo1 = Thought76.getInstance(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
        lb0 = ab1 || ab2;
        fd0 = fd1 + fd0;
        ab3 = ab4 || fb0;
        fb1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought78.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
if(fo0 != null){
      fo0.m1();
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    double ld1 = 445.15725002787445;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;
if(fo1 != null){
      fo1.m2(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ad1 = ad2 + ad3;
    boolean lb4 = true;
if(fo0 != null){
      lb4 = fo0.m2();
}
    fb0 = fb1 && lb2;
    lb3 = lb4 && fb0;
    fb1 = !lb2;
    Thought lo5 = Thought150.getInstance(lb3, lb4, fb0, fb1);
    lb2 = ad4 < fd0;
    Output.points[4][2] += fd1;
    boolean lb6 = false;

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
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Output.points[4][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 77.17515137652639;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    double ld2 = 979.584585586389;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, ad1, ad2);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    double ld3 = 414.48178253618386;
    boolean lb4 = false;
    lb0 = !lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    Thought lo5 = Thought269.getInstance(ld2, ld3, ad1, ad2, fb0, fb1, lb0, lb4);
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, ld2, ld3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, lb4, ab1);
}
    ab2 = fd1 > ld1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fd1 < fd0;
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    Thought lo2 = Thought14.getInstance(ao2, ao3, ao4, fo0);
    boolean lb3 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb1 = lb3 || fb0;
    Output.points[4][4] += fd0;
    double ld4 = 65.09254647207598;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld4, fd0);
}
if(ao1 != null){
      ao1.m3();
}
    fd1 = ld4 + fd0;
    fb1 = lb0 || lb1;
if(ao2 != null){
      fd1 = ao2.m3(lb3, fb0, fb1, lb0);
}
    Output.points[4][5] -= ld4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld4, fd0, lb1, lb3, fb0, fb1);
}
    fd1 *= -1;
    lb0 = ld4 > fd0;
    lb1 = !lb3;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought12.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    boolean lb1 = false;
    fd0 = fd1 + ad1;
    lb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 < ad1;
    double ld2 = 859.1717031481918;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab1 = ab2 && ab3;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ab1 = ao4.m2(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        Thought lo0 = Thought205.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        Output.points[4][6] += fd1;
        boolean lb1 = true;
        boolean lb2 = true;
        ab4 = fb0 || fb1;
        boolean lb3 = false;
        fd0 = fd1 - fd0;
}
Thought.STACK_COUNTER++;
return ao4;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ad2 *= -1;
    ad3 = ad4 + fd0;
    double ld0 = 419.1029071475967;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    boolean lb2 = true;
    boolean lb3 = true;
    fd0 = fd1 + ld0;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    boolean lb5 = true;
    lb4 = fd0 > fd1;
    ld0 = ad1 + ad2;
    lb5 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
if(ao3 != null){
      ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    double ld6 = 264.8358364481498;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld0, ld6, ad1, ad2, fb0, fb1, lb1, lb2);
}
    Output.points[4][7] += ad3;
if(fo1 != null){
      lb3 = fo1.m2(ad4, fd0, fd1, ld0, lb4, lb5, ab1, ab2);
}
    ld6 = ad1 - ad2;

Thought.STACK_COUNTER++;
return ao1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 747.8553015755826;
    ld0 *= -1;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 + ld0;
    fb1 = fd0 < fd1;
    Thought lo1 = Thought290.getInstance(ld0, fd0, fd1, ld0);
    fd0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
        fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 379.0866403371714;
    ld0 = fd0 - fd1;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought376.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
    fb1 = !fb0;
    Output.points[4][8] += ld0;
    double ld2 = 335.56696943865364;
    fb1 = fb0 || fb1;
    boolean lb3 = false;
    ld2 = fd0 + fd1;
    Output.points[5][0] += ld0;

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
    Thought lo0 = Thought259.getInstance();
    Thought lo1 = Thought180.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb2, fb0);
}
    double ld3 = 99.123323012771;
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb1, lb2, fb0, fb1);
}
    lb2 = fd0 < fd1;
    boolean lb4 = false;
if(fo0 != null){
      ld3 = fo0.m3(fd0, fd1, ld3, fd0, lb4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb4, fb0, fb1, lb2);
}
    Output.points[5][1] -= fd1;
    Output.points[5][2] -= ld3;
    fd0 *= -1;
        Output.points[5][3] += fd1;

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
