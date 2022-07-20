package genetic;
import java.util.ArrayList;
class Thought289 extends Thought{
private static ArrayList<Thought289> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 580.3435587153142;
private double fd1 = 134.8809152237303;
private Thought fo0 = null;
private Thought fo1 = null;
Thought289 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought289 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought289 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought289 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought289 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought289 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought289 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought289 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought289 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought289 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought289 instance = new Thought289 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought279.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    Output.points[5][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd0 < fd1;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    boolean lb4 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Output.points[5][7] += fd0;
    fb1 = ab1 || ab2;
    ab3 = fd1 < fd0;
    fd1 = fd0 + fd1;
    boolean lb0 = true;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
}
    ab4 = fd0 < fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
    fd0 = fd1 - fd0;
    fd1 *= -1;
    ab4 = fd0 > fd1;

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
    Output.points[5][8] -= ad1;
    ad2 *= -1;
    boolean lb0 = true;
    ad3 = ad4 - fd0;
    fb0 = fd1 > ad1;
    ad2 = ad3 + ad4;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb0 = !fb0;
if(fo1 != null){
      ad3 = fo1.m3();
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 *= -1;
    fb1 = lb0 && fb0;
    fb1 = lb0 && fb0;
    double ld1 = 174.31716903176635;
    Thought lo2 = Thought235.getInstance(fb1, lb0, fb0, fb1);
        ad2 = ad3 - ad4;
    double ld3 = 786.8879201349818;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ld3, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0);
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    ab1 = fd1 > ad1;
    ab2 = ad2 > ad3;
    ab3 = ab4 || fb0;
    ad4 *= -1;
    fb1 = fd0 > fd1;
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    lb0 = ab1 && ab2;
    Output.points[6][0] -= fd1;
    double ld1 = 804.3050852228339;
    ab3 = ld1 > ad1;
    ad2 *= -1;
    double ld2 = 800.91507692451;
if(fo0 != null){
      fo0.m1();
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
      ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = !lb0;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4();
}
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    lb0 = fd1 < fd0;
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought227.getInstance(fd0, fd1, fd0, fd1);
    if (fb1) {
        fd0 *= -1;
if(ao1 != null){
          fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 < fd1;
        fd0 = fd1 + fd0;
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
    fb1 = !fb0;
    boolean lb0 = false;
    Output.points[6][1] -= ad2;
if(ao2 != null){
      fb0 = ao2.m2();
}
    Thought lo1 = Thought233.getInstance(fb1, lb0, fb0, fb1);
    ad3 *= -1;
    double ld2 = 853.26878272108;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ld2 = ad1 + ad2;
if(ao2 != null){
      fb0 = ao2.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
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
    ab1 = fd0 > fd1;
    Thought lo0 = Thought77.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fb1 = ab1 && ab2;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3);
}
    ab3 = !ab4;
    fd0 = fd1 + fd0;
    fb0 = fb1 || ab1;
    ab2 = fd1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb1 = true;
    fd1 = fd0 + fd1;
    Output.points[6][2] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[6][3] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb1, ab1, ab2);
}
    boolean lb2 = true;
    if (ab2) {
if(ao4 != null){
          ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        lb1 = lb2 && ab1;
        double ld3 = 46.087240031004455;
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
    ab2 = ab3 && ab4;
    boolean lb0 = true;
    ab4 = fb0 && fb1;
    lb0 = !ab1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4);
}
    fb1 = ad2 < ad3;
    ad4 *= -1;
    Output.points[6][4] += fd0;
    Thought lo1 = Thought354.getInstance(fd1, ad1, ad2, ad3);
    boolean lb2 = false;
    lb0 = lb2 && ab1;
    ab2 = ad4 < fd0;
    Output.points[6][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;

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
    fb0 = !fb1;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 415.24330458819446;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    Output.points[6][6] += ld0;
    fb0 = fd0 > fd1;
    Thought lo1 = Thought238.getInstance(ld0, fd0, fd1, ld0);
    if (fb1) {
        boolean lb2 = false;
        Thought lo3 = Thought220.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
        lb2 = fd1 > ld0;
if(fo0 != null){
          fo1 = fo0.m4();
}
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
if(fo1 != null){
      ab1 = fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = !fb0;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought196.getInstance(fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
        fd1 *= -1;
        ab4 = !fb0;
        fb1 = fd0 > fd1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
        fb0 = fb1 && ab1;
        Thought lo1 = Thought283.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 + fd1;
if(fo0 != null){
          ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        ab3 = ab4 || fb0;
if(fo0 != null){
          fo1 = fo0.m4();
}
        double ld2 = 539.9563091635084;
if(fo1 != null){
          fb1 = fo1.m2(ab1, ab2, ab3, ab4);
}
        boolean lb3 = false;
        boolean lb4 = false;
        double ld5 = 198.01364084895008;
        Output.points[6][7] += ld2;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
        boolean lb6 = true;
if(fo1 != null){
          fo0 = fo1.m4(ld5, fd0, fd1, ld2, lb3, lb4, lb6, ab1);
}
        ab2 = ld5 < fd0;
        boolean lb7 = true;
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
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    double ld0 = 918.7754772435993;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought270.getInstance(ad2, ad3, ad4, fd0);
    fb0 = fb1 || fb0;
    fb1 = fd1 > ld0;
    boolean lb2 = true;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
          fo1.m3();
}
if(fo0 != null){
      fo0.m3(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb0, fb1, lb2, fb0);
}
    double ld3 = 970.3024206220039;
        boolean lb4 = false;
if(fo1 != null){
      fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, lb2, lb4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, lb4, fb0, fb1);
}
    Thought lo5 = Thought177.getInstance(fo0, fo1, fo0, fo1);
    boolean lb6 = false;
    fd1 *= -1;
    boolean lb7 = true;
    Thought lo8 = Thought54.getInstance(ld0, ld3, ad1, ad2);

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
    Thought lo0 = Thought166.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    boolean lb1 = true;
if(fo0 != null){
      ad2 = fo0.m3();
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, lb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought30.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, ab1, ab2, ab3);
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
    ad3 *= -1;
    boolean lb4 = false;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, lb2, lb4, ab1, ab2);
}
    if (ab3) {
        Thought lo5 = Thought3.getInstance(fo1, fo0, fo1, fo0);
        fd0 *= -1;
        ab4 = !fb0;
        } else {
        fd1 *= -1;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
        Output.points[6][8] += fd1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        boolean lb6 = true;
        boolean lb7 = false;
        Thought lo8 = Thought194.getInstance();
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
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
    Output.points[7][0] += fd0;
if(ao2 != null){
      fb1 = ao2.m2(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought291.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    double ld1 = 202.34557975372758;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld2 = 524.9030631508018;
if(ao1 != null){
      fb0 = ao1.m2(ld1, ld2, fd0, fd1);
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
    fb0 = fb1 && fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    if (fb0) {
        Output.points[7][1] += fd0;
        boolean lb0 = true;
        fb0 = fd1 < ad1;
        Thought lo1 = Thought162.getInstance();
        double ld2 = 437.22260689126966;
        double ld3 = 153.47396460136804;
if(ao2 != null){
          ao1 = ao2.m4(fb1, lb0, fb0, fb1);
}
        lb0 = fb0 && fb1;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1, ld3, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
        double ld4 = 251.94852563354183;
        ad3 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ad4, fd0, fd1, ld2, fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
if(ao4 != null){
          ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
        Thought lo5 = Thought98.getInstance(ao3, ao4, fo0, fo1);
        fb1 = ld3 > ld4;
if(ao2 != null){
          ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
        lb0 = fd0 < fd1;
        ld2 = ld3 - ld4;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
if(ao3 != null){
          fb0 = ao3.m2();
}
        for(int i0=0; i0<10; i0++){
            Output.points[7][2] -= fd0;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    fd0 = fd1 + fd0;
    double ld0 = 368.78094464136444;
    ab2 = ab3 && ab4;
    double ld1 = 348.57004754838755;
        fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(ao2 != null){
      ld1 = ao2.m3(fb0, fb1, ab1, ab2);
}
    ab3 = !ab4;
    double ld2 = 413.33309782886823;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
}
    double ld3 = 978.9569629869345;
    Output.points[7][3] += ld1;
    Thought lo4 = Thought116.getInstance(ld2, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
    Output.points[7][4] += ld0;
    ab1 = ab2 || ab3;
    boolean lb5 = true;
    Thought lo6 = Thought130.getInstance(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
    if (lb5) {
if(ao1 != null){
          ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
          ld1 = fo1.m3(ld2, ld3, fd0, fd1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = false;
    lb0 = lb1 && lb2;
    ab1 = !ab2;
    boolean lb3 = true;
    fd0 = fd1 + ad1;
        ab2 = ab3 && ab4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    lb2 = !lb3;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || lb1;
    lb2 = fd1 < ad1;
if(fo0 != null){
      ao4 = fo0.m4(ad2, ad3, ad4, fd0, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][5] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Output.points[7][6] -= fd0;
if(fo0 != null){
      fo0.m1(fd1, fd0, fd1, fd0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Output.points[7][7] += fd0;
    fd1 = fd0 - fd1;
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 575.988265832613;
    fb0 = fb1 || fb0;
    double ld1 = 624.0159560094589;
if(fo0 != null){
      fo0.m3(ld0, ld1, fd0, fd1);
}
    ld0 = ld1 - fd0;
    double ld2 = 882.2726443270263;
    Output.points[7][8] += fd0;
    double ld3 = 886.5435066510571;

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
    ab2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    boolean lb0 = true;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    fb0 = fb1 || lb0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
    Output.points[8][0] += fd1;
    ab2 = !ab3;
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    Thought lo2 = Thought265.getInstance();
    ab4 = fd0 < fd1;
    double ld3 = 530.7218374010702;
if(fo0 != null){
      fo0.m1(fb0, fb1, lb0, lb1);
}
    ld3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        fb1 = lb0 || lb1;
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
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    lb0 = !fb0;
    double ld1 = 148.2625070892171;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Thought lo2 = Thought189.getInstance(ad1, ad2, ad3, ad4);
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, fb1, lb0, fb0, fb1);
}
    Output.points[8][1] -= ad4;
    lb0 = fd0 < fd1;
    Thought lo3 = Thought344.getInstance(ld1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
    double ld4 = 613.9034740461026;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fd1 = ld1 - ld4;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb0 = fb0 && fb1;

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
    Output.points[8][2] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    double ld0 = 944.6075487646638;
    boolean lb1 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
if(fo0 != null){
      fo0.m1();
}
    Output.points[8][3] -= ad4;
    Thought lo2 = Thought201.getInstance(lb1, ab1, ab2, ab3);
    ab4 = fb0 && fb1;
    lb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
    boolean lb3 = true;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, lb1, lb3, ab1, ab2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
    double ld1 = 162.1666292078184;
    fd0 = fd1 + ld1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(ld1, fd0, fd1, ld1);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, fd0);
}
    fb1 = lb0 || fb0;
    double ld2 = 78.3518526905384;
    Output.points[8][4] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ld1 + ld2;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao4.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      ld2 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fb0 = !fb1;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ld2 = ao4.m3(fd0, fd1, ld1, ld2, lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - ld1;
    ld2 = fd0 + fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd1, ad1, ad2, ad3);
}
    fb0 = ad4 > fd0;
    fb1 = fd1 < ad1;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
    Thought lo0 = Thought250.getInstance();
    fb1 = fb0 || fb1;
    double ld1 = 596.5660764299108;
    fb0 = fb1 && fb0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought50.getInstance(ab3, ab4, fb0, fb1);
    Thought lo1 = Thought5.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    double ld2 = 904.3865974227645;
if(fo0 != null){
          fb0 = fo0.m2(ld2, fd0, fd1, ld2, fb1, ab1, ab2, ab3);
}
    boolean lb3 = true;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    Output.points[8][5] -= fd1;
    ld2 = fd0 + fd1;
    Thought lo4 = Thought256.getInstance(fo1, ao1, ao2, ao3);
    Output.points[8][6] -= ld2;
    Thought lo5 = Thought115.getInstance(fd0, fd1, ld2, fd0);
    fd1 = ld2 - fd0;
    Thought lo6 = Thought32.getInstance(ao4, fo0, fo1, ao1, fd1, ld2, fd0, fd1);
if(ao2 != null){
      ld2 = ao2.m3();
}
    for(int i0=0; i0<10; i0++){
        lb3 = fd0 > fd1;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought213.getInstance(ab2, ab3, ab4, fb0);
if(ao1 != null){
          ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
        Output.points[8][7] += fd1;
        double ld1 = 427.92787157351063;
if(ao1 != null){
          fo1 = ao1.m4(ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        ad4 = fd0 - fd1;
        boolean lb2 = true;
        ab1 = ld1 < ad1;
        ab2 = ab3 || ab4;
        fb0 = fb1 && lb2;
        ab1 = ab2 && ab3;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Output.points[8][8] -= fd0;
    Output.points[0][0] += fd1;
    fb0 = fd0 < fd1;
    double ld0 = 582.8838306387313;
    fb1 = ld0 > fd0;
    fb0 = !fb1;
    Thought lo1 = Thought129.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb2 = true;
    fb0 = ld0 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(ld0, fd0, fd1, ld0, fb1, lb2, fb0, fb1);
}
    if (lb2) {
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
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought139.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    fd0 = fd1 - fd0;
    Output.points[0][1] += fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    fd1 *= -1;
    Output.points[0][2] += fd0;
    fd1 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, fd0, fd1);
}
    Output.points[0][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[0][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb1, ab1, ab2);
}
    fd0 = fd1 - fd0;

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
    fb1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = !fb1;
    ad1 = ad2 + ad3;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        if (lb0) {
if(fo0 != null){
              ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
}
            double ld1 = 5.818501600719559;
if(fo1 != null){
              fo1.m3(ad2, ad3, ad4, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
              fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
            double ld2 = 353.51024598953524;
            Output.points[0][5] -= fd0;
            fd1 = ld1 - ld2;
            Output.points[0][6] += ad1;
if(fo0 != null){
              fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
            double ld3 = 859.5088933733157;
            fd0 = fd1 - ld1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2);
}
            ad3 *= -1;
            double ld4 = 18.414303153386072;
if(fo0 != null){
              fo1 = fo0.m4();
}
            fb1 = lb0 || fb0;
            boolean lb5 = false;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 + ad3;
    ab1 = ad4 > fd0;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    fd1 = ad1 + ad2;
    Thought lo0 = Thought15.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = ad1 < ad2;
    Output.points[0][7] -= ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab2 = ad1 < ad2;
    boolean lb1 = false;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    ab4 = !fb0;
    fb1 = lb1 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld2 = 777.737374048919;
    boolean lb3 = true;
    ab1 = !ab2;

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
    Thought lo0 = Thought274.getInstance();
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao2.m2(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought107.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
        Thought lo2 = Thought167.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought177.getInstance();
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 || fb0;
        fb1 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fd1 = fd0 - fd1;
        fd0 = fd1 + fd0;
        Thought lo4 = Thought120.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
        fb0 = fb1 || fb0;
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
    Output.points[0][8] += ad2;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    double ld0 = 891.6587194206878;
    if (fb1) {
if(ao1 != null){
          ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
        ad3 *= -1;
        ad4 *= -1;
if(ao1 != null){
          fo1 = ao1.m4(fd0, fd1, ld0, ad1);
}
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
        fd1 *= -1;
if(ao4 != null){
          ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ao4 = fo0.m4(ad4, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
        Output.points[1][0] += ad1;
        } else {
        Output.points[1][1] += ad2;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
    fb0 = fb1 || ab1;
    boolean lb0 = true;
    double ld1 = 632.8167457625897;
    fd0 = fd1 - ld1;
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    ab3 = !ab4;
    fd0 = fd1 - ld1;

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
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = !ab3;
    ad2 = ad3 - ad4;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ad1, ad2);
}
    boolean lb1 = true;
    Thought lo2 = Thought291.getInstance(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1);
    Thought lo3 = Thought118.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb0, lb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    boolean lb4 = false;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, lb1, lb4, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad1 *= -1;
    lb1 = lb4 || ab1;
    boolean lb5 = false;
    ab1 = ab2 || ab3;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
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
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought214.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fd0 = fo1.m3();
}
        fb0 = fd1 > fd0;
    Output.points[1][2] += fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    double ld1 = 366.81567302960536;
    Output.points[1][3] += ld1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
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
    Thought lo0 = Thought279.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    Output.points[1][4] += fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought195.getInstance();
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought348.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
    Output.points[1][5] -= fd0;
    fb0 = fb1 || fb0;

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
      fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    Thought lo1 = Thought160.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
    double ld2 = 915.3659599434808;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld2);
}
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
    fd1 = ld2 + fd0;
    boolean lb3 = false;
    fb0 = fb1 && lb0;
    lb3 = fb0 || fb1;
    Thought lo4 = Thought312.getInstance(lb0, lb3, fb0, fb1);
    lb0 = lb3 || fb0;
    double ld5 = 599.6243974133803;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ld5, fb1, lb0, lb3, fb0);
}
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
}
