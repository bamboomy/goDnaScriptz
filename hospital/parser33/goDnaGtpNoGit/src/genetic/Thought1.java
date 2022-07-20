package genetic;
import java.util.ArrayList;
class Thought1 extends Thought{
private static ArrayList<Thought1> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 24.322062918615064;
private double fd1 = 701.5352462575808;
private Thought fo0 = null;
private Thought fo1 = null;
Thought1 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought1 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought1 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought1 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought1 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought1 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought1 instance = new Thought1 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[4][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 159.12131981194867;
    fb1 = fd0 > fd1;
    fb0 = ld0 > fd0;
    fb1 = fd1 < ld0;
    fd0 = fd1 - ld0;
    fb0 = fd0 < fd1;
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ld0 - fd0;
    boolean lb1 = false;
    Thought lo2 = Thought27.getInstance(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
    ld0 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    ld0 = fd0 - fd1;
    double ld3 = 921.4714657672561;
    ld0 = ld3 - fd0;
    fd1 = ld0 - ld3;
    fd0 *= -1;
    Thought lo4 = Thought150.getInstance(fo1, fo0, fo1, fo0);

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
    ab1 = ab2 && ab3;
    double ld0 = 264.51920547938005;
    ab4 = fd0 < fd1;
    ld0 = fd0 + fd1;
    boolean lb1 = true;
    if (ab4) {
        fb0 = !fb1;
        double ld2 = 221.87343131384836;
        ld2 *= -1;
        double ld3 = 857.0195632159855;
        boolean lb4 = false;
        } else if (lb1) {
        fd0 = fd1 + ld0;
        fd0 *= -1;
        fd1 *= -1;
        Thought lo5 = Thought26.getInstance(ld0, fd0, fd1, ld0);
        double ld6 = 965.0131905898315;
if(fo1 != null){
          ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld6, ld0);
}
        Output.points[4][6] -= fd0;
        fd1 = ld6 - ld0;
if(fo1 != null){
          fo0 = fo1.m4();
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
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        Thought lo2 = Thought339.getInstance(fo0, fo1, fo0, fo1);
        lb1 = ad3 > ad4;
        lb0 = fd0 > fd1;
        ad1 = ad2 - ad3;
        Output.points[4][7] -= ad4;
if(fo0 != null){
          fb0 = fo0.m2(fd0, fd1, ad1, ad2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
        Output.points[4][8] += ad1;
if(fo1 != null){
          ad2 = fo1.m3();
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
    double ld0 = 345.5788210468974;
    boolean lb1 = false;
    lb1 = ab1 && ab2;
    ld0 *= -1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought94.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, lb1, ab1, ab2, ab3);
    boolean lb3 = true;
    boolean lb4 = true;
    ab2 = ab3 && ab4;
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld0, ad1, ad2, fb1, lb1, lb3, lb4);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    boolean lb5 = false;
    ad4 *= -1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought192.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = fb0 || fb1;
if(fo1 != null){
      lb1 = fo1.m2();
}
    fb0 = fd1 < fd0;
if(ao1 != null){
      ao1.m1(fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    double ld2 = 381.3786223025285;

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
    boolean lb1 = false;
    ad2 = ad3 + ad4;
    double ld2 = 805.127858959056;
    Output.points[5][0] += ad4;
    lb0 = lb1 && fb0;
    fd0 = fd1 - ld2;
    fb1 = lb0 || lb1;
    Thought lo3 = Thought63.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
    fb0 = ad1 > ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, ao1, ao2, ao3);
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
    ab2 = !ab3;
if(ao2 != null){
      ab4 = ao2.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[5][1] += fd0;
if(ao2 != null){
      ao2.m1();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought293.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
if(ao3 != null){
      ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
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
    double ld0 = 832.8628983821579;
    ld0 *= -1;
    Output.points[5][2] += ad1;
    ab2 = ab3 || ab4;
    Thought lo1 = Thought231.getInstance(ao1, ao2, ao3, ao4);
            Thought lo2 = Thought232.getInstance(ad2, ad3, ad4, fd0);
    Output.points[5][3] += fd1;
    fb0 = fb1 && ab1;
    ld0 = ad1 + ad2;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
}
    Output.points[5][4] += ld0;
    ad1 = ad2 - ad3;
    Thought lo3 = Thought141.getInstance();
    ad4 = fd0 - fd1;
    boolean lb4 = false;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[5][5] += ld0;
    fb1 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb4, ab1, ab2, ab3);
}
    ab4 = ld0 < ad1;
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb4, ab1, ab2);
}
    boolean lb5 = true;
    ab2 = ab3 || ab4;
    fd1 *= -1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb4, lb5);
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
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    double ld0 = 89.27016533942823;
    ld0 = fd0 + fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    ld0 = fd0 + fd1;
    boolean lb1 = false;
    Output.points[5][6] += ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd1, ld0, fd0, fd1, lb1, fb0, fb1, lb1);
}
    boolean lb2 = false;
    boolean lb3 = false;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought165.getInstance(fo0, fo1, fo0, fo1);
    Output.points[5][7] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
if(fo0 != null){
      ab4 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought299.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb1, ab1);
if(fo1 != null){
          fo1.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fd1 = fd0 + fd1;
        fd0 = fd1 - fd0;
        fb1 = lb1 && ab1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought228.getInstance(fo0, fo1, fo0, fo1);
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
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb0 = fb1 || fb0;
    fb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought235.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    Thought lo1 = Thought323.getInstance(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought350.getInstance(fo0, fo1, fo0, fo1);
    boolean lb3 = false;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    Output.points[5][8] += fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb4 = true;
    boolean lb5 = true;
    boolean lb6 = true;
    Thought lo7 = Thought292.getInstance();
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m1(lb5, lb6, fb0, fb1);
}
        lb3 = fd0 > fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 + ad1;
    fb0 = ad2 < ad3;
    Thought lo0 = Thought228.getInstance(ad4, fd0, fd1, ad1, fb1, ab1, ab2, ab3);
    ab4 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought82.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 16.5949439798301;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ad2 = ad3 + ad4;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, ad1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    ad2 = ad3 + ad4;
    lb3 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 - fd1;
        boolean lb1 = true;
        fd0 = fd1 + fd0;
        double ld2 = 291.01971639904207;
        boolean lb3 = true;
        lb3 = lb0 || fb0;
        fb1 = lb1 || lb3;
        boolean lb4 = false;
        lb4 = lb0 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0);
}
        fb1 = fd1 > ld2;
        lb1 = lb3 || lb4;
        fd0 = fd1 + ld2;
        double ld5 = 948.6223157156651;
        lb0 = fb0 || fb1;
