package genetic;
import java.util.ArrayList;
class Thought164 extends Thought{
private static ArrayList<Thought164> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 481.582578781419;
private double fd1 = 551.7975844555001;
private Thought fo0 = null;
private Thought fo1 = null;
Thought164 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought164 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought164 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought164 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought164 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought164 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought164 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought164 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought164 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought164 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought164 instance = new Thought164 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 || fb0;
    fd1 = fd0 - fd1;
    Thought lo0 = Thought350.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[1][4] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld1 = 114.91371685046147;
    fb1 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(ld1, fd0, fd1, ld1);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        ld1 = fd0 + fd1;
        fb1 = ld1 < fd0;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
        ld1 = fd0 - fd1;
        ld1 = fd0 + fd1;
        fb0 = !fb1;
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
    double ld0 = 624.2940289629009;
    ld0 = fd0 + fd1;
    double ld1 = 777.7340353282713;
if(fo0 != null){
      ab1 = fo0.m2();
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
    ld0 = ld1 - fd0;
    fb1 = !ab1;
    fd1 = ld0 - ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = ad1 + ad2;
    double ld0 = 248.77922358780506;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad3 = ad4 + fd0;
    fd1 = ld0 - ad1;
    double ld1 = 538.8427303623308;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fb1 = fd0 > fd1;
    ld0 = ld1 + ad1;
    boolean lb2 = true;
    ad2 = ad3 + ad4;

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
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
    boolean lb0 = false;
    boolean lb1 = true;
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
    Output.points[1][5] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought328.getInstance(lb0, lb1, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb3 = true;
    lb0 = ad1 < ad2;
    boolean lb4 = false;
    boolean lb5 = true;
    Output.points[1][6] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1, lb1, lb3, lb4, lb5);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Output.points[1][7] += ad3;
    Thought lo6 = Thought365.getInstance(ad4, fd0, fd1, ad1);
    boolean lb7 = true;
    lb3 = ad2 > ad3;

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
    boolean lb0 = true;
    Output.points[1][8] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m2(fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    fd0 *= -1;
    lb0 = fb0 && fb1;
    fd1 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, ao1, ao2, ao3, fb0, fb1, lb0, fb0);
}
    Output.points[2][0] += fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb0;
    boolean lb2 = false;
    Thought lo3 = Thought297.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    lb1 = lb2 && fb0;
    fd1 *= -1;
    Thought lo4 = Thought322.getInstance(fb1, lb0, lb1, lb2);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld0 = 175.2176532616249;
    boolean lb1 = false;
    fb0 = ad4 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ad1, ad2, fb1, lb1, fb0, fb1);
}
    Output.points[2][1] += ad3;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
}
    fb0 = fd0 < fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = ld0 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld0, ad1, ad2);
}
    boolean lb2 = false;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[2][2] += ad3;
    boolean lb4 = true;
    lb1 = ad4 > fd0;
    Thought lo5 = Thought269.getInstance(lb2, lb3, lb4, fb0);

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
    double ld0 = 554.2543180489816;
    ab2 = ab3 && ab4;
    Thought lo1 = Thought26.getInstance(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb0, fb1, ab1, ab2);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    boolean lb2 = true;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;
    Thought lo3 = Thought99.getInstance(fo0, fo1, ao1, ao2);
    ld0 = fd0 - fd1;
    ld0 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ab1 = ao3.m2();
}
    double ld0 = 191.23937287256192;
