package genetic;
import java.util.ArrayList;
class Thought311 extends Thought{
private static ArrayList<Thought311> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 166.1975030893363;
private double fd1 = 964.3850492165876;
private Thought fo0 = null;
private Thought fo1 = null;
Thought311 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought311 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought311 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought311 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought311 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought311 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought311 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought311 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought311 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought311 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought311 instance = new Thought311 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo0.m3(fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought320.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    fd0 = fd1 + fd0;
    Output.points[8][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    double ld1 = 412.8580249302521;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    fd0 = fd1 + ld1;
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    boolean lb2 = false;
if(fo0 != null){
      ld1 = fo0.m3();
}
    fb0 = fd0 < fd1;
    boolean lb3 = false;
    ld1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb2, lb3);
}
    boolean lb4 = true;
    Output.points[8][4] -= ld1;
    boolean lb5 = true;
    boolean lb6 = true;
    boolean lb7 = true;
    Thought lo8 = Thought109.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb4, lb5, lb6, lb7);

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
      fo1.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab3 = ab4 || fb0;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    Thought lo0 = Thought321.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    fd1 *= -1;
    double ld1 = 35.62245482648447;
    fb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo0 != null){
      fo0.m1();
}
if(fo1 != null){
      ld1 = fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
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
    ad2 *= -1;
    Output.points[8][5] += ad3;
        ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 - fd0;
    double ld0 = 915.2375090996082;
    boolean lb1 = true;
    lb1 = !fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
        fb1 = lb1 || fb0;
    fb1 = fd1 > ld0;
    Thought lo2 = Thought209.getInstance(ad1, ad2, ad3, ad4);
    lb1 = fd0 > fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    double ld3 = 42.25852943361295;
    ad4 = fd0 - fd1;
    fb1 = !lb1;
    Thought lo4 = Thought73.getInstance(fb0, fb1, lb1, fb0);

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    Thought lo1 = Thought250.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb0 = ab1 && ab2;
    Output.points[8][6] += ad1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ad1;
    Thought lo2 = Thought18.getInstance(ab3, ab4, fb0, fb1);
    lb0 = !ab1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    double ld3 = 618.5955502425389;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ad1, fb0, fb1, lb0, ab1);
}
    ab2 = ab3 && ab4;
    ad2 = ad3 - ad4;
    fb0 = fb1 || lb0;

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
    fd1 = fd0 - fd1;
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    fb0 = fd0 < fd1;
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fb1 || lb0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    if (fb1) {
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
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
    fb0 = ad1 > ad2;
    Thought lo0 = Thought298.getInstance(ao1, ao2, ao3, ao4);
    boolean lb1 = false;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || lb1;
    Output.points[8][7] -= ad1;
    fb0 = ad2 < ad3;
if(fo1 != null){
      ad4 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
    fb1 = lb1 && fb0;
    Thought lo2 = Thought43.getInstance();
    fb1 = lb1 && fb0;
    fb1 = lb1 && fb0;
if(fo0 != null){
      ad3 = fo0.m3(fb1, lb1, fb0, fb1);
}
    double ld3 = 954.378188577244;
    ad3 = ad4 - fd0;
    fd1 = ld3 - ad1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld3, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = lb1 && fb0;
    boolean lb4 = true;
    fb0 = fb1 && lb1;
    lb4 = ad3 < ad4;
    fd0 = fd1 + ld3;
    boolean lb5 = true;

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
    fd1 *= -1;
    boolean lb0 = true;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    lb0 = fd0 > fd1;
    ab1 = ab2 || ab3;
    ab4 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb0, ab1, ab2, ab3);
}
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0);
}
    boolean lb2 = true;
    Thought lo3 = Thought98.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[8][8] += fd1;
    ab2 = fd0 < fd1;
    ab3 = !ab4;
    fd0 = fd1 + fd0;
        fb0 = !fb1;
    lb0 = lb1 && lb2;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Output.points[0][0] -= fd0;
    ab1 = fd1 > fd0;
    ab2 = !ab3;
    boolean lb4 = true;
