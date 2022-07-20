package genetic;
import java.util.ArrayList;
class Thought291 extends Thought{
private static ArrayList<Thought291> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 128.89554440206223;
private double fd1 = 798.791240613066;
private Thought fo0 = null;
private Thought fo1 = null;
Thought291 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought291 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought291 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought291 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought291 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought291 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought291 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought291 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought291 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought291 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought291 instance = new Thought291 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo0 != null){
      fo0.m3();
}
    Output.points[5][8] -= fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    Output.points[6][0] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    ab1 = fd0 < fd1;
    double ld0 = 754.8715654684661;
    boolean lb1 = true;
    ld0 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ab1 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
        fd0 = fd1 + ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = ld0 + fd0;
        fd1 = ld0 - fd0;
        Output.points[6][1] += fd1;
        ab2 = ab3 || ab4;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, ab1);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 - fd0;
        boolean lb2 = true;
        double ld3 = 45.988783582747615;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld3, ld0, fb0, fb1, lb2, lb1);
}
        Thought lo4 = Thought120.getInstance(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
    Output.points[6][2] += ad3;
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fb0 = fd0 < fd1;
    double ld0 = 665.3946979806676;
if(fo1 != null){
      ld0 = fo1.m3();
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
    Thought lo1 = Thought118.getInstance(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
        Output.points[6][3] -= ad2;
        ad3 = ad4 - fd0;
        Thought lo1 = Thought369.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
        ab4 = ad4 > fd0;
        double ld2 = 120.71177041706463;
        fb0 = fd0 < fd1;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
          ad4 = fo1.m3();
}
        Thought lo3 = Thought367.getInstance(fb1, lb0, ab1, ab2);
        ab3 = ab4 || fb0;
        fd0 = fd1 + ld2;
        fb1 = lb0 || ab1;
        Output.points[6][4] -= ad1;
        Thought lo4 = Thought110.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
        fb1 = fd1 > ld2;
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
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought257.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    Thought lo1 = Thought364.getInstance(fb1, fb0, fb1, fb0);
    fd1 *= -1;
    boolean lb2 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fd0 *= -1;
    boolean lb3 = true;
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = !lb2;
    boolean lb4 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    fb1 = fb0 && fb1;
        fb0 = ad1 < ad2;
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    Output.points[6][5] -= ad2;
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao3.m1();
}
    fd0 *= -1;
if(ao4 != null){
      ao4.m1(fb0, fb1, lb0, fb0);
}
    fd1 = ad1 + ad2;
    ad3 *= -1;
    fb1 = !lb0;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought367.getInstance(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
    fd0 = fd1 - ad1;
    Output.points[6][6] += ad2;
    boolean lb2 = true;
    for(int i0=0; i0<10; i0++){
        fb0 = ad3 > ad4;
        fb1 = lb0 && lb2;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb2);
}
        fb0 = fb1 && lb0;
        Thought lo3 = Thought7.getInstance(ao4, fo0, fo1, ao1);
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
    Thought lo0 = Thought357.getInstance(fd0, fd1, fd0, fd1);
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    Thought lo1 = Thought91.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fb0 = fb1 || ab1;
    ab2 = ab3 && ab4;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
if(ao1 != null){
          fo1 = ao1.m4();
}
        fb0 = fb1 || ab1;
        boolean lb2 = false;
        ab1 = !ab2;
        fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
        Thought lo3 = Thought377.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb2, ab1, ab2, ab3);
}
        ab4 = fb0 || fb1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
        lb2 = fd0 > fd1;
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
      ao2.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought206.getInstance(ao3, ao4, fo0, fo1);
    double ld1 = 16.791033363127216;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ld1);
}
    ab1 = ad1 < ad2;
    Thought lo2 = Thought55.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    boolean lb3 = false;
    ab1 = ld1 > ad1;
    ab2 = ab3 && ab4;
    boolean lb4 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m3(ab4, fb0, fb1, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb3, lb4);
}
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = !lb3;
    boolean lb5 = true;
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb4 = fd0 > fd1;
if(ao3 != null){
      ao3.m2(ld1, ad1, ad2, ad3);
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo0 = Thought178.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
              fo0.m3(fd1, fd0, fd1, fd0);
}
            fb1 = fd1 > fd0;
            fd1 = fd0 + fd1;
}}
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
    fd0 *= -1;
    fd1 *= -1;
    ab2 = ab3 || ab4;
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    Thought lo1 = Thought288.getInstance();
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    boolean lb2 = true;
    ab3 = !ab4;
    Output.points[6][7] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb2);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought1.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    ab2 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought217.getInstance();
    boolean lb2 = false;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
        boolean lb3 = false;
    Thought lo4 = Thought267.getInstance(lb3, fb0, fb1, lb0);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
    Output.points[6][8] -= ad4;
    lb0 = !lb2;