if(ao4 != null){
          ao3 = ao4.m4();
}
if(fo0 != null){
          fo0.m1(lb1, lb3, lb4, lb0);
}
        double ld6 = 418.51844780098037;
        Thought lo7 = Thought141.getInstance(fo1, ao1, ao2, ao3, ld5, ld6, fd0, fd1, fb0, fb1, lb1, lb3);
        if (lb4) {
            Output.points[6][0] += ld2;
            boolean lb8 = true;
if(fo0 != null){
              ao4 = fo0.m4(ld5, ld6, fd0, fd1, lb4, lb0, fb0, fb1);
}
}}
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
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Output.points[6][1] += ad4;
    fd0 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      fd1 = ao2.m3();
}
if(ao3 != null){
      ad1 = ao3.m3(lb1, fb0, fb1, lb0);
}
    lb1 = ad2 > ad3;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, fb1, lb0, lb1, fb0);
}
    Thought lo2 = Thought191.getInstance(ad2, ad3, ad4, fd0, fb1, lb0, lb1, fb0);
    fb1 = fd1 > ad1;
    Thought lo3 = Thought340.getInstance(ao3, ao4, fo0, fo1, lb0, lb1, fb0, fb1);
    double ld4 = 189.35104366690118;
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    lb1 = ad1 < ad2;
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ld4 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld4);
}
    Output.points[6][2] += ad1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld5 = 599.3585328955693;
    fb0 = fb1 || lb0;
    lb1 = ad1 < ad2;
    Thought lo6 = Thought152.getInstance(fb0, fb1, lb0, lb1);

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
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo0 = Thought356.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
        double ld1 = 63.99261714270351;
        fd0 *= -1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
          fo1 = ao1.m4(fd1, ld1, fd0, fd1);
}
        ld1 *= -1;
        double ld2 = 312.53231661190955;
        Thought lo3 = Thought335.getInstance(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld1);
        if (ab4) {
            boolean lb4 = true;
            } else {
            for(int i0=0; i0<10; i0++){
                double ld5 = 629.1252361523849;
if(ao1 != null){
                  fo1 = ao1.m4();
}
                ld1 *= -1;
                boolean lb6 = true;
                Thought lo7 = Thought260.getInstance(ab4, fb0, fb1, lb6);
if(ao2 != null){
                  ao2.m3(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld5, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
                  ao1 = ao2.m4(ld1, ld2, fd0, fd1, fb0, fb1, lb6, ab1);
}
                ab2 = ld5 < ld1;
                ld2 *= -1;
}}}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    fd1 *= -1;
    Thought lo0 = Thought35.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
