package genetic;
import java.util.ArrayList;
class Thought270 extends Thought{
private static ArrayList<Thought270> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 757.1429460252385;
private double fd1 = 881.0756714497919;
private Thought fo0 = null;
private Thought fo1 = null;
Thought270 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought270 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought270 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought270 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought270 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought270 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought270 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought270 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought270 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought270 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought270 instance = new Thought270 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    Output.points[2][7] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought287.getInstance();
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m3();
}
    Thought lo0 = Thought155.getInstance(ab4, fb0, fb1, ab1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[2][8] -= fd1;
    Thought lo1 = Thought174.getInstance(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && ab1;
    ab2 = fd0 < fd1;
    double ld2 = 774.6480737420238;
    ab3 = ld2 < fd0;
    double ld3 = 78.34518556965678;
    ab4 = fb0 && fb1;
    Thought lo4 = Thought331.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fd0 < fd1;
    fb1 = !ab1;
    ab2 = ld2 < ld3;
    boolean lb5 = true;
    boolean lb6 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld3, fd0, fd1);
}
    boolean lb7 = true;
    ld2 = ld3 + fd0;
    fd1 *= -1;
    Thought lo8 = Thought26.getInstance(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1);

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
      fo1.m2();
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fb0 && fb1;
if(fo0 != null){
      ad1 = fo0.m3(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    boolean lb1 = true;
    lb1 = fb0 || fb1;
    lb0 = ad2 > ad3;
    double ld2 = 662.3906873345704;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb0);
}
    ld2 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);
}
        fb1 = fd0 < fd1;

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
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab3 = ad1 > ad2;
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
        Thought lo1 = Thought193.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    ab3 = fd0 > fd1;
    boolean lb2 = true;
    ab3 = ab4 || fb0;
    Output.points[3][0] += ad1;
if(fo1 != null){
      fo1.m3();
}
    Output.points[3][1] += ad2;
    Output.points[3][2] -= ad3;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb2, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[3][3] -= ad2;
    if (lb0) {
        lb2 = ad3 > ad4;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            fb0 = !fb1;
if(ao3 != null){
              ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
}
            boolean lb0 = false;
            lb0 = fb0 || fb1;
            fd0 = fd1 - fd0;
            lb0 = !fb0;
            Thought lo1 = Thought272.getInstance(ao4, fo0, fo1, ao1);
            fb1 = !lb0;
            fb0 = fb1 && lb0;
            fd1 = fd0 - fd1;
            double ld2 = 384.97356028028184;
            double ld3 = 226.6166875201355;
            double ld4 = 735.0466302206296;
            ld2 = ld3 - ld4;
            double ld5 = 212.8164364442846;
if(ao2 != null){
              fb0 = ao2.m2(ld5, fd0, fd1, ld2);
}
            Thought lo6 = Thought140.getInstance(ao3, ao4, fo0, fo1, ld3, ld4, ld5, fd0);
            Thought lo7 = Thought154.getInstance();
            double ld8 = 34.70945791392254;
if(ao2 != null){
              ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
            boolean lb9 = true;
            fd0 = fd1 - ld2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][4] += ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao3.m3();
}
    fd0 = fd1 - fd0;
if(ao4 != null){
      fd1 = ao4.m3(ab4, fb0, fb1, ab1);
}
    ab2 = fd0 < fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo0 = Thought10.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
    ad1 = ad2 + ad3;
    ab1 = ad4 < fd0;
    Thought lo0 = Thought337.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fd1 = ad1 + ad2;
    ad3 *= -1;
    Output.points[3][5] += ad4;
    fd0 = fd1 - ad1;
    ad2 = ad3 - ad4;
        fd0 = fd1 - ad1;
    double ld1 = 415.87578090160616;
    fb1 = ad1 < ad2;
    ab1 = ad3 < ad4;

