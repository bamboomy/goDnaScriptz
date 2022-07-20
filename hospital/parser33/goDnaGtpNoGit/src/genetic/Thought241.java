package genetic;
import java.util.ArrayList;
class Thought241 extends Thought{
private static ArrayList<Thought241> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 545.6564398950718;
private double fd1 = 56.43558362262041;
private Thought fo0 = null;
private Thought fo1 = null;
Thought241 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought241 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought241 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought241 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought241 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought241 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought241 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought241 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought241 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought241 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought241 instance = new Thought241 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought271.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    fb0 = fd1 < fd0;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    double ld0 = 659.2693818495355;
    Thought lo1 = Thought139.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
if(fo0 != null){
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab4, fb0, fb1, lb2);
}
    Thought lo3 = Thought5.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
    double ld4 = 170.32199086976524;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(ld4, fd0, fd1, ld0);
}
    double ld5 = 940.9350379198386;

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
    ad2 *= -1;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb0 = !fb1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][4] -= ad4;
    double ld1 = 453.97156688523694;
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld1 = ad1 + ad2;
    fb1 = !lb0;
    boolean lb3 = true;
    ad3 *= -1;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1, lb2, lb3, lb4, fb0);
}
    double ld5 = 896.5834390968835;
    double ld6 = 905.0964671971541;
    fb1 = lb0 && lb2;

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
    Thought lo0 = Thought222.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    boolean lb1 = false;
    boolean lb2 = true;
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = lb3 && ab1;
    double ld4 = 485.0451756621233;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    Thought lo5 = Thought43.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1);
    ab2 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 - ld4;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld4, ad1, ad2, ad3, lb1, lb2, lb3, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ad4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought42.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ad1);
}
    ab3 = ad2 < ad3;
    Output.points[0][5] -= ad4;
    double ld7 = 437.26170665053155;
if(fo1 != null){
      ab4 = fo1.m2();
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
    Output.points[0][6] -= fd1;
    fb1 = fd0 < fd1;
if(ao1 != null){
          ao1.m3(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld0 = 533.397536046934;
    boolean lb1 = true;
    lb1 = ld0 > fd0;
    Thought lo2 = Thought131.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
    ld0 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb3 = false;
    lb1 = fd1 < ld0;
    fd0 *= -1;

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
    fb1 = fb0 && fb1;
    fb0 = ad1 > ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao3.m2();
}
    boolean lb0 = true;
    Output.points[0][7] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
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
    Thought lo0 = Thought326.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought350.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = fd1 > fd0;
    boolean lb2 = false;
        Thought lo3 = Thought19.getInstance(fo0, fo1, ao1, ao2);
    boolean lb4 = false;
    for(int i0=0; i0<10; i0++){
        Thought lo5 = Thought179.getInstance(fd1, fd0, fd1, fd0);
        fd1 = fd0 - fd1;
if(ao3 != null){
          lb2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        boolean lb6 = true;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        Output.points[0][8] -= fd0;
        Thought lo7 = Thought399.getInstance(lb2, lb4, ab1, ab2);
        Thought lo8 = Thought193.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb6, lb2, lb4, ab1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought333.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = ad4 > fd0;
    Thought lo1 = Thought76.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m2(fd1, ad1, ad2, ad3);
}
    Thought lo2 = Thought90.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ad2 = ao3.m3(ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought165.getInstance(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
    ab3 = !ab4;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
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
    Thought lo0 = Thought23.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    lb1 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
        double ld2 = 23.79014070851712;
        fb0 = ld2 > fd0;
        fd1 *= -1;
        fb1 = !lb1;
        boolean lb3 = true;
        }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    if (fb0) {
        Thought lo4 = Thought249.getInstance();
        fb1 = lb1 || fb0;
if(fo0 != null){
          fo0.m3(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
        boolean lb5 = false;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb5);
}
if(fo1 != null){
          lb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb5, lb1);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought59.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[1][0] += fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fd0 = fo0.m3(lb0, ab1, ab2, ab3);
}
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    double ld3 = 906.3704086217518;
    boolean lb4 = false;
    double ld5 = 868.114882203909;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld3, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld5, fd0, fd1, ld3, fb1, lb0, lb2, lb4);
}
    boolean lb6 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb6, ab1, ab2, ab3);
}

