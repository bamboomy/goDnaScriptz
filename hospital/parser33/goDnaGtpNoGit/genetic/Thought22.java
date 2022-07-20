package genetic;
import java.util.ArrayList;
class Thought22 extends Thought{
private static ArrayList<Thought22> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 339.0491829411029;
private double fd1 = 647.4615787045384;
private Thought fo0 = null;
private Thought fo1 = null;
Thought22 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought22 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought22 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought22 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought22 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought22 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought22 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought22 instance = new Thought22 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 811.8219342885244;
    double ld2 = 741.7820952249656;
    fb0 = !fb1;
    lb0 = fb0 && fb1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld1 = ld2 + fd0;
    fd1 = ld1 - ld2;
    Thought lo4 = Thought370.getInstance(lb0, lb3, fb0, fb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2, lb0, lb3, fb0, fb1);
}
    lb0 = fd0 > fd1;
    double ld5 = 887.0547177977704;
if(fo1 != null){
      fo1.m2(ld1, ld2, ld5, fd0, lb3, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb0);
}
    fd1 *= -1;
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld1 = ld2 + ld5;

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
    boolean lb0 = false;
    if (lb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab1 = ab2 && ab3;
        ab4 = fd1 > fd0;
        fb0 = fd1 < fd0;
        fb1 = fd1 < fd0;
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb1 = fd1 > fd0;
if(fo0 != null){
          lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        Output.points[4][8] -= fd1;
        boolean lb2 = true;
        boolean lb3 = true;
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    for(int i0=0; i0<10; i0++){
        ad1 *= -1;
        ad2 *= -1;
if(fo0 != null){
          ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ad4 = fd0 + fd1;
        Output.points[5][0] -= ad1;
        ad2 *= -1;
        fb1 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
        double ld0 = 78.60348048698856;
        fb1 = fb0 || fb1;
        boolean lb1 = false;
        lb1 = fb0 || fb1;
        lb1 = fb0 && fb1;
        Output.points[5][1] += ld0;
        boolean lb2 = true;
        boolean lb3 = false;
        boolean lb4 = true;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        for(int i1=0; i1<10; i1++){
            Thought lo5 = Thought170.getInstance();
            boolean lb6 = false;
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    ad2 = ad3 + ad4;
    ab4 = fb0 && fb1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 *= -1;
        boolean lb0 = false;
    Thought lo1 = Thought100.getInstance(fd0, fd1, ad1, ad2, lb0, ab1, ab2, ab3);
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    fd0 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    ab4 = ad2 > ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad1 = ad2 + ad3;
    double ld2 = 779.6649488541062;
if(fo0 != null){
      ad3 = fo0.m3(fb0, fb1, lb0, ab1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    boolean lb0 = true;
    double ld1 = 243.45834353419852;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1);
}
    lb0 = ld1 < fd0;
    boolean lb2 = false;
if(ao2 != null){
      ao2.m3();
}
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
}
    ld1 = fd0 + fd1;
    boolean lb3 = true;
    fb0 = !fb1;
    boolean lb4 = false;
    Thought lo5 = Thought156.getInstance(ld1, fd0, fd1, ld1, lb0, lb2, lb3, lb4);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb2);
}
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    lb3 = fd1 > ld1;
    lb4 = fd0 > fd1;
    fb0 = ld1 > fd0;

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
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought303.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
        Output.points[5][2] -= ad1;
if(fo1 != null){
          fo1.m1();
}
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
        }
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
    Thought lo3 = Thought30.getInstance(fd1, ad1, ad2, ad3, lb0, lb2, fb0, fb1);
    boolean lb4 = true;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, lb2, lb4, fb0, fb1);
}
    lb0 = lb2 && lb4;

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
    ab2 = ab3 || ab4;
    double ld0 = 547.7250411032373;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought249.getInstance(ao2, ao3, ao4, fo0);
    fb1 = ab1 || ab2;
    ab3 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, fd0);
}
    ab4 = fd1 < ld0;
    Output.points[5][3] -= fd0;
