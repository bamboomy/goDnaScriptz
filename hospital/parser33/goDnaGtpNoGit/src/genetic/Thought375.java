package genetic;
import java.util.ArrayList;
class Thought375 extends Thought{
private static ArrayList<Thought375> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 697.3001348406813;
private double fd1 = 149.48135498004524;
private Thought fo0 = null;
private Thought fo1 = null;
Thought375 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought375 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought375 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought375 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought375 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought375 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought375 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought375 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought375 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought375 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought375 instance = new Thought375 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Output.points[0][8] -= fd0;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[1][0] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    double ld0 = 414.160628540932;
    ld0 = fd0 + fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    double ld1 = 992.7880415495298;
        double ld2 = 920.1974780534246;
if(fo1 != null){
      ld1 = fo1.m3();
}
    fb1 = ld2 < fd0;
    Thought lo3 = Thought122.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 > ld0;
    Thought lo4 = Thought35.getInstance(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb5 = false;
    ld0 = ld1 - ld2;
    fb0 = fb1 && lb5;
    fb0 = fb1 || lb5;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, ld1, fb0, fb1, lb5, fb0);
}
    fb1 = !lb5;
    ld2 = fd0 + fd1;
    Output.points[1][1] -= ld0;
    fb0 = fb1 || lb5;

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
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
        boolean lb0 = false;
        boolean lb1 = true;
        Thought lo2 = Thought159.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 *= -1;
        Output.points[1][2] -= fd1;
        fd0 *= -1;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
        fb1 = fd0 < fd1;
        lb0 = !lb1;
        Output.points[1][3] += fd0;
        ab1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld3 = 529.201670757026;
