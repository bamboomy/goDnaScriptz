package genetic;
import java.util.ArrayList;
class Thought310 extends Thought{
private static ArrayList<Thought310> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 965.3874689093218;
private double fd1 = 637.6529010414432;
private Thought fo0 = null;
private Thought fo1 = null;
Thought310 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought310 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought310 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought310 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought310 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought310 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought310 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought310 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought310 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought310 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought310 instance = new Thought310 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    Thought lo1 = Thought83.getInstance(fb0, fb1, lb0, fb0);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    Output.points[5][0] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, lb2);
}
    boolean lb3 = false;
    lb3 = !fb0;
    fd0 *= -1;
    fb1 = lb0 && lb2;
    lb3 = !fb0;

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
    double ld0 = 445.602839205594;
    ab4 = fb0 && fb1;
        Thought lo1 = Thought164.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - ld0;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld0, fd0);
}
    boolean lb2 = true;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    lb2 = ld0 < fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ld0 *= -1;
    boolean lb3 = true;
    fd0 = fd1 + ld0;

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
    Output.points[5][1] -= ad2;
    double ld0 = 471.4985594337755;
    double ld1 = 443.41821619427964;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought235.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[5][2] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    double ld3 = 849.4804646894113;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1);
}
if(fo1 != null){
      ld3 = fo1.m3();
}
    ad1 = ad2 - ad3;
    boolean lb4 = true;
    boolean lb5 = true;
    lb5 = !fb0;
if(fo0 != null){
      fo0.m3(fb1, lb4, lb5, fb0);
}
    fb1 = !lb4;

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
    ad1 = ad2 - ad3;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(ad2, ad3, ad4, fd0, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, lb0, ab1, ab2);
}
    ab3 = fd1 < ad1;
    ab4 = ad2 < ad3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
    lb0 = ab1 && ab2;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo1 = fo0.m4(lb3, ab1, ab2, ab3);
}
    ad3 = ad4 - fd0;
    double ld4 = 82.16458923447017;
    ab4 = !fb0;
    fb1 = fd0 > fd1;

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
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[5][3] -= fd1;
    double ld0 = 981.2329087660851;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ld0 = fd0 - fd1;
        boolean lb1 = false;
        boolean lb2 = true;
        double ld3 = 611.7523876584384;
        ld3 = ld0 - fd0;
if(ao2 != null){
          ao1 = ao2.m4(fd1, ld3, ld0, fd0);
}
        Thought lo4 = Thought15.getInstance(ao3, ao4, fo0, fo1, fd1, ld3, ld0, fd0);
        Thought lo5 = Thought383.getInstance();
        lb2 = fd1 < ld3;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb1, lb2);
}
        boolean lb6 = true;
        ld0 *= -1;
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
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
    fb1 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    fb0 = ad4 < fd0;
        fd1 = ad1 - ad2;
    Output.points[5][4] += ad3;
    Output.points[5][5] += ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
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
    Output.points[5][6] -= fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
if(ao1 != null){
      ab4 = ao1.m2();
}
if(ao2 != null){
      fb0 = ao2.m2(fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 || ab1;
    ad1 = ad2 + ad3;
    Thought lo0 = Thought64.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m3(ad2, ad3, ad4, fd0);
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
    boolean lb0 = false;
    lb0 = !fb0;
    fb1 = lb0 && fb0;
    double ld1 = 235.72652827072878;
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    lb0 = ld1 > fd0;
    lb2 = !fb0;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
    if (fb1) {
        boolean lb3 = true;
        Output.points[5][7] -= ld1;
        lb3 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          lb0 = fo1.m2(lb2, fb0, fb1, lb3);
}
        lb0 = ld1 > fd0;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb3, lb0);
}
        double ld4 = 248.76037967791902;
