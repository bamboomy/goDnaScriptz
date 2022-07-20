package genetic;
import java.util.ArrayList;
class Thought282 extends Thought{
private static ArrayList<Thought282> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 665.4647989811058;
private double fd1 = 806.4365577923854;
private Thought fo0 = null;
private Thought fo1 = null;
Thought282 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought282 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought282 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought282 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought282 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought282 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought282 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought282 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought282 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought282 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought282 instance = new Thought282 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb1 = fd0 > fd1;
    Output.points[7][1] -= fd0;
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    for(int i0=0; i0<10; i0++){
        fb1 = !fb0;
        Output.points[7][2] -= fd0;
        double ld0 = 144.22637601720507;
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 *= -1;
        fb0 = fd0 > fd1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
        fb0 = fb1 || fb0;
if(fo0 != null){
          fo0.m3(fb1, fb0, fb1, fb0);
}
        fb1 = !fb0;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb0 = true;
    fb0 = !fb1;
    lb0 = ab1 && ab2;
    fd1 = fd0 + fd1;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld1 = 790.0629064738284;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    Thought lo3 = Thought300.getInstance(ld1, fd0, fd1, ld1);
    fd0 = fd1 + ld1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo1.m2();
}
    Output.points[7][3] += fd1;
if(fo0 != null){
      lb2 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
    Output.points[7][4] += ld1;
    fd0 = fd1 + ld1;
    if (lb2) {
        ab1 = !ab2;
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    Output.points[7][5] -= ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
    lb2 = lb3 || fb0;
    Output.points[7][6] -= fd1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      ad1 = fo0.m3(fb1, lb0, lb1, lb2);
}
    lb3 = ad2 > ad3;
    boolean lb4 = false;
    Output.points[7][7] += ad4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, lb4, fb0, fb1, lb0);
}
    lb1 = lb2 || lb3;

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
      ab1 = fo0.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
    boolean lb0 = false;
    for(int i0=0; i0<10; i0++){
        fd1 = ad1 + ad2;
        boolean lb1 = true;
        boolean lb2 = true;
        double ld3 = 799.1007245127571;
        boolean lb4 = true;
        ad2 = ad3 - ad4;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
        Thought lo5 = Thought394.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld3, ad1);
}
        fb1 = lb1 && lb2;
        ad2 = ad3 + ad4;
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    Thought lo0 = Thought180.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[7][8] += fd1;
if(ao2 != null){
          ao1 = ao2.m4(fb0, fb1, lb1, fb0);
}
    fb1 = lb1 || fb0;
    fb1 = lb1 && fb0;
    fb1 = fd0 < fd1;
    lb1 = fd0 > fd1;
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb1);
}
    Output.points[8][0] += fd1;
    fb0 = fd0 > fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb0 = ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought11.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(ao1 != null){
      ad2 = ao1.m3();
}
    fb0 = fb1 || lb1;
    ad3 = ad4 - fd0;
    fb0 = fd1 < ad1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb1, fb0, fb1);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
    Thought lo1 = Thought57.getInstance(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
    fd0 = fd1 - fd0;
    boolean lb2 = false;
    fb0 = !fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    fd1 *= -1;
    lb0 = lb2 && ab1;
    ab2 = ab3 || ab4;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
    ab4 = !fb0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    fb1 = lb0 || lb2;
    lb3 = fd1 < fd0;
    boolean lb4 = true;
    boolean lb5 = true;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb4 = lb5 || ab1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
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
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao3.m1(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    Output.points[8][1] += ad3;
    ab4 = ad4 > fd0;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd1 *= -1;
if(ao4 != null){
      ao4.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    Output.points[8][2] += fd1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(ao1 != null){
      fo1 = ao1.m4(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought251.getInstance(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    fb0 = !fb1;
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    ab4 = ad2 > ad3;
    fb0 = ad4 > fd0;

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
    Thought lo0 = Thought177.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[8][3] -= fd1;
    Thought lo1 = Thought35.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        Output.points[8][4] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
    Thought lo2 = Thought203.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);

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
    double ld0 = 669.989112393008;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[8][5] += fd1;
if(fo0 != null){
      ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ab4 = fd0 < fd1;
    Thought lo1 = Thought122.getInstance(ld0, fd0, fd1, ld0);
    fb0 = fb1 && ab1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0);
}
    ab2 = ab3 || ab4;
    Output.points[8][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought233.getInstance(fb0, fb1, ab1, ab2);

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
    fb1 = fb0 && fb1;
    double ld0 = 890.4267648977856;
    double ld1 = 420.0010109250533;
    boolean lb2 = false;
    lb2 = ld0 < ld1;
    Thought lo3 = Thought133.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
    Output.points[8][7] += fd0;
    Output.points[8][8] += fd1;
    fb1 = ld0 > ld1;
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
        lb4 = lb2 && fb0;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb1, lb4, lb2, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb4, lb2, fb0);
}
        double ld5 = 691.7959778535513;
        Output.points[0][0] += ad4;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
        fd0 = fd1 - ld5;
        fb1 = lb4 && lb2;
        fb0 = !fb1;
        lb4 = ld0 > ld1;
        }
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb6 = false;
    lb6 = fb0 || fb1;

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
    ad2 = ad3 - ad4;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb0 = !fb1;
        Thought lo0 = Thought35.getInstance();
    ab1 = ad3 > ad4;
    double ld1 = 357.93435881561504;
    ab2 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    ab4 = !fb0;
    fb1 = ld1 < ad1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
        fd1 = ld1 - ad1;
    fb0 = fb1 && ab1;
    boolean lb2 = false;
    ad2 *= -1;

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
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(ao2 != null){
      ao2.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m1(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    Output.points[0][1] += fd1;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fb0 = fb1 || lb0;
        boolean lb1 = true;
        double ld2 = 828.5108648114656;
if(fo0 != null){
          lb0 = fo0.m2(fb0, fb1, lb1, lb0);
}
        fb0 = fb1 || lb1;
        fd0 *= -1;
        lb0 = fd1 > ld2;
        boolean lb3 = false;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld2, fd0, lb0, fb0, fb1, lb1);
}
        fd1 = ld2 - fd0;
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
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[0][2] -= fd0;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd1 = ad1 + ad2;
    fb1 = fb0 || fb1;
    boolean lb0 = true;
    boolean lb1 = false;
    ad3 = ad4 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ad1, ad2, ad3, ad4);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
        boolean lb2 = true;
    lb0 = !lb1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(lb0, lb1, lb2, fb0);
}
    Thought lo3 = Thought101.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, lb0, lb1, lb2);
    if (fb0) {
if(ao4 != null){
          fb1 = ao4.m2(ad2, ad3, ad4, fd0, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb1, lb0, lb1, lb2);
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
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Thought lo0 = Thought190.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2();
}
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    ab4 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb1, ab1, ab2);
}
    fd1 = fd0 + fd1;

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
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - ad1;
    fb0 = fb1 && ab1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[0][3] -= fd1;
    Thought lo0 = Thought309.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
    ab4 = ad1 < ad2;
    Output.points[0][4] += ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    ad2 *= -1;