if(ao1 != null){
      ab3 = ao1.m2(ab4, fb0, fb1, lb0);
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          ao2 = ao3.m4(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
        boolean lb0 = false;
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb0);
}
        }
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ab2 = ad4 < fd0;
    ab3 = !ab4;
    fd1 = ad1 - ad2;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    ad4 = fd0 + fd1;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought240.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    double ld1 = 75.12293075881227;
    fb0 = fb1 && fb0;
    Thought lo2 = Thought197.getInstance();
    fb1 = fb0 && fb1;
    ld1 = fd0 + fd1;
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(fo1 != null){
      ld1 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m3(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
    Output.points[0][1] -= fd0;
    fd1 *= -1;
    Output.points[0][2] += ld1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought381.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
    if (fb1) {
        Output.points[0][3] -= fd1;
        fb0 = ld1 < fd0;
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
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = true;
    boolean lb1 = false;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    ab1 = fd1 > fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought136.getInstance();
        ab3 = ab4 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(lb0, lb1, ab1, ab2);
}
    fd0 = fd1 - fd0;

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
        ad2 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[0][4] += ad2;
    lb0 = !fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
    lb0 = ad1 < ad2;

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
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    ab2 = ab3 || ab4;
        fd0 = fd1 + ad1;
    fb0 = ad2 > ad3;
    fb1 = ab1 || ab2;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2();
}
    Thought lo1 = Thought255.getInstance(ab2, ab3, ab4, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, fb1, lb0, ab1, ab2);
}
    ab3 = !ab4;
    double ld2 = 444.77777353398574;
    fb0 = ad1 < ad2;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, fb0, fb1, lb0, lb3);
}
    ab1 = ab2 || ab3;
    ld2 *= -1;
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
    Thought lo4 = Thought65.getInstance(fo1, fo0, fo1, fo0);
    lb3 = ab1 && ab2;
    ad2 *= -1;
    ab3 = ad3 > ad4;
    double ld5 = 369.85951577172244;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ld2);
}
    ld5 = ad1 - ad2;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    Output.points[0][5] -= ld2;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = !fb1;
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    double ld1 = 835.8972339454284;
    lb0 = fd0 < fd1;
    ld1 = fd0 - fd1;
    ld1 = fd0 + fd1;
if(ao2 != null){
      ao2.m1();
}
    fb0 = ld1 < fd0;
    boolean lb2 = true;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo3 = Thought256.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, lb0, lb2);
    boolean lb4 = false;
if(ao3 != null){
      lb4 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    Thought lo5 = Thought145.getInstance(ao2, ao3, ao4, fo0);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fb0 && fb1;
    Thought lo0 = Thought72.getInstance(ad1, ad2, ad3, ad4);
    double ld1 = 886.209045263128;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld1);
}
    fb1 = fb0 && fb1;
    double ld2 = 646.1145179968464;
    ld2 *= -1;
    ad1 = ad2 - ad3;
if(ao2 != null){
      fb0 = ao2.m2();
}
    ad4 = fd0 + fd1;
    Thought lo3 = Thought159.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    Output.points[0][6] -= ld1;
    ld2 = ad1 - ad2;
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m3(ld1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, fb0, fb1);
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
    ab2 = fd0 > fd1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab3 = fd0 < fd1;
    double ld0 = 745.2619677597534;
    double ld1 = 847.2496096705894;
    boolean lb2 = false;
    ab3 = ld0 < ld1;
    fd0 *= -1;
    fd1 *= -1;
    Thought lo3 = Thought286.getInstance(ao2, ao3, ao4, fo0);
    ab4 = fb0 || fb1;
    lb2 = ab1 || ab2;
    ab3 = !ab4;

Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    boolean lb0 = true;
    lb0 = !ab1;
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    ab3 = !ab4;
if(ao2 != null){
      ao2.m1(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m3();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb0, ab1, ab2);
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
    fb0 = fd0 > fd1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fb0 = !fb1;
    lb0 = !fb0;
    double ld1 = 338.6847406762016;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
    if (lb0) {
        lb2 = !fb0;
        Thought lo3 = Thought80.getInstance(fd1, ld1, fd0, fd1, fb1, lb0, lb2, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
        fb1 = lb0 || lb2;
        Thought lo4 = Thought236.getInstance(ld1, fd0, fd1, ld1);
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        ld1 *= -1;
        boolean lb5 = false;
        lb2 = fd0 < fd1;
        boolean lb6 = true;
        boolean lb7 = true;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    double ld0 = 659.5913855073907;
    boolean lb1 = true;
    double ld2 = 377.56235050109194;
    ab4 = ld2 > fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0, fb0, fb1, lb1, ab1);
}
if(fo0 != null){
      fo0.m1(fd1, ld0, ld2, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
    ld0 = ld2 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld2, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ld2, fd0);
}
    boolean lb3 = true;
    Thought lo4 = Thought330.getInstance();
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
    Output.points[0][7] -= fd1;
    fb1 = ld0 < ld2;
    boolean lb5 = true;
    lb1 = lb3 && lb5;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    fd0 = fd1 - ld0;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 655.0167917976553;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought287.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    fb0 = fd1 > ld0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 111.78615877556608;
    ld2 = ad1 + ad2;
    double ld3 = 213.21963244663968;
    fb1 = ad2 > ad3;
    fb0 = ad4 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fb1, fb0, fb1, fb0);
}
    ld0 = ld2 + ld3;
    boolean lb4 = true;
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(ld2, ld3, ad1, ad2, lb4, fb0, fb1, lb4);
}
    ad3 = ad4 + fd0;
    Output.points[0][8] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
}
    fb1 = !lb4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[1][0] -= ld0;
    fb0 = fb1 || lb4;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, ad1, ad2);
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
    ad1 = ad2 - ad3;
    Output.points[1][1] += ad4;
    ab2 = ab3 || ab4;
    fd0 = fd1 + ad1;
    fb0 = fb1 && ab1;
    ab2 = !ab3;
    ab4 = ad2 < ad3;
    ad4 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    Thought lo0 = Thought362.getInstance();
    fb1 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    double ld1 = 37.915883835792776;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ad1);
}
    ab1 = ab2 || ab3;
    boolean lb2 = true;
    Thought lo3 = Thought332.getInstance();