if(fo0 != null){
          fo1 = fo0.m4(ld4, ld1, fd0, fd1, lb2, fb0, fb1, lb3);
}
        lb0 = lb2 || fb0;
        ld4 = ld1 + fd0;
        double ld5 = 888.3375716724986;
        Thought lo6 = Thought139.getInstance(fo1, fo0, fo1, fo0, fb1, lb3, lb0, lb2);
        fb0 = fd0 > fd1;
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
        Thought lo0 = Thought192.getInstance(fo1, fo0, fo1, fo0);
    ab1 = fd1 < fd0;
    double ld1 = 840.2077816739156;
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    fd1 = ld1 + fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 < ld1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    Thought lo0 = Thought261.getInstance(ad2, ad3, ad4, fd0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    Output.points[5][8] -= ad4;
    Thought lo1 = Thought49.getInstance(fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    ad4 *= -1;
    fd0 = fd1 + ad1;
    Thought lo3 = Thought106.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    lb2 = !fb0;
if(fo0 != null){
      fo0.m2();
}
    fd1 *= -1;

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
    ab1 = !ab2;
    Thought lo0 = Thought57.getInstance(ab3, ab4, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    double ld1 = 338.46487170572243;
    fb0 = ad4 < fd0;
    fb1 = ab1 && ab2;
if(fo0 != null){
      fd1 = fo0.m3(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo0.m2(ld1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1);
}
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    ad1 = ad2 - ad3;
    boolean lb3 = false;
    Thought lo4 = Thought395.getInstance(ad4, fd0, fd1, ld1, lb2, lb3, ab1, ab2);
    ab3 = ab4 && fb0;
    fb1 = lb2 && lb3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1);
}
    ad2 = ad3 + ad4;

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
      fd1 = ao2.m3();
}
    fb1 = !fb0;
    boolean lb0 = true;
    double ld1 = 953.1852883138366;
if(ao3 != null){
      ao3.m1(fb0, fb1, lb0, fb0);
}
    boolean lb2 = false;
    ld1 *= -1;
    fb0 = !fb1;
    fd0 *= -1;
    boolean lb3 = false;
    fd1 = ld1 + fd0;
    Thought lo4 = Thought28.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, lb0, lb2, lb3, fb0);
    boolean lb5 = false;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, lb2);
}
    boolean lb6 = false;
    lb3 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb5, lb6, fb0, fb1);
}
    ld1 = fd0 - fd1;
    ld1 *= -1;
    lb0 = fd0 < fd1;
    Thought lo7 = Thought170.getInstance(ao4, fo0, fo1, ao1);
    boolean lb8 = false;

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
      ao2.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
    double ld0 = 959.2818461282213;
if(ao4 != null){
      ao3 = ao4.m4();
}
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    double ld1 = 434.62197240638545;
    boolean lb2 = false;
    boolean lb3 = false;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    double ld4 = 547.6112061572427;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 931.6435786542437;
    ab1 = !ab2;
if(ao2 != null){
      ld0 = ao2.m3(fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    fd1 *= -1;
    ab4 = ld0 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao3 != null){
      ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
    boolean lb1 = false;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought236.getInstance(fd1, ld0, fd0, fd1);
    ld0 = fd0 - fd1;
    ab3 = ld0 < fd0;
    double ld3 = 288.34581570533624;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ld3);
}
    lb1 = ab1 || ab2;
    boolean lb4 = true;
