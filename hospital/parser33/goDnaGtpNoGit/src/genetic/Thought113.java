package genetic;
import java.util.ArrayList;
class Thought113 extends Thought{
private static ArrayList<Thought113> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 998.06545693091;
private double fd1 = 138.97320099502528;
private Thought fo0 = null;
private Thought fo1 = null;
Thought113 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought113 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought113 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought113 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought113 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought113 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought113 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought113 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought113 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought113 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought113 instance = new Thought113 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    Output.points[3][6] -= fd0;
    lb0 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    double ld1 = 462.20680787212416;
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    boolean lb2 = true;
    lb0 = lb2 || fb0;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ld1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1);
}
    lb0 = ld1 < fd0;
    lb2 = lb3 || fb0;
    Output.points[3][7] += fd1;
    fb1 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    lb0 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, fb0, fb1);
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
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    fd1 *= -1;
    ab1 = fd0 < fd1;
    double ld0 = 159.31972720264054;
    ab2 = !ab3;
    ld0 = fd0 - fd1;
    ld0 = fd0 + fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
    boolean lb1 = true;
    fd1 = ld0 + fd0;
if(fo0 != null){
      ab1 = fo0.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 + fd1;
        ld0 = fd0 - fd1;
        ld0 = fd0 + fd1;
        Output.points[3][8] -= ld0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, ab1, ab2);
}
        boolean lb2 = false;
        boolean lb3 = true;
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
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[4][0] += ad2;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb1 = ad1 > ad2;
    Thought lo2 = Thought207.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m2();
}
    ad1 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought310.getInstance(lb1, lb3, fb0, fb1);
    double ld5 = 8.56109351901752;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, lb3, fb0, fb1);
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
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    double ld0 = 212.47489502767272;
    fb0 = fb1 || ab1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought383.getInstance(ad2, ad3, ad4, fd0);
    fb1 = ab1 || ab2;
    ab3 = ab4 && fb0;
    fb1 = fd1 > ld0;
    Output.points[4][1] += ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      ab1 = fo1.m2();
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
    fb1 = !fb0;
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought102.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
    boolean lb2 = true;
    Output.points[4][2] -= fd1;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    double ld3 = 22.79800941146906;
    fd0 = fd1 - ld3;
    lb2 = fb0 || fb1;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld3, fd0, fd1, ld3);
}
    Thought lo4 = Thought165.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld3, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;
        fd1 *= -1;
    lb1 = lb2 || lb5;

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
    Thought lo0 = Thought271.getInstance(fb1, fb0, fb1, fb0);
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb1, fb0, fb1);
}
    Output.points[4][3] -= ad3;
    double ld2 = 701.3929693270771;
    ad3 = ad4 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ld2, ad1, ad2, ad3);
}
    lb1 = fb0 && fb1;
    ad4 *= -1;
if(ao2 != null){
      lb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1);
}
if(ao1 != null){
      ao1.m2();
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
    ab2 = ab3 && ab4;
if(ao2 != null){
      fd0 = ao2.m3(fb0, fb1, ab1, ab2);
}
    double ld0 = 861.1500914320839;
    boolean lb1 = false;
    ab2 = !ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0, fb0, fb1, lb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 || ab1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao2 != null){
              fb1 = ao2.m2();
}
            ld0 = fd0 + fd1;