if(fo0 != null){
      fo0.m3(fd0, fd1, ad1, ad2, lb3, fb0, fb1, lb0);
}
    if (lb2) {
        lb3 = ad3 > ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0);
}
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(ad1, ad2, ad3, ad4);
}
        lb3 = fb0 && fb1;
        fd0 = fd1 + ad1;
        boolean lb5 = true;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad3 *= -1;
    ab3 = !ab4;
    fb0 = fb1 && ab1;
    ab2 = ad4 > fd0;
    boolean lb0 = false;
    Thought lo1 = Thought90.getInstance(ab2, ab3, ab4, fb0);
    Output.points[7][0] += fd1;
    fb1 = !lb0;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    Output.points[7][1] += fd1;
    fb1 = fb0 && fb1;
        fd0 = fd1 + fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
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
    fb0 = !fb1;
    ad2 *= -1;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    Thought lo0 = Thought46.getInstance(fb1, fb0, fb1, fb0);
    double ld1 = 122.20974201387892;
    Output.points[7][2] += ad1;
    boolean lb2 = false;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 || fb0;
    ld1 *= -1;
    fb1 = lb2 && fb0;
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
    fb0 = fb1 && lb2;
    fb0 = fb1 || lb2;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = ld1 > ad1;

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
    ab1 = fd0 > fd1;
    if (ab2) {
        ab3 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 - fd0;
        Output.points[7][3] += fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          fd0 = ao4.m3();
}
if(fo0 != null){
          fo0.m3(ab4, fb0, fb1, ab1);
}
        ab2 = fd1 < fd0;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
}
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
    ad2 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 888.3446932340706;
    fb0 = fd0 > fd1;
    fb1 = ab1 && ab2;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
    fd0 *= -1;
    ab2 = !ab3;
    ab4 = !fb0;
    fb1 = fd1 < ld0;
    ad1 *= -1;
    boolean lb2 = true;
    if (lb1) {
        ad2 = ad3 + ad4;
        for(int i0=0; i0<10; i0++){
            lb2 = !ab1;
}}
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
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought170.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 245.97547237562097;
    double ld2 = 176.193778597134;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    ld2 = fd0 + fd1;
    ld1 = ld2 - fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
}
    double ld3 = 151.33414152133142;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fd0 = fd1 - ld1;
    fb1 = ld2 < ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, ld1, ld2);
}
    Thought lo4 = Thought277.getInstance(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
if(fo0 != null){
      fo0.m3();
}
    boolean lb5 = false;
if(fo1 != null){
      lb5 = fo1.m2(fb0, fb1, lb5, fb0);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld1, fb1, lb5, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1, lb5, fb0, fb1, lb5);
}
    ld1 = ld2 + ld3;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb5, fb0, fb1);
}
if(fo0 != null){
      lb5 = fo0.m2(fo1, fo0, fo1, fo0);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought50.getInstance();
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    Output.points[7][4] -= fd1;
    Thought lo1 = Thought163.getInstance(fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb2 = false;
    boolean lb3 = false;
    fd0 *= -1;
    double ld4 = 875.419828923857;
    Thought lo5 = Thought90.getInstance(fd0, fd1, ld4, fd0, ab3, ab4, fb0, fb1);
    lb2 = fd1 > ld4;
    double ld6 = 330.2749240011054;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, fd0, fd1, ld4);
}
    ld6 = fd0 - fd1;
    Thought lo7 = Thought351.getInstance(fo0, fo1, fo0, fo1, ld4, ld6, fd0, fd1);
    ab4 = ld4 < ld6;
    Thought lo8 = Thought162.getInstance();
    fb0 = !fb1;
    lb2 = !lb3;

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
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought47.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld1 = 522.4133048263278;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m2();
}
    fd1 = ld1 - ad1;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld1 + ad1;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 = ad1 + ad2;
    Thought lo2 = Thought163.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
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
    ab1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought274.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 - fd1;
    Thought lo1 = Thought67.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    double ld2 = 609.9392042641326;
    Thought lo3 = Thought19.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, ab1, ab2, ab3, ab4);
    ad1 = ad2 + ad3;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld2, fb1, ab1, ab2, ab3);
}
    Thought lo4 = Thought271.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
    ab2 = ad1 < ad2;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb0 = fb1 && lb0;
if(ao4 != null){
          ao4.m3(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
          fd0 = ao4.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        Thought lo1 = Thought159.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
        fb1 = fd1 < fd0;
        lb0 = fb0 || fb1;
        double ld2 = 530.9565493691739;
        lb0 = fb0 && fb1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, ld2, fd0);
}
        boolean lb3 = false;
        lb3 = fd1 < ld2;
if(fo0 != null){
          lb0 = fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld2, fd0);
}
        fb0 = fd1 > ld2;
if(fo0 != null){
          ao4 = fo0.m4();
}
        fd0 = fd1 - ld2;
        boolean lb4 = true;
        boolean lb5 = false;