if(ao1 != null){
      ab2 = ao1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    if (ab2) {
        Output.points[6][0] -= ad4;
        ab3 = fd0 < fd1;
if(ao3 != null){
          ao2 = ao3.m4(ab4, fb0, fb1, ab1);
}
        boolean lb0 = false;
        double ld1 = 710.9430847397632;
        boolean lb2 = false;
if(ao4 != null){
          ld1 = ao4.m3(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
        boolean lb3 = false;
        fd0 = fd1 + ld1;
        ab3 = ad1 < ad2;
        ad3 = ad4 + fd0;
        fd1 = ld1 - ad1;
if(ao3 != null){
          ad2 = ao3.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
        lb2 = ld1 < ad1;
        double ld4 = 189.88881667190967;
        boolean lb5 = true;
        lb3 = lb5 && ab1;
if(ao4 != null){
          ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || lb2;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 715.5302632938101;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 + ld0;
    fb0 = fb1 || lb1;
    Output.points[6][1] += fd0;
    fb0 = fb1 && lb1;
    fd1 = ld0 - fd0;
    fb0 = fb1 || lb1;
    fb0 = fd1 > ld0;
    boolean lb2 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 *= -1;
    double ld3 = 719.8277810318963;
    Output.points[6][2] += fd0;
    fb0 = fb1 && lb1;
    lb2 = fd1 < ld0;
    fb0 = ld3 > fd0;
    double ld4 = 63.42142065369976;
if(fo0 != null){
          fo1 = fo0.m4(fb1, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, fb1, lb1, lb2, fb0);
}
    Output.points[6][3] += ld4;
    Thought lo5 = Thought199.getInstance(fd0, fd1, ld0, ld3, fb1, lb1, lb2, fb0);
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, lb1, lb2, fb0);
}
    fb1 = lb1 || lb2;
    ld4 *= -1;

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
    double ld0 = 642.346334659262;
    ab1 = ab2 || ab3;
    ld0 = fd0 - fd1;
    ab4 = fb0 || fb1;
    Output.points[6][4] += ld0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld0;
if(fo1 != null){
      ab4 = fo1.m2(fd0, fd1, ld0, fd0);
}
    fb0 = fb1 || ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    Thought lo1 = Thought298.getInstance();
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
}
    Output.points[6][5] += ld0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ld0 *= -1;
if(fo0 != null){
      ab4 = fo0.m2(fd0, fd1, ld0, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 + fd0;
    ab4 = fb0 && fb1;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    ld0 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ab2 = !ab3;
        ab4 = ld0 > fd0;
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
    Output.points[6][6] += ad1;
    ad2 = ad3 - ad4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 = ad4 - fd0;
        boolean lb0 = true;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
        fb0 = fd1 > ad1;
        ad2 *= -1;
        ad3 = ad4 + fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
          fo1.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
        ad3 = ad4 + fd0;
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad1 < ad2;
    ad3 *= -1;
    ad4 *= -1;
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb0 = false;
    ad2 = ad3 - ad4;
    lb0 = ab1 || ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought187.getInstance(fd1, ad1, ad2, ad3);
    ab3 = ad4 > fd0;
    ab4 = fd1 > ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld2 = 632.9380471997036;
    fb0 = ld2 > ad1;
    fb1 = !lb0;
    ad2 *= -1;
if(fo0 != null){
      ab1 = fo0.m2();
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
    boolean lb0 = true;
    fd0 *= -1;
        lb0 = fd1 < fd0;
    double ld1 = 392.61969403881966;
    fb0 = fb1 || lb0;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    fd0 *= -1;
    Thought lo2 = Thought356.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, fd0, fd1, fb1, lb0, fb0, fb1);
    ld1 = fd0 - fd1;
    lb0 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    Output.points[6][7] += fd0;
    Thought lo3 = Thought154.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
    fb1 = lb0 && fb0;
    boolean lb4 = true;
    fb0 = fd1 < ld1;
    double ld5 = 240.27348833546384;
    Output.points[6][8] += ld5;
    fb1 = fd0 > fd1;
    if (lb0) {
        lb4 = fb0 && fb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
        lb0 = lb4 && fb0;
        Thought lo6 = Thought126.getInstance(ld1, ld5, fd0, fd1);
        fb1 = ld1 > ld5;
        Output.points[7][0] -= fd0;
        Thought lo7 = Thought33.getInstance(ao1, ao2, ao3, ao4, fd1, ld1, ld5, fd0);
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
    fb0 = !fb1;
    double ld0 = 657.2887585810637;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb1, fb0, fb1, fb0);
}
    ld0 = ad1 + ad2;
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb1);
}
    ld0 *= -1;
    lb2 = fb0 && fb1;
    lb1 = lb2 || fb0;
    fb1 = lb1 && lb2;
    ad1 = ad2 + ad3;

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
    boolean lb0 = true;
    lb0 = fd1 > fd0;
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = fd1 > fd0;
    lb0 = ab1 || ab2;
    ab3 = fd1 > fd0;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    boolean lb2 = false;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ao4.m3();
}
if(fo0 != null){
      fo0.m1(ab2, ab3, ab4, fb0);
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
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        Thought lo0 = Thought5.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
        ab1 = ad3 < ad4;
        double ld1 = 385.62757778238046;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        ad4 *= -1;
        double ld2 = 940.6393023260673;
        ab2 = ab3 && ab4;
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = true;
    lb0 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    if (lb0) {
        boolean lb1 = true;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb1);
}
        lb0 = fb0 && fb1;
        lb1 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        Output.points[7][1] += fd0;
if(fo1 != null){
          fo1.m1(fd1, fd0, fd1, fd0);
}
        fd1 = fd0 - fd1;
        lb0 = fb0 || fb1;
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
    Output.points[7][2] -= fd0;
    ab1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m3(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    double ld0 = 898.7846518821984;
    ld0 = fd0 - fd1;
    fb1 = !ab1;
    ab2 = ld0 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    Thought lo1 = Thought35.getInstance(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);

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
    fb1 = fb0 || fb1;
    Thought lo0 = Thought362.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought292.getInstance(ad4, fd0, fd1, ad1);
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      ad1 = fo1.m3();
}
    fb0 = ad2 < ad3;
    fb1 = ad4 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    double ld2 = 278.74875500862737;
    Thought lo3 = Thought277.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb4 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(ld2, ad1, ad2, ad3);
}
    double ld5 = 129.44406772457106;
    lb4 = fb0 || fb1;
    Thought lo6 = Thought312.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(lb4, fb0, fb1, lb4);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, ld5, ad1, ad2, ad3, fb0, fb1, lb4, fb0);
}
        ad4 = fd0 - fd1;
    ld2 *= -1;
    boolean lb7 = false;

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
if(fo1 != null){
      ab1 = fo1.m2(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = ad4 < fd0;
    ab1 = ab2 || ab3;
    double ld0 = 234.43278251710578;
    ab4 = fd0 < fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2);
}
    ad3 *= -1;
    fb0 = !fb1;
    Thought lo1 = Thought124.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    Output.points[7][3] += ad4;
    Output.points[7][4] -= fd0;
    double ld2 = 449.2753337000832;
    fb0 = fb1 || ab1;
    fd0 = fd1 - ld0;
    ab2 = ld2 < ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, ld2, ad1, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought334.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
    ad2 = ad3 - ad4;
    ab3 = fd0 > fd1;

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
    boolean lb0 = false;
    fb0 = !fb1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 *= -1;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    lb0 = !fb0;
    fd0 = fd1 - fd0;
    if (fb1) {
        fd1 = fd0 - fd1;
        boolean lb1 = true;
if(ao2 != null){
          ao2.m2();
}
        Thought lo2 = Thought320.getInstance(lb1, lb0, fb0, fb1);
        boolean lb3 = true;
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
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    Output.points[7][5] += ad3;
    ad4 = fd0 - fd1;
    double ld0 = 747.1380695782667;
    ld0 = ad1 + ad2;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb0 = ad3 < ad4;
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld0, ad1, ad2);
}
    ad3 = ad4 + fd0;
    Thought lo2 = Thought341.getInstance(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);

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
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    ab2 = fd1 < fd0;
    Thought lo0 = Thought102.getInstance(fo1, ao1, ao2, ao3);
    fd1 *= -1;
    boolean lb1 = false;
    Thought lo2 = Thought129.getInstance(fd0, fd1, fd0, fd1);
    ab2 = ab3 && ab4;
    Thought lo3 = Thought161.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && lb1;
    ab1 = fd0 < fd1;
    ab2 = ab3 || ab4;
    fb0 = fd0 > fd1;
