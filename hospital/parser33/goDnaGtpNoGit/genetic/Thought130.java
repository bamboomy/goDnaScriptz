package genetic;
import java.util.ArrayList;
class Thought130 extends Thought{
private static ArrayList<Thought130> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 767.0116380259584;
private double fd1 = 16.76591263315482;
private Thought fo0 = null;
private Thought fo1 = null;
Thought130 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought130 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought130 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought130 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought130 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought130 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought130 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought130 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought130 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought130 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought130 instance = new Thought130 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    for(int i0=0; i0<10; i0++){
        double ld0 = 201.25077296302098;
        fd0 = fd1 - ld0;
        boolean lb1 = false;
        fd0 = fd1 + ld0;
        fb0 = fb1 && lb1;
        fb0 = !fb1;
        lb1 = fd0 > fd1;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          lb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
        boolean lb2 = true;
        boolean lb3 = true;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
        boolean lb4 = true;
if(fo0 != null){
          fo0.m2();
}
        Thought lo5 = Thought399.getInstance(lb2, lb3, lb4, fb0);
        boolean lb6 = false;
        boolean lb7 = false;
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
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 - fd0;
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
        boolean lb0 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = lb0 || ab1;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        ab2 = fd1 < fd0;
        for(int i1=0; i1<10; i1++){
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
              fo0.m2();
}
            ab3 = ab4 || fb0;
            double ld1 = 654.3194810643183;
            fb1 = lb0 && ab1;
            Output.points[1][5] -= fd0;
            double ld2 = 733.7604097044206;
            ab2 = fd0 < fd1;
if(fo0 != null){
              fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 1.535685856449213;
    fb0 = ld0 < ad1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    lb1 = fd1 < ld0;
        Thought lo2 = Thought183.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
    Thought lo3 = Thought199.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = !fb0;

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
    for(int i0=0; i0<10; i0++){
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        ad2 = ad3 - ad4;
        boolean lb0 = false;
        fd0 = fd1 + ad1;
        if (fb0) {
if(fo0 != null){
              fo0.m2(ad2, ad3, ad4, fd0);
}
            fb1 = !lb0;
            fd1 = ad1 - ad2;
            ab1 = !ab2;
            double ld1 = 357.2109056500456;
            boolean lb2 = false;
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
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    Output.points[1][6] += fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
    fb0 = !fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    lb0 = !fb0;
    ad3 *= -1;
    fb1 = lb0 && fb0;
    Thought lo1 = Thought255.getInstance(ad4, fd0, fd1, ad1);
    fb1 = lb0 && fb0;
    ad2 = ad3 - ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    ad1 = ad2 + ad3;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb0, lb2, fb0);
}
    ad2 *= -1;
    fb1 = ad3 < ad4;
    lb0 = fd0 > fd1;
    Thought lo3 = Thought297.getInstance(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb0);
}
    fd0 = fd1 - ad1;

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
    fd1 = fd0 - fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    Thought lo0 = Thought141.getInstance();
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    double ld1 = 578.334380104013;
    boolean lb2 = true;
    fd0 = fd1 + ld1;
    Output.points[1][7] -= fd0;
    Thought lo3 = Thought12.getInstance(ab2, ab3, ab4, fb0);
    Thought lo4 = Thought169.getInstance(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1, fb1, lb2, ab1, ab2);
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb2, ab1, ab2, ab3);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
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
    boolean lb0 = false;
    boolean lb1 = true;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ad2 = ao4.m3(lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb1 = !ab1;
    if (ab2) {
        Thought lo2 = Thought21.getInstance(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
        lb0 = lb1 && ab1;
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    Thought lo0 = Thought51.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    double ld1 = 849.1738026158869;

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
    ab1 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2();
}
    Output.points[1][8] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought237.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    Thought lo1 = Thought183.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;

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
    ad2 = ad3 - ad4;
    double ld0 = 835.411753229712;
if(fo0 != null){
      fb0 = fo0.m2(ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[2][0] += fd0;
    boolean lb1 = false;
if(fo1 != null){
      fb0 = fo1.m2();
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
    ab1 = ad1 < ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    Thought lo0 = Thought291.getInstance(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
    Thought lo1 = Thought369.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb2 = true;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = !fb1;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, ab1, ab2);
}
    Thought lo4 = Thought4.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab3, ab4, fb0, fb1);
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, lb2, lb3, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      lb2 = fo0.m2();
}
    double ld5 = 281.7431243888883;
if(fo1 != null){
      lb3 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb2;

Thought.STACK_COUNTER++;
return lb3;
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
    Output.points[2][1] -= fd1;
    fb0 = fd0 < fd1;
    Output.points[2][2] -= fd0;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
        fd1 *= -1;
        fb1 = fd0 < fd1;
        boolean lb1 = true;
        Thought lo2 = Thought310.getInstance(fd0, fd1, fd0, fd1, lb1, lb0, fb0, fb1);
        Output.points[2][3] += fd0;
        lb1 = !lb0;
        fb0 = fb1 && lb1;
        lb0 = fb0 && fb1;
        lb1 = !lb0;
        fd1 = fd0 - fd1;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb1, lb0);
}
        fd0 = fd1 - fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1);
}
        double ld3 = 864.6510380877231;
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, ld3, fd0, fd1, ld3);
}
if(fo1 != null){
          fo1.m3();
}
        fb1 = lb1 || lb0;
