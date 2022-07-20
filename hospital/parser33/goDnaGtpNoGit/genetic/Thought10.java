package genetic;
import java.util.ArrayList;
class Thought10 extends Thought{
private static ArrayList<Thought10> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 553.0859969858626;
private double fd1 = 327.0242764372315;
private Thought fo0 = null;
private Thought fo1 = null;
Thought10 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought10 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought10 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought10 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought10 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought10 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought10 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought10 instance = new Thought10 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
    Output.points[8][3] += fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    boolean lb2 = false;
    lb0 = !lb1;
if(fo1 != null){
              fd0 = fo1.m3();
}
    double ld3 = 698.8264566115159;
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, fb1, lb0, lb1, lb2);
}
    fb0 = fd1 < ld3;
    fd0 = fd1 - ld3;
    fb1 = lb0 || lb1;
    fd0 = fd1 + ld3;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld3, fd0, fd1, lb2, fb0, fb1, lb0);
}
    ld3 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    ab4 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    if (ab2) {
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        Thought lo1 = Thought272.getInstance(fo0, fo1, fo0, fo1);
        boolean lb2 = false;
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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ad3 *= -1;
    fb0 = fb1 || lb0;
    ad4 = fd0 + fd1;
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    double ld1 = 778.1070566473148;
if(fo0 != null){
          ad4 = fo0.m3();
}
    fd0 *= -1;
        Thought lo2 = Thought113.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    Thought lo3 = Thought321.getInstance(ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
    ad1 *= -1;
    Thought lo4 = Thought188.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb5 = false;
    ad2 = ad3 - ad4;
    lb0 = lb5 && fb0;

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
    ab2 = !ab3;
    boolean lb0 = false;
    Thought lo1 = Thought385.getInstance(ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo1.m3();
}
    fb1 = lb0 || ab1;
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
    double ld2 = 843.4934583737455;
    double ld3 = 761.8238261868108;
    lb0 = ad4 < fd0;
    ab1 = !ab2;
    fd1 *= -1;
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
if(fo0 != null){
      lb0 = fo0.m2(ad4, fd0, fd1, ld2, lb4, ab1, ab2, ab3);
}
    ld3 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad4 *= -1;
    Thought lo5 = Thought342.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd0, fd1, ld2, ld3);
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
    fd0 *= -1;
    fd1 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao4 != null){
      lb0 = ao4.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && lb1;

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
    fb0 = ad2 < ad3;
    ad4 *= -1;
    Thought lo0 = Thought64.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
if(fo1 != null){
      fb1 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
    double ld1 = 967.4436431165777;
    boolean lb2 = true;
    ld1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    Output.points[8][4] -= ld1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 || lb2;
    double ld3 = 731.026350487827;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld3 = ao3.m3(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    double ld4 = 666.0654545701174;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld3, ld4, ad1);
}
    lb2 = ad2 > ad3;
    Thought lo5 = Thought374.getInstance();
    boolean lb6 = true;
if(fo0 != null){
      ao4 = fo0.m4(lb6, fb0, fb1, lb2);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, lb6, fb0, fb1, lb2);
}
    lb6 = fb0 || fb1;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1();
}
    fb0 = !fb1;

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
    ab1 = !ab2;
    ad1 *= -1;
if(ao1 != null){
      ad2 = ao1.m3(ab3, ab4, fb0, fb1);
}
    if (ab1) {
        ab2 = ad3 < ad4;
        boolean lb0 = true;
        double ld1 = 180.5871873172315;
        boolean lb2 = false;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        Output.points[8][5] -= ad4;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, lb0, lb2, ab1, ab2);
}
        boolean lb3 = false;
if(ao1 != null){
          ao1.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb1, lb0, lb2, lb3);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        ab1 = ab2 || ab3;