if(fo1 != null){
      fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 + fd1;
    Thought lo2 = Thought388.getInstance(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    Output.points[5][4] -= fd0;

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
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = ad3 > ad4;
    fd0 *= -1;
    double ld0 = 499.33294166586256;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab1 = ab2 && ab3;
    Thought lo1 = Thought69.getInstance(fd0, fd1, ld0, ad1);
    Output.points[5][5] -= ad2;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        fb0 = fb1 && ab1;
        ab2 = ld0 > ad1;
        ab3 = ab4 && fb0;
if(ao2 != null){
          ao1 = ao2.m4();
}
        double ld2 = 610.3749921981868;
        double ld3 = 391.0407106107681;
        }
if(ao4 != null){
      ao3 = ao4.m4(fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb4 = false;
    fb0 = ad2 > ad3;
    fb1 = lb4 && ab1;

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
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    Output.points[5][6] -= fd1;
    fb1 = fd0 > fd1;
        Output.points[5][7] -= fd0;
    Output.points[5][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 499.0454631439832;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ld0 = fd0 + fd1;
        ld0 = fd0 + fd1;
        double ld1 = 101.46481611057493;
        Output.points[6][0] -= ld0;
if(fo1 != null){
          fo0 = fo1.m4(ld1, fd0, fd1, ld0);
}
        fb0 = fb1 || fb0;
        for(int i1=0; i1<10; i1++){
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought114.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fd1 > fd0;
    fb1 = ab1 || ab2;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
    double ld1 = 754.1574052275669;
    ld1 = fd0 - fd1;
if(fo1 != null){
      ab1 = fo1.m2(ld1, fd0, fd1, ld1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
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
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo0 = Thought114.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought395.getInstance(fo1, fo0, fo1, fo0);
    fd0 = fd1 + ad1;
    boolean lb2 = false;
    double ld3 = 42.91866723436612;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2);
}
    boolean lb4 = true;
    boolean lb5 = false;
    lb2 = lb4 && lb5;
    fb0 = ad3 > ad4;
    fb1 = fd0 > fd1;
    ld3 = ad1 + ad2;

Thought.STACK_COUNTER++;
return lb2;
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
    ad3 = ad4 + fd0;
    boolean lb0 = false;
    ab1 = ab2 || ab3;
    Thought lo1 = Thought199.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    double ld2 = 984.6317341487132;
    Output.points[6][1] -= ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb3 = true;

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
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
        fb0 = fb1 && lb0;
        double ld1 = 889.7916408860003;
        ld1 *= -1;
        fb0 = fb1 || lb0;
        boolean lb2 = false;
        fd0 = fd1 - ld1;
        lb2 = fd0 < fd1;
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
    boolean lb0 = false;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    double ld1 = 945.0536222004743;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd0 = fd1 + ld1;
    fb1 = lb0 || fb0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb0, fb0, fb1);
}
    Thought lo2 = Thought112.getInstance(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
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
    ab1 = ab2 && ab3;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    lb0 = fd1 < fd0;
    boolean lb2 = false;
    Thought lo3 = Thought372.getInstance(ao1, ao2, ao3, ao4);
    boolean lb4 = false;
    fd1 *= -1;
    Thought lo5 = Thought323.getInstance(fd0, fd1, fd0, fd1);
    Thought lo6 = Thought64.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    lb1 = fd0 > fd1;
    lb2 = lb4 || ab1;
    ab2 = !ab3;
if(ao3 != null){
      ab4 = ao3.m2();
}
    Thought lo7 = Thought49.getInstance(fb0, fb1, lb0, lb1);
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb4, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    Output.points[6][2] += fd0;
    Thought lo8 = Thought94.getInstance(fo0, fo1, ao1, ao2, lb1, lb2, lb4, ab1);
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
        lb0 = !lb1;
    boolean lb9 = false;
    lb2 = lb4 && lb9;

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
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld0 = 128.74272828192935;
if(ao4 != null){
      ao3 = ao4.m4(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
if(fo0 != null){
      ld0 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought160.getInstance(fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
    fb1 = ab1 || ab2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    ab1 = ad2 < ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    double ld2 = 287.861836247789;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    ab2 = !ab3;
if(ao4 != null){
      ao4.m2(ld0, ld2, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        ab4 = fb0 || fb1;
        ad3 *= -1;
        Output.points[6][3] += ad4;
        boolean lb3 = false;
        fd0 = fd1 - ld0;
        ld2 = ad1 + ad2;
        Thought lo4 = Thought347.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Output.points[6][4] -= fd0;
    Output.points[6][5] += fd1;
        double ld1 = 987.796485182843;
    Thought lo2 = Thought88.getInstance(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
    fd0 *= -1;
    fb0 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, fd0);
}
    Thought lo3 = Thought21.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
    fb0 = ld1 < fd0;
    Thought lo4 = Thought334.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);

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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab1) {
        } else if (ab2) {
        ab3 = !ab4;
        Thought lo0 = Thought364.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        Output.points[6][6] -= fd1;
        ab1 = ab2 && ab3;
        ab4 = fb0 && fb1;
        Thought lo1 = Thought299.getInstance(fo1, fo0, fo1, fo0);
        for(int i0=0; i0<10; i0++){
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    double ld1 = 930.3348005968382;
    lb0 = ad4 > fd0;
        for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        ld1 = ad1 + ad2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ld1);
}
        boolean lb2 = false;
        Output.points[6][7] += ad1;
        boolean lb3 = false;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
        double ld4 = 508.39506525373776;
        lb3 = ad1 > ad2;
        ad3 = ad4 + fd0;
        double ld5 = 616.0346741600088;
        Thought lo6 = Thought280.getInstance();
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb2);
}
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld4, ld5, lb0, fb0, fb1, lb2);
}
if(fo1 != null){
          lb3 = fo1.m2(ld1, ad1, ad2, ad3, lb0, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb3, lb0, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        boolean lb7 = false;
        Thought lo8 = Thought194.getInstance(ad4, fd0, fd1, ld4);
        ld5 = ld1 - ad1;
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
    ad2 *= -1;
    Output.points[6][8] -= ad3;
    ad4 = fd0 + fd1;
    ab1 = !ab2;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][0] += fd1;
    Thought lo0 = Thought60.getInstance(ab3, ab4, fb0, fb1);
    Thought lo1 = Thought112.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    double ld0 = 943.113743100707;
    fb1 = !fb0;
    boolean lb1 = true;
        fb0 = fd0 < fd1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb2);
}
    boolean lb3 = false;
    double ld4 = 421.14166411733015;
    lb3 = !fb0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    ld0 = ld4 - fd0;
    fb1 = lb1 && lb2;
    lb3 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ld4, fd0);
}
    double ld5 = 131.7862731004102;
    fb1 = fd0 < fd1;
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, ld4, ld5, fd0, fd1);
}
    lb1 = lb2 && lb3;
    fb0 = ld0 > ld4;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb6 = false;