if(ao1 != null){
          fb0 = ao1.m2(fb1, lb1, lb0, fb0);
}
        fd0 = fd1 - ld3;
        fb1 = !lb1;
        lb0 = fd0 > fd1;
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
    double ld0 = 24.66582109391817;
    Output.points[2][4] += ld0;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
}
    fd1 = ld0 + ad1;
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[2][5] += ld0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        fb1 = !lb1;
if(ao2 != null){
          ao2.m1(ad1, ad2, ad3, ad4);
}
        fd0 = fd1 + ld0;
        Thought lo2 = Thought276.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
        boolean lb3 = false;
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
    double ld0 = 63.895852326194415;
if(ao1 != null){
      ab1 = ao1.m2();
}
    ab2 = fd0 > fd1;
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[2][6] -= ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
        ld0 *= -1;
    fb0 = fd0 > fd1;
    boolean lb1 = true;
    fb0 = ld0 > fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2);
}
    fd1 = ld0 - fd0;
    double ld2 = 222.25219749394913;
    fd0 = fd1 - ld0;
    double ld3 = 739.2352132887665;

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
    ab1 = ad2 < ad3;
    ab2 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    ad1 *= -1;
    double ld0 = 337.83652606510316;
    Thought lo1 = Thought22.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
    if (ab1) {
        ab2 = ab3 && ab4;
        fb0 = ld0 > ad1;
        boolean lb2 = true;
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao4 != null){
          ao3 = ao4.m4(fb0, fb1, lb2, ab1);
}
if(fo0 != null){
          ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        boolean lb3 = true;
if(fo0 != null){
          ao4 = fo0.m4(ld0, ad1, ad2, ad3, fb0, fb1, lb2, lb3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 *= -1;
    fd0 *= -1;
    Thought lo1 = Thought68.getInstance();
    fb0 = fb1 && lb0;
    double ld2 = 863.5351616688314;
    if (fb0) {
        boolean lb3 = false;
        fd0 = fd1 + ld2;
        fb0 = fb1 || lb3;
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
    Output.points[2][7] -= fd0;
if(fo0 != null){
          fo0.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 *= -1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    fd1 *= -1;
    boolean lb0 = true;
    double ld1 = 345.02281108879043;
    ld1 *= -1;
    ab2 = ab3 && ab4;
    boolean lb2 = false;
    ab4 = fd0 < fd1;
    Thought lo3 = Thought131.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 - fd1;
        Output.points[2][8] -= ld1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    if (fb0) {
        Output.points[3][0] += fd0;
        fb1 = fd1 > ad1;
        lb0 = ad2 < ad3;
if(fo0 != null){
          ad4 = fo0.m3(fb0, fb1, lb0, fb0);
}
        fd0 = fd1 + ad1;
        fb1 = ad2 < ad3;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
        fb1 = ad2 > ad3;
        } else {
        double ld1 = 231.64302303461542;
        Thought lo2 = Thought251.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
}
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 || ab3;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    fb1 = ab1 || ab2;
    boolean lb0 = false;
        ad4 *= -1;
    ab2 = ab3 || ab4;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 917.4630584445656;
    fb0 = !fb1;
    fd0 = fd1 + ld0;
    fb0 = fb1 && fb0;
    double ld1 = 567.595872749364;
    ld1 = fd0 - fd1;
    Thought lo2 = Thought279.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    ld1 *= -1;
    Output.points[3][1] += fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
}
    ld0 = ld1 - fd0;
    fb1 = fd1 > ld0;
    fb0 = fb1 || fb0;
    ld1 = fd0 + fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo0 = Thought251.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
        double ld1 = 122.61262366829177;
        Output.points[3][2] -= ad1;
        ad2 *= -1;
        fb1 = ad3 > ad4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
        fb0 = ad2 < ad3;
        fb1 = !fb0;
        }
if(ao3 != null){
      ao3.m3(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    ad3 *= -1;
    Output.points[3][3] += ad4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
    fb1 = fd0 > fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought398.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1();
}
    double ld3 = 655.5491671717602;
if(ao2 != null){
      ao1 = ao2.m4(lb1, lb2, ab1, ab2);
}
    boolean lb4 = true;
    for(int i0=0; i0<10; i0++){
        ab2 = fd0 > fd1;
        ab3 = ab4 || fb0;
        fb1 = !lb1;
        ld3 = fd0 + fd1;
        ld3 *= -1;
        double ld5 = 24.9423274157963;
        ld3 *= -1;
        lb2 = !lb4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld5, ld3, ab1, ab2, ab3, ab4);
}
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
    boolean lb0 = true;
if(ao1 != null){
      ab1 = ao1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
    Thought lo1 = Thought268.getInstance(ao2, ao3, ao4, fo0);
    ab3 = fd0 > fd1;
    ad1 = ad2 + ad3;
    Output.points[3][4] += ad4;
    ab4 = fb0 && fb1;
    fd0 = fd1 + ad1;
    Output.points[3][5] -= ad2;
    ad3 *= -1;
    lb0 = ab1 || ab2;
    ad4 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
}
    ab3 = !ab4;
    fb0 = fb1 || lb0;

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
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    Output.points[3][6] += fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    double ld1 = 773.0024839442816;
    fb1 = fd0 > fd1;
    Output.points[3][7] -= ld1;
    lb0 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Output.points[3][8] -= fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ld1 = fd0 + fd1;
    ld1 *= -1;
    boolean lb2 = false;
    Output.points[4][0] -= fd0;

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
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = !ab1;
    ab2 = ab3 && ab4;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
        fd1 = fd0 - fd1;
    Output.points[4][1] += fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    fd1 = fd0 + fd1;
    ab3 = !ab4;
    Output.points[4][2] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
    boolean lb1 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
    ad1 = ad2 + ad3;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = fb1 || lb0;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, fb0);
}
    Output.points[4][3] += ad1;
    Thought lo1 = Thought325.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2();
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(lb0, lb1, ab1, ab2);
}
    double ld2 = 307.994182535151;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ad1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
}
        fd1 = ld2 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ad2 *= -1;
    Output.points[4][4] -= ad3;

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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao1 != null){
      ao1.m2();
}
    fb1 = fb0 && fb1;
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = fd1 < fd0;
    lb0 = fd1 < fd0;
    boolean lb1 = true;
    Output.points[4][5] -= fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    lb1 = fb0 && fb1;

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
          fb0 = ao3.m2(fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo1 = Thought230.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = ad4 < fd0;
    fd1 *= -1;
    double ld2 = 815.7700209692687;
    ld2 = ad1 + ad2;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought114.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
        fd0 = fd1 + fd0;
    ab2 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    boolean lb1 = false;
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = lb1 && ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Thought lo2 = Thought312.getInstance(fd1, fd0, fd1, fd0, fb1, lb1, ab1, ab2);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd1, fd0, fd1, fd0);
}
    lb1 = !ab1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    boolean lb3 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
    fd0 = fd1 + fd0;
    ab1 = !ab2;

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
    boolean lb0 = false;
    ad2 *= -1;
    lb0 = !ab1;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
              fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
}}
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb0 = false;
    fb0 = fd1 < fd0;
    Output.points[4][6] -= fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fb1 = lb0 && fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Output.points[4][7] += fd1;

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
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    double ld0 = 537.7470902655006;
if(fo1 != null){
      ld0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    lb1 = fb0 || fb1;
    fd1 *= -1;
    lb1 = ld0 < fd0;
        fd1 *= -1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