Thought.STACK_COUNTER++;
} catch (StackOverflowExc | NoClassDefFoundError e) { 
throw new CountDownExc(50);
} 
}
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought252.getInstance(fo0, fo1, fo0, fo1);
    double ld1 = 49.50327531364665;
    fd0 = fd1 + ld1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1);
}
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;

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
    ab2 = !ab3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo0 = Thought316.getInstance();
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    for(int i0=0; i0<10; i0++){
        fd0 *= -1;
        fb0 = !fb1;
        Output.points[3][6] += fd1;
        ab1 = !ab2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        Thought lo1 = Thought370.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
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
    ad1 *= -1;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought214.getInstance();
    fd1 *= -1;
    ad1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = ad4 < fd0;
    fd1 = ad1 - ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[3][7] += ad3;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld2 = 5.686310571083522;
    Thought lo3 = Thought337.getInstance();
    ad2 *= -1;
    fb1 = lb1 || fb0;
    fb1 = ad3 > ad4;
    lb1 = fb0 && fb1;
    lb1 = fd0 < fd1;
if(fo0 != null){
      ld2 = fo0.m3(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 461.16914319323183;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    fb1 = ab1 || ab2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld1 = 118.22454801254214;
if(fo0 != null){
      ab1 = fo0.m2(ad1, ad2, ad3, ad4);
}
    boolean lb2 = false;
    double ld3 = 929.3497633290345;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    ld1 = ld3 + ad1;
    Output.points[3][8] += ad2;
    fb1 = lb2 && ab1;
    ab2 = ab3 && ab4;
    boolean lb4 = true;
    ab4 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld5 = 357.5186523502256;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fo0 = fo1.m4(lb4, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
}
    ld1 = ld3 - ld5;
    ad1 = ad2 - ad3;
    lb4 = ad4 > fd0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought13.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
    fb0 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
    double ld1 = 563.7291720103332;
    if (fb1) {
        } else {
if(ao1 != null){
          fo1 = ao1.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought50.getInstance(ao2, ao3, ao4, fo0);
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
    ad2 = ad3 - ad4;
    fb0 = fb1 || lb0;
    boolean lb1 = false;
    boolean lb2 = true;
    fd0 = fd1 + ad1;
    boolean lb3 = false;
if(ao2 != null){
      ad2 = ao2.m3(ad3, ad4, fd0, fd1);
}
    boolean lb4 = false;
    ad1 = ad2 - ad3;
    lb1 = ad4 > fd0;
    lb2 = fd1 < ad1;
    ad2 *= -1;
    ad3 *= -1;
    boolean lb5 = false;
    lb3 = lb4 && lb5;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao2.m3();
}
    fb1 = lb0 || lb1;
if(ao4 != null){
      ao3 = ao4.m4(lb2, lb3, lb4, lb5);
}
    double ld6 = 103.23400343944624;
    ad1 = ad2 + ad3;
    double ld7 = 86.25872186049398;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld6, ld7, ad1, ad2, lb2, lb3, lb4, lb5);
}
    Thought lo8 = Thought320.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, lb0, lb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        boolean lb0 = true;
if(ao4 != null){
          ao3 = ao4.m4();
}
        ab1 = ab2 || ab3;
        }
    fd0 = fd1 + fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    double ld1 = 213.58890893076975;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    double ld2 = 81.36814300085148;
    ld2 = fd0 + fd1;
    Output.points[4][0] += ld1;
    double ld3 = 501.7830652690172;
    boolean lb4 = false;
    Thought lo5 = Thought56.getInstance(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);

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
    ab1 = !ab2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ab4 = !fb0;
    fb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = ad1 < ad2;
        fb1 = !ab1;

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
    fb0 = fb1 || fb0;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd0 = fo1.m3();
}
        Output.points[4][1] += fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
        boolean lb1 = true;
        double ld2 = 587.425543994899;
if(fo1 != null){
          fo0 = fo1.m4(ld2, fd0, fd1, ld2, lb1, lb0, fb0, fb1);
}
        lb1 = lb0 || fb0;
        Thought lo3 = Thought282.getInstance(fo0, fo1, fo0, fo1, fb1, lb1, lb0, fb0);
        fd0 = fd1 + ld2;
        fd0 = fd1 + ld2;
        fd0 *= -1;
        Thought lo4 = Thought59.getInstance(fo0, fo1, fo0, fo1);
        fb1 = lb1 || lb0;
        fb0 = fd1 > ld2;
        double ld5 = 563.408815308638;
        fb1 = ld5 < fd0;
if(fo0 != null){
          fo0.m2(fd1, ld2, ld5, fd0);
}
        fd1 *= -1;
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
    for(int i0=0; i0<10; i0++){
        fd1 = fd0 + fd1;
        ab1 = !ab2;
        ab3 = ab4 && fb0;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        double ld0 = 301.629385466687;
        boolean lb1 = false;
        Output.points[4][2] -= fd0;
        fd1 = ld0 - fd0;
        Thought lo2 = Thought91.getInstance();
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb1, ab1, ab2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          ld0 = fo1.m3(fd0, fd1, ld0, fd0, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb1);
}
        ab1 = ab2 || ab3;
        ab4 = !fb0;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = ad2 > ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
    double ld0 = 813.7252924959282;
    boolean lb1 = false;
    lb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
    lb1 = fb0 || fb1;
    Output.points[4][3] += ad4;
    Thought lo2 = Thought169.getInstance();
    fd0 = fd1 - ld0;