if(fo0 != null){
      fo0.m3(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fd1 = fo1.m3(ld1, ad1, ad2, ad3, ab4, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[1][2] += fd1;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 < fd1;
if(ao1 != null){
      fd0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought115.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought371.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);

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
    fb0 = !fb1;
    fb0 = !fb1;
    Output.points[1][3] -= ad1;
    Output.points[1][4] -= ad2;
    ad3 = ad4 - fd0;
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    double ld0 = 200.9609069211994;
    ld0 = ad1 + ad2;
    Thought lo1 = Thought158.getInstance(ad3, ad4, fd0, fd1);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3);
}
    double ld2 = 935.874365892457;
    ad3 = ad4 - fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2();
}
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao3.m1(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    double ld0 = 175.632840397314;
    ab1 = !ab2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    if (ab4) {
        fb0 = fb1 || ab1;
        double ld0 = 135.6364922281033;
        ad2 = ad3 - ad4;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ad1);
}
        ad2 = ad3 - ad4;
        fd0 *= -1;
        fd1 = ld0 + ad1;
        ab2 = ab3 || ab4;
        ad2 *= -1;
        fb0 = ad3 > ad4;
        fb1 = fd0 < fd1;
        ld0 = ad1 - ad2;
        ab1 = ab2 || ab3;
        boolean lb1 = false;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
        boolean lb2 = true;
        ab2 = ld0 > ad1;
        boolean lb3 = true;
        ad2 *= -1;
        ad3 = ad4 + fd0;
if(ao3 != null){
          ab2 = ao3.m2();
}
        ab3 = fd1 < ld0;
        ab4 = !fb0;
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
    fd0 *= -1;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
    lb0 = fb0 && fb1;
    double ld1 = 722.2247025745197;
    ld1 = fd0 + fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, lb0, lb2, fb0, fb1);
}
    lb0 = fd0 > fd1;
    double ld3 = 575.6411166443994;