if(ao3 != null){
              ao3.m1(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    fb0 = fb1 && lb0;
    fd1 = ad1 + ad2;
    Output.points[4][4] += ad3;
    ad4 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab4 = fd1 > ad1;

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
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought292.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    Output.points[4][5] -= fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[4][6] -= fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[4][7] += fd0;
    Thought lo2 = Thought178.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 && fb0;
    boolean lb3 = false;
    fd0 = fd1 - fd0;

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
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
    fd1 *= -1;
    Output.points[4][8] -= fd0;
    Thought lo2 = Thought355.getInstance(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought7.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      lb0 = fo1.m2(lb1, ab1, ab2, ab3);
}
    double ld4 = 25.6625969332218;
    ab4 = ld4 > fd0;
    Thought lo5 = Thought15.getInstance(fo0, fo1, fo0, fo1, fd1, ld4, fd0, fd1, fb0, fb1, lb0, lb1);
    ab1 = !ab2;
if(fo0 != null){
      fo0.m2(ld4, fd0, fd1, ld4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
}
    double ld6 = 944.4531042438055;
    Output.points[5][0] -= ld6;
    ab3 = fd0 < fd1;
    ab4 = ld4 > ld6;
    fd0 *= -1;

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
    double ld0 = 1.1136707806470447;
    Thought lo1 = Thought14.getInstance(fo1, fo0, fo1, fo0);
    ad1 = ad2 - ad3;
    Output.points[5][1] -= ad4;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ld0;
    Output.points[5][2] += ad1;
    fb1 = !fb0;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
    boolean lb2 = true;
    fb0 = ad4 > fd0;
    Output.points[5][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld0 *= -1;
        ad1 = ad2 - ad3;
if(fo1 != null){
      fb1 = fo1.m2(lb2, fb0, fb1, lb2);
}
    ad4 = fd0 + fd1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, lb3, fb0, fb1, lb2);
}
if(fo1 != null){
      lb3 = fo1.m2(ad4, fd0, fd1, ld0, fb0, fb1, lb2, lb3);
}
    Thought lo4 = Thought101.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
    for(int i0=0; i0<10; i0++){
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ad2 < ad3;
    Thought lo0 = Thought306.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab3 = fd1 < ad1;
    Thought lo1 = Thought166.getInstance();
    Output.points[5][4] += ad2;
if(fo0 != null){
      ad3 = fo0.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    Output.points[5][5] += ad4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ad1, ad2, lb2, lb3, ab1, ab2);
}
    boolean lb4 = true;
    ad3 *= -1;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
    fb1 = !fb0;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      fb1 = ao3.m2(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    Thought lo0 = Thought244.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 = fd0 - fd1;
if(ao2 != null){
      fb0 = ao2.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought343.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ad1 = ao3.m3(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    Output.points[5][6] += fd1;
    fb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2();
}
if(ao3 != null){
      ad1 = ao3.m3(fb0, fb1, fb0, fb1);
}
    if (fb0) {
        fb1 = fb0 || fb1;
        boolean lb0 = true;
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
    Thought lo0 = Thought58.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    for(int i0=0; i0<10; i0++){
        Thought lo1 = Thought19.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
        Thought lo2 = Thought8.getInstance(fo1, ao1, ao2, ao3);
        }
if(ao4 != null){
      ab2 = ao4.m2(fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    Thought lo4 = Thought75.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
    boolean lb5 = true;

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
      ad1 = ao1.m3();
}
    ab1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought180.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
        ab4 = ad3 < ad4;
if(ao1 != null){
          fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
        ad4 *= -1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
        boolean lb1 = true;
        Output.points[5][7] -= fd0;
        fd1 = ad1 + ad2;
        Thought lo2 = Thought13.getInstance(ao1, ao2, ao3, ao4);
        Output.points[5][8] -= ad3;
        lb1 = !ab1;
if(fo0 != null){
          fo0.m2(ad4, fd0, fd1, ad1);
}
        boolean lb3 = true;
        ab1 = ab2 || ab3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Output.points[6][0] += fd1;
    fb1 = fb0 || fb1;
    double ld0 = 292.5012841317637;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Thought lo0 = Thought54.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld2 = 386.0918937163724;

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
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld1 = 399.3494228063354;
    ld1 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb2);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    Output.points[6][1] += ad4;
    Thought lo3 = Thought49.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        lb2 = fd1 > ld1;
        fb0 = ad1 > ad2;
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
    boolean lb0 = true;
    double ld1 = 620.6332081661876;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(ad4, fd0, fd1, ld1, lb2, ab1, ab2, ab3);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
    boolean lb3 = false;
    boolean lb4 = false;
if(fo0 != null){
      fo0.m1(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    lb3 = !lb4;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb2;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, lb4, ab1, ab2, ab3);
}
    fd0 *= -1;
    Thought lo5 = Thought361.getInstance(fd1, ld1, ad1, ad2, ab4, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb3, lb4, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo6 = Thought91.getInstance(ad3, ad4, fd0, fd1);
    ld1 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fb0 = fb1 || lb0;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought216.getInstance(lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        lb2 = lb0 || fb0;
        Output.points[6][2] += fd0;
        fd1 = fd0 + fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb2, lb0, fb0);
}
if(ao4 != null){
          fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        lb2 = !lb0;
        boolean lb3 = true;
        lb0 = !fb0;
        boolean lb4 = true;
        Output.points[6][3] += fd0;
        double ld5 = 488.56386052810115;
        double ld6 = 309.217306682402;
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
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought352.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought340.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m3(ad2, ad3, ad4, fd0);
}
    Output.points[6][4] -= fd1;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
if(ao1 != null){
      ao1.m2(lb2, lb3, fb0, fb1);
}
if(ao2 != null){
      lb2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, lb3, fb0, fb1, lb2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    Thought lo2 = Thought70.getInstance(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld3 = 51.632590552315996;
    double ld4 = 274.0861288673948;
    double ld5 = 325.1331449087809;
    lb1 = ld4 < ld5;
    Thought lo6 = Thought63.getInstance(fd0, fd1, ld3, ld4);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, fd0, fd1, ld3);
}
if(ao1 != null){
      ab1 = ao1.m2();
}
    ab2 = ld4 < ld5;
if(ao2 != null){
      fd0 = ao2.m3(ab3, ab4, fb0, fb1);
}
    fd1 = ld3 + ld4;
    lb0 = ld5 < fd0;
    Thought lo7 = Thought350.getInstance(ao3, ao4, fo0, fo1, fd1, ld3, ld4, ld5, lb1, ab1, ab2, ab3);

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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = ad3 > ad4;
    lb0 = fd0 < fd1;
    if (ab1) {
        Thought lo1 = Thought18.getInstance();
        ab2 = !ab3;
if(ao1 != null){
          ad1 = ao1.m3(ab4, fb0, fb1, lb0);
}
        ad2 = ad3 + ad4;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
          fb0 = ao2.m2(ad3, ad4, fd0, fd1, fb1, lb0, ab1, ab2);
}
        ad1 = ad2 + ad3;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
          lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
        boolean lb2 = true;
        lb0 = ad4 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        Output.points[6][5] += ad4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2();
}
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    double ld3 = 654.4471088975779;
    Output.points[6][6] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld3, fd0, fd1, fb1, lb0, lb1, lb2);
}
    ld3 = fd0 + fd1;

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
    ab2 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = !ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo1 = Thought299.getInstance(ab3, ab4, fb0, fb1);
    lb0 = ab1 || ab2;

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
    boolean lb0 = true;
    ad2 = ad3 - ad4;
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 && fb0;
        boolean lb1 = false;
        boolean lb2 = false;
        lb0 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb1, lb2, lb0);
}
        ad1 = ad2 - ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
        ad4 = fd0 + fd1;
        lb0 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
        fd1 = ad1 - ad2;
        Thought lo3 = Thought209.getInstance();
        fb0 = fb1 || lb1;
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
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
    ab1 = fd1 < ad1;
    ab2 = ad2 > ad3;
    boolean lb0 = false;
    Output.points[6][7] += ad4;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    if (fb0) {
        Output.points[6][8] -= ad3;
        fb1 = ad4 > fd0;
        lb0 = fd1 < ad1;
        ad2 *= -1;
        ad3 *= -1;
        Thought lo1 = Thought356.getInstance(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
        Output.points[7][0] -= ad2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
        Output.points[7][1] += ad3;
if(fo0 != null){
          ad4 = fo0.m3(fo1, fo0, fo1, fo0);
}
        ab2 = fd0 > fd1;
        ab3 = ad1 > ad2;
        double ld2 = 626.4433597191908;
        ab4 = !fb0;
        ad2 = ad3 + ad4;
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
      fb0 = ao1.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
    Output.points[7][2] += fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought305.getInstance(fb0, fb1, fb0, fb1);
        fb0 = fb1 && fb0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
        fb1 = fd1 > fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = !fb0;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
    fb1 = fb0 && fb1;
    ad4 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = ad1 < ad2;
    fb0 = !fb1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    fb1 = !fb0;
    double ld0 = 826.6292994823992;
    fb1 = !fb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    double ld1 = 959.7048166369327;
    double ld2 = 413.02972595228215;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 - fd0;
    Output.points[7][3] -= fd1;
    Thought lo0 = Thought22.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    fd0 = fd1 - fd0;
    ab1 = ab2 && ab3;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    ab3 = ab4 && fb0;
    Thought lo2 = Thought214.getInstance(fb1, lb1, ab1, ab2);
    ab3 = ab4 && fb0;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    Output.points[7][4] -= fd1;
    ab4 = fd0 > fd1;
    Thought lo4 = Thought169.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, lb3);
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;

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
    boolean lb0 = false;
    if (ab1) {
if(ao2 != null){
          ab2 = ao2.m2(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
        lb0 = ad2 > ad3;
        Output.points[7][5] += ad4;
        boolean lb1 = true;
        fd0 = fd1 - ad1;
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
        lb0 = fd1 < ad1;
        ab1 = !ab2;
if(ao3 != null){
          ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
        ab3 = ad1 < ad2;
if(ao2 != null){
          ao2.m3();
}
        ab4 = ad3 < ad4;
        } else if (fb1) {
        fd0 *= -1;
if(ao3 != null){
          lb0 = ao3.m2(ab1, ab2, ab3, ab4);
}
        Output.points[7][6] -= fd1;
        fb0 = ad1 < ad2;
        Output.points[7][7] -= ad3;
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
    boolean lb0 = true;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fb1 = fd1 > fd0;
    lb0 = fd1 > fd0;
    boolean lb2 = false;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    double ld1 = 540.4774173841471;
    fd0 = fd1 + ld1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 && lb0;
    boolean lb3 = false;
    double ld4 = 907.691436167014;
    double ld5 = 48.81910711794421;
    boolean lb6 = true;
    ld1 = ld4 + ld5;
    lb2 = lb3 || lb6;
    Thought lo7 = Thought198.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb2);
    boolean lb8 = true;
    lb3 = lb6 || lb8;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    double ld9 = 410.18403402414646;
    boolean lb10 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ld4);
}
    lb10 = fb0 || fb1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought19.getInstance();
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[7][8] += fd1;
    boolean lb2 = true;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld3 = 828.296570842998;
    lb1 = !lb2;
    double ld4 = 93.31333131290508;

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
