package genetic;
import java.util.ArrayList;
class Thought303 extends Thought{
private static ArrayList<Thought303> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 752.0059037030051;
private double fd1 = 346.6696181245351;
private Thought fo0 = null;
private Thought fo1 = null;
Thought303 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought303 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought303 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought303 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought303 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought303 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought303 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought303 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought303 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought303 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought303 instance = new Thought303 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    Thought lo2 = Thought1.getInstance(fo1, fo0, fo1, fo0, lb0, lb1, fb0, fb1);
    lb0 = !lb1;
    Thought lo3 = Thought23.getInstance(fo1, fo0, fo1, fo0);
    fb0 = fd1 > fd0;
    boolean lb4 = false;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
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
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    Output.points[2][1] -= fd0;
    Thought lo0 = Thought158.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    lb1 = fd1 > fd0;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought65.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2();
}
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        Thought lo0 = Thought269.getInstance(fb1, fb0, fb1, fb0);
        boolean lb1 = true;
        for(int i1=0; i1<10; i1++){
            Thought lo2 = Thought133.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
            boolean lb3 = true;
            fd0 = fd1 + ad1;
            fb0 = fb1 && lb3;
            lb1 = !fb0;
            ad2 = ad3 + ad4;
if(fo0 != null){
              fo1 = fo0.m4(fd0, fd1, ad1, ad2, fb1, lb3, lb1, fb0);
}
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fb1, lb3, lb1, fb0);
}
            fb1 = ad3 > ad4;
            for(int i2=0; i2<10; i2++){
                boolean lb4 = false;
                double ld5 = 643.192179686872;
                double ld6 = 677.5525448483062;
if(fo0 != null){
                  ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
                  fo1.m2(ad4, fd0, fd1, ld5);
}
if(fo0 != null){
                  fo0.m3(fo1, fo0, fo1, fo0, ld6, ad1, ad2, ad3);
}
                lb4 = lb3 && lb1;
                ad4 = fd0 - fd1;
                Thought lo7 = Thought37.getInstance();
                Thought lo8 = Thought139.getInstance(fb0, fb1, lb4, lb3);
}}}
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
    ab1 = ad1 > ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
    ab1 = fd1 < ad1;
    if (ab2) {
        ab3 = !ab4;
        Thought lo0 = Thought380.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
        ab4 = !fb0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        Thought lo1 = Thought74.getInstance(ad1, ad2, ad3, ad4);
        Output.points[2][2] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
        double ld2 = 569.3442105275851;
        fb1 = ad3 > ad4;
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
if(ao1 != null){
      fd1 = ao1.m3();
}
    fd0 = fd1 - fd0;
        if (fb1) {
if(ao2 != null){
          ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        boolean lb0 = true;
if(ao3 != null){
          ao3.m3(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
        fd1 = fd0 + fd1;
        boolean lb1 = true;
        fd0 = fd1 - fd0;
        lb1 = fd1 < fd0;
        double ld2 = 802.8228115826887;
        fd0 *= -1;
        fb0 = fd1 > ld2;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb1, fb0);
}
        Output.points[2][3] += fd0;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb1 = lb0 && lb1;
        } else {
        Thought lo3 = Thought145.getInstance(fd0, fd1, fd0, fd1);
        Thought lo4 = Thought310.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
        fd0 *= -1;
        Output.points[2][4] -= fd1;
        fb0 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
        fb1 = fd0 < fd1;
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
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    Thought lo1 = Thought244.getInstance(fb0, fb1, lb0, fb0);
    ad1 *= -1;
    ad2 = ad3 + ad4;
    Output.points[2][5] += fd0;
    fd1 = ad1 - ad2;
    fb1 = lb0 || fb0;
    fb1 = ad3 > ad4;
        fd0 = fd1 + ad1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ad1 = ad2 + ad3;
    fb1 = lb0 || fb0;
    ad4 *= -1;
    Thought lo2 = Thought380.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
    boolean lb3 = true;
    fd0 = fd1 - ad1;
    boolean lb4 = true;
    boolean lb5 = false;
    boolean lb6 = true;
    lb0 = !lb3;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb4 = lb5 && lb6;
    ad3 = ad4 + fd0;

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
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    ab3 = ab4 || fb0;
    boolean lb0 = false;
    boolean lb1 = false;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab4, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    fd1 *= -1;
    Thought lo2 = Thought377.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    boolean lb3 = true;
if(ao3 != null){
      ab4 = ao3.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
    Thought lo4 = Thought335.getInstance(ao4, fo0, fo1, ao1, lb3, ab1, ab2, ab3);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    boolean lb5 = false;
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    double ld6 = 942.5998385048069;
if(ao3 != null){
      ab3 = ao3.m2();
}
    ld6 *= -1;
    ab4 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(lb0, lb1, lb3, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, ld6, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    double ld7 = 686.9168071510472;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld6, ld7, lb1, lb3, lb5, ab1);
}
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
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
    ab2 = ad1 < ad2;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 378.6278418681648;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
    Thought lo1 = Thought323.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    Output.points[2][6] -= fd1;
if(ao1 != null){
      ao1.m2();
}
    Thought lo2 = Thought293.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;

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
    Thought lo0 = Thought59.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
    double ld1 = 892.7068359957298;
    fd0 *= -1;
    boolean lb2 = true;
    double ld3 = 826.8327652027536;
    lb2 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, ld3, lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
    lb2 = ld1 > ld3;
    fb0 = fd0 < fd1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought189.getInstance(ld3, fd0, fd1, ld1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
}
if(fo0 != null){
      fo0.m1();
}
    Output.points[2][7] -= ld3;
    boolean lb5 = true;

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
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld0 = 51.82198409275002;

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
    fb1 = fb0 || fb1;
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[2][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    Output.points[3][0] += ad1;
    ad2 = ad3 + ad4;
    boolean lb2 = true;
    lb2 = !fb0;
    Thought lo3 = Thought237.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, lb0, lb1, lb2);
    fb0 = !fb1;
    lb0 = lb1 && lb2;

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
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    Output.points[3][1] += fd0;
    boolean lb0 = true;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    lb1 = lb2 || ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    double ld3 = 916.6232210848042;
    ad3 *= -1;
    Thought lo4 = Thought271.getInstance(ab3, ab4, fb0, fb1);
    for(int i0=0; i0<10; i0++){
        lb0 = ad4 > fd0;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, lb1, lb2, ab1, ab2);
}
        Thought lo5 = Thought50.getInstance(ad4, fd0, fd1, ld3, ab3, ab4, fb0, fb1);
        boolean lb6 = true;
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
      ao1.m1(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 && fb1;
    fd1 = fd0 + fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[3][2] -= fd0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
}
        double ld1 = 795.7210864460569;
    double ld2 = 612.2226429578693;
    if (fb1) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld2, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        ld2 = fd0 + fd1;
        fb0 = ld1 < ld2;
        Output.points[3][3] += fd0;
if(fo0 != null){
          fo0.m1(fd1, ld1, ld2, fd0, fb1, lb0, fb0, fb1);
}
        boolean lb3 = false;
        Output.points[3][4] -= fd1;
        double ld4 = 84.26948410597325;
        ld4 *= -1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 || fb1;
    Output.points[3][5] -= ad2;
    fb0 = ad3 > ad4;
    Thought lo0 = Thought78.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld1 = 640.7604568053314;
if(ao1 != null){
      ad1 = ao1.m3();
}
    Output.points[3][6] -= ad2;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ld1;
    ad1 *= -1;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
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
        Thought lo0 = Thought326.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    double ld1 = 35.562556089678836;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    double ld2 = 29.770247905610535;
    ab2 = ld1 > ld2;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 = ld1 + ld2;
    double ld3 = 130.89773898509338;
    ab3 = ld3 < fd0;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, ld2, ld3);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    Thought lo4 = Thought238.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ld2);

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
if(ao1 != null){
      ab1 = ao1.m2();
}
    ab2 = ad1 > ad2;