Thought.STACK_COUNTER++;
return ab4;
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd1 = ad1 + ad2;
    fb1 = !fb0;
    Output.points[1][1] -= ad3;
    fb1 = ad4 > fd0;
    fd1 = ad1 - ad2;
    fb0 = fb1 && fb0;
    fb1 = ad3 > ad4;
    fb0 = fd0 > fd1;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    Output.points[1][2] += fd0;
    Thought lo1 = Thought126.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    Output.points[1][3] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    ab1 = fd1 < ad1;
    ad2 *= -1;
    ab2 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    if (ab1) {
        fd0 = fd1 - ad1;
        ad2 *= -1;
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
        Thought lo0 = Thought5.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
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
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought221.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        Thought lo1 = Thought171.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
        Thought lo2 = Thought68.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
        boolean lb3 = true;
        fd1 = fd0 - fd1;
        Thought lo4 = Thought344.getInstance(fo1, ao1, ao2, ao3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought85.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ad1 *= -1;
    lb1 = ad2 < ad3;
    double ld2 = 161.97774886762568;
    fb0 = fb1 && lb1;
    fb0 = ad3 < ad4;
    Thought lo3 = Thought168.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, fb0, fb1);
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = ab1 && ab2;
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo0 = Thought304.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao4.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ad3 = ad4 + fd0;
    fb1 = !ab1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;

Thought.STACK_COUNTER++;
return ab4;
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
    fd1 *= -1;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb1 = false;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought250.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    Thought lo3 = Thought399.getInstance();
    boolean lb4 = true;
    lb4 = fd1 > fd0;
    boolean lb5 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb5, fb0, fb1, lb0);
}
    lb1 = lb4 || lb5;
    Thought lo6 = Thought357.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
    Thought lo7 = Thought165.getInstance(fd1, fd0, fd1, fd0, lb4, lb5, fb0, fb1);
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    lb0 = lb1 || lb4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought189.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo1 != null){
      ab3 = fo1.m2();
}
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought277.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
    ab2 = ab3 && ab4;
    Output.points[1][4] -= fd1;
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    double ld3 = 220.84450119782866;
    ab4 = fb0 && fb1;
    fd0 = fd1 - ld3;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    lb1 = ab1 && ab2;
    ab3 = fd1 < ld3;
    boolean lb4 = false;
    ab3 = fd0 > fd1;
    ld3 *= -1;
    fd0 = fd1 + ld3;

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
    ad1 = ad2 - ad3;
        double ld0 = 259.3843567749081;
if(fo0 != null){
      fb1 = fo0.m2(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought139.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
    boolean lb2 = true;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
    ad4 *= -1;
    Thought lo4 = Thought337.getInstance(lb2, lb3, fb0, fb1);
    Thought lo5 = Thought272.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, lb2, lb3, fb0, fb1);
    double ld6 = 278.41598234864216;
    Thought lo7 = Thought133.getInstance(ad1, ad2, ad3, ad4, lb2, lb3, fb0, fb1);
    double ld8 = 596.9322458250108;

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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 708.8033663311363;
    fb1 = ad1 < ad2;
    ab1 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1);
}
    ad2 *= -1;
        ad3 = ad4 + fd0;
    double ld1 = 749.3164148160062;
    boolean lb2 = false;
    Thought lo3 = Thought294.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);

Thought.STACK_COUNTER++;
return ad1;
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
    boolean lb0 = true;
    Thought lo1 = Thought87.getInstance();
