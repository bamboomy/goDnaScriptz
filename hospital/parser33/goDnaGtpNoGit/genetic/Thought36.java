package genetic;
import java.util.ArrayList;
class Thought36 extends Thought{
private static ArrayList<Thought36> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 543.7292594073773;
private double fd1 = 292.76031125552953;
private Thought fo0 = null;
private Thought fo1 = null;
Thought36 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought36 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought36 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought36 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought36 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought36 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought36 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought36 instance = new Thought36 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
        fd1 = fd0 + fd1;
    fd0 *= -1;
    if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
        } else {
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        boolean lb0 = true;
        double ld1 = 241.56672829167914;
        Output.points[6][7] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
        Thought lo2 = Thought353.getInstance();
        Thought lo3 = Thought150.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
        Thought lo4 = Thought267.getInstance(fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
        boolean lb5 = false;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, lb5, fb0, fb1, lb0);
}
        boolean lb6 = false;
        ld1 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fo1.m1(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
        fd0 = fd1 - ld1;
        fd0 = fd1 + ld1;
        fd0 = fd1 - ld1;
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
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    fd1 = fd0 - fd1;
    Output.points[6][8] -= fd0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[7][0] += ad2;
    fb1 = fb0 || fb1;
    ad3 = ad4 + fd0;
    fb0 = fd1 > ad1;
    Thought lo0 = Thought92.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    if (fb0) {
        ad4 = fd0 - fd1;
        fb1 = ad1 > ad2;
        boolean lb1 = true;
        ad3 = ad4 - fd0;
if(fo1 != null){
          fo1.m2();
}
        boolean lb2 = true;
        lb1 = lb2 && fb0;
        fb1 = lb1 && lb2;
        Output.points[7][1] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, ad1, ad2, fb0, fb1, lb1, lb2);
}
        fb0 = fb1 && lb1;
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
    ab2 = ad1 < ad2;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    boolean lb1 = true;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;

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
    fb0 = !fb1;
    Thought lo0 = Thought55.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    boolean lb1 = false;
    if (lb1) {
if(fo1 != null){
          fb0 = fo1.m2();
}
        fd1 = fd0 - fd1;
        } else if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(lb1, fb0, fb1, lb1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
}
        Thought lo2 = Thought278.getInstance(fd0, fd1, fd0, fd1, fb1, lb1, fb0, fb1);
        boolean lb3 = false;
        lb3 = !lb1;
        fd0 = fd1 - fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb3, lb1);
}
        boolean lb4 = false;
if(ao3 != null){
          fd1 = ao3.m3(ao4, fo0, fo1, ao1);
}
        fd0 = fd1 + fd0;
if(ao2 != null){
          lb1 = ao2.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && lb3;
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
    Thought lo0 = Thought99.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0);
    fb1 = fd1 > ad1;
    fb0 = !fb1;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 && fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2();
}
    fb0 = ad2 > ad3;