if(ao2 != null){
      ab3 = ao2.m2(ab4, fb0, fb1, ab1);
}
    ad3 *= -1;
    ab2 = ab3 || ab4;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = false;
    double ld1 = 964.5331026914722;
    Thought lo2 = Thought340.getInstance(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
    Thought lo3 = Thought358.getInstance(ao2, ao3, ao4, fo0);

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    if (lb0) {
if(fo1 != null){
          fo1.m2(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb1 = false;
if(fo1 != null){
          fd1 = fo1.m3();
}
if(fo0 != null){
          fd0 = fo0.m3(fb0, fb1, lb1, lb0);
}
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
}
        Thought lo2 = Thought306.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb0);
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = fd0 > fd1;
        fd0 *= -1;
        lb1 = lb0 && fb0;
if(fo1 != null){
          fb1 = fo1.m2(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        lb1 = lb0 || fb0;
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
    boolean lb0 = false;
    if (lb0) {
        ab1 = ab2 && ab3;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
        ab4 = fb0 && fb1;
        boolean lb1 = true;
        lb1 = lb0 || ab1;
        ab2 = ab3 && ab4;
        fd1 *= -1;
        fd0 *= -1;
        fb0 = fd1 < fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb2 = true;
if(fo1 != null){
          fd1 = fo1.m3();
}
        boolean lb3 = false;
        Output.points[3][7] += fd0;
        Thought lo4 = Thought105.getInstance(ab4, fb0, fb1, lb1);
        fd1 *= -1;
        for(int i0=0; i0<10; i0++){
            Thought lo5 = Thought100.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb2, lb3, lb0, ab1);
            Output.points[3][8] += fd0;
            fd1 = fd0 + fd1;
            fd0 = fd1 - fd0;
            fd1 *= -1;
            }
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Thought lo6 = Thought260.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb2, lb3);
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
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    for(int i0=0; i0<10; i0++){
        ad4 = fd0 - fd1;
        fb1 = ad1 < ad2;
        boolean lb0 = true;
        ad3 = ad4 + fd0;
        lb0 = fb0 && fb1;
if(fo1 != null){
          fo1.m3();
}
        Thought lo1 = Thought184.getInstance(lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
        boolean lb3 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] -= ad1;
    ad2 *= -1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought239.getInstance(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    ab4 = fb0 || fb1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    ab4 = !fb0;
    fb1 = ad1 > ad2;
    lb1 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld2 = 512.2691661821199;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[4][1] -= fd1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    double ld0 = 703.1083659969852;
    fb1 = fb0 && fb1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
        fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ld0 = fd0 + fd1;
    fb0 = ld0 > fd0;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought353.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fd1 > ad1;
    ad2 *= -1;
if(ao1 != null){
      ao1.m1(ad3, ad4, fd0, fd1);
}
    double ld1 = 851.6434369195636;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3);
}
    boolean lb2 = true;
    ad4 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m2(lb2, fb0, fb1, lb2);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld1, ad1, ad2, ad3, fb1, lb2, fb0, fb1);
}
    ad4 *= -1;
if(ao4 != null){
      lb2 = ao4.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb2, fb0);
}
    ad2 = ad3 - ad4;

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
    Thought lo0 = Thought361.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    fb1 = !ab1;
    ab2 = !ab3;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;
    double ld2 = 704.3028854607617;
