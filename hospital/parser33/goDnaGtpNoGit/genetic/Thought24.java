package genetic;
import java.util.ArrayList;
class Thought24 extends Thought{
private static ArrayList<Thought24> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 147.05636502402038;
private double fd1 = 115.70035950392202;
private Thought fo0 = null;
private Thought fo1 = null;
Thought24 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought24 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought24 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought24 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought24 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought24 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought24 instance = new Thought24 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = !fb1;
    boolean lb0 = false;
    double ld1 = 409.7435198171818;
    Output.points[3][5] -= ld1;
    lb0 = fb0 || fb1;
    fd0 = fd1 + ld1;
    fd0 *= -1;
    fd1 *= -1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
    lb0 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 && fb1;
    lb0 = fd1 < ld1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    Thought lo2 = Thought243.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 && ab3;
    Output.points[3][6] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
    Output.points[3][7] -= fd1;
    fb0 = fb1 && ab1;
    ab2 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
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
    ad1 *= -1;
    boolean lb0 = false;
    lb0 = !fb0;
    ad2 *= -1;
    fb1 = ad3 < ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    ad3 = ad4 + fd0;
    double ld1 = 752.7108180719019;
    fd0 *= -1;
    fb1 = !lb0;

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
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 && fb0;
    boolean lb0 = false;
    double ld1 = 841.4836475949145;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    Thought lo3 = Thought169.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m1();
}
    ad3 = ad4 - fd0;
    double ld4 = 381.1063425329837;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(lb2, ab1, ab2, ab3);
}
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought214.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld4, ab4, fb0, fb1, lb0);
        Thought lo6 = Thought94.getInstance(ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
        double ld7 = 619.5101289610436;
        boolean lb8 = false;
        boolean lb9 = true;
        ab2 = ab3 && ab4;
        fb0 = fb1 || lb8;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
        double ld0 = 496.86745596808703;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
    boolean lb1 = true;
    fd1 = ld0 + fd0;
    boolean lb2 = false;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    boolean lb3 = true;
    lb2 = ld0 < fd0;
    double ld4 = 981.8283962284912;

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
    double ld0 = 187.1211486533269;
    double ld1 = 826.8849934105592;
    fb0 = fb1 || fb0;
    fb1 = ld0 > ld1;
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad4 = ao3.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb2 = true;
    fb0 = fd0 > fd1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld0, ld1, ad1, ad2, fb1, lb2, fb0, fb1);
}
    ad3 *= -1;
    double ld3 = 725.0526123454866;
    ad3 = ad4 - fd0;
    boolean lb4 = true;
    fd1 *= -1;
    ld0 = ld1 + ld3;

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
    ab1 = fd1 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
        fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld0 = 996.9024565644182;
    double ld1 = 868.88736947978;
    ab1 = !ab2;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb3 = false;
    double ld4 = 538.8788795426088;