if(ao1 != null){
          ao1.m3(ab1, ab2, ab3, ab4);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
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
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought157.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought378.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    Output.points[0][5] += fd0;
    double ld2 = 439.9362501535874;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
        fd1 = ld2 - fd0;
    Output.points[0][6] -= fd1;
    double ld3 = 874.8101079585682;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ld2, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[0][7] += ld2;
if(fo1 != null){
      fb1 = fo1.m2(ld3, fd0, fd1, ld2, fb0, fb1, fb0, fb1);
}
    double ld4 = 159.72919804610976;
        boolean lb5 = false;
    lb5 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb5, fb0, fb1);
}

Thought.STACK_COUNTER++;
return ld3;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    if (ab1) {
        ab2 = fd0 < fd1;
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        ab3 = ab4 && fb0;
        fb1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        Output.points[0][8] += fd0;
        double ld1 = 456.0927454198999;
        lb0 = ab1 && ab2;
        Output.points[1][0] -= fd0;
        fd1 = ld1 - fd0;
        fd1 *= -1;
        ab3 = ld1 < fd0;
        ab4 = fb0 && fb1;
        lb0 = !ab1;
        fd1 = ld1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
        fd1 = ld1 + fd0;
        double ld2 = 995.4895720927144;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, fb1, lb0, ab1, ab2);
}
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
if(fo0 != null){
      fb1 = fo0.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    fb1 = fb0 || fb1;
    double ld0 = 750.1387031308369;
    fb0 = fb1 || fb0;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought136.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld2 = 158.02418961262748;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, ad1, fb0, fb1, lb1, ab1);
}
    ad2 = ad3 - ad4;
    ab2 = fd0 < fd1;
    Output.points[1][1] -= ld2;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo3 = Thought342.getInstance(fo0, fo1, fo0, fo1, lb1, ab1, ab2, ab3);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought133.getInstance(fd0, fd1, ld2, ad1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo5 = Thought113.getInstance(ab4, fb0, fb1, lb1);

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Output.points[1][2] -= fd1;
    double ld1 = 686.0375220850774;
    fb0 = fb1 || lb0;
if(ao2 != null){
      ao1 = ao2.m4(ld1, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    fb1 = !lb0;
    fd0 = fd1 - ld1;
    double ld2 = 844.4584739180117;
    ld2 = fd0 - fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb0, fb0);
}
    fb1 = ld1 < ld2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld3 = 856.7881103300676;
    ld3 = fd0 + fd1;
    boolean lb4 = false;
    lb0 = ld1 < ld2;
    ld3 = fd0 - fd1;
    ld1 = ld2 - ld3;
    lb4 = fd0 > fd1;

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
    double ld0 = 200.25799488014982;
    Thought lo1 = Thought72.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = true;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
    lb2 = fb0 && fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao2 != null){
      lb2 = ao2.m2(fb0, fb1, lb2, fb0);
}
    Output.points[1][3] += ad2;
    fb1 = !lb2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, fb0, fb1, lb2, fb0);
}
    ld0 *= -1;
