package genetic;
import java.util.ArrayList;
class Thought349 extends Thought{
private static ArrayList<Thought349> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 691.0139389922501;
private double fd1 = 821.0964595369102;
private Thought fo0 = null;
private Thought fo1 = null;
Thought349 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought349 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought349 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought349 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought349 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought349 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought349 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought349 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought349 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought349 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought349 instance = new Thought349 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 600.9233891333367;
    ld0 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, lb1, fb0);
}
    fb1 = fd0 > fd1;
    ld0 = fd0 - fd1;
    Thought lo2 = Thought31.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, fb0, fb1, lb1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, lb1, fb0);
}
    double ld3 = 158.61761421451007;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
        double ld4 = 429.3753276305683;
    Thought lo5 = Thought383.getInstance(fo0, fo1, fo0, fo1);
    lb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld3, ld4, fd0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld3, ld4);
}
    fb0 = fb1 && lb1;
    Thought lo6 = Thought217.getInstance();
    fd0 = fd1 - ld0;
    ld3 = ld4 + fd0;
    fb0 = fd1 > ld0;
if(fo1 != null){
      ld3 = fo1.m3(fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo1.m1(ld3, ld4, fd0, fd1, fb1, lb1, fb0, fb1);
}
    Output.points[6][1] -= ld0;
    ld3 *= -1;

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
    boolean lb0 = true;
    Output.points[6][2] -= fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb0, ab1, ab2, ab3);
}
    Thought lo1 = Thought67.getInstance(fo1, fo0, fo1, fo0);
    boolean lb2 = false;
    ab3 = fd0 > fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2();
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
    double ld0 = 815.0511465855349;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
        ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        ad4 = fd0 - fd1;
        fb1 = !fb0;
        fb1 = !fb0;
        fb1 = ld0 < ad1;
        Thought lo1 = Thought207.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        ld0 = ad1 - ad2;
        fb0 = ad3 > ad4;
        fb1 = fb0 || fb1;
        boolean lb2 = true;
        boolean lb3 = false;
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
      fo0.m3(fo1, fo0, fo1, fo0);
}
        ab1 = !ab2;
    double ld0 = 235.65630846146811;
    boolean lb1 = true;
    ab2 = ad1 < ad2;
    double ld2 = 458.6459285246678;
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3);
}
if(fo0 != null){
      ab3 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    boolean lb3 = true;
    lb3 = !ab1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
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
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
        fb0 = fd1 > fd0;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought397.getInstance(fd1, fd0, fd1, fd0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Output.points[6][3] -= fd1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      fb0 = ao1.m2();
}
    Thought lo1 = Thought145.getInstance(fb1, fb0, fb1, fb0);
    fd0 *= -1;
    Thought lo2 = Thought356.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
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
    Thought lo0 = Thought147.getInstance(ao1, ao2, ao3, ao4, fb1, fb0, fb1, fb0);
        Output.points[6][4] -= ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb1 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    fd1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    Thought lo1 = Thought293.getInstance();
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    fd1 = fd0 + fd1;
    ab4 = !fb0;
    Output.points[6][5] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 < fd0;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    boolean lb1 = true;
if(ao3 != null){
      fb0 = ao3.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    Thought lo2 = Thought335.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);

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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = true;
if(ao4 != null){
      ad2 = ao4.m3(lb0, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab4 = fo0.m2(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3, fb0, fb1, lb0, ab1);
}
    double ld1 = 577.5023637121342;
    if (ab2) {
        boolean lb2 = false;
        boolean lb3 = false;
        Thought lo4 = Thought208.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
        Thought lo5 = Thought277.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb2, lb3);
        ld1 *= -1;
if(ao2 != null){
          ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          lb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
        fd1 = ld1 - ad1;
        double ld6 = 207.36290183034671;
        Thought lo7 = Thought28.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
        Thought lo8 = Thought49.getInstance();
        boolean lb9 = false;
        for(int i0=0; i0<10; i0++){
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        fb1 = !fb0;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought50.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = true;
    Output.points[6][6] += fd0;
    boolean lb2 = false;
    Thought lo3 = Thought307.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb2 = fb0 && fb1;
    fd1 = fd0 + fd1;
    Output.points[6][7] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m2(lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb2, fb0, fb1, lb1);
}
    Thought lo4 = Thought184.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);

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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = fd1 > fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
        boolean lb0 = false;
    ab4 = !fb0;
    double ld1 = 53.99464039379508;
    Thought lo2 = Thought190.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, lb0, ab1, ab2);
if(fo1 != null){
      fo1.m2(fd1, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld1 = fd0 + fd1;
    ld1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
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
    ad2 *= -1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        boolean lb0 = true;
        fb0 = !fb1;
        boolean lb1 = true;
        Thought lo2 = Thought94.getInstance();
        boolean lb3 = true;
        ad1 = ad2 - ad3;
if(fo0 != null){
          ad4 = fo0.m3(lb0, lb1, lb3, fb0);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, fb1, lb0, lb1, lb3);
}
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        lb3 = fb0 || fb1;
        lb0 = ad2 < ad3;
        boolean lb4 = false;
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
    double ld0 = 999.1324926324689;
    Output.points[6][8] += ad1;
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = fd1 > ld0;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    Output.points[7][0] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 && ab1;
    ab2 = ad3 < ad4;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = !fb1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 = fd0 - fd1;
    fb0 = !fb1;
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 596.8752976963723;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
        double ld1 = 789.5226667336003;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld1);
}
    boolean lb2 = true;