if(fo0 != null){
      lb1 = fo0.m2(fb0, fb1, lb1, fb0);
}
    Thought lo3 = Thought267.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
    lb1 = !fb0;
    fb1 = !lb1;

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
    ad1 = ad2 + ad3;
    ab2 = ad4 > fd0;
    ab3 = fd1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    double ld0 = 558.4559370710732;
    fd0 = fd1 + ld0;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    double ld1 = 640.6133051820301;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    Thought lo2 = Thought82.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad1 = ad2 + ad3;
    boolean lb3 = true;
    ad4 *= -1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ld1, ad1, ad2, fb1, lb3, ab1, ab2);
}
    ab3 = !ab4;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0, fb0, fb1, lb3, ab1);
}
    boolean lb4 = false;
    double ld5 = 706.2435007922039;
    ld1 = ld5 + ad1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[4][4] += ad2;

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
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fd0 = fd1 + fd0;
    Output.points[4][5] += fd1;
    Thought lo0 = Thought223.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      fd1 = ao2.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 + fd0;
    Output.points[4][6] -= fd1;
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fd1 *= -1;
        for(int i1=0; i1<10; i1++){
}}
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
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    Output.points[4][7] -= fd1;
    double ld0 = 470.01714905668365;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ld0 = ao3.m3(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m1();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 723.7661294607392;
    ab1 = !ab2;
    double ld1 = 367.92667407904185;
if(ao2 != null){
      ao1 = ao2.m4(ld0, ld1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
if(ao3 != null){
              ld0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
            boolean lb2 = false;
            ab4 = fb0 && fb1;
if(ao2 != null){
              ld1 = ao2.m3(ao3, ao4, fo0, fo1);
}
            boolean lb3 = false;
            boolean lb4 = true;
            lb2 = fd0 < fd1;
            lb3 = !lb4;
            double ld5 = 174.68462536965626;
            Output.points[4][8] += ld5;
            Thought lo6 = Thought148.getInstance(ld0, ld1, fd0, fd1);
if(ao2 != null){
              ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld5, ld0, ld1, fd0);
}
if(ao2 != null){
              ao1 = ao2.m4();
}
            ab1 = fd1 < ld5;
            ab2 = ab3 || ab4;
            fb0 = fb1 && lb2;
            lb3 = lb4 && ab1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m3(ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
if(ao2 != null){
      ab3 = ao2.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
}
    fb1 = lb0 && ab1;
    ab2 = ab3 || ab4;
    Output.points[5][0] -= ad3;
if(ao3 != null){
      ao3.m1();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, ab1);
}
    ad4 = fd0 - fd1;
    ab2 = !ab3;
    ab4 = !fb0;
    double ld1 = 639.6515442601204;
    ld1 = ad1 - ad2;
if(fo1 != null){
      ad3 = fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld1, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 > fd1;

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
    double ld0 = 381.8047913063783;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 575.0484845835763;
    lb1 = ld2 < fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = ld0 + ld2;
    boolean lb3 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld2, fd0);
}
    fd1 = ld0 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    ld2 = fd0 + fd1;
    fb1 = ld0 < ld2;
    lb1 = fd0 > fd1;
    ld0 *= -1;
    boolean lb4 = true;
    ld2 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(lb3, lb4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0, lb1, lb3, lb4, fb0);
}
    fd1 = ld0 + ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld2, fb1, lb1, lb3, lb4);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought177.getInstance(fd0, fd1, fd0, fd1);
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 119.57184961682415;
    double ld2 = 955.9795735439775;
    ld1 = ld2 + fd0;
    double ld3 = 980.7724385628961;
    boolean lb4 = true;
    ab3 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb4);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, fb0, fb1, lb4, ab1);
}
    boolean lb5 = false;
    Thought lo6 = Thought250.getInstance(ld1, ld2, ld3, fd0, ab1, ab2, ab3, ab4);

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
    if (lb0) {
        fb0 = ad1 < ad2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad3 = ad4 - fd0;
if(fo0 != null){
          lb0 = fo0.m2(fd1, ad1, ad2, ad3);
}
        ad4 = fd0 + fd1;
        fb0 = fb1 || lb0;
        fb0 = ad1 < ad2;
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
    boolean lb0 = true;
    Output.points[5][1] += ad1;
    boolean lb1 = false;
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    if (lb0) {
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        lb1 = ad3 < ad4;
        } else {
if(fo0 != null){
          fd0 = fo0.m3();
}
        lb2 = ab1 && ab2;
        Thought lo3 = Thought126.getInstance(ab3, ab4, fb0, fb1);
        fd1 = ad1 - ad2;
        ad3 = ad4 - fd0;
        lb0 = lb1 || lb2;
if(fo1 != null){
          ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb1, lb2);
}
        boolean lb4 = true;
        lb2 = ab1 || ab2;
        fd0 *= -1;
        Output.points[5][2] += fd1;
        ad1 *= -1;
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
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    Thought lo2 = Thought113.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    double ld3 = 795.245348708057;
    Thought lo4 = Thought318.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0);
    Output.points[5][3] += fd1;
    lb0 = lb1 || fb0;

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
      ao1 = ao2.m4();
}
    Output.points[5][4] -= ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 + ad4;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
    boolean lb1 = false;
    boolean lb2 = false;
    boolean lb3 = true;
    double ld4 = 197.8716785755795;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, lb2, lb3, fb0, fb1);
}
    lb0 = !lb1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    lb2 = fd0 > fd1;