if(fo1 != null){
      fo1.m1(fb1, lb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    if (fb0) {
        Thought lo2 = Thought175.getInstance(ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
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
    ab1 = fd1 > fd0;
    ab2 = ab3 || ab4;
    boolean lb0 = false;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    ab1 = ab2 || ab3;
    ab4 = fd1 < fd0;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo2 = Thought112.getInstance(ab4, fb0, fb1, lb0);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fd1 > fd0;
    fb0 = fd1 < fd0;
    double ld3 = 748.118225252989;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld3, fd0, fd1, fb1, lb0, lb1, ab1);
}
    ab2 = ld3 > fd0;
    ab3 = fd1 > ld3;

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
    boolean lb0 = true;
    ad2 *= -1;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < ad1;
    Thought lo1 = Thought204.getInstance(ao2, ao3, ao4, fo0);
    Thought lo2 = Thought180.getInstance(ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
    boolean lb3 = false;
    boolean lb4 = false;
    Thought lo5 = Thought60.getInstance();
    lb0 = lb3 || lb4;
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
    boolean lb6 = false;
    fd1 = ad1 + ad2;
    lb0 = lb3 || lb4;
    boolean lb7 = false;
    lb6 = ad3 > ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, lb7, ab1, ab2, ab3);
}
    ab4 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        boolean lb8 = false;
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb8);
}
if(ao1 != null){
          lb0 = ao1.m2(ao2, ao3, ao4, fo0, lb3, lb4, lb6, lb7);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fb1 = !fb0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    boolean lb1 = false;
    fb0 = fd0 > fd1;

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
    Thought lo0 = Thought377.getInstance(fo1, fo0, fo1, fo0);
    ab1 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo1 = Thought60.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab2 = fd1 > fd0;
    boolean lb2 = true;
    ab2 = !ab3;
        ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb2 = ab1 || ab2;
    ab3 = !ab4;
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, lb2, ab1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;

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
    double ld0 = 92.40930912242294;
if(fo1 != null){
      fb0 = fo1.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
    ld0 = ad1 + ad2;
    double ld1 = 5.250844467200089;
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld2 = 348.1509095367829;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ld1;
    ld2 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(lb3, fb0, fb1, lb3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ld2, fb0, fb1, lb3, fb0);
}
    ad1 = ad2 - ad3;
        fb1 = lb3 && fb0;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    double ld4 = 467.89720663797397;
    lb3 = fb0 || fb1;
    lb3 = ld0 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ld4, ad1, ad2, fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, lb3, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 + ad3;
    if (fb0) {
        double ld0 = 418.7616567009407;
        fb1 = ad3 > ad4;
        if (ab1) {
            ab2 = !ab3;
if(fo1 != null){
              fo1.m1(fd0, fd1, ld0, ad1);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
            Output.points[7][2] -= fd1;
            ld0 *= -1;
if(fo1 != null){
              fo0 = fo1.m4();
}
            Thought lo1 = Thought276.getInstance(ab4, fb0, fb1, ab1);
if(fo0 != null){
              ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
            double ld2 = 681.6440557288756;
            boolean lb3 = true;
if(fo0 != null){
              fo1 = fo0.m4(ad4, fd0, fd1, ld2, lb3, ab1, ab2, ab3);
}
            boolean lb4 = true;
            ab3 = ld0 > ad1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[7][3] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    double ld1 = 773.8364818785839;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo2 = Thought148.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    ld1 = fd0 - fd1;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = ld1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fb1, lb0, fb0, fb1);
}
    lb0 = !fb0;

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
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    Output.points[7][4] += ad1;
        boolean lb0 = true;
    lb0 = ad2 < ad3;
    fb0 = fb1 && lb0;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    lb1 = ad2 < ad3;
    fb0 = fb1 && lb0;
    ad4 *= -1;
    Thought lo2 = Thought135.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    boolean lb3 = true;
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      ao2.m2(lb1, lb3, fb0, fb1);
}
    lb0 = !lb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb3, fb0, fb1, lb0);
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
    fd1 = fd0 - fd1;
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    double ld0 = 233.00939585272207;
        fb1 = ld0 > fd0;
    ab1 = fd1 < ld0;
    double ld1 = 548.7443207931128;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    fb1 = ld1 > fd0;
    ab1 = fd1 > ld0;
    ab2 = ld1 > fd0;
    Thought lo2 = Thought138.getInstance(ao2, ao3, ao4, fo0);
    double ld3 = 351.28035531741983;
    ab3 = fd0 < fd1;
    boolean lb4 = false;
    ld0 = ld1 - ld3;
    boolean lb5 = true;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ld1, ld3);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = ab1 && ab2;
    ad2 *= -1;
    ab3 = ad3 < ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3();
}
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    ab3 = ab4 && fb0;

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
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    lb0 = fb0 || fb1;
    lb0 = fb0 && fb1;
    Output.points[7][5] -= fd0;
    lb0 = fd1 < fd0;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = fd1 > fd0;
    Thought lo2 = Thought123.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld3 = 906.9193731737915;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld3);
}
    Output.points[7][6] -= fd0;
    fb1 = fd1 > ld3;
        boolean lb4 = true;
    fd0 = fd1 - ld3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
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
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Output.points[7][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, ab1, ab2);
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
    fb0 = !fb1;
    ad1 *= -1;
    Output.points[7][8] -= ad2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1);
}
    Thought lo1 = Thought181.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb2 = true;
    lb0 = lb2 || fb0;

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
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
        ab2 = ab3 && ab4;
        for(int i1=0; i1<10; i1++){
            fd0 = fd1 + ad1;
            double ld0 = 705.0075858962033;
            Output.points[8][0] += ad1;
            }
        Thought lo1 = Thought214.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        boolean lb2 = false;
        ab1 = ad2 > ad3;
        ab2 = ad4 < fd0;
        fd1 = ad1 - ad2;
        ab3 = ab4 && fb0;
        double ld3 = 709.1153322051774;
        fb1 = ad2 < ad3;
        ad4 = fd0 + fd1;