if(ao2 != null){
          ao1 = ao2.m4(ld1, ad1, ad2, ad3);
}
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
        fb0 = fb1 && lb0;
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
    fb1 = !fb0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
    boolean lb1 = true;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fd1 = fd0 + fd1;
    Thought lo2 = Thought164.getInstance(fb1, lb0, lb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
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
    boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        lb1 = !ab1;
        Thought lo2 = Thought8.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
        Output.points[8][6] -= fd1;
        fd0 *= -1;
        ab3 = ab4 && fb0;
        fb1 = fd1 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
        ab3 = ab4 && fb0;
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    lb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;

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
    Output.points[8][7] += ad2;
if(fo0 != null){
      ab2 = fo0.m2();
}
    double ld0 = 550.4061849955958;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > ad1;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    double ld1 = 955.1351464326491;
    double ld2 = 116.54352902015658;
    ad4 = fd0 + fd1;
    ab1 = ld0 < ld1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        Output.points[8][8] += fd1;
        fd0 = fd1 - fd0;
        boolean lb2 = false;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
if(ao4 != null){
          fd0 = ao4.m3(lb2, lb0, lb1, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb2, lb0, lb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    lb0 = !fb0;
    Thought lo1 = Thought289.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      ao1.m2(fd1, ad1, ad2, ad3);
}
        fb1 = ad4 < fd0;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    Output.points[0][0] += ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb0 = fd0 < fd1;
if(ao1 != null){
      fb1 = ao1.m2();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(ao2 != null){
      lb0 = ao2.m2(fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
        boolean lb0 = false;
    boolean lb1 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    Output.points[0][1] += fd0;
    fd1 *= -1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb1 = fd0 > fd1;

Thought.STACK_COUNTER++;
return ab1;
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
        ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    ab2 = ab3 || ab4;
    fb0 = ad2 < ad3;
    boolean lb0 = false;
    Thought lo1 = Thought6.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    ad2 = ad3 + ad4;
    fb0 = fb1 || lb0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 - ad1;
    ab1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ad1;
    fb1 = ad2 > ad3;
    Thought lo2 = Thought221.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb0, ab1, ab2, ab3);
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb3, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld4 = 909.1623470376667;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    Output.points[0][2] -= fd1;
    double ld0 = 315.9935326571031;
if(fo0 != null){
      fo0.m1(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fd1 = ld0 - fd0;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought210.getInstance();
    double ld2 = 913.8296897947316;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    ld0 = ld2 + fd0;
    double ld3 = 352.04247082051216;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ld3, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, ab1);
}
        ab2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought337.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        ab4 = fb0 && fb1;
        fd0 = fd1 - fd0;
        ab1 = ab2 || ab3;
        ab4 = !fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fb1 = !ab1;
        fd0 *= -1;
        ab2 = fd1 < fd0;
        Output.points[0][3] -= fd1;
        fd0 = fd1 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab3 = !ab4;
        fb0 = fd0 > fd1;
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
    ad2 = ad3 + ad4;
    double ld0 = 186.66545971462958;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb1 = false;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fb0, fb1, lb1, lb2);
}
    double ld3 = 3.9627077003652067;
    fb0 = !fb1;
    ad3 = ad4 + fd0;
    Output.points[0][4] += fd1;
    Output.points[0][5] += ld0;
    for(int i0=0; i0<10; i0++){
        lb1 = ld3 > ad1;
        ad2 = ad3 + ad4;
        fd0 *= -1;
        lb2 = fd1 < ld0;
        boolean lb4 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, lb2, fb0, fb1, lb4);
}
        ad4 = fd0 - fd1;
if(fo0 != null){
          fo0.m1(ld0, ld3, ad1, ad2, lb1, lb2, fb0, fb1);
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        boolean lb0 = false;
    boolean lb1 = false;
    Thought lo2 = Thought61.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought229.getInstance(ad2, ad3, ad4, fd0);
    Thought lo4 = Thought171.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo1.m3();
}
    lb0 = lb1 && ab1;
    ab2 = fd1 < ad1;
    ad2 *= -1;
    Output.points[0][6] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
    double ld5 = 887.6937074986766;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb0 = ao2.m2();
}
        Thought lo0 = Thought97.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 + fd0;