if(fo1 != null){
      lb2 = fo1.m2(ld1, ld3, fd0, fd1, fb0, fb1, lb0, lb2);
}
    ld1 *= -1;
    fb0 = fb1 || lb0;
    Thought lo4 = Thought103.getInstance(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
    ld3 = fd0 + fd1;
    boolean lb5 = false;
    boolean lb6 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo7 = Thought223.getInstance(ld1, ld3, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, fd0, fd1);
}
    Thought lo8 = Thought77.getInstance();
    ld1 *= -1;
    boolean lb9 = false;

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
    double ld0 = 980.5004203657346;
    ab2 = fd0 < fd1;
    Output.points[1][5] += ld0;
    Output.points[1][6] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb1 = true;
    boolean lb2 = false;
    ld0 = fd0 + fd1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, lb2, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, ld0, fd0, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought278.getInstance(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
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
    boolean lb0 = true;
    Thought lo1 = Thought273.getInstance();
    ad2 = ad3 + ad4;
    double ld2 = 756.9936566064965;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
    Output.points[1][7] -= ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
    Output.points[1][8] -= fd1;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 541.8717120652005;
    boolean lb4 = false;
if(fo0 != null){
      ld2 = fo0.m3(ld3, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    lb0 = lb4 && fb0;
    fb1 = ld2 > ld3;
    if (lb0) {
        lb4 = !fb0;
        Output.points[2][0] -= ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ld2;
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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    double ld0 = 866.5826080989766;
if(fo0 != null){
      ad2 = fo0.m3();
}
    if (ab2) {
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m1(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
        Thought lo1 = Thought109.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
        Output.points[2][1] -= ad4;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        fd0 = fd1 + ld0;
        ad1 = ad2 + ad3;
        ab2 = !ab3;
        ad4 = fd0 + fd1;
        ab4 = fb0 && fb1;
if(fo0 != null){
          ld0 = fo0.m3(ad1, ad2, ad3, ad4);
}
        ab1 = !ab2;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        double ld2 = 455.2912283189422;
        ad2 *= -1;
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
    fd0 *= -1;
if(ao1 != null){
      ao1.m1();
}
    fd1 = fd0 + fd1;
    Output.points[2][2] -= fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought275.getInstance(fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought78.getInstance(ao3, ao4, fo0, fo1);
    boolean lb2 = true;
    lb2 = !fb0;

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
    if (fb0) {
        ad2 = ad3 - ad4;
        Output.points[2][3] -= fd0;
if(ao2 != null){
          ao2.m1(fd1, ad1, ad2, ad3);
}
        Output.points[2][4] += ad4;
        double ld0 = 822.7446913595574;
        Thought lo1 = Thought245.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
        ad1 *= -1;
        double ld2 = 403.1905407933833;
        fb1 = !fb0;
        ad1 = ad2 + ad3;
if(ao1 != null){
          ao1.m2();
}
        ad4 *= -1;
        fb1 = fb0 && fb1;
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ld2, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
          ao2.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
        Output.points[2][5] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
        double ld3 = 933.4317783805747;
        fd0 = fd1 - ld0;
        ld2 *= -1;
        fb1 = fb0 && fb1;
        fb0 = !fb1;
        boolean lb4 = true;
if(ao3 != null){
          ao3.m3(ao4, fo0, fo1, ao1);
}
        } else {
if(ao2 != null){
          ad3 = ao2.m3(ad4, fd0, fd1, ad1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
    fd0 *= -1;
    boolean lb0 = true;
if(ao4 != null){
      fd1 = ao4.m3(lb0, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    boolean lb1 = false;
    boolean lb2 = true;
    double ld3 = 694.9724296016917;
    ab4 = fb0 && fb1;
    ld3 *= -1;
if(ao4 != null){
      ao4.m3(fd0, fd1, ld3, fd0, lb0, lb1, lb2, ab1);
}
    fd1 *= -1;
    boolean lb4 = true;
    ab1 = ab2 || ab3;
    if (ab4) {
        fb0 = !fb1;
        Output.points[2][6] += ld3;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3, lb0, lb1, lb2, lb4);
}
        fd0 = fd1 + ld3;
        ab1 = fd0 > fd1;
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld0 = 453.82380385763133;
    Thought lo1 = Thought23.getInstance(ld0, ad1, ad2, ad3);
    boolean lb2 = true;
    Thought lo3 = Thought82.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ld0);
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    lb4 = !ab1;
    double ld5 = 691.7488058365524;
    boolean lb6 = true;
    boolean lb7 = false;
    lb7 = ab1 && ab2;

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
    double ld0 = 319.88006399015654;
    fb0 = ld0 < fd0;
    Output.points[2][7] -= fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld1 = 946.1607283640578;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    double ld2 = 541.4139211483902;
    Thought lo3 = Thought71.getInstance(fo0, fo1, fo0, fo1, ld0, ld1, ld2, fd0, fb1, fb0, fb1, fb0);
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fd1, ld0, ld1, ld2, fb0, fb1, lb4, fb0);
}
    fd0 *= -1;
    Output.points[2][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ld0 = ld1 - ld2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
    boolean lb5 = true;
    lb5 = fb0 && fb1;
if(fo0 != null){
      fo0.m1();
}
    ld1 = ld2 - fd0;
    Thought lo6 = Thought30.getInstance(lb4, lb5, fb0, fb1);

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
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    Thought lo0 = Thought51.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
        fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb2 = true;
    fd1 = fd0 - fd1;
    lb2 = fd0 > fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought264.getInstance();
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, lb2, fb0);
}
    Thought lo4 = Thought274.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb1, lb2, fb0);
    fb1 = lb1 || lb2;
    fb0 = fb1 || lb1;
if(fo1 != null){
      lb2 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    boolean lb5 = true;
    lb5 = fb0 && fb1;
    lb1 = fd1 > fd0;
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
    fb1 = fb0 || fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought147.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    lb0 = fb0 && fb1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3(lb0, lb2, fb0, fb1);
}
    Thought lo3 = Thought262.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    boolean lb4 = false;
    lb0 = fd0 < fd1;
    boolean lb5 = true;
    Output.points[3][0] -= fd0;
    Output.points[3][1] -= fd1;
    lb2 = lb4 && lb5;
    fb0 = fb1 && lb0;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb2 = fo1.m2(fo0, fo1, fo0, fo1, lb4, lb5, fb0, fb1);
}
    fd1 *= -1;
    lb0 = lb2 || lb4;

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