if(ao1 != null){
          fo1 = ao1.m4(lb0, fb0, fb1, lb3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, lb4, lb5, lb0, fb0);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld2, fd0, fd1, fb1, lb3, lb4, lb5);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ad3 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || fb0;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    ad1 *= -1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb0 = fd0 > fd1;
    lb1 = fb0 || fb1;
    ad1 = ad2 + ad3;

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
    ab1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought119.getInstance(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought199.getInstance(ao4, fo0, fo1, ao1);
if(ao2 != null){
      fb1 = ao2.m2(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    ab4 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        Output.points[7][5] -= fd0;
    Output.points[7][6] -= fd1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
        fb1 = fd1 > fd0;
        double ld2 = 472.938317344422;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        fd0 *= -1;
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
if(ao1 != null){
      ad2 = ao1.m3(ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ad1 = ao1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[7][7] += fd1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
          ad1 = ao2.m3(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
        ad4 *= -1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fd0 = fd1 + ad1;
        boolean lb0 = true;
        ab4 = !fb0;
        boolean lb1 = true;
        }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
        boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    Output.points[7][8] -= fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    double ld2 = 524.8266703211596;
    fd0 = fd1 + ld2;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fb1, lb0, lb1, fb0);
}
    boolean lb3 = true;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld2, lb0, lb1, lb3, fb0);
}
    Output.points[8][0] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld2, fd0, fd1, lb0, lb1, lb3, fb0);
}
        ld2 *= -1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    fd1 *= -1;
    fb1 = !ab1;
    Thought lo0 = Thought267.getInstance(ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ab4 = fd0 < fd1;
    Thought lo1 = Thought195.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb2);
}
    ab1 = fd0 < fd1;
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb2);
}
    Output.points[8][1] -= fd0;

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
    boolean lb0 = false;
    Output.points[8][2] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 *= -1;
    double ld1 = 888.2774794736277;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad4 = fo0.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, ad1, ad2, fb0, fb1, lb0, lb2);
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
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    Thought lo1 = Thought201.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought183.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
    Thought lo3 = Thought35.getInstance();
    Output.points[8][3] -= ad4;
    Output.points[8][4] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    boolean lb4 = false;
    fb0 = !fb1;

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
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    if (fb1) {
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought246.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
if(ao1 != null){
          fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        boolean lb1 = false;
        lb1 = fb0 && fb1;
        double ld2 = 610.0440038694787;
        fd0 = fd1 - ld2;
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
    fb0 = !fb1;
if(ao1 != null){
      ao1.m1(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    Thought lo1 = Thought1.getInstance();
    boolean lb2 = true;
    Thought lo3 = Thought183.getInstance(lb0, lb2, fb0, fb1);
    lb0 = !lb2;
    Thought lo4 = Thought271.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb2);
    Output.points[8][5] += ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
    Thought lo5 = Thought83.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad3 = ad4 - fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
    double ld6 = 943.9579442543848;
    double ld7 = 596.8606103693008;
    ld6 = ld7 + ad1;

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
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb1 = false;
    double ld2 = 12.318362821823419;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
    fd0 *= -1;
    Output.points[8][6] += fd1;
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
    fb1 = ld2 < fd0;
    lb0 = lb1 || ab1;
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    ad1 *= -1;
    boolean lb0 = true;
    lb0 = ad2 > ad3;
    ab1 = ad4 < fd0;
    fd1 = ad1 + ad2;
    boolean lb1 = false;
    ab1 = ad3 > ad4;
if(ao1 != null){
      ao1.m1();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, lb0, lb1, ab1);
}
    double ld2 = 286.53067533519646;
    ab2 = ab3 && ab4;
    boolean lb3 = false;
    Thought lo4 = Thought263.getInstance(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb1, lb3, ab1, ab2);
}
    Output.points[8][7] += fd1;
    ab3 = ab4 || fb0;
    ld2 = ad1 + ad2;
    Thought lo5 = Thought180.getInstance(ao3, ao4, fo0, fo1);

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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
    Thought lo1 = Thought323.getInstance();
    fd1 *= -1;
if(fo1 != null){
          lb0 = fo1.m2(fb0, fb1, lb0, fb0);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    Output.points[8][8] += fd1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[0][0] += fd0;
    fb0 = fb1 && lb0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3();
}
    fd0 *= -1;
    fd1 *= -1;

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
    double ld0 = 556.7427189184574;
    ld0 *= -1;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
    boolean lb1 = false;
    fd0 = fd1 - ld0;
    lb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ld0 > fd0;
    Thought lo2 = Thought144.getInstance(fd1, ld0, fd0, fd1);
    fb1 = lb1 || fb0;
    Thought lo3 = Thought255.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
    Output.points[0][1] += fd0;
    double ld4 = 598.0431496134876;

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