if(ao3 != null){
          fd1 = ao3.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 || fb1;
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
    fb0 = fb1 && fb0;
    ad2 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    Output.points[0][7] -= ad2;
    double ld0 = 705.1247276037267;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0);
}
    double ld1 = 473.64292524528713;
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
    Output.points[0][8] -= ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld2 = 201.70315689762467;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    double ld3 = 587.7007654963605;
    Output.points[1][0] -= ld3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[1][1] += fd0;
    fd1 = ld0 - ld1;
    ld2 = ld3 - ad1;
    fb0 = ad2 > ad3;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, lb4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb4, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ld1;
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
    Thought lo0 = Thought378.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao1 != null){
      ab2 = ao1.m2(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 || ab2;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    double ld2 = 560.2694050829015;
    ld2 = fd0 - fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 771.3553232763661;
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[1][2] += ad1;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    ld0 = ad1 + ad2;
    ab3 = ad3 < ad4;
    Thought lo1 = Thought174.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
    ad2 *= -1;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4();
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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
    Thought lo1 = Thought327.getInstance();
    boolean lb2 = false;
    lb0 = lb2 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, lb2, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    double ld4 = 801.9070796370794;

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
    boolean lb0 = false;
    if (ab1) {
        Output.points[1][3] += fd1;
        Thought lo1 = Thought123.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
          fb1 = fo0.m2(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        fd0 = fd1 - fd0;
        Output.points[1][4] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
        fd0 = fd1 - fd0;
        double ld2 = 806.3488076520812;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab1 = fd0 < fd1;
        boolean lb3 = false;
        Output.points[1][5] += ld2;
        ab1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld2, fd0, fd1, ld2);
}
        fd0 = fd1 + ld2;
        ab2 = ab3 || ab4;
        Output.points[1][6] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
        ld2 *= -1;
        boolean lb4 = false;
        Output.points[1][7] -= fd0;
        fd1 = ld2 + fd0;
        fd1 = ld2 - fd0;
        ab4 = fd1 < ld2;
        fb0 = !fb1;
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
    ad2 = ad3 - ad4;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][8] -= fd0;
    lb0 = fd1 < ad1;
    ad2 *= -1;
    fb0 = fb1 || lb0;
    ad3 = ad4 + fd0;
    Thought lo1 = Thought325.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 > fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 *= -1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 73.88023206300021;
if(fo0 != null){
          fb0 = fo0.m2(ad1, ad2, ad3, ad4);
}
        boolean lb4 = false;
    boolean lb5 = false;
    boolean lb6 = true;
    lb5 = lb6 || fb0;

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
    Output.points[2][0] -= ad2;
    ad3 *= -1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2();
}
    ad2 = ad3 - ad4;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo0.m3(fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
    Thought lo1 = Thought49.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
    lb0 = ab1 && ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    boolean lb2 = true;
    lb2 = fd0 > fd1;
    ab1 = !ab2;
    ab3 = ad1 < ad2;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Output.points[2][1] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = !fb0;
    Thought lo0 = Thought105.getInstance(fb1, fb0, fb1, fb0);
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        double ld1 = 326.23143182845;
        }
    Thought lo2 = Thought0.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    double ld3 = 966.6559708291065;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ld3 = fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;

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
    double ld0 = 441.8687911460067;
if(ao2 != null){
      ao2.m1(ld0, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ad1 = ao4.m3(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought286.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(ao3 != null){
      fb0 = ao3.m2(fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 < ad4;
    fb0 = fb1 || fb0;

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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 = fd1 - fd0;
    fb0 = fb1 && ab1;
    double ld0 = 447.66692352851913;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought385.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          fd1 = ao4.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fd0 = ao3.m3(fd1, ld0, fd0, fd1);
}
        double ld2 = 622.3663684391357;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld2, ld0, fd0, fd1);
}
if(ao4 != null){
          ab1 = ao4.m2();
}
if(fo0 != null){
          ab2 = fo0.m2(ab3, ab4, fb0, fb1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    boolean lb0 = false;
    lb0 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought92.getInstance(ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    boolean lb2 = true;
    double ld3 = 410.2643923600805;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    boolean lb4 = false;
    boolean lb5 = false;
    fd0 = fd1 - ld3;
    Thought lo6 = Thought119.getInstance(ad1, ad2, ad3, ad4);
        ab1 = ab2 || ab3;
    boolean lb7 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld3, ad1);
}
    double ld8 = 43.51559439384506;
    ab3 = ad1 > ad2;
    ab4 = fb0 || fb1;
    Output.points[2][2] -= ad3;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][3] += fd0;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;

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
    fd1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
    double ld0 = 26.014691770330238;
    fb0 = fb1 && fb0;
    fb1 = ld0 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && fb0;
    double ld1 = 649.8916131087952;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
        ld1 = fd0 + fd1;
    fb1 = fb0 && fb1;
        fb0 = !fb1;
    boolean lb2 = true;
    lb2 = ld0 < ld1;
    boolean lb3 = true;
    double ld4 = 380.6883887549506;

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
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[2][4] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
        boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
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