if(fo0 != null){
          ld3 = fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        }
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    Thought lo4 = Thought139.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ad1 *= -1;
    ab1 = ad2 > ad3;
if(fo1 != null){
      fo1.m2(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
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
    fb1 = fd0 > fd1;
    Thought lo0 = Thought337.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fb1 = ao4.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
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
    fb0 = fb1 || fb0;
    Thought lo0 = Thought201.getInstance(fb1, fb0, fb1, fb0);
    fb1 = !fb0;
    Thought lo1 = Thought213.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
    fb1 = ad3 > ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    fb0 = !fb1;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought11.getInstance(ao1, ao2, ao3, ao4);
    fb0 = ad4 > fd0;
if(fo0 != null){
      fo0.m1(fd1, ad1, ad2, ad3);
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
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought276.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
        fd0 = fd1 + fd0;
        boolean lb1 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
        ab1 = !ab2;
        ab3 = ab4 && fb0;
if(ao2 != null){
          fb1 = ao2.m2(lb1, ab1, ab2, ab3);
}
        fd1 *= -1;
        for(int i1=0; i1<10; i1++){
            ab4 = fb0 || fb1;
if(ao3 != null){
              lb1 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
            fb0 = !fb1;
            Output.points[8][1] += fd0;
            fd1 = fd0 - fd1;
if(ao2 != null){
              lb1 = ao2.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb1, ab1);
}
            }
        Thought lo2 = Thought354.getInstance(ao3, ao4, fo0, fo1);
        fd0 = fd1 - fd0;
        Thought lo3 = Thought98.getInstance(fd1, fd0, fd1, fd0);
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
        boolean lb4 = false;
        ab2 = fd1 < fd0;
        Output.points[8][2] -= fd1;
        fd0 = fd1 - fd0;
        Output.points[8][3] -= fd1;
        ab3 = fd0 > fd1;
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
      ao2 = ao3.m4();
}
    ab2 = ad2 > ad3;
    ad4 *= -1;
    ab3 = ab4 || fb0;
    fb1 = !ab1;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    Thought lo0 = Thought220.getInstance(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
          ad1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        Thought lo1 = Thought140.getInstance(ad2, ad3, ad4, fd0);
        Thought lo2 = Thought195.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
        double ld3 = 333.5125899084137;
        double ld4 = 62.53646180382222;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    Thought lo1 = Thought358.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    Thought lo2 = Thought156.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
    fd1 *= -1;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        boolean lb3 = false;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
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
    ab1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
    Thought lo0 = Thought113.getInstance();
    ab2 = ab3 && ab4;
    fd0 = fd1 - fd0;
    Thought lo1 = Thought249.getInstance(fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    Output.points[8][4] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
    Thought lo2 = Thought257.getInstance(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;

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
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        fb1 = fd1 < ad1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        double ld0 = 753.5610637344356;
        boolean lb1 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, ad1, lb1, fb0, fb1, lb1);
}
        Thought lo2 = Thought162.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, fb0);
        ad2 *= -1;
        Thought lo3 = Thought292.getInstance(fo0, fo1, fo0, fo1);
        Thought lo4 = Thought74.getInstance(ad3, ad4, fd0, fd1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
}
        fb1 = ad4 > fd0;
        lb1 = fb0 || fb1;
        fd1 *= -1;
        lb1 = fb0 || fb1;
if(fo0 != null){
          ld0 = fo0.m3();
}
        boolean lb5 = true;
        Thought lo6 = Thought163.getInstance(lb1, lb5, fb0, fb1);
        lb1 = lb5 || fb0;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb1, lb5, fb0);
}
        Thought lo7 = Thought251.getInstance(fd1, ld0, ad1, ad2, fb1, lb1, lb5, fb0);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, lb1, lb5, fb0);
}
        ad3 = ad4 + fd0;
        boolean lb8 = true;
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
    Thought lo0 = Thought300.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
    Output.points[8][5] -= ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
    Thought lo1 = Thought128.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb2 = ab1 && ab2;
    ab3 = fd0 > fd1;
    double ld3 = 971.892582086489;
    ld3 = ad1 - ad2;
    ab4 = ad3 < ad4;

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
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld0 = 591.460460074893;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
              fb0 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[8][6] += fd1;
    fb1 = fb0 || fb1;
    double ld1 = 849.2701680883421;
    Output.points[8][7] += ld0;
    ld1 *= -1;
    fb0 = fd0 < fd1;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought352.getInstance(fo1, ao1, ao2, ao3);

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
    boolean lb0 = true;
    Output.points[8][8] -= ad1;
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    lb0 = fd0 < fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ad2 = ao2.m3();
}
    fb0 = fb1 && lb0;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        lb0 = !fb0;
        boolean lb2 = true;
