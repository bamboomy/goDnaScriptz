package genetic;
import java.util.ArrayList;
class Thought271 extends Thought{
private static ArrayList<Thought271> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 343.6363289941776;
private double fd1 = 218.21889072500358;
private Thought fo0 = null;
private Thought fo1 = null;
Thought271 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought271 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought271 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought271 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought271 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought271 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought271 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought271 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought271 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought271 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought271 instance = new Thought271 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      fb0 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
    Thought lo3 = Thought58.getInstance(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
    fb1 = lb0 || lb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
    Output.points[5][7] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought227.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
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
    double ld0 = 456.22148924389154;
    ab1 = ld0 > fd0;
    ab2 = fd1 < ld0;
    Thought lo1 = Thought46.getInstance(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    Thought lo2 = Thought163.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    Thought lo4 = Thought332.getInstance(fd1, ld0, fd0, fd1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    ab4 = !fb0;
    fd0 = fd1 + ld0;
    fb1 = lb3 || ab1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    fd0 = fd1 + ld0;
    ab3 = fd0 < fd1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      lb3 = fo0.m2(ab1, ab2, ab3, ab4);
}
    boolean lb5 = true;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        double ld0 = 169.97189479266578;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    ad3 = ad4 - fd0;
    lb1 = fd1 < ld0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
    boolean lb2 = true;
    double ld3 = 288.71418187140137;
    ad4 *= -1;
    double ld4 = 935.2393052007519;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    boolean lb5 = false;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = ld3 > ld4;

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
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = ad4 < fd0;
    fd1 *= -1;
    double ld0 = 539.6714631657152;
    for(int i0=0; i0<10; i0++){
        fb1 = ab1 || ab2;
        ab3 = ab4 && fb0;
        for(int i1=0; i1<10; i1++){
            fb1 = ab1 || ab2;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
            boolean lb1 = false;
if(fo1 != null){
              fo0 = fo1.m4(ad4, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
            Thought lo2 = Thought374.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
            boolean lb3 = true;
            double ld4 = 655.1379221726179;
            Thought lo5 = Thought154.getInstance(fo0, fo1, fo0, fo1);
            lb3 = !ab1;
            ab2 = ld0 < ad1;
            Thought lo6 = Thought110.getInstance(ad2, ad3, ad4, fd0);
            fd1 = ld4 + ld0;
            ab3 = !ab4;
            fb0 = fb1 && lb1;
            ad1 = ad2 + ad3;
}}
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
    fb1 = !fb0;
    boolean lb0 = false;
    fd1 *= -1;
    Thought lo1 = Thought98.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
    double ld2 = 90.28423051388228;
    fb0 = ld2 > fd0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = ld2 - fd0;
    Output.points[5][8] -= fd1;
    lb0 = fb0 || fb1;

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
    double ld1 = 880.6488022755661;
    if (lb0) {
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
        Thought lo2 = Thought332.getInstance(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
        boolean lb3 = true;
if(ao2 != null){
          lb3 = ao2.m2(ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb3);
}
        ad1 = ad2 - ad3;
        double ld4 = 719.2918432036194;
        Thought lo5 = Thought276.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb3);
        ad3 *= -1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(ad4, fd0, fd1, ld4);
}
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        Thought lo6 = Thought43.getInstance();
if(ao2 != null){
          ao1 = ao2.m4(lb0, fb0, fb1, lb3);
}
if(ao3 != null){
          ld4 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
    fd0 = fd1 + fd0;
    double ld0 = 764.1398885963857;
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
        ab2 = ld0 > fd0;
        }
if(ao3 != null){
      ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Output.points[6][0] -= fd1;
    ld0 = fd0 + fd1;

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
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 || ab3;
        ab4 = ad1 > ad2;
        Thought lo0 = Thought248.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
        ab3 = !ab4;
        Thought lo1 = Thought327.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
        boolean lb2 = true;
        ab2 = ab3 && ab4;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fd0 *= -1;
        boolean lb3 = false;
        fd1 = ad1 - ad2;
        double ld4 = 837.7550814255312;
        ab2 = ad2 > ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ld4);
}
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
        ab3 = ab4 || fb0;
if(fo1 != null){
          fd0 = fo1.m3();
}
        Output.points[6][1] += fd1;
        fb1 = ld4 < ad1;
        ad2 *= -1;
        lb2 = lb3 && ab1;
if(ao2 != null){
          ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb2, lb3, ab1);
}
        Output.points[6][2] -= ld4;
        ab2 = ad1 < ad2;
        ab3 = !ab4;
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
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    if (fb0) {
        fb1 = fd1 > fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = fd0 > fd1;
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        boolean lb1 = false;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
        fb0 = fd1 > fd0;
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
    double ld0 = 490.2317774309079;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab1 = fo0.m2(fd0, fd1, ld0, fd0);
}
    ab2 = ab3 && ab4;
    Thought lo1 = Thought238.getInstance(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
if(fo1 != null){
      fo1.m2();
}
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ld0 = fd0 + fd1;
    boolean lb2 = false;
    ld0 = fd0 + fd1;
    ab3 = ld0 > fd0;
    Thought lo3 = Thought227.getInstance(ab4, fb0, fb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = ad1 > ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
    double ld1 = 448.2808607723976;
    lb0 = ad1 < ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld1 = fo1.m3(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        }
    boolean lb3 = false;
    fd0 *= -1;
    fd1 = ld1 - ad1;
    lb2 = ad2 < ad3;
    ad4 *= -1;
    boolean lb4 = true;
    lb3 = lb4 && fb0;
    fd0 = fd1 - ld1;
    boolean lb5 = false;

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
    ad2 *= -1;
    double ld0 = 597.0466122333765;
    ab1 = ab2 || ab3;
    ab4 = ad2 < ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
    Thought lo1 = Thought179.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    fd1 = ld0 + ad1;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][3] -= fd0;
    boolean lb2 = false;
    ab1 = ab2 && ab3;
    fd1 = ld0 + ad1;
    Thought lo3 = Thought328.getInstance(ad2, ad3, ad4, fd0);
    ab4 = fd1 < ld0;
    boolean lb4 = true;
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    lb2 = lb4 || ab1;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
        fd0 = fd1 - ld0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb2);
}

Thought.STACK_COUNTER++;
return lb4;
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
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fb1 = fb0 && fb1;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      ao3.m2(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[6][4] += ad1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      fb0 = ao4.m2(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    fb1 = ad4 < fd0;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld0 = 301.94892820288464;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 = fd1 - ld0;
    Thought lo3 = Thought300.getInstance(ao4, fo0, fo1, ao1);
    boolean lb4 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ad1);
}
    lb2 = lb4 && fb0;
    Thought lo5 = Thought282.getInstance();
if(ao4 != null){
      ao4.m3(fb1, lb1, lb2, lb4);
}
    Thought lo6 = Thought88.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb2);
    fd1 *= -1;
    boolean lb7 = true;
if(ao3 != null){
      ld0 = ao3.m3(ad1, ad2, ad3, ad4, lb4, lb7, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab2 = ab3 && ab4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    ab3 = fd0 > fd1;
    Thought lo0 = Thought161.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought289.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    boolean lb2 = false;
    Thought lo3 = Thought3.getInstance();
        fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Output.points[6][5] += fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb2);
}
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb4, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 842.9414257809743;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 656.8005748754834;
    Output.points[6][6] -= ld1;
    Output.points[6][7] -= ad1;
    Output.points[6][8] -= ad2;
    ab2 = !ab3;
    Thought lo2 = Thought155.getInstance(ad3, ad4, fd0, fd1);
    ab4 = fb0 || fb1;
    ab1 = ld0 < ld1;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought133.getInstance(ao3, ao4, fo0, fo1, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
    fb0 = ad2 > ad3;
    ad4 = fd0 - fd1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought338.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;

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
    double ld0 = 728.0620795244394;
    boolean lb1 = true;
    Output.points[7][0] += fd0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = ab1 && ab2;
    boolean lb3 = false;
    boolean lb4 = false;
    fd1 = ld0 - fd0;
        ab1 = ab2 && ab3;
    ab4 = fd1 < ld0;
    fb0 = !fb1;
    Thought lo5 = Thought61.getInstance(lb1, lb2, lb3, lb4);
        double ld6 = 332.14573514518946;
    ld6 *= -1;
    Output.points[7][1] += fd0;
    Output.points[7][2] -= fd1;
    ld0 *= -1;
if(fo0 != null){
      ld6 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld6, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fb0 = fo1.m2(ld6, fd0, fd1, ld0, fb1, lb1, lb2, lb3);
}
    Thought lo7 = Thought92.getInstance(fo0, fo1, fo0, fo1, lb4, ab1, ab2, ab3);
    ld6 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + ld0;
    Thought lo8 = Thought172.getInstance(ld6, fd0, fd1, ld0);

Thought.STACK_COUNTER++;
return ld6;
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    boolean lb1 = true;
    lb1 = !fb0;
    fb1 = lb0 || lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    double ld0 = 517.2812908061799;
    ld0 *= -1;
    double ld1 = 252.92130863626858;
    ld1 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    Output.points[7][3] -= fd0;
    Output.points[7][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][5] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1);
}
    Output.points[7][6] += ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    double ld2 = 456.42499924623064;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    double ld3 = 136.7249878751277;
    ab3 = ab4 && fb0;
    ad1 = ad2 - ad3;
    boolean lb4 = false;

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
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    Output.points[7][7] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
        fb0 = !fb1;
    fb0 = !fb1;
    double ld0 = 630.6613941310285;
    ld0 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
        boolean lb2 = false;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1);
}
        lb2 = ad2 < ad3;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
        lb1 = ad1 < ad2;
        double ld3 = 328.631719684421;
        fb0 = fb1 || lb2;
        Output.points[7][8] += ad2;
