package genetic;
import java.util.ArrayList;
class Thought283 extends Thought{
private static ArrayList<Thought283> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 457.24320536605336;
private double fd1 = 207.5055032679272;
private Thought fo0 = null;
private Thought fo1 = null;
Thought283 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought283 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought283 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought283 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought283 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought283 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought283 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought283 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought283 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought283 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought283 instance = new Thought283 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 671.0764027799485;
    Thought lo1 = Thought197.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld0 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 - fd0;
    Thought lo3 = Thought226.getInstance();
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ld0 = fd0 - fd1;
    fb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb2, fb0, fb1);
}
    double ld4 = 996.3933962421881;
    ld4 *= -1;
    lb2 = fb0 && fb1;

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
        ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ab2 && ab3;
    boolean lb0 = true;
    if (ab3) {
        Thought lo1 = Thought202.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        ab4 = fd1 > fd0;
        fd1 *= -1;
        fb0 = !fb1;
        lb0 = ab1 && ab2;
if(fo1 != null){
          fd0 = fo1.m3();
}
if(fo0 != null){
          fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
        lb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
        Output.points[2][8] += fd0;
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        lb0 = fd1 < fd0;
        ab1 = ab2 && ab3;
        ab4 = fb0 || fb1;
        fd1 *= -1;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    double ld0 = 534.7783480599738;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fb0 = fb1 && fb0;
    fd0 = fd1 - ld0;
if(fo0 != null){
      ad1 = fo0.m3();
}
    Thought lo1 = Thought231.getInstance(fb1, fb0, fb1, fb0);
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb2, fb0, fb1);
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
    Thought lo0 = Thought345.getInstance(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought131.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ab3 = ab4 && fb0;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 774.4866911777169;
    boolean lb4 = true;
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld3);
}
    ad1 = ad2 - ad3;
    lb2 = lb4 || ab1;
    double ld5 = 690.8988769477278;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    double ld0 = 700.6119990995093;
    fb1 = !fb0;
    ld0 *= -1;
    fb1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    for(int i0=0; i0<10; i0++){
        fb0 = !fb1;
if(ao3 != null){
          fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
        ld0 = fd0 - fd1;
        boolean lb1 = false;
if(ao4 != null){
          ao4.m1(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
          ao3.m1(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
        lb1 = !fb0;
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
    fb0 = ad1 < ad2;
    Thought lo0 = Thought173.getInstance(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought43.getInstance(fo1, ao1, ao2, ao3);
    Thought lo2 = Thought151.getInstance(ad3, ad4, fd0, fd1);
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fb1 && fb0;
    Thought lo3 = Thought307.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;

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
    fb0 = fd1 < fd0;
    fb1 = !ab1;
    boolean lb0 = false;
    fd1 *= -1;
if(ao1 != null){
      ab1 = ao1.m2(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, ab1, ab2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab3 = ab4 || fb0;
    double ld1 = 349.1714355987414;
    fb1 = ld1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, fd0, fd1);
}
    double ld2 = 211.92947284910238;
    if (lb0) {
        double ld3 = 221.05394407195612;
        ab1 = ld3 > ld1;
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
    Thought lo0 = Thought41.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
if(fo1 != null){
      fo1.m2();
}
    Output.points[3][0] += fd0;
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fd1 = ao1.m3(ab1, ab2, ab3, ab4);
}
    ad1 *= -1;
    ad2 = ad3 - ad4;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, lb1);
}
    ab1 = ad3 < ad4;

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
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        fb1 = fb0 || fb1;
if(fo1 != null){
          fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb1 = fb0 && fb1;
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0);
}
        fb0 = fb1 && fb0;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    if (ab1) {
        fd1 = fd0 + fd1;
if(fo1 != null){
          fo1.m2();
}
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fb1 = ab1 && ab2;
        ab3 = !ab4;
        fd0 = fd1 - fd0;
        fb0 = fd1 > fd0;
        fb1 = fd1 < fd0;
        Output.points[3][1] -= fd1;
        fd0 = fd1 - fd0;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
        boolean lb0 = true;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb1 = fd0 > fd1;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = ad2 < ad3;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought353.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fb1 = fo0.m2();
}
    boolean lb1 = false;
    fd1 = ad1 - ad2;
    double ld2 = 971.696017383142;
    ad2 = ad3 - ad4;
if(fo1 != null){
      lb1 = fo1.m2(fb0, fb1, lb1, fb0);
}
    fd0 = fd1 + ld2;

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
    ad2 = ad3 - ad4;
    ab1 = fd0 > fd1;
    ab2 = !ab3;
    Output.points[3][2] += ad1;
    Output.points[3][3] += ad2;
    double ld0 = 511.14299876022864;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
    Thought lo1 = Thought233.getInstance(fd1, ld0, ad1, ad2, ab2, ab3, ab4, fb0);
    fb1 = ad3 > ad4;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Thought lo2 = Thought163.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd1, ld0, ad1, ad2);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ld0 = fo1.m3(fb0, fb1, ab1, ab2);
}
    Output.points[3][4] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb3 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ad1, ad2, lb3, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
        Output.points[3][5] -= fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    fd1 *= -1;
    double ld1 = 778.5380622943017;
    ld1 = fd0 + fd1;
    fb0 = !fb1;
    Output.points[3][6] -= ld1;
    if (lb0) {
        fd0 = fd1 + ld1;
        fb0 = fb1 && lb0;
if(ao2 != null){
          ao2.m3();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        Output.points[3][7] -= ad2;
        ad3 *= -1;
        ad4 = fd0 + fd1;
        Thought lo0 = Thought370.getInstance(fb1, fb0, fb1, fb0);
        boolean lb1 = false;
        ad1 *= -1;
        Thought lo2 = Thought355.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb1, fb0);
if(fo1 != null){
          fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
        ad4 = fd0 - fd1;
        fb0 = ad1 > ad2;
        double ld3 = 750.1948302194296;
if(fo1 != null){
          ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
        Output.points[3][8] += ad3;
        fb1 = ad4 > fd0;
        lb1 = fb0 || fb1;
if(fo0 != null){
          fo0.m2(fd1, ld3, ad1, ad2);
}
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
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
    boolean lb1 = false;
    lb1 = fd0 < fd1;
    ab1 = !ab2;
    boolean lb2 = true;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    double ld3 = 821.9432836044004;
    boolean lb4 = true;
if(fo0 != null){
      ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
    Thought lo5 = Thought5.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0, fb1, lb0, lb1, lb2);
    if (lb4) {
        ab1 = !ab2;
        fd1 = ld3 - fd0;
if(ao4 != null){
          ao4.m1(fd1, ld3, fd0, fd1, ab3, ab4, fb0, fb1);
}
        double ld6 = 832.3019882283861;
        lb0 = lb1 || lb2;
        lb4 = ld6 < ld3;
        Thought lo7 = Thought186.getInstance(fo0, fo1, ao1, ao2, ab1, ab2, ab3, ab4);
        fb0 = fd0 > fd1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][0] += ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = !ab2;
    boolean lb0 = true;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    Output.points[4][1] += ad4;
if(ao2 != null){
      ao2.m3();
}
    ab2 = ab3 || ab4;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought356.getInstance(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
    Output.points[4][2] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 + ad2;

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
    Thought lo0 = Thought309.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought142.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb3 = false;
    double ld4 = 418.54204098682357;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb2, lb3);
}
    ld4 *= -1;
    double ld5 = 941.6294786300589;
    fb0 = !fb1;
    Thought lo6 = Thought133.getInstance(fo0, fo1, fo0, fo1, ld5, fd0, fd1, ld4, lb2, lb3, fb0, fb1);
    Output.points[4][3] += ld5;
    lb2 = lb3 && fb0;
    boolean lb7 = false;
    fb0 = fd0 > fd1;
    Output.points[4][4] += ld4;

Thought.STACK_COUNTER++;
return ld5;
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
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
    ab1 = fd1 > fd0;
    ab2 = ab3 && ab4;
    double ld0 = 922.1215318456213;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;
    ab3 = !ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && ab1;
if(fo1 != null){
      ab2 = fo1.m2(fd0, fd1, ld0, fd0);
}
    ab3 = ab4 || fb0;
    double ld1 = 169.52271185395665;
    fb1 = ab1 || ab2;
    ab3 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ld1, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    double ld2 = 108.34196812647548;
    ab4 = ld1 < ld2;
    fb0 = fb1 || ab1;
    ab2 = ab3 || ab4;

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
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    Output.points[4][5] += ad1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought133.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
    double ld1 = 689.7924209234949;
    boolean lb2 = true;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    ld1 = ad1 + ad2;

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
    ad1 = ad2 + ad3;
    double ld0 = 87.687954458515;
    ad3 *= -1;
    ad4 = fd0 + fd1;
        Output.points[4][6] -= ld0;
    double ld1 = 844.5521997489623;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb2 = true;
        ld1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
        Output.points[4][7] += fd0;
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ld1, ad1);
}
        Output.points[4][8] -= ad2;
        Thought lo3 = Thought11.getInstance();
        Output.points[5][0] -= ad3;
if(fo0 != null){
          fo1 = fo0.m4(lb2, ab1, ab2, ab3);
}
        Output.points[5][1] += ad4;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, ld1, ad1, lb2, ab1, ab2, ab3);
}
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
    fb0 = fd0 < fd1;
    boolean lb0 = false;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;
    fd1 = fd0 - fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
        lb0 = fd0 > fd1;
    lb1 = !fb0;
    double ld2 = 841.2873490699867;
    boolean lb3 = true;
    boolean lb4 = true;
    ld2 = fd0 + fd1;
    Output.points[5][2] -= ld2;
    Output.points[5][3] += fd0;
    boolean lb5 = false;
    Thought lo6 = Thought241.getInstance(fd1, ld2, fd0, fd1);
    boolean lb7 = true;
    lb4 = lb5 && lb7;
    ld2 = fd0 - fd1;
    Output.points[5][4] += ld2;
    fb0 = fd0 > fd1;
    double ld8 = 996.0722898102364;
    Thought lo9 = Thought220.getInstance(ao1, ao2, ao3, ao4, ld2, ld8, fd0, fd1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[5][5] += ad2;
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = !fb0;
    ad3 = ad4 + fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
    boolean lb1 = true;

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
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    for(int i0=0; i0<10; i0++){
        Thought lo0 = Thought307.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
        double ld1 = 188.3986091872207;
if(ao2 != null){
          fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m2(fd0, fd1, ld1, fd0);
}
        if (ab1) {
if(ao2 != null){
              fd1 = ao2.m3(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
            boolean lb2 = false;
            fd0 = fd1 + ld1;
}}
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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ad1 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 808.188636311433;
    Thought lo1 = Thought112.getInstance(fd0, fd1, ld0, ad1, ab4, fb0, fb1, ab1);
    ad2 = ad3 + ad4;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought222.getInstance(ao3, ao4, fo0, fo1);
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
    ld0 = ad1 + ad2;
if(ao2 != null){
      ad3 = ao2.m3();
}
    boolean lb3 = true;
    lb3 = !ab1;
    Thought lo4 = Thought202.getInstance(ab2, ab3, ab4, fb0);
    Thought lo5 = Thought366.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, fb1, lb3, ab1, ab2);
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
        fd1 = ld0 - ad1;
        lb3 = ab1 && ab2;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb3);
}
        Thought lo6 = Thought77.getInstance(ao2, ao3, ao4, fo0);
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
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    double ld0 = 962.9188677125443;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3();
}
    fb0 = !fb1;
    fb0 = ld0 > fd0;
    Thought lo1 = Thought72.getInstance(fb1, fb0, fb1, fb0);
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, lb3, fb0, fb1, lb2);
}
    lb3 = ld0 > fd0;
    fb0 = !fb1;
    lb2 = !lb3;
    Output.points[5][6] -= fd1;
    double ld4 = 796.1495621485668;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    boolean lb1 = true;
        for(int i0=0; i0<10; i0++){
        Thought lo2 = Thought271.getInstance();
        Thought lo3 = Thought174.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
        fb0 = fb1 || lb0;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb1, ab1, ab2, ab3);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb1 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ad4 *= -1;
    lb1 = fd0 < fd1;
    ad1 *= -1;
    boolean lb2 = true;
    Output.points[5][7] -= ad2;
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld3 = 277.8568225378644;
    lb2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;
    lb1 = lb2 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, lb1, lb2);
}
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Thought lo4 = Thought139.getInstance(fo0, fo1, fo0, fo1, ld3, ad1, ad2, ad3, fb0, fb1, lb0, lb1);
    lb2 = fb0 && fb1;
    lb0 = lb1 && lb2;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    Thought lo0 = Thought332.getInstance(fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    ab4 = fb0 && fb1;
    ad1 = ad2 + ad3;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    double ld1 = 404.3581610301505;
    boolean lb2 = false;
    ab3 = ad1 < ad2;
if(fo0 != null){
      ab4 = fo0.m2();
}
    ad3 = ad4 - fd0;

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
    double ld0 = 956.3477058093168;
if(ao1 != null){
      ao1.m1(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      ao2.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    ld0 = fd0 - fd1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      fb1 = ao2.m2(ld0, fd0, fd1, ld0);
}
    fd0 *= -1;
    boolean lb1 = false;

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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    fb0 = !fb1;
    double ld0 = 469.83345145309863;
    ad2 = ad3 + ad4;
    Thought lo1 = Thought160.getInstance();
    fd0 = fd1 + ld0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      ao3.m2(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 *= -1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    ad3 = ad4 - fd0;
    fb0 = !fb1;

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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld0 = 495.7258405717118;
if(ao1 != null){
      ld0 = ao1.m3(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || ab1;
    fd1 = ld0 - fd0;
    fd1 = ld0 - fd0;
if(ao2 != null){
      ab2 = ao2.m2(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    ab3 = ld0 < fd0;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fd1 = ao1.m3();
}
    ab1 = ld0 < fd0;
    ab2 = !ab3;
    boolean lb1 = false;
    Thought lo2 = Thought271.getInstance(ab3, ab4, fb0, fb1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ab4 = ao2.m2(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    ab2 = fd1 < ld0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    double ld3 = 928.5666154944562;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    ab2 = fd0 > fd1;
    Thought lo0 = Thought224.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
if(ao1 != null){
      ao1.m1();
}
    ab3 = fd0 < fd1;
    boolean lb1 = false;
    double ld2 = 113.38172596504332;
    ab3 = ld2 > ad1;
if(ao2 != null){
      ad2 = ao2.m3(ab4, fb0, fb1, lb1);
}
    ab1 = ad3 < ad4;
    fd0 *= -1;
    Thought lo3 = Thought117.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
    Thought lo4 = Thought262.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, ab1, ab2);
    double ld5 = 449.26638520928805;
    boolean lb6 = false;
    double ld7 = 740.7813019048533;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb8 = true;
    Output.points[5][8] -= ld2;
if(ao1 != null){
      ld5 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 && lb1;
if(fo1 != null){
      ld7 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld2, ld5, ld7);
}
if(fo1 != null){
      fo1.m2();
}
    Output.points[6][0] += ad1;
    Output.points[6][1] += ad2;

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
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought270.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    Output.points[6][2] -= fd1;
    double ld1 = 73.78216571384051;
    ld1 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < ld1;
    fb1 = fd0 < fd1;
    ld1 *= -1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fb1 = fd1 > ld1;
    fd0 = fd1 + ld1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought124.getInstance(fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo0 != null){
      fo0.m3(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
    fb1 = fb0 || fb1;
        fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo0 = Thought364.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought1.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought310.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);

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
    Thought lo0 = Thought80.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fb0 = fb1 || fb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    fb1 = !fb0;
    boolean lb1 = false;
    double ld2 = 560.2171235395357;
    ld2 *= -1;
    double ld3 = 22.44045733239281;
if(fo0 != null){
      fb0 = fo0.m2(fb1, lb1, fb0, fb1);
}
    boolean lb4 = true;
    ld3 = fd0 - fd1;
    lb1 = !lb4;
        boolean lb5 = true;
    boolean lb6 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, lb5, lb6, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld3, fd0, fd1, lb1, lb4, lb5, lb6);
}
    ld2 = ld3 - fd0;
    fb0 = fd1 > ld2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb1, lb4, lb5);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb6 = ld3 > fd0;
    Thought lo7 = Thought258.getInstance(fd1, ld2, ld3, fd0);

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