if(ao3 != null){
          ad3 = ao3.m3(fb0, fb1, lb1, lb2);
}
        lb0 = ad4 > fd0;
        fd1 *= -1;
        boolean lb3 = false;
        boolean lb4 = false;
        ad1 = ad2 - ad3;
        ad4 = fd0 - fd1;
        lb4 = lb0 && fb0;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb1, lb1, lb2, lb3);
}
        lb4 = fd0 < fd1;
if(ao3 != null){
          lb0 = ao3.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb3, lb4, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought202.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    Output.points[0][0] += fd0;
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;

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
    ab2 = ab3 && ab4;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
    double ld0 = 586.7593658830833;
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    boolean lb2 = false;
    ab1 = !ab2;
    fd0 = fd1 - ld0;
    ad1 = ad2 - ad3;
    ab3 = !ab4;
    Thought lo3 = Thought60.getInstance(ad4, fd0, fd1, ld0, fb0, fb1, lb1, lb2);
    boolean lb4 = true;
    Thought lo5 = Thought342.getInstance(ao1, ao2, ao3, ao4, lb4, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
if(fo1 != null){
      ad2 = fo1.m3();
}
    ad3 = ad4 - fd0;
    Output.points[0][1] += fd1;
    double ld6 = 807.0222362220562;
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb1, lb2, lb4);
}
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, ld6, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
}
    ad4 *= -1;
    boolean lb7 = true;

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
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Output.points[0][2] -= fd0;
    double ld1 = 479.61845076346015;
    Output.points[0][3] += fd0;
    fd1 = ld1 + fd0;
    Output.points[0][4] -= fd1;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;

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
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[0][5] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought200.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fb1 = fb0 || fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    boolean lb1 = true;
    double ld2 = 849.2480527486514;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
    fb0 = ld2 > fd0;
    Thought lo3 = Thought114.getInstance(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
    lb1 = ld2 > fd0;
    fb0 = fd1 < ld2;
    Thought lo4 = Thought34.getInstance(fd0, fd1, ld2, fd0, fb1, lb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fb0 = fb1 || lb1;
    Thought lo5 = Thought132.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld2, fd0, fd1, fb1, lb1, fb0, fb1);
}
    ld2 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld2, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    boolean lb6 = false;

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
    Thought lo0 = Thought227.getInstance(fo1, fo0, fo1, fo0);
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    Output.points[0][6] -= fd0;
    double ld1 = 372.8428025301842;
    boolean lb2 = true;
if(fo1 != null){
      lb2 = fo1.m2(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    Thought lo3 = Thought392.getInstance();
    fb0 = !fb1;
    fd0 *= -1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld1, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    double ld4 = 396.5806410683017;
    ld1 = ld4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld1, ld4, fd0);
}
    Thought lo5 = Thought31.getInstance(fo0, fo1, fo0, fo1, fd1, ld1, ld4, fd0);

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