if(ao1 != null){
      fd0 = ao1.m3();
}
    Thought lo1 = Thought90.getInstance(ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
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
    fd1 = fd0 + fd1;
    fd0 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m2();
}
    boolean lb0 = false;
    Output.points[6][3] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    double ld1 = 594.1592097410365;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
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
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought190.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[6][4] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    Thought lo2 = Thought356.getInstance();
    boolean lb3 = false;
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
    double ld0 = 590.3782844865359;
    Thought lo1 = Thought344.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought20.getInstance(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ad2 *= -1;
    double ld3 = 521.2491000286338;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld3, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ad3 = fo0.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld3, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[6][5] -= ad4;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    ld0 = ld3 - ad1;
    double ld4 = 469.42476253538155;
    ad1 *= -1;

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
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab2 = fo0.m2(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab3 = !ab4;
    fb0 = fb1 && ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ab3 = ab4 || fb0;
    double ld0 = 178.74328014275343;
    fb1 = ad2 > ad3;
    boolean lb1 = false;
if(fo1 != null){
      lb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
    fb0 = ad4 > fd0;

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
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought26.getInstance(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3);
}
    double ld2 = 929.2059557047997;
    Thought lo3 = Thought48.getInstance(fd0, fd1, ld2, fd0);
    fb0 = !fb1;
    fd1 = ld2 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2);
}
    lb0 = fb0 && fb1;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(ao4 != null){
      ao4.m1(lb0, fb0, fb1, lb0);
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
    fb1 = ad1 < ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 - ad3;
        fb0 = ad4 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = fb0 || fb1;
    Output.points[6][6] -= ad2;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb0 = !fb1;
    double ld0 = 340.1128417900067;
    boolean lb1 = true;
    lb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
        boolean lb1 = true;
    boolean lb2 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, lb2, ab1, ab2);
}
    Thought lo3 = Thought322.getInstance(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
    fd1 *= -1;
    Thought lo4 = Thought285.getInstance(ao2, ao3, ao4, fo0, lb0, lb1, lb2, ab1);
    if (ab2) {
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
    ad1 = ad2 + ad3;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb2 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && lb1;
    Thought lo3 = Thought328.getInstance(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
    boolean lb4 = true;
if(ao4 != null){
      ab3 = ao4.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
    Output.points[6][7] -= ad4;
    lb1 = fd0 > fd1;
    Thought lo5 = Thought295.getInstance(fo0, fo1, ao1, ao2, lb2, lb4, ab1, ab2);
if(ao3 != null){
          ad1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab3 = !ab4;
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 > ad1;
        Thought lo6 = Thought391.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
    fd1 = ad1 - ad2;
if(ao1 != null){
      fb1 = ao1.m2();
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
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        if (fb0) {
if(fo0 != null){
              fb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
            fb0 = fb1 || fb0;
            fb1 = !fb0;
if(fo1 != null){
              fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
            fb1 = fb0 && fb1;
            Thought lo0 = Thought247.getInstance(fo0, fo1, fo0, fo1);
            fb0 = fb1 && fb0;
            double ld1 = 87.18660859702356;
            Thought lo2 = Thought219.getInstance(ld1, fd0, fd1, ld1);
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
            fb1 = !fb0;
            Thought lo3 = Thought368.getInstance();
if(fo1 != null){
              fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
              fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
            Thought lo4 = Thought346.getInstance(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = ab1 || ab2;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb1, ab1, ab2, ab3);
}
    double ld0 = 517.684885760624;
        ab4 = ld0 > fd0;
    Output.points[6][8] -= fd1;
    Output.points[7][0] += ld0;
    Thought lo1 = Thought2.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[7][1] -= ld0;
    boolean lb2 = true;

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
    Output.points[7][2] += ad2;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld0 = 689.9067307963621;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    double ld1 = 375.14686036601495;
    ad4 = fd0 - fd1;
    fb0 = !fb1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld2 = 792.7205926480963;
        ld1 = ld2 - ad1;
    boolean lb3 = true;
    boolean lb4 = true;

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
      ab2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb0 = false;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    ab2 = ab3 || ab4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    ab1 = ab2 || ab3;
    Output.points[7][3] -= ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought363.getInstance();
    double ld2 = 188.66091697382632;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fb1, lb0, ab1, ab2);
}
    double ld3 = 551.2515577593455;
    ab3 = fd0 < fd1;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ab2 = ad3 < ad4;
    ab3 = fd0 > fd1;
    ld2 = ld3 + ad1;
    ad2 *= -1;

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
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
        boolean lb0 = true;
        double ld1 = 816.9194160379946;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb0 = ld1 < fd0;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        Thought lo2 = Thought380.getInstance(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
        boolean lb3 = true;
        Thought lo4 = Thought341.getInstance(ao2, ao3, ao4, fo0);
        double ld5 = 223.86693014906945;
if(fo1 != null){
          fo1.m3(ld5, fd0, fd1, ld1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m2();
}
    Output.points[7][4] += fd1;
    double ld0 = 573.1574055827234;
    boolean lb1 = false;
    fb0 = ld0 > ad1;
    fb1 = lb1 && fb0;
    Thought lo2 = Thought302.getInstance(fb1, lb1, fb0, fb1);
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
    ld0 *= -1;
    boolean lb3 = true;

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
    double ld0 = 163.03764260418404;
if(ao2 != null){
      ao2.m3(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab4 = ld0 < fd0;
    boolean lb1 = false;
    fd1 = ld0 + fd0;
    fd1 *= -1;
    ab4 = ld0 > fd0;
    fb0 = fd1 < ld0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0);
}
    fb1 = lb1 && ab1;
    double ld2 = 130.24374728018515;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld2);
}
if(ao3 != null){
      ao3.m2();
}
if(ao4 != null){
      ao4.m2(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld0, ld2, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fd1, ld0, ld2, fd0, ab4, fb0, fb1, lb1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, ab1);
}
    fd1 = ld0 - ld2;
    ab2 = ab3 || ab4;
    fd0 = fd1 - ld0;

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
    Output.points[7][5] += ad2;
    Thought lo0 = Thought44.getInstance(ao2, ao3, ao4, fo0);
        boolean lb1 = false;
    ab1 = ad3 > ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb2 = false;
    ad4 = fd0 + fd1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    double ld3 = 722.5578501865574;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ab1 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, ld3, ad1, ad2, fb1, lb1, lb2, ab1);
}
if(ao4 != null){
      ab2 = ao4.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb4 = true;
    boolean lb5 = true;
if(fo0 != null){
      ld3 = fo0.m3(fo1, ao1, ao2, ao3, lb1, lb2, lb4, lb5);
}
    ad1 *= -1;
    Output.points[7][6] += ad2;
    ab1 = ab2 || ab3;
    double ld6 = 656.6249202062611;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2);
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought152.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m1();
}
    boolean lb1 = true;
            lb1 = fb0 || fb1;

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
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    Output.points[7][7] += fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    double ld1 = 659.1761734087397;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      lb0 = fo0.m2();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    double ld2 = 412.36124923496175;

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
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought169.getInstance(fd1, fd0, fd1, fd0);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      lb1 = fo0.m2(lb2, fb0, fb1, lb1);
}
    Output.points[7][8] -= fd1;
    double ld3 = 560.2008870286755;
    Output.points[8][0] -= ld3;
    Thought lo4 = Thought366.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb1);
    Thought lo5 = Thought291.getInstance(fd1, ld3, fd0, fd1, lb2, fb0, fb1, lb1);
    ld3 *= -1;
    Output.points[8][1] += fd0;
        fd1 = ld3 - fd0;
    fd1 *= -1;
    Thought lo6 = Thought306.getInstance(fo1, fo0, fo1, fo0, lb2, fb0, fb1, lb1);
    ld3 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0);
}
    lb2 = !fb0;
    fb1 = lb1 && lb2;
    double ld7 = 349.03674621577136;
    fb0 = fd0 > fd1;

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