if(ao3 != null){
      fb1 = ao3.m2(ad1, ad2, ad3, ad4, lb2, fb0, fb1, lb2);
}
    boolean lb3 = false;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    fd0 = fd1 + fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought291.getInstance(fd1, fd0, fd1, fd0);
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao1 != null){
      ab1 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    double ld2 = 172.07764702926627;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld2, fd0, lb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fd1, ld2, fd0, fd1, fb0, fb1, lb1, ab1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && ab1;
    ab2 = !ab3;
    ab4 = fb0 || fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
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
    ab1 = ab2 && ab3;
    double ld0 = 35.79741763636666;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought165.getInstance();
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld0, ad1, ad2, ab1, ab2, ab3, ab4);
}
    Output.points[1][4] -= ad3;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        Output.points[1][5] += ad4;
if(fo0 != null){
          fo0.m2(fd0, fd1, ld0, ad1);
}
        ab3 = ab4 || fb0;
if(ao1 != null){
          fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
        fd1 *= -1;
        ld0 *= -1;
        fb1 = ad1 > ad2;
        double ld2 = 302.6976843315642;
        ab1 = !ab2;
if(fo1 != null){
          fo1.m3();
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    if (lb0) {
        Output.points[1][6] -= fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
        double ld1 = 463.2897648029391;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(ld1, fd0, fd1, ld1, lb0, fb0, fb1, lb0);
}
        fb0 = fb1 && lb0;
        fd0 = fd1 - ld1;
        fd0 *= -1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
        fd1 = ld1 + fd0;
        fb1 = !lb0;
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        if (fb1) {
            boolean lb2 = true;
            boolean lb3 = true;
            fd1 = ld1 - fd0;
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fd0, fd1, fd0, fd1);
}
    ab1 = fd0 < fd1;
    if (ab2) {
        Thought lo0 = Thought50.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
          fo0.m2();
}
        } else if (ab3) {
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        ab4 = fd0 < fd1;
        } else {
if(fo1 != null){
          fd0 = fo1.m3(fb0, fb1, ab1, ab2);
}
        fd1 *= -1;
        double ld1 = 832.8421093070783;
        double ld2 = 980.7112065266027;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}
        ab1 = ab2 && ab3;