if(ao1 != null){
      ao1.m2(ld1, ld4, fd0, fd1);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld1, ld4, fd0, fd1);
}
    ld0 = ld1 + ld4;
    boolean lb5 = false;
    boolean lb6 = true;
    Thought lo7 = Thought25.getInstance();
    Output.points[3][8] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(lb5, lb6, ab1, ab2);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ld0, ld1, ld4, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, ld1, ld4, lb2, lb3, lb5, lb6);
}
    Output.points[4][0] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    boolean lb8 = false;
    Thought lo9 = Thought301.getInstance(ld0, ld1, ld4, fd0);

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
    ab1 = ad1 > ad2;
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
    Thought lo0 = Thought201.getInstance(ab1, ab2, ab3, ab4);
    Output.points[4][1] -= ad3;
    ad4 = fd0 - fd1;
    Output.points[4][2] -= ad1;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(ao1 != null){
      ab3 = ao1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought134.getInstance(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fd0 > fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    ab1 = fd0 > fd1;
    ad1 = ad2 - ad3;
    boolean lb3 = false;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld0 = 379.6092504791793;
    Output.points[4][3] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    Thought lo2 = Thought209.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
    double ld3 = 729.6225928526603;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0, lb4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo5 = Thought137.getInstance(ld3, fd0, fd1, ld0);
    boolean lb6 = false;
    lb4 = lb6 && fb0;
    ld3 = fd0 + fd1;
    Thought lo7 = Thought7.getInstance(fo1, fo0, fo1, fo0, ld0, ld3, fd0, fd1);
    fb1 = lb1 && lb4;
    lb6 = ld0 > ld3;

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
    Thought lo0 = Thought157.getInstance();
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ab2 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 21.943875863607452;
    ab1 = ab2 || ab3;
    ab4 = ld1 > fd0;
    Thought lo2 = Thought70.getInstance();
    Thought lo3 = Thought199.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Output.points[4][4] += fd0;
    fb1 = fb0 || fb1;
        boolean lb0 = true;
    Thought lo1 = Thought214.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    fb0 = fd1 < ad1;
    double ld2 = 78.510496563018;
    ad1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb0 = ad2 > ad3;
    Output.points[4][5] += ad4;
        fb0 = fb1 && lb0;
    Thought lo3 = Thought47.getInstance(fd0, fd1, ld2, ad1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ld2 - ad1;
    fb0 = !fb1;
    if (lb0) {
        Thought lo4 = Thought379.getInstance();
        fb0 = !fb1;
        ad2 = ad3 - ad4;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    Output.points[4][6] -= ad3;
    double ld0 = 824.2945101286645;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Output.points[4][7] -= ld0;
    double ld1 = 734.9120118349507;
    for(int i0=0; i0<10; i0++){
        ld1 = ad1 + ad2;
        ab3 = !ab4;
        fb0 = !fb1;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        boolean lb2 = false;
}
Thought.STACK_COUNTER++;
return ab3;
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
    fb1 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    double ld0 = 310.76489469988405;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(ao1 != null){
          ao1.m2();
}
    fd1 = ld0 - fd0;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(lb1, lb2, fb0, fb1);
}
    lb1 = lb2 && fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld0, fd0, fd1, fb1, lb1, lb2, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0, fb1, lb1, lb2, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb1, lb2, fb0);
}
    if (fb1) {
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought92.getInstance(ao2, ao3, ao4, fo0);
    Thought lo1 = Thought51.getInstance(ad2, ad3, ad4, fd0);
    fb1 = fd1 < ad1;
    fb0 = ad2 < ad3;
    Output.points[4][8] += ad4;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      fd0 = ao1.m3(fb1, fb0, fb1, fb0);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    double ld0 = 829.475655690672;
    ld0 = fd0 - fd1;
    ld0 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 || ab3;
    Output.points[5][0] += ad2;
if(ao2 != null){
      ao2.m2(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
    boolean lb1 = false;
    fb0 = fb1 && lb0;
    lb1 = ad4 < fd0;
    fd1 = ad1 + ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        Thought lo2 = Thought106.getInstance();
    Thought lo3 = Thought10.getInstance(ab1, ab2, ab3, ab4);
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo4 = Thought368.getInstance(ao3, ao4, fo0, fo1, fb1, lb0, lb1, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + ad1;
    Output.points[5][1] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought66.getInstance();
    fd0 *= -1;
    fb0 = !fb1;
    fb0 = fd1 < fd0;
    Thought lo1 = Thought150.getInstance(fb1, fb0, fb1, fb0);
    boolean lb2 = true;
    fb0 = !fb1;
    lb2 = fd1 > fd0;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
    double ld3 = 79.31042406967994;
    fd0 = fd1 + ld3;
    boolean lb4 = true;
    fd0 = fd1 - ld3;
    Thought lo5 = Thought325.getInstance(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb2);

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought13.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    ab1 = ab2 && ab3;
    Output.points[5][2] += fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought280.getInstance();
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
        double ld4 = 957.1846653112748;
    fd0 *= -1;
    fd1 = ld4 + fd0;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld4, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld4, ab4, fb0, fb1, lb0);
}
    boolean lb5 = false;
    fd0 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 898.2556121470044;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd0 = fd1 - ld0;
    double ld1 = 645.4550548575146;
if(fo0 != null){
      fb0 = fo0.m2(ld1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = true;
    boolean lb3 = true;
    lb3 = ad4 > fd0;
    fb0 = fb1 && lb2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb3 = fb0 || fb1;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(ld0, ld1, ad1, ad2);
}
    ad3 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo0 = Thought229.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[5][3] -= fd0;
    double ld1 = 871.6476726307376;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ab4 = ld1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    if (ab3) {
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd1 *= -1;
    boolean lb0 = false;
    double ld1 = 502.0308931340026;
    ld1 *= -1;
    fd0 = fd1 - ld1;
    Output.points[5][4] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1);
}
    boolean lb2 = false;
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
    lb2 = !fb0;
    boolean lb3 = true;
    fb0 = fd1 > ld1;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb1 = lb0 || lb2;
    Thought lo4 = Thought245.getInstance(lb3, fb0, fb1, lb0);
    lb2 = lb3 && fb0;
    double ld5 = 751.014703794357;
    ld5 = fd0 - fd1;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld5, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo0.m3(ld1, ld5, fd0, fd1, lb3, lb6, fb0, fb1);
}
    lb0 = ld1 < ld5;
    fd0 = fd1 - ld1;

Thought.STACK_COUNTER++;
return ld5;
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
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[5][5] -= fd0;
    fb1 = fd1 > ad1;
    ad2 = ad3 + ad4;
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
        fb0 = !fb1;
    double ld0 = 632.1235685795051;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;

Thought.STACK_COUNTER++;
return ld0;
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
    ab2 = ab3 || ab4;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    Output.points[5][6] -= fd1;
if(ao1 != null){
      fb1 = ao1.m2();
}
    Thought lo0 = Thought7.getInstance(ab1, ab2, ab3, ab4);
    Output.points[5][7] -= fd0;
    fb0 = !fb1;
    double ld1 = 444.09498728761184;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > ld1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    ld1 = fd0 - fd1;
        boolean lb2 = false;
        ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb2, ab1, ab2);
}
    ld1 = fd0 + fd1;
    ab3 = ld1 < fd0;
    ab4 = fd1 > ld1;
    fb0 = fd0 < fd1;
    Output.points[5][8] -= ld1;
    Output.points[6][0] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 < ad2;
    ab2 = ad3 > ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought63.getInstance(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
        double ld1 = 564.3033391267703;
    ab3 = ab4 || fb0;
    Thought lo2 = Thought182.getInstance();
    double ld3 = 72.89533728902931;
    boolean lb4 = false;
    fb0 = ld1 > ld3;
    ad1 = ad2 - ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb4, ab1, ab2);
}
    Output.points[6][1] -= ad4;
    fd0 = fd1 - ld1;
    double ld5 = 32.952541423214356;
    ab3 = !ab4;