if(ao4 != null){
      ld0 = ao4.m3(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    double ld1 = 793.9007595365428;
    double ld2 = 880.1969977533167;
    ab4 = ad3 > ad4;
if(ao4 != null){
      fd0 = ao4.m3(fd1, ld0, ld1, ld2, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    ad1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, lb3, ab1);
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb0 = fd1 > fd0;
    boolean lb1 = false;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    if (lb1) {
        Thought lo2 = Thought345.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
        fd1 = fd0 - fd1;
        double ld3 = 652.260683806064;
        fb0 = ld3 > fd0;
        boolean lb4 = true;
        fb0 = fd1 < ld3;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, fd0, fb1, lb4, lb0, lb1);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, lb4, lb0, lb1);
}
        fd1 = ld3 - fd0;
        Thought lo5 = Thought374.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m3(fd1, ld3, fd0, fd1);
}
        ld3 *= -1;
        fb0 = !fb1;
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
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
    Output.points[2][3] += fd0;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fb0 = fo0.m2(fb1, ab1, ab2, ab3);
}
    fd1 = fd0 + fd1;
    ab4 = fd0 < fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
    Output.points[2][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought134.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    fd1 = ad1 + ad2;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad4 < fd0;
        double ld1 = 619.3018942512753;
        fd0 = fd1 - ld1;
        double ld2 = 757.9704591106755;
if(fo1 != null){
          ld2 = fo1.m3(ad1, ad2, ad3, ad4);
}
        boolean lb3 = true;
        lb3 = fb0 || fb1;
        boolean lb4 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
        boolean lb5 = false;
        ad1 *= -1;
if(fo1 != null){
          ad2 = fo1.m3();
}
        Output.points[2][5] -= ad3;
        boolean lb6 = true;
        Thought lo7 = Thought306.getInstance(lb3, lb4, lb5, lb6);
        fb0 = ad4 > fd0;
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
    ab1 = ad2 > ad3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought21.getInstance(ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
    fd1 *= -1;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    double ld1 = 959.8865459008225;
    fb1 = ab1 || ab2;
    Thought lo2 = Thought156.getInstance(fo1, fo0, fo1, fo0);
    ab3 = ab4 || fb0;
    fd0 = fd1 - ld1;
    double ld3 = 518.6924339441883;
if(fo1 != null){
      ld3 = fo1.m3(ad1, ad2, ad3, ad4);
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
    boolean lb0 = true;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    lb0 = fd1 > fd0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    lb1 = fb0 || fb1;
    lb0 = lb1 && fb0;
    Thought lo2 = Thought361.getInstance();
    Thought lo3 = Thought30.getInstance(fb1, lb0, lb1, fb0);
    fd1 = fd0 - fd1;
    fb1 = lb0 && lb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
        Output.points[2][6] += fd0;
    double ld4 = 931.0976839095771;
    boolean lb5 = true;
if(fo1 != null){
      lb5 = fo1.m2(fd0, fd1, ld4, fd0, fb0, fb1, lb0, lb1);
}
    fd1 = ld4 - fd0;
    fd1 = ld4 - fd0;
    lb5 = !fb0;
    fb1 = !lb0;
    boolean lb6 = false;
    fd1 = ld4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb1, lb5, lb6, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    boolean lb7 = false;
if(ao1 != null){
      fb0 = ao1.m2(fd1, ld4, fd0, fd1);
}
        double ld8 = 8.345559269008374;

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
    fb0 = fb1 || fb0;
        Thought lo0 = Thought347.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
    fb1 = fd0 > fd1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4();
}
    lb1 = !fb0;
    boolean lb2 = true;
    ad1 *= -1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      fb0 = ao2.m2(fb1, lb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, lb1, lb2, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, lb1, lb2, fb0);
}
    Thought lo3 = Thought391.getInstance(fo0, fo1, ao1, ao2, fb1, lb1, lb2, fb0);
    ad1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
    fd1 *= -1;
    boolean lb0 = false;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
    double ld1 = 62.61870357321498;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 *= -1;
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    double ld2 = 424.1682057662793;
    fd0 *= -1;
    fb1 = fd1 < ld1;
    lb0 = ld2 < fd0;
    Thought lo3 = Thought66.getInstance(ab1, ab2, ab3, ab4);
    fd1 *= -1;
    fb0 = fb1 || lb0;
    ab1 = ld1 < ld2;

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
    ad1 *= -1;
    ab2 = !ab3;
    if (ab4) {
        Thought lo0 = Thought62.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
        ab3 = !ab4;
        fb0 = !fb1;
        double ld1 = 433.305602335037;
if(fo0 != null){
          fd0 = fo0.m3(fd1, ld1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        boolean lb2 = false;
        ab4 = ad3 > ad4;
        fb0 = fb1 || lb2;
        double ld3 = 701.362513275357;
        double ld4 = 768.1724591642006;
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
}
        Thought lo5 = Thought192.getInstance(fo0, fo1, ao1, ao2);
        fb0 = fb1 || lb2;
        ab1 = ab2 || ab3;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought153.getInstance(fd1, fd0, fd1, fd0);
    double ld1 = 309.1754319158122;
    Thought lo2 = Thought320.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fd1 < ld1;
    fd0 = fd1 - ld1;
    if (fb0) {
        fd0 *= -1;
        double ld3 = 774.9358021196911;
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
        boolean lb4 = false;
        fb0 = fb1 || lb4;
        boolean lb5 = true;
if(fo0 != null){
          fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld3, ld1, fd0, lb5, fb0, fb1, lb4);
}
        lb5 = !fb0;
        fb1 = fd1 > ld3;
        double ld6 = 314.66269475011796;
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
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    Thought lo0 = Thought240.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = false;
    ab2 = fd0 < fd1;
    boolean lb2 = true;
    ab2 = !ab3;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd0 = fo1.m3(ab4, fb0, fb1, lb1);
}
    double ld3 = 925.3299395007562;
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 501.464203475519;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = !fb0;
    fb1 = !fb0;
    Output.points[2][7] -= ad1;
    Thought lo1 = Thought127.getInstance(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb2 = false;
    ld0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
    boolean lb3 = false;
    Output.points[2][8] += ad3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb3 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, lb3, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ab4 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(ao1 != null){
      fb0 = ao1.m2(fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought359.getInstance(fd0, fd1, fd0, fd1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = !fb0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd0 < fd1;
    Thought lo1 = Thought108.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 - fd0;

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
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[3][0] -= fd1;
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb0 = fd1 > ad1;
    Output.points[3][1] -= ad2;
    Thought lo0 = Thought37.getInstance(ad3, ad4, fd0, fd1);
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    boolean lb1 = true;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao1 != null){
      fb0 = ao1.m2();
}
    fb1 = fd1 < ad1;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m3(lb1, fb0, fb1, lb1);
}
    if (fb0) {
        fb1 = lb1 && fb0;
        double ld2 = 355.539167542785;
        Output.points[3][2] += ad4;
        double ld3 = 90.6259974664644;
        fb1 = lb1 && fb0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    ab1 = fd1 < fd0;
    boolean lb0 = false;
    Thought lo1 = Thought149.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
    fd0 = fd1 + fd0;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought155.getInstance(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
if(fo0 != null){
      ao4 = fo0.m4();
}
if(fo1 != null){
      fo1.m1(lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
        ab4 = fb0 && fb1;
    Output.points[3][3] -= fd0;
    Output.points[3][4] -= fd1;
if(ao1 != null){
      lb0 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
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
    ab2 = ad2 > ad3;
    boolean lb0 = false;
    Thought lo1 = Thought191.getInstance(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
    ad2 *= -1;
    boolean lb2 = false;
    Thought lo3 = Thought268.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb2);
    ab1 = !ab2;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    boolean lb4 = false;
    ab2 = !ab3;
    Output.points[3][5] += ad3;
    ab4 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb0, lb2, lb4, ab1);
}
    double ld5 = 379.9662573044546;
    double ld6 = 420.3800949089639;
    ab2 = ab3 && ab4;
    fb0 = ad2 > ad3;
    ad4 = fd0 + fd1;
    boolean lb7 = false;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld5, ld6, ad1, ad2, fb0, fb1, lb0, lb2);
}
    lb4 = lb7 || ab1;
if(fo0 != null){
      ao4 = fo0.m4(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    Thought lo0 = Thought15.getInstance(fd0, fd1, fd0, fd1);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb2 = false;
    lb1 = !lb2;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    lb3 = fb0 && fb1;
if(fo1 != null){
      lb1 = fo1.m2(lb2, lb3, fb0, fb1);
}
    Output.points[3][6] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    fb1 = fd0 < fd1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb1, lb2, lb3, fb0);
}
    Thought lo4 = Thought95.getInstance(fo1, fo0, fo1, fo0, fb1, lb1, lb2, lb3);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    lb1 = !lb2;

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
    if (ab1) {
        Thought lo0 = Thought49.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
        ab2 = fd1 > fd0;
        boolean lb1 = false;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo1.m2();
}
        Output.points[3][7] -= fd0;
        double ld2 = 432.28335696526904;
        Output.points[3][8] -= fd0;
        fd1 = ld2 + fd0;
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 955.7306874723765;
    fb0 = ld0 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fd1 *= -1;
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought204.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 *= -1;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    boolean lb0 = true;
    fd0 *= -1;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            lb0 = fd1 < ad1;
            ad2 = ad3 + ad4;
            fd0 *= -1;
            boolean lb1 = true;
            boolean lb2 = true;
            boolean lb3 = true;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            boolean lb4 = false;
            lb2 = !lb3;
            lb4 = !lb0;
            ab1 = !ab2;
            ad4 = fd0 - fd1;
            ad1 = ad2 + ad3;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought338.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd1 < fd0;
    double ld1 = 119.91078081778106;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      ao1.m1(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ld1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Output.points[4][0] -= ld1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
    fd1 = ld1 + fd0;
    fd1 = ld1 + fd0;
    for(int i0=0; i0<10; i0++){
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought73.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought66.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought305.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
    if (fb1) {
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
        } else {
        fd0 = fd1 + ad1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
          ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
        fb0 = fb1 || fb0;
if(ao3 != null){
          ad4 = ao3.m3();
}
        boolean lb3 = true;
        Thought lo4 = Thought77.getInstance(fb0, fb1, lb3, fb0);
        fb1 = lb3 || fb0;
        fb1 = lb3 || fb0;
        fb1 = fd0 > fd1;
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
    ab1 = !ab2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab3, ab4, fb0, fb1);
}
    Output.points[4][1] += fd0;
    boolean lb0 = false;
    fd1 *= -1;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    boolean lb1 = true;
    fd0 *= -1;
    Thought lo2 = Thought382.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
    lb0 = !lb1;
    fd1 = fd0 + fd1;
    for(int i0=0; i0<10; i0++){
        ab1 = fd0 > fd1;
if(ao3 != null){
          ao2 = ao3.m4();
}
if(fo0 != null){
          ao4 = fo0.m4(ab2, ab3, ab4, fb0);
}
        fb1 = lb0 || lb1;
        ab1 = !ab2;
        fd0 = fd1 + fd0;
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        fd1 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    ad2 = ad3 - ad4;
    ab1 = ab2 || ab3;
    if (ab4) {
        Output.points[4][2] += fd0;
        fb0 = !fb1;
        double ld1 = 202.38914709290248;
        for(int i0=0; i0<10; i0++){
            lb0 = ab1 || ab2;
            ab3 = ab4 && fb0;
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
            Thought lo2 = Thought75.getInstance(ao3, ao4, fo0, fo1);
            fd1 = ld1 - ad1;
if(ao2 != null){
              ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
              ao3.m2(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2);
}
}}
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
    fb1 = fd1 < fd0;
if(fo0 != null){
      fb0 = fo0.m2();
}
    fb1 = fb0 || fb1;
if(fo0 != null){
          fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[4][3] -= fd0;
    double ld0 = 323.9962529260675;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ld0 *= -1;
    double ld1 = 893.7507529933991;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld0);
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
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 + fd0;
    Thought lo1 = Thought254.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
    fb1 = fd1 > fd0;
if(fo1 != null){
      lb0 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    double ld2 = 38.256083136120765;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Thought lo3 = Thought306.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld2, fd0);
}
    lb0 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
    lb0 = ld2 < fd0;
if(fo0 != null){
      fo0.m3();
}
    fb0 = fd1 < ld2;
    fd0 = fd1 + ld2;
if(fo1 != null){
      fb1 = fo1.m2(lb0, fb0, fb1, lb0);
}
    Thought lo4 = Thought393.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, fb0, fb1, lb0, fb0);
    boolean lb5 = false;
    fb0 = fb1 || lb0;
    lb5 = !fb0;
    fd1 = ld2 - fd0;

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
    fb1 = !fb0;
    double ld0 = 68.12165192544933;
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    ld0 *= -1;
    fd0 = fd1 - ld0;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Output.points[4][4] -= ld0;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld0;
    double ld2 = 22.757320030069547;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld0);
}
        Output.points[4][5] += ld2;
    fd0 = fd1 - ld0;

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