if(fo1 != null){
          fo0 = fo1.m4(ld1, ld2, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ld1 = ld2 + fd0;
        ab2 = !ab3;
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
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought367.getInstance(fo0, fo1, fo0, fo1);
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    boolean lb1 = false;
if(fo0 != null){
      fb0 = fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
    fd0 = fd1 + ad1;
    Output.points[1][7] += ad2;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
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
if(fo1 != null){
      ab1 = fo1.m2(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo0 = Thought307.getInstance(fd0, fd1, ad1, ad2);
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = ad1 > ad2;
    ab2 = ad3 < ad4;
    double ld1 = 396.07147984552535;
if(fo1 != null){
      fo1.m1(ab3, ab4, fb0, fb1);
}
    ad4 = fd0 + fd1;
        ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;

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
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    fd0 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    fd1 = fd0 - fd1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2);
}
        Thought lo1 = Thought135.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    fb0 = !fb1;
    boolean lb3 = true;
    lb0 = lb2 || lb3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    Output.points[1][8] += fd0;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 *= -1;
if(ao4 != null){
      fd0 = ao4.m3(fb0, fb1, lb0, lb2);
}
    lb3 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
    double ld4 = 864.4882770048698;
    fd0 = fd1 - ld4;
    fd0 *= -1;
    fd1 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(ld4, fd0, fd1, ld4, fb0, fb1, lb0, lb2);
}
    lb3 = fd0 < fd1;
    ld4 = fd0 - fd1;
    if (fb0) {
        ld4 *= -1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 594.2441472863733;
    double ld1 = 710.5708161469475;
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb2);
}
    boolean lb3 = true;
        Output.points[2][0] -= ld1;
if(ao1 != null){
      lb3 = ao1.m2(ao2, ao3, ao4, fo0);
}
    Output.points[2][1] -= ad1;
    ad2 *= -1;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    ld0 = ld1 + ad1;
    Output.points[2][2] += ad2;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || lb2;
    boolean lb4 = false;
    lb3 = !lb4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb2, lb3);
}
    ad3 = ad4 - fd0;
    Thought lo5 = Thought23.getInstance(fo0, fo1, ao1, ao2, fd1, ld0, ld1, ad1, lb4, fb0, fb1, lb2);
    ad2 *= -1;
    Output.points[2][3] -= ad3;
    lb3 = lb4 && fb0;
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ld0, fb1, lb2, lb3, lb4);
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
    boolean lb0 = false;
    ab1 = ab2 && ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ab1 = ao1.m2(fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        fd1 *= -1;
        ab1 = !ab2;
        ab3 = ab4 || fb0;
        fb1 = lb1 || lb0;
if(ao2 != null){
          ab1 = ao2.m2();
}
if(ao3 != null){
          ao3.m3(ab2, ab3, ab4, fb0);
}
        fd0 *= -1;
        fd1 = fd0 - fd1;
        fb1 = fd0 < fd1;
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
    ab1 = ad1 > ad2;
    boolean lb0 = true;
    Output.points[2][4] += ad3;
    ad4 = fd0 + fd1;
    ad1 = ad2 - ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
        ad3 *= -1;
    double ld1 = 82.60493220770472;
if(fo1 != null){
      fo1.m1(ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought117.getInstance(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
    fb1 = ld1 > ad1;
    Thought lo3 = Thought12.getInstance(fo0, fo1, ao1, ao2);
    Thought lo4 = Thought382.getInstance(ad2, ad3, ad4, fd0);
    boolean lb5 = true;
    lb0 = fd1 < ld1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m1();
}
    Thought lo6 = Thought328.getInstance(lb5, ab1, ab2, ab3);
    Thought lo7 = Thought73.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld1, ad1, ab4, fb0, fb1, lb0);
    lb5 = ad2 < ad3;
    boolean lb8 = true;
    lb8 = ab1 && ab2;
if(ao1 != null){
      ab3 = ao1.m2(ad4, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}

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
    fb1 = fb0 && fb1;
    fd1 *= -1;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought26.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    Thought lo1 = Thought232.getInstance();
    fb1 = fd1 < fd0;
    Output.points[2][5] += fd1;
    fb0 = !fb1;
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb2, fb0);
}
    fb1 = fd0 < fd1;
    lb2 = !fb0;
    fd0 *= -1;
        boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb3);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, lb3);
}
    fd0 = fd1 + fd0;
    fb0 = !fb1;
    fd1 = fd0 - fd1;

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
    fb0 = fb1 || fb0;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Output.points[2][6] += fd1;
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought66.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
    fb1 = !fb0;
if(fo0 != null){
          fo0.m3();
}
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fb0 = !fb1;
    fb0 = fb1 && fb0;
        Thought lo1 = Thought180.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    double ld2 = 526.2943921489505;
    ld2 = fd0 + fd1;
    fb1 = ld2 < fd0;
    fb0 = !fb1;
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
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fd0 *= -1;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought203.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
        Thought lo1 = Thought160.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 || fb0;
        fd1 *= -1;
    Thought lo2 = Thought52.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    Output.points[2][7] -= fd1;
    boolean lb3 = false;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
        double ld4 = 595.7097333355201;
    boolean lb5 = false;
    boolean lb6 = true;
    ld4 = fd0 + fd1;
    ld4 *= -1;
    lb5 = fd0 < fd1;
if(fo0 != null){
      lb6 = fo0.m2(fb0, fb1, lb3, lb5);
}
    lb6 = !fb0;

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