if(ao3 != null){
      ld3 = ao3.m3(ao4, fo0, fo1, ao1, ld5, ad1, ad2, ad3, fb0, fb1, lb4, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, lb4, ab1, ab2);
}

Thought.STACK_COUNTER++;
return ld3;
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
    fb1 = fb0 || fb1;
    Output.points[6][2] += fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    Thought lo0 = Thought86.getInstance();
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;

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
    ab2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo2 = Thought79.getInstance(ab2, ab3, ab4, fb0);
    fd1 *= -1;

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
    fb1 = fb0 && fb1;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought191.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought211.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    Thought lo2 = Thought46.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
if(fo0 != null){
      fo1 = fo0.m4();
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought211.getInstance(ab1, ab2, ab3, ab4);
        boolean lb1 = false;
        ad1 = ad2 + ad3;
        ab4 = fb0 || fb1;
        lb1 = !ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
        Thought lo2 = Thought228.getInstance(ad2, ad3, ad4, fd0, fb1, lb1, ab1, ab2);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        lb1 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2();
}
        boolean lb3 = true;
        ab3 = !ab4;
        boolean lb4 = false;
if(fo1 != null){
          ad3 = fo1.m3(ab4, fb0, fb1, lb1);
}
        lb3 = lb4 && ab1;
        }
    Thought lo5 = Thought132.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + ad1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 566.5510618967618;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    boolean lb1 = false;
    fd0 *= -1;
    boolean lb2 = true;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
    Thought lo3 = Thought370.getInstance(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m3();
}
    lb1 = lb2 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb1, lb2, fb0);
}
    fb1 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
if(ao3 != null){
      ao3.m3(fd1, ld0, fd0, fd1, lb2, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    lb2 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    Output.points[6][3] += ad1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
        fb0 = fb1 && lb1;
if(ao3 != null){
          fd1 = ao3.m3(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb1);
}
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        fd0 *= -1;
        }
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1);
}
if(ao4 != null){
      fb0 = ao4.m2();
}
        boolean lb2 = false;
    ad2 = ad3 + ad4;
        Thought lo3 = Thought312.getInstance(fb0, fb1, lb0, lb2);
    Output.points[6][4] += fd0;
    boolean lb4 = false;
    fd1 = ad1 + ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
    fd0 *= -1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2);
}
    Output.points[6][5] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought134.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
        fd0 = fd1 + ad1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fb0 = fb1 && ab1;
        Thought lo1 = Thought249.getInstance(ab2, ab3, ab4, fb0);
        fb1 = ad2 < ad3;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
        double ld2 = 436.0668410193558;
        ad1 = ad2 - ad3;
        double ld3 = 497.84657265235023;
        fb0 = ad3 > ad4;
if(ao2 != null){
          fb1 = ao2.m2(fd0, fd1, ld2, ld3, ab1, ab2, ab3, ab4);
}
        ad1 *= -1;
}
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
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought212.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought81.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);

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
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    double ld1 = 91.96487149877825;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    Output.points[6][6] -= fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3();
}
if(fo0 != null){
      fo0.m1(fb1, fb0, fb1, fb0);
}
        Thought lo2 = Thought131.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld3 = 489.3644375331004;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 < fd1;
    boolean lb0 = false;
            boolean lb1 = false;
    Thought lo2 = Thought284.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Output.points[6][7] += fd0;
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[6][8] += fd1;
    Output.points[7][0] -= fd0;
    lb1 = !fb0;
    boolean lb3 = true;

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