if(fo0 != null){
      ld4 = fo0.m3(ad1, ad2, ad3, ad4);
}
    lb3 = fd0 < fd1;
    ld4 = ad1 + ad2;
    fb0 = fb1 && lb0;
    ad3 = ad4 + fd0;
    Thought lo5 = Thought394.getInstance(fo1, ao1, ao2, ao3, fd1, ld4, ad1, ad2);
    ad3 = ad4 - fd0;
if(ao4 != null){
      lb1 = ao4.m2();
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 127.6197067643989;
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ld0 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      fd1 = ao3.m3(ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    double ld1 = 470.6987751774981;
    ld1 = fd0 - fd1;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        ld0 *= -1;
        fb0 = fb1 && ab1;
        Thought lo2 = Thought276.getInstance(ld1, fd0, fd1, ld0);
        ab2 = ab3 && ab4;
        fb0 = fb1 || ab1;
        }
    Thought lo3 = Thought86.getInstance(ao2, ao3, ao4, fo0, ld1, fd0, fd1, ld0);
    boolean lb4 = false;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1();
}
    ab1 = !ab2;
    if (ab3) {
if(ao2 != null){
          ao1 = ao2.m4(ab4, fb0, fb1, lb4);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    Thought lo0 = Thought148.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    Thought lo1 = Thought308.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
    boolean lb2 = false;
    ad3 = ad4 + fd0;
    fd1 *= -1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4);
}
    Thought lo3 = Thought17.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2);
    ab3 = ad3 > ad4;
if(ao3 != null){
      fd0 = ao3.m3();
}
if(ao4 != null){
      ao4.m3(ab4, fb0, fb1, lb2);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
        fb0 = !fb1;
    if (lb2) {
        double ld4 = 826.9688150832818;
if(fo1 != null){
          fo0 = fo1.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fb1, lb2, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4);
}
        ab4 = !fb0;
        fb1 = ld4 > ad1;
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
    double ld0 = 647.7078110910805;
        double ld1 = 716.1002260726149;
if(fo0 != null){
      fo1 = fo0.m4(ld0, ld1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Output.points[5][5] -= ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld0);
}
    Thought lo2 = Thought377.getInstance();
    ld1 = fd0 + fd1;
    ld0 = ld1 - fd0;
    double ld3 = 79.03980544144245;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld1, fb0, fb1, lb4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0, fb1, lb4, fb0, fb1);
}
    lb4 = fb0 && fb1;
    boolean lb5 = true;
    ld1 = ld3 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb4, lb5, fb0, fb1);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought175.getInstance();
    fd1 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought219.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    double ld2 = 388.61374402480044;
    Thought lo3 = Thought37.getInstance(ld2, fd0, fd1, ld2);
    fb1 = fb0 || fb1;
    fb0 = fd0 > fd1;
    fb1 = ld2 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1);
}
    ld2 = fd0 - fd1;
    Output.points[5][6] += ld2;
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
    boolean lb0 = true;
    Thought lo1 = Thought33.getInstance();
    fd0 = fd1 + fd0;
    fd1 *= -1;
    double ld2 = 128.3157309042111;
    ld2 = fd0 - fd1;
        lb0 = fb0 && fb1;
    ld2 = fd0 - fd1;
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
    fb0 = !fb1;
if(fo0 != null){
      ld2 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld2, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo3 = Thought5.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    ld2 = fd0 - fd1;
    fb0 = ld2 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(fd1, ld2, fd0, fd1);
}
    fb1 = ld2 < fd0;
    lb0 = fd1 > ld2;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
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