if(ao1 != null){
      lb2 = ao1.m2();
}
    fb0 = ad1 < ad2;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb2, lb3);
}
    ad3 *= -1;
    ad4 *= -1;
    fb0 = fd0 < fd1;
    fb1 = ld0 < ld1;
    double ld4 = 109.14068098137162;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3, lb2, lb3, fb0, fb1);
}
    lb2 = !lb3;
    boolean lb5 = false;

Thought.STACK_COUNTER++;
return lb5;
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
    Thought lo0 = Thought7.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[7][1] -= fd0;
    boolean lb1 = false;
    Thought lo2 = Thought61.getInstance(fo1, ao1, ao2, ao3);
    Thought lo3 = Thought102.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ab4 = ao4.m2();
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
if(ao3 != null){
      ad2 = ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
    Output.points[7][2] += fd0;
    boolean lb0 = true;
    ab3 = ab4 || fb0;

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
    fb0 = fb1 || fb0;
    Output.points[7][3] -= fd1;
    double ld0 = 317.9169032136665;
    Thought lo1 = Thought232.getInstance(fo1, fo0, fo1, fo0);
    Thought lo2 = Thought98.getInstance(ld0, fd0, fd1, ld0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    Output.points[7][4] += fd1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = ld0 < fd0;
    fb1 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4(lb3, fb0, fb1, lb3);
}
    double ld4 = 441.5388518260118;
if(fo1 != null){
      ld4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld4, fb0, fb1, lb3, fb0);
}
    fb1 = lb3 && fb0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m1(ld4, fd0, fd1, ld0, fb1, lb3, fb0, fb1);
}
    ld4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb3, fb0, fb1, lb3);
}
    fb0 = fb1 || lb3;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    lb3 = ld0 > ld4;
    fb0 = fd0 > fd1;
    fb1 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(ld0, ld4, fd0, fd1);
}
    fb1 = lb3 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld4, fd0, fd1);
}
    fb1 = lb3 || fb0;

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
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
    fb0 = fb1 && ab1;
if(fo0 != null){
      fd1 = fo0.m3(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought372.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 = fd1 + fd0;
    ab4 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;

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
    double ld0 = 257.48459476162435;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    Thought lo1 = Thought237.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought126.getInstance(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    boolean lb4 = true;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb4 = lb5 && fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    boolean lb1 = true;
    fb0 = ad1 > ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    double ld2 = 146.60737209838547;
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    lb0 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 - fd1;
    Thought lo3 = Thought314.getInstance(ld2, ad1, ad2, ad3, fb1, lb0, lb1, ab1);
    ab2 = ad4 < fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    double ld0 = 696.8029932211366;
if(ao3 != null){
      fd0 = ao3.m3();
}
    fd1 = ld0 - fd0;
    boolean lb1 = true;
    fd1 *= -1;
    fb0 = ld0 < fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, lb1, fb0, fb1);
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
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    ad1 *= -1;
    boolean lb2 = true;
    lb0 = ad2 < ad3;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, lb2, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb1, lb0, lb1, lb2);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
        Output.points[7][5] += fd1;
    ad1 = ad2 + ad3;
if(ao1 != null){
      ao1.m1(ad4, fd0, fd1, ad1);
}
    fb0 = fb1 || lb0;
    lb1 = ad2 > ad3;
    lb2 = fb0 || fb1;
    Thought lo3 = Thought270.getInstance(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo1.m3();
}
if(ao1 != null){
      ad2 = ao1.m3(lb0, lb1, lb2, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb1, lb0, lb1, lb2);
}
    boolean lb4 = false;
    boolean lb5 = false;
    lb4 = !lb5;

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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    double ld0 = 666.763675503295;
    double ld1 = 693.6864546924429;
    ld1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
}
    ld0 = ld1 + fd0;
    boolean lb2 = false;
    Thought lo3 = Thought264.getInstance(ao4, fo0, fo1, ao1);
    ab3 = ab4 || fb0;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, fd0, fd1);
}
    boolean lb4 = false;
    double ld5 = 687.2915830004185;
    Output.points[7][6] += ld0;
    double ld6 = 129.88298955095527;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld5, ld6, fd0);
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
    Output.points[7][7] -= ad1;
    Output.points[7][8] += ad2;
    Thought lo0 = Thought214.getInstance();
    double ld1 = 48.06861323585778;
    ab1 = !ab2;
    ad2 = ad3 - ad4;
    double ld2 = 469.2527997785066;
    double ld3 = 317.994262849847;
    ab3 = ad3 < ad4;
    double ld4 = 690.1019885529859;