if(fo1 != null){
          fo1.m3(ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
        fb1 = fd1 < ld3;
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
    boolean lb0 = false;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    if (lb1) {
        fb0 = fb1 && lb0;
        lb1 = ad1 > ad2;
if(fo1 != null){
          ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, lb0, lb1);
}
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
            fb1 = lb0 || lb1;
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
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 = fd0 - fd1;
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
    boolean lb0 = true;
    ad1 *= -1;
    ab1 = ad2 > ad3;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
    fd1 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > ad1;
    lb1 = lb2 || ab1;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && fb0;
        fd1 *= -1;
        double ld0 = 536.1476557110844;
if(ao1 != null){
          ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fb1 = fb0 || fb1;
        boolean lb1 = true;
if(fo1 != null){
          lb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(ao1 != null){
          fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld0, fd0, fd1);
}
if(ao1 != null){
          fo1 = ao1.m4();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought225.getInstance(fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
    fd1 *= -1;
    double ld1 = 964.6222610003463;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 < ad1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    if (fb0) {
        boolean lb2 = true;
if(ao1 != null){
          fb0 = ao1.m2(ad2, ad3, ad4, fd0);
}
        fb1 = lb2 && fb0;
        boolean lb3 = true;
        fb0 = fd1 > ld1;
if(ao2 != null){
          ao2.m1(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
          ao1.m1();
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
      fd1 = ao2.m3(ab2, ab3, ab4, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = ab1 || ab2;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    ab2 = fd1 > fd0;
    ab3 = ab4 || fb0;
    fb1 = lb0 && ab1;
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    ab3 = ab4 && fb0;
    fb1 = fd0 > fd1;
if(ao3 != null){
      lb0 = ao3.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        boolean lb1 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
    double ld2 = 410.94010069496943;
    ld2 = fd0 + fd1;
    Thought lo3 = Thought134.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      lb1 = ao1.m2(ld2, fd0, fd1, ld2);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld2, fd0);
}
    ab1 = fd1 > ld2;

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
if(ao1 != null){
      ao1.m2();
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    double ld0 = 130.77008982771548;
if(ao2 != null){
      ab2 = ao2.m2(ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought331.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    fd0 *= -1;
    fb0 = fb1 || ab1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb2 = true;
    ad3 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought316.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
    fb1 = fd1 < fd0;
    double ld1 = 693.1693263504978;
    fd0 = fd1 + ld1;

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
        ab2 = fd1 < fd0;
    Output.points[1][4] -= fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
    if (fb0) {
        Thought lo1 = Thought76.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb0, ab1, ab2);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    ad4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought241.getInstance(fd0, fd1, ad1, ad2);
    boolean lb1 = true;
    fb0 = ad3 < ad4;
    fb1 = fd0 < fd1;
    Output.points[1][5] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[1][6] += fd1;
    Thought lo2 = Thought252.getInstance(lb1, fb0, fb1, lb1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
    lb1 = ad4 > fd0;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld0 = 869.5621111871817;
    double ld1 = 495.8191148001704;
    ld1 *= -1;
    boolean lb2 = false;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
    ab4 = ld0 < ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    for(int i0=0; i0<10; i0++){
        fb1 = !lb2;
        fd0 *= -1;
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        fd1 *= -1;
        fb1 = !lb2;
if(fo1 != null){
          ab1 = fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        Output.points[1][7] += ld0;
if(fo0 != null){
          fb1 = fo0.m2(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, lb2, ab1, ab2, ab3);
}
        Thought lo3 = Thought185.getInstance(ad4, fd0, fd1, ld0, ab4, fb0, fb1, lb2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    Thought lo1 = Thought310.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    fb1 = !lb0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m1();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Thought lo2 = Thought201.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo3 = Thought283.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
if(ao3 != null){
      fd1 = ao3.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;

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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
    boolean lb0 = false;
    Thought lo1 = Thought259.getInstance(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
    fb0 = ad3 > ad4;
    fd0 = fd1 - ad1;
    double ld2 = 369.8223430480781;
    double ld3 = 401.86060744177877;
    Thought lo4 = Thought59.getInstance(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
    Thought lo5 = Thought359.getInstance(fo1, ao1, ao2, ao3);
if(fo0 != null){
      ao4 = fo0.m4(ld3, ad1, ad2, ad3);
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
    ab2 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    ab3 = !ab4;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1();
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao3.m2(fb1, ab1, ab2, ab3);
}
    boolean lb0 = false;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
    ab3 = fd1 > fd0;
    Output.points[1][8] -= fd1;
    fd0 = fd1 - fd0;

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
    double ld0 = 417.96068429519494;
    boolean lb1 = false;
    ab1 = ad1 < ad2;
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb1);
}
    ld0 = ad1 + ad2;
    ab1 = !ab2;
    ab3 = ad3 > ad4;
    if (ab4) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
        fd0 = fd1 + ld0;
        Thought lo2 = Thought92.getInstance(ao3, ao4, fo0, fo1);
        ab2 = ab3 && ab4;
        fb0 = ad1 < ad2;
        ad3 *= -1;
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
    fd0 = fd1 + fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      fb0 = fo1.m2(fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought284.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    Output.points[2][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
    lb0 = fd0 > fd1;
    lb2 = fb0 || fb1;
    lb0 = lb2 && fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      lb0 = fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb1 = true;
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    Thought lo3 = Thought251.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
    lb1 = lb2 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab3 = ab4 || fb0;
    fb1 = lb0 && lb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb2 = ab1 || ab2;

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
    Thought lo0 = Thought356.getInstance();
    ad1 = ad2 - ad3;
if(fo0 != null){
              fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Output.points[2][1] += ad4;
    fb1 = fb0 && fb1;
    Output.points[2][2] += fd0;
    Output.points[2][3] += fd1;
        Output.points[2][4] += ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    if (fb0) {
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        double ld1 = 99.19704804378996;
if(fo0 != null){
          fo0.m2(fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        ad2 *= -1;
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        double ld2 = 763.948951607916;
        ad2 = ad3 - ad4;
        double ld3 = 271.2654666233692;
        Thought lo4 = Thought107.getInstance(ad4, fd0, fd1, ld1);
        ld2 = ld3 + ad1;
        boolean lb5 = true;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    Thought lo0 = Thought340.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    ab4 = fb0 && fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      lb1 = fo1.m2(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    Thought lo2 = Thought103.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    ab4 = ad3 > ad4;
    fd0 = fd1 + ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || lb1;
if(fo1 != null){
          fd1 = fo1.m3();
}
        ab1 = ad1 > ad2;
        ab2 = ab3 && ab4;
if(fo0 != null){
          fo0.m2(fb0, fb1, lb1, ab1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    Thought lo0 = Thought250.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    Output.points[2][5] -= fd1;
    double ld1 = 279.10844044888296;
if(ao1 != null){
      fo1 = ao1.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    if (fb0) {
        boolean lb2 = false;
        fb0 = !fb1;
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
    Output.points[2][6] -= ad1;
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        lb0 = !fb0;
        Output.points[2][7] -= ad2;
        fb1 = !lb0;
        boolean lb1 = true;
        ad3 = ad4 + fd0;
        lb0 = fb0 || fb1;
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
        Thought lo2 = Thought76.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
        lb1 = !lb0;
        }
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao2.m3();
}
    fd0 *= -1;
    fd1 *= -1;
    fb1 = lb0 || fb0;
if(ao3 != null){
      ao3.m1(fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought36.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd0 *= -1;
    boolean lb0 = false;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(fd0, fd1, fd0, fd1);
}
    ab4 = fd0 < fd1;
    boolean lb1 = true;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Thought lo2 = Thought28.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);

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
if(ao2 != null){
      ao2.m1();
}
    double ld0 = 751.2471270876708;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, fb0, fb1, lb1, ab1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    Output.points[2][8] -= fd1;
    fb0 = fb1 && lb1;
    Thought lo2 = Thought65.getInstance(ao4, fo0, fo1, ao1);
    ab1 = ld0 > ad1;
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, ad1);
}
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Output.points[3][0] -= ld0;
if(ao3 != null){
      ao3.m1();
}
    ad1 = ad2 + ad3;
    Thought lo3 = Thought308.getInstance(ab2, ab3, ab4, fb0);
    ad4 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Output.points[3][1] += ad4;
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ld0, ad1, fb1, lb1, ab1, ab2);
}
        ad2 = ad3 + ad4;
    boolean lb4 = true;

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
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    if (fb0) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          fd1 = fo1.m3(fb1, fb0, fb1, fb0);
}
        boolean lb0 = true;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
        boolean lb1 = true;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        boolean lb3 = true;
        boolean lb4 = true;
        lb1 = lb2 && lb3;
        lb4 = !fb0;
        fb1 = lb0 || lb1;
        fd0 *= -1;
        fd1 = fd0 - fd1;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    Thought lo1 = Thought190.getInstance(fd0, fd1, fd0, fd1);
    lb0 = fd0 > fd1;
    Thought lo2 = Thought165.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    boolean lb3 = false;
    Thought lo4 = Thought21.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(lb3, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    lb3 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 > fd0;
    Thought lo5 = Thought236.getInstance(fo1, fo0, fo1, fo0, lb3, ab1, ab2, ab3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld6 = 315.80575409976075;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld6, fd0);
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
    boolean lb0 = false;
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    double ld1 = 961.4299303222903;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    double ld2 = 577.0545623396742;
    Thought lo3 = Thought48.getInstance();
    double ld4 = 733.4190644552737;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    boolean lb5 = true;
    ld4 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb0, lb5, fb0, fb1);
}
    lb0 = lb5 && fb0;
    boolean lb6 = false;
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(ld1, ld2, ld4, ad1, lb0, lb5, lb6, fb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, lb5, lb6);
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
    Output.points[3][2] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = !ab3;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ab4 = !fb0;
        ad1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    if (fb1) {
        fd1 *= -1;
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          lb0 = fo0.m2(ab1, ab2, ab3, ab4);
}
        fb0 = ad1 < ad2;
        } else if (ab1) {
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
        Output.points[3][3] += ad1;
        double ld1 = 503.888578305987;
if(fo0 != null){
          fb1 = fo0.m2(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought185.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
        ab3 = ab4 && fb0;
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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[3][4] += fd1;
    fb0 = fd0 < fd1;
if(ao1 != null){
      ao1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought334.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    double ld2 = 591.6975364151027;
if(fo1 != null){
      ld2 = fo1.m3();
}
    Thought lo3 = Thought72.getInstance(fb1, lb0, fb0, fb1);
    double ld4 = 318.1669091852685;

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
    ad2 *= -1;
    boolean lb0 = true;
    lb0 = ad3 < ad4;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
    Thought lo1 = Thought321.getInstance(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
    Output.points[3][5] += ad2;
    ad3 = ad4 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    fd1 *= -1;
    Output.points[3][6] -= fd0;
    Output.points[3][7] -= fd1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought245.getInstance(ab3, ab4, fb0, fb1);
    double ld1 = 828.1697248818732;
    ab1 = ab2 || ab3;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          ao4 = fo0.m4(fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
        double ld2 = 594.9524000010537;
        ld2 = ld1 - fd0;
        for(int i1=0; i1<10; i1++){
            double ld3 = 308.92789232425906;
if(fo1 != null){
              fb1 = fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
}}
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
    Thought lo0 = Thought395.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld1 = 918.2973679626381;
    ad2 = ad3 + ad4;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab4 = !fb0;
if(ao3 != null){
      fb1 = ao3.m2(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ad1, fb0, fb1, ab1, ab2);
}
    ab3 = ad2 < ad3;
    double ld2 = 27.10880206073097;
if(ao4 != null){
      ad3 = ao4.m3(ad4, fd0, fd1, ld1, ab4, fb0, fb1, ab1);
}
    ld2 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;

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
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = !fb0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    Output.points[3][8] += fd1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    fd0 *= -1;
    double ld1 = 877.1944728641615;
    lb0 = fb0 || fb1;
    Thought lo2 = Thought331.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ld1 *= -1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fb0 && fb1;
    lb0 = fb0 && fb1;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
    fb1 = !lb0;
    lb1 = fb0 && fb1;
    lb0 = !lb1;
    Thought lo2 = Thought298.getInstance(fo1, fo0, fo1, fo0);
    Thought lo3 = Thought238.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    fb0 = fb1 && lb0;
    double ld4 = 922.428206766452;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[4][1] -= ld4;
    double ld5 = 432.5414939093707;
    Thought lo6 = Thought244.getInstance(lb1, fb0, fb1, lb0);

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
    fd1 *= -1;
    boolean lb0 = true;
    Output.points[4][2] -= fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fd0 > fd1;
    fb1 = lb0 && fb0;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought146.getInstance(fd1, fd0, fd1, fd0);

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