if(ao4 != null){
      ld5 = ao4.m3(fb0, fb1, lb1, lb2);
}
    fd0 = fd1 - ld0;

Thought.STACK_COUNTER++;
return ld4;
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo1.m1(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb0);
}
    Thought lo2 = Thought321.getInstance(fo1, ao1, ao2, ao3);
    lb1 = !fb0;
    fb1 = ad4 < fd0;
    Thought lo3 = Thought399.getInstance(fd1, ad1, ad2, ad3);
    Output.points[7][1] -= ad4;
    lb0 = lb1 || fb0;
    boolean lb4 = true;
    fb0 = fb1 || lb0;

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
    ab2 = fd1 < fd0;
    Thought lo0 = Thought238.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    Output.points[7][2] += fd0;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab3 = fd1 > fd0;
    ab4 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought98.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 = fd0 - fd1;
    ab1 = !ab2;
    fd0 *= -1;
    boolean lb2 = true;
    ab2 = !ab3;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb2);
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = ab4 || fb0;
    fb1 = fd1 < fd0;
    lb2 = ab1 || ab2;
    Thought lo3 = Thought249.getInstance(fd1, fd0, fd1, fd0);

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
    ad1 *= -1;
    ab2 = ad2 > ad3;
    ab3 = ab4 && fb0;
    Output.points[7][3] += ad4;
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, ab1);
}
    double ld1 = 659.3972995157659;
    Output.points[7][4] -= ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, ld1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    double ld3 = 573.0476716786967;
    fb0 = ld1 > ld3;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
        ad4 = fd0 + fd1;
if(ao3 != null){
          ao2 = ao3.m4(ld1, ld3, ad1, ad2, fb1, lb0, lb2, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
        ad3 = ad4 + fd0;
        fd1 = ld1 - ld3;
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        double ld4 = 326.15629743579564;
if(ao3 != null){
          lb0 = ao3.m2(ld3, ad1, ad2, ad3);
}
        boolean lb5 = true;
        ad4 = fd0 + fd1;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 516.2872377627784;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought183.getInstance(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
    ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    lb1 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || lb1;
    fd0 = fd1 - ld0;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    Thought lo3 = Thought188.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
    Output.points[7][5] -= fd1;
if(fo0 != null){
      ld0 = fo0.m3();
}
    boolean lb4 = false;

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
    ab1 = ab2 || ab3;
    Output.points[7][6] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, ab1);
}
    double ld0 = 70.51398163193547;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb1, ab1, ab2, ab3);
}
    Thought lo1 = Thought221.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    ab2 = !ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    ab4 = fb0 && fb1;
    fd0 = fd1 - ld0;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0);
}
    ab1 = fd0 < fd1;
    ab2 = !ab3;
    ab4 = fb0 && fb1;
    ld0 = fd0 + fd1;
    lb2 = ld0 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    ab1 = ld0 > fd0;