if(ao2 != null){
      ad4 = ao2.m3(ab4, fb0, fb1, ab1);
}
    Output.points[8][0] -= fd0;
    Output.points[8][1] -= fd1;
    double ld5 = 650.3372274154069;
    ab2 = ab3 || ab4;

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
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    double ld2 = 49.79246325731775;
    Thought lo3 = Thought287.getInstance(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
    boolean lb4 = true;
    Output.points[8][2] += fd0;
    double ld5 = 529.4686126070395;
    boolean lb6 = false;
    lb4 = lb6 || fb0;
    fb1 = !lb1;
    lb4 = lb6 && fb0;
    boolean lb7 = false;
    boolean lb8 = true;
if(fo0 != null){
      lb8 = fo0.m2();
}
if(fo1 != null){
      fo1.m2(fb0, fb1, lb1, lb4);
}
if(fo0 != null){
      lb6 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld2, ld5, lb7, lb8, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, ld5, lb1, lb4, lb6, lb7);
}
    fd0 *= -1;
    lb8 = fd1 > ld2;
    fb0 = !fb1;

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
    Output.points[8][3] += fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Output.points[8][4] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
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
    fb1 = fb0 && fb1;
    ad2 *= -1;
    Thought lo0 = Thought157.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld1 = 421.03189530769066;
        fb1 = ad4 > fd0;
    fd1 *= -1;
    ld1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    boolean lb2 = true;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[8][5] += fd0;
    fd1 = ld1 - ad1;
    ad2 = ad3 + ad4;
    lb2 = fb0 && fb1;
    fd0 = fd1 - ld1;
    lb2 = !fb0;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo0.m3();
}
    ld1 = ad1 + ad2;
    Output.points[8][6] += ad3;

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
      fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = ad1 < ad2;
    double ld0 = 830.4351323056532;
    boolean lb1 = true;
    ad2 *= -1;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    double ld2 = 673.6517324853961;
    Thought lo3 = Thought261.getInstance(ld0, ld2, ad1, ad2, fb0, fb1, lb1, ab1);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;

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
    boolean lb0 = false;
    double ld1 = 614.4124626617566;
    fb0 = fb1 && lb0;
    ld1 = fd0 + fd1;
    double ld2 = 928.5877817042904;
    ld1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = ld2 < fd0;
    fb1 = fd1 > ld1;
    lb0 = ld2 < fd0;
    Thought lo3 = Thought37.getInstance(fd1, ld1, ld2, fd0);

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
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    Thought lo1 = Thought253.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd1 = fo1.m3(lb0, lb2, fb0, fb1);
}
    ad1 = ad2 + ad3;
    double ld3 = 118.94144276071;
    lb0 = lb2 || fb0;
    fb1 = ad3 > ad4;
    lb0 = lb2 || fb0;
    fb1 = fd0 < fd1;
    ld3 = ad1 - ad2;
    boolean lb4 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, lb0, lb2, lb4, fb0);
}
    Output.points[8][7] -= ld3;
    fb1 = ad1 > ad2;
    lb0 = !lb2;
    lb4 = ad3 > ad4;
    fb0 = fb1 && lb0;
    Thought lo5 = Thought270.getInstance(fd0, fd1, ld3, ad1, lb2, lb4, fb0, fb1);
    ad2 = ad3 + ad4;
    boolean lb6 = false;
    lb0 = !lb2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, lb4, lb6, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    fd0 *= -1;
    fd1 = ld3 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Output.points[8][8] -= fd0;
    ab4 = fd1 > fd0;
    fb0 = fb1 && ab1;
    Thought lo0 = Thought46.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ab1 && ab2;
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought327.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb1 = ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ab1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb0 = true;
    ab1 = !ab2;
    ad3 *= -1;
    if (ab3) {
        if (ab4) {
            if (fb0) {
                Thought lo1 = Thought70.getInstance();
if(ao1 != null){
                  ao1.m1(fb1, lb0, ab1, ab2);
}
if(ao3 != null){
                  ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
                  ao2.m3(ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
if(ao4 != null){
                  ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
}}}
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 < fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    boolean lb1 = false;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, fb0, fb1);
}
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
}
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
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][0] += fd0;
    fd1 *= -1;
    Output.points[0][1] -= fd0;
    fb0 = fd1 < fd0;
    Output.points[0][2] += fd1;
    fb1 = !fb0;
    Output.points[0][3] -= fd0;
    fb1 = fb0 || fb1;
    double ld0 = 572.850804747307;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
    double ld1 = 913.1801323535848;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    ld0 = ld1 + fd0;
    fd1 *= -1;
    ld0 = ld1 - fd0;
    Thought lo2 = Thought311.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, ld1, fd0, fb0, fb1, fb0, fb1);

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
      fo0.m1(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    boolean lb1 = false;

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