if(fo1 != null){
      ld2 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ld2, fd0);
}
    fd1 = ld2 + fd0;
    Thought lo3 = Thought80.getInstance();
    Thought lo4 = Thought283.getInstance(ab4, fb0, fb1, lb1);

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
    ab2 = ab3 && ab4;
    double ld0 = 98.77012360370136;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld0, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    double ld1 = 60.33180140623567;
    double ld2 = 42.077853261578674;
    boolean lb3 = false;
    ab4 = ld1 > ld2;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1);
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
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = lb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    boolean lb2 = false;
    double ld3 = 130.34524276907365;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld3, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, lb1, lb2, fb0);
}
    ld3 *= -1;
    boolean lb4 = true;
    double ld5 = 102.0957807397525;
    boolean lb6 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld5, fd0, fd1, ld3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld3);
}
    lb6 = ld5 < fd0;
    fb0 = fd1 > ld3;
    ld5 *= -1;
    fb1 = lb0 || lb1;
    for(int i0=0; i0<10; i0++){
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
    double ld0 = 574.674667158421;
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought390.getInstance(ab4, fb0, fb1, ab1);
    Thought lo2 = Thought301.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Thought lo3 = Thought192.getInstance(fo1, fo0, fo1, fo0);
    boolean lb4 = true;
    fd1 = ld0 + fd0;
if(fo1 != null){
      fo1.m2(fd1, ld0, fd0, fd1);
}
    Output.points[4][2] -= ld0;
    fd0 = fd1 - ld0;
    boolean lb5 = false;

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
        ad2 = ad3 - ad4;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    Output.points[4][3] += ad3;
    Thought lo2 = Thought45.getInstance();
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2(lb1, lb3, fb0, fb1);
}
    lb0 = lb1 && lb3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
    lb3 = fb0 || fb1;
    lb0 = ad2 < ad3;
    lb1 = lb3 && fb0;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb1, lb0, lb1, lb3);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    double ld0 = 108.78469919555295;
    Thought lo1 = Thought55.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fb1 = fo1.m2(ad1, ad2, ad3, ad4);
}
    Output.points[4][4] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    Thought lo2 = Thought340.getInstance();