if(ao4 != null){
      fd0 = ao4.m3(fb1, lb1, ab1, ab2);
}
    fd1 = fd0 - fd1;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fd0 = ao1.m3(fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    double ld0 = 793.483138966481;
    boolean lb1 = true;
    ab3 = ab4 || fb0;
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    ad1 *= -1;
    fb1 = !lb1;
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0);
}
    fd1 = ld0 + ad1;
if(ao2 != null){
      ao2.m3();
}
    Thought lo3 = Thought250.getInstance(lb2, ab1, ab2, ab3);
    double ld4 = 592.5448507392445;
    ab4 = ad1 > ad2;
    fb0 = fb1 && lb1;
    boolean lb5 = false;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
        fb1 = fd0 < fd1;
    Output.points[7][6] -= fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought155.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
            boolean lb1 = false;
    lb1 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
    fb0 = fd0 < fd1;
    fb1 = lb1 || lb2;
    fb0 = fb1 && lb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    Output.points[7][7] -= fd0;
    Thought lo3 = Thought285.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    double ld4 = 907.7670631655984;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld5 = 504.2595830145367;
    lb2 = fb0 && fb1;
if(fo0 != null){
      lb1 = fo0.m2(lb2, fb0, fb1, lb1);
}
    boolean lb6 = true;
    Output.points[7][8] -= ld5;
    Output.points[8][0] += fd0;

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
    fb1 = !fb0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Output.points[8][1] += fd0;
    fb0 = fb1 || fb0;
    fb1 = fd1 > fd0;
    Output.points[8][2] -= fd1;
    fb0 = !fb1;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb0);
}
    lb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    lb1 = !fb0;
    fb1 = lb0 || lb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
        fb1 = fd0 < fd1;
    lb0 = fd0 > fd1;
        Thought lo2 = Thought188.getInstance(lb1, fb0, fb1, lb0);
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
    double ld0 = 40.40452532333218;
    boolean lb1 = false;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    boolean lb3 = false;
    lb1 = !lb2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
}
    boolean lb4 = true;
    boolean lb5 = false;
    boolean lb6 = true;
    boolean lb7 = true;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, lb2, lb3, lb4, lb5);
}
    double ld8 = 337.3600354282487;
    Thought lo9 = Thought179.getInstance(fo1, fo0, fo1, fo0, lb6, lb7, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld0;
    ld8 = fd0 + fd1;
    double ld10 = 945.5381532810223;
if(fo0 != null){
      lb1 = fo0.m2(ld0, ld8, ld10, fd0);
}
    lb2 = fd1 < ld0;
    lb3 = !lb4;
if(fo1 != null){
      ld8 = fo1.m3(fo0, fo1, fo0, fo1, ld10, fd0, fd1, ld0);
}
    lb5 = ld8 > ld10;
    Thought lo11 = Thought347.getInstance();
    double ld12 = 403.4847831678126;
    boolean lb13 = true;
    lb6 = lb7 && lb13;
    fb0 = fb1 || lb1;

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