if(fo0 != null){
      fo0.m1();
}
    fd1 = ld0 - fd0;

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
    fb0 = ad4 < fd0;
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      lb0 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ad1 *= -1;
    if (fb1) {
        ad2 *= -1;
        lb0 = lb1 || fb0;
        ad3 = ad4 - fd0;
        Output.points[7][7] += fd1;
        Output.points[7][8] += ad1;
if(fo1 != null){
          fb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
        boolean lb2 = true;
        Thought lo3 = Thought59.getInstance(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
        lb2 = ad4 < fd0;
        double ld4 = 911.374145287422;
        lb0 = lb1 && fb0;
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
    boolean lb0 = true;
    if (lb0) {
if(fo1 != null){
          ad2 = fo1.m3();
}
        ad3 *= -1;
        ab1 = ad4 > fd0;
        ab2 = ab3 && ab4;
        fd1 = ad1 - ad2;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, ab1);
}
        ab2 = ad3 > ad4;
        boolean lb1 = true;
        ab2 = ab3 && ab4;
        Thought lo2 = Thought343.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb0);
        boolean lb3 = true;
        if (lb0) {
if(fo0 != null){
              ab1 = fo0.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
            Output.points[8][0] += ad1;
            fb1 = ad2 > ad3;
            lb1 = lb3 && lb0;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
            ad4 = fd0 - fd1;
}}
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
    fd0 = fd1 - fd0;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[8][1] -= fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        fd0 = fd1 - fd0;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        Output.points[8][2] += fd0;
        fd1 *= -1;
        fb1 = !fb0;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fd1 = fo1.m3();
}
        }
    boolean lb0 = true;

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
    boolean lb0 = false;
    ad1 = ad2 - ad3;
    fb0 = !fb1;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m2(lb0, lb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, lb0, lb1, fb0, fb1);
}
    Thought lo2 = Thought215.getInstance(fd1, ad1, ad2, ad3, lb0, lb1, fb0, fb1);
    lb0 = ad4 < fd0;
    if (lb1) {
        fb0 = fd1 > ad1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
        Thought lo3 = Thought5.getInstance(ao2, ao3, ao4, fo0);
        double ld4 = 265.2747926117141;
if(ao1 != null){
          fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
        fb1 = lb0 && lb1;
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld4, ad1);
}
        ad2 = ad3 + ad4;
        fd0 *= -1;
        fd1 = ld4 + ad1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
          fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ab1 = ao4.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
if(ao4 != null){
          ab1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        fd1 = fd0 + fd1;
if(ao4 != null){
          ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
        ab2 = ab3 && ab4;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
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
if(ao1 != null){
      ab1 = ao1.m2();
}
    Output.points[8][3] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        Output.points[8][4] -= ad3;
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
        boolean lb0 = true;
        for(int i1=0; i1<10; i1++){
            ad3 *= -1;
if(ao4 != null){
              ao3 = ao4.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
            Thought lo1 = Thought13.getInstance(fo0, fo1, ao1, ao2, lb0, ab1, ab2, ab3);
            ab4 = fb0 && fb1;
            Output.points[8][5] -= ad2;
            lb0 = ad3 > ad4;
            double ld2 = 376.4152828047323;
            ab1 = ad4 > fd0;
            boolean lb3 = true;
            fd1 = ld2 + ad1;
            boolean lb4 = true;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
            Output.points[8][6] -= ad2;
if(ao3 != null){
              ao3.m1(ad3, ad4, fd0, fd1);
}
            boolean lb5 = false;
            Thought lo6 = Thought108.getInstance(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3);
if(ao3 != null){
              ao2 = ao3.m4();
}
if(fo0 != null){
              ao4 = fo0.m4(lb5, lb0, ab1, ab2);
}
            ad4 = fd0 - fd1;
            }
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, lb0, ab1, ab2);
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought353.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    fb1 = fd0 < fd1;
    lb0 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = !lb2;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 || lb2;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    double ld4 = 292.18788479249054;

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
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought25.getInstance(fo0, fo1, fo0, fo1);
    Output.points[8][7] += fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 815.9666525306818;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    double ld2 = 34.644668237683746;
if(fo1 != null){
      ld2 = fo1.m3();
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Thought lo0 = Thought119.getInstance(fb1, fb0, fb1, fb0);
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought160.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
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