if(ao2 != null){
      ao2.m3(fb0, fb1, lb0, fb0);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld2 = 465.8444025815888;
    fb1 = lb0 || fb0;
    fb1 = fd0 < fd1;
    ld2 = fd0 + fd1;
if(ao4 != null){
      ld2 = ao4.m3(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + ld2;
    double ld3 = 889.6600244491107;
    Thought lo4 = Thought295.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m3(ld3, fd0, fd1, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld2);
}
    boolean lb5 = true;
    ld3 *= -1;
    Thought lo6 = Thought167.getInstance();

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
      ao2.m1(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < ad1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
        fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    double ld0 = 424.748445384817;
    ad2 *= -1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    boolean lb1 = true;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 329.2690508241532;
if(ao1 != null){
      ab1 = ao1.m2(ao2, ao3, ao4, fo0);
}
    ab2 = !ab3;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld0, fd0, fd1);
}
        boolean lb1 = true;
    if (ab3) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
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
    ab1 = ad1 > ad2;
    boolean lb0 = false;
    Output.points[1][5] -= ad3;
if(ao2 != null){
      ao2.m1();
}
    Thought lo1 = Thought351.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    lb0 = !ab1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    ad2 *= -1;
    double ld2 = 758.951816085857;
    fb1 = lb0 && ab1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    ab2 = fd1 < ld2;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    Output.points[1][6] += ad1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    ad2 = ad3 + ad4;
    fd0 = fd1 - ld2;
        lb0 = ab1 || ab2;
if(ao3 != null){
      ab3 = ao3.m2(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, ad1, ad2);
}
if(ao3 != null){
      ao3.m3();
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    double ld0 = 486.4208505683163;
    boolean lb1 = false;
    lb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought230.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, lb1, lb3, fb0, fb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought88.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    lb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    boolean lb0 = true;
    Output.points[1][7] -= ad3;
    Thought lo1 = Thought125.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb0 = ad2 < ad3;
    lb2 = ad4 > fd0;
    fb0 = !fb1;
    lb0 = fd1 > ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    Output.points[1][8] += ad4;
    lb2 = !fb0;
    Output.points[2][0] += fd0;
    double ld3 = 530.5727667176446;
    boolean lb4 = true;
if(fo1 != null){
      fd0 = fo1.m3();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, lb2, lb4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld3, ad1, ad2, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1, lb4, fb0, fb1, lb0);
}
        lb2 = lb4 || fb0;
        fb1 = lb0 && lb2;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 && ab3;
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][1] -= fd0;
    ab2 = !ab3;
    for(int i0=0; i0<10; i0++){
        ab4 = fd1 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        fd1 = ad1 + ad2;
        ad3 *= -1;
        }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    boolean lb0 = true;
    if (ab4) {
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb0, ab1, ab2);
}
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
}
        Output.points[2][2] -= ad2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    fb0 = !fb1;
    fd0 *= -1;
    double ld0 = 767.1787853336918;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m2(fd0, fd1, ld0, fd0);
}
    fb1 = !fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought208.getInstance();
    fb1 = !fb0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    Thought lo0 = Thought290.getInstance(fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb1, fb0);
}
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought112.getInstance(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
    boolean lb3 = true;
    lb3 = ad1 > ad2;
    fb0 = fb1 || lb1;
    lb3 = ad3 > ad4;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    fd0 = fd1 + fd0;
    double ld1 = 63.03629965967841;
if(ao1 != null){
      ao1.m3(fd0, fd1, ld1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
    ab3 = !ab4;
        double ld2 = 833.8120093876769;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        }
    Output.points[2][3] -= ad2;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = ad3 < ad4;
if(ao4 != null){
      ao4.m1(fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb0 = true;
    ad1 *= -1;
    Output.points[2][4] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    double ld1 = 873.5852086882347;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[2][5] += fd0;
    fd1 = ld1 - ad1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb0);
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
    Output.points[2][6] += fd0;
    fd1 = fd0 - fd1;
    Output.points[2][7] -= fd0;
    fd1 = fd0 + fd1;
    Thought lo0 = Thought252.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought81.getInstance(fd0, fd1, fd0, fd1);
    fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
        fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
if(fo0 != null){
          fo0.m1(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 557.5941077721236;
    Thought lo2 = Thought206.getInstance(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld3 = 462.3861258297722;
        boolean lb4 = false;
        ld3 *= -1;
    Thought lo5 = Thought199.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 || lb0;
    fd0 = fd1 - ld1;

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
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    lb0 = fd1 < fd0;
    fb0 = !fb1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
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