if(fo1 != null){
      fo1.m1(ab1, ab2, ab3, ab4);
}
    double ld3 = 942.4450416099272;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 = ld3 - ad1;
    ab4 = fb0 && fb1;
    ab1 = ad2 > ad3;

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
    fb1 = fb0 && fb1;
    Output.points[4][5] += fd1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      fb1 = ao1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    boolean lb0 = true;
    Output.points[4][6] -= fd0;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    lb0 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
    Output.points[4][7] -= fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo1 = Thought343.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = ad1 < ad2;
    fb1 = fb0 && fb1;
    boolean lb0 = false;
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    fd1 = ad1 - ad2;
    boolean lb2 = false;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1);
}
    lb0 = ad1 > ad2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      lb1 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(lb2, fb0, fb1, lb0);
}
    ad1 *= -1;
    lb1 = lb2 || fb0;
    fb1 = ad2 > ad3;
    lb0 = ad4 > fd0;
if(fo1 != null){
      lb1 = fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
    Output.points[4][8] -= ad4;
    Output.points[5][0] += fd0;
    lb1 = fd1 < ad1;
if(fo0 != null){
      lb2 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ad1 + ad2;
    lb2 = fb0 && fb1;
    boolean lb3 = false;

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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    Output.points[5][1] += fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought386.getInstance(fd1, fd0, fd1, fd0);
    Output.points[5][2] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 *= -1;
if(ao3 != null){
      ab1 = ao3.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
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
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        Thought lo0 = Thought65.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
        double ld1 = 81.81871019043685;
        ad3 *= -1;
if(ao1 != null){
          ad4 = ao1.m3();
}
        ab2 = ab3 && ab4;
if(ao2 != null){
          ao2.m1(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought375.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
        ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        boolean lb3 = false;
        Output.points[5][3] -= ad1;
        boolean lb4 = false;
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
    fd0 = fd1 - fd0;
    boolean lb0 = false;
        fb0 = !fb1;
    double ld1 = 116.65022542225427;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    double ld3 = 563.8236220912597;
    Thought lo4 = Thought70.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld3);
    lb0 = lb2 && fb0;
        boolean lb5 = true;
if(fo1 != null){
      fo1.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
    fd0 = fd1 + ld1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fd1 < fd0;
    double ld0 = 379.61821871014007;
    boolean lb1 = false;
    fb0 = fb1 && lb1;
    fb0 = fb1 || lb1;
    fb0 = fb1 || lb1;
    Output.points[5][4] += fd0;
    Thought lo2 = Thought72.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
        double ld3 = 903.4709513596791;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld3, fd0, fd1);
}
    lb1 = ld0 < ld3;
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    Thought lo0 = Thought243.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb1 = !fb0;
    Thought lo1 = Thought169.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    Thought lo2 = Thought327.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
}