if(ao3 != null){
          ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld3);
}
        double ld4 = 221.21525520427917;
        lb1 = fb0 || fb1;
if(ao2 != null){
          ao2.m3();
}
        lb2 = lb1 && fb0;
        Thought lo5 = Thought66.getInstance(fb1, lb2, lb1, fb0);
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld4, ld0, ad1, ad2, fb1, lb2, lb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    if (fb1) {
        Output.points[8][0] -= fd1;
        fd0 = fd1 + fd0;
        Output.points[8][1] += fd1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + fd0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        boolean lb0 = true;
if(ao2 != null){
          fd1 = ao2.m3(fd0, fd1, fd0, fd1);
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
    ab1 = ad2 > ad3;
    double ld0 = 652.8457508421335;
if(ao1 != null){
          ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
    ab2 = !ab3;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(ao1 != null){
      ad2 = ao1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo1 = Thought11.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ab1 = ad4 > fd0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ld0 > ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Thought lo0 = Thought300.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    double ld1 = 74.74628400795442;
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld1;
    Output.points[8][2] -= fd0;
    Thought lo2 = Thought301.getInstance(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
    double ld3 = 602.5776405858404;
    Thought lo4 = Thought135.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 || ab3;
    fd0 *= -1;
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + fd0;
    Thought lo2 = Thought315.getInstance(ab3, ab4, fb0, fb1);
    lb0 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb0 = fd0 < fd1;
    lb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 && ab1;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
        fb1 = ad4 < fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
        ad3 = ad4 - fd0;
        Thought lo0 = Thought368.getInstance(fo0, fo1, fo0, fo1);
        fb1 = fb0 || fb1;
        fb0 = !fb1;
        Thought lo1 = Thought18.getInstance(fd1, ad1, ad2, ad3);
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        fb1 = !fb0;
        ad2 *= -1;
        boolean lb2 = false;
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
          fo1 = fo0.m4(lb3, fb0, fb1, lb2);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = !ab3;
    Thought lo0 = Thought287.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought232.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fd1 > fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][3] -= fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao3.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 *= -1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
    boolean lb0 = true;
        fb0 = ad1 < ad2;
    Thought lo1 = Thought61.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, lb2);
}
    double ld3 = 509.39797782437853;
    fb0 = ld3 < ad1;
    double ld4 = 919.7419237855643;
    ad1 *= -1;
    Thought lo5 = Thought187.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb0, lb2, fb0);
    Output.points[8][4] -= fd1;
    double ld6 = 569.0242366446316;
    fb1 = ld3 > ld4;
    ld6 *= -1;
    boolean lb7 = false;
    double ld8 = 926.8593990152965;
    ld8 = ad1 + ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    boolean lb1 = false;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb2 = false;
if(ao1 != null){
      lb2 = ao1.m2(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Thought lo0 = Thought382.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb0 = fb1 && ab1;
    boolean lb1 = true;
    ab1 = !ab2;
    Output.points[8][5] += fd1;
if(fo0 != null){
      ab3 = fo0.m2();
}
    ab4 = ad1 < ad2;
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(fb1, lb1, ab1, ab2);
}
if(ao2 != null){
      ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    fb1 = !lb1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought151.getInstance(ao2, ao3, ao4, fo0);
    Output.points[8][6] += ad2;
    Thought lo3 = Thought94.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ad1 > ad2;
    fb1 = !lb1;
    ab1 = !ab2;
    ab3 = ad3 < ad4;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    boolean lb4 = false;
    Thought lo5 = Thought42.getInstance();
    Output.points[8][7] += ad3;
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
}

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
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = fd0 < fd1;
        fb0 = !fb1;
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 < fd0;
    boolean lb2 = false;
    lb1 = fd1 < fd0;
    lb2 = fd1 > fd0;

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
    fb1 = fb0 && fb1;
    Thought lo0 = Thought387.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought104.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld2 = 836.8803759916559;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    lb3 = fd1 < ld2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
    lb4 = !fb0;
    fd1 = ld2 + fd0;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought362.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    Thought lo1 = Thought124.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought274.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
    Thought lo4 = Thought383.getInstance(fd1, fd0, fd1, fd0);
    Thought lo5 = Thought173.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    Thought lo6 = Thought19.getInstance();
    boolean lb7 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb3, lb7, fb0, fb1);
}
    lb3 = fd0 > fd1;
    lb7 = fb0 || fb1;

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
