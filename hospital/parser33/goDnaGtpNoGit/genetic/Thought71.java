package genetic;
import java.util.ArrayList;
class Thought71 extends Thought{
private static ArrayList<Thought71> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = false;
private double fd0 = 315.2006406701223;
private double fd1 = 769.3427190353716;
private Thought fo0 = null;
private Thought fo1 = null;
Thought71 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought71 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought71 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought71 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought71 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought71 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought71 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought71 instance = new Thought71 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Output.points[6][1] -= fd0;
    fd1 = fd0 + fd1;
    fd0 = fd1 - fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
    fb1 = fb0 || fb1;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[6][2] += fd1;
    fb0 = fb1 && fb0;
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[6][3] -= fd0;
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2();
}
    Output.points[6][4] += fd0;

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
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    fd1 *= -1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    lb0 = fd0 < fd1;
    ab1 = fd0 > fd1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
    if (lb0) {
        fd0 *= -1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 + fd0;
        double ld1 = 696.5455627807706;
        Output.points[6][5] += fd0;
        Output.points[6][6] += fd1;
        fb0 = ld1 < fd0;
        fb1 = !lb0;
        ab1 = ab2 && ab3;
if(fo0 != null){
          ab4 = fo0.m2(fo1, fo0, fo1, fo0);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1);
}
    fb0 = fb1 || fb0;
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
          fo0.m1();
}
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        ad2 *= -1;
        Thought lo0 = Thought249.getInstance(fb1, fb0, fb1, fb0);
        Thought lo1 = Thought322.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
        double ld2 = 828.8325681873815;
if(fo0 != null){
          fo1 = fo0.m4(ld2, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
        boolean lb3 = false;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, lb3, fb0);
}
        Output.points[6][7] -= ad4;
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
    double ld0 = 57.60193861659527;
    ab1 = ad1 < ad2;
    ab2 = !ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[6][8] -= ad3;
    Thought lo1 = Thought334.getInstance(ad4, fd0, fd1, ld0);
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Output.points[7][0] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
    ld0 = ad1 - ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, ab3, ab4, fb0, fb1);
}
    ab1 = ad3 > ad4;
    ab2 = !ab3;
    double ld2 = 288.6295437587732;
if(fo1 != null){
      fo1.m3(ad4, fd0, fd1, ld0, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
    double ld0 = 824.8889692978245;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought171.getInstance(ao2, ao3, ao4, fo0);
    fd0 *= -1;
        boolean lb2 = false;
if(fo1 != null){
      fd1 = fo1.m3(ld0, fd0, fd1, ld0);
}
    fd0 = fd1 - ld0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad1 = ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 < ad3;
    Output.points[7][1] += ad4;
    Output.points[7][2] += fd0;
    fb0 = fd1 > ad1;
    Thought lo0 = Thought66.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
    double ld1 = 372.95376813530396;
    Output.points[7][3] += fd0;
    fb1 = fd1 < ld1;
if(fo1 != null){
      fo1.m3(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Output.points[7][4] -= fd0;
    Thought lo2 = Thought205.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    double ld3 = 885.4244050128214;
    boolean lb4 = false;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fd0 = fd1 + ld1;
    boolean lb5 = false;
    lb4 = lb5 && fb0;
    ld3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ld3);
}
    ad1 *= -1;
    fb1 = lb4 || lb5;
    if (fb0) {
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld1;
        boolean lb6 = true;
if(ao1 != null){
          fo1 = ao1.m4();
}
        Output.points[7][5] += ld3;
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
    ab2 = fd0 < fd1;
    fd0 *= -1;
    Output.points[7][6] += fd1;
    boolean lb0 = false;
    Output.points[7][7] -= fd0;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    ab3 = fd0 < fd1;
    boolean lb1 = false;
    Output.points[7][8] -= fd0;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ab2 = ao2.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[8][0] += fd1;
        Output.points[8][1] += fd0;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, lb1, lb2, ab1);
}
        fd1 = fd0 - fd1;
        double ld3 = 492.2550390687216;
        ld3 *= -1;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1);
}
        double ld4 = 962.5436438101779;
        ab2 = !ab3;
        ld4 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld3, ld4);
}
        ab4 = fb0 || fb1;
        fd0 = fd1 + ld3;
        Output.points[8][2] -= ld4;
if(ao4 != null){
          lb0 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ld3, ld4);
}
        Thought lo5 = Thought367.getInstance();
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
    ab2 = ab3 || ab4;
    ad1 = ad2 + ad3;
    fb0 = ad4 < fd0;
    fb1 = ab1 || ab2;
    boolean lb0 = false;
    ab2 = ab3 && ab4;
    fd1 = ad1 - ad2;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(lb0, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;

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
          fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo1.m2();
}
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
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 < fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought47.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, ab1, ab2);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    fb1 = !lb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo2 = Thought93.getInstance();
if(fo0 != null){
      fd0 = fo0.m3(ab4, fb0, fb1, lb0);
}
    for(int i0=0; i0<10; i0++){
        fd1 *= -1;
        double ld3 = 294.5942153420041;
        ab1 = ab2 || ab3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, fd0, fd1, ld3, ab4, fb0, fb1, lb0);
}
        boolean lb4 = false;
        }
if(fo1 != null){
      fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb5 = false;

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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought273.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    double ld1 = 842.4745020958553;
    fb0 = ad3 < ad4;
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd0 < fd1;
    fb0 = !fb1;
    Thought lo2 = Thought283.getInstance(fb0, fb1, fb0, fb1);
        fb0 = ld1 < ad1;

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
    double ld0 = 859.1457780436424;
    ld0 *= -1;
    if (ab1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
        fb1 = fd0 > fd1;
if(fo1 != null){
          ld0 = fo1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        fd0 = fd1 - ld0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
        ad1 = ad2 + ad3;
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = fb1 || ab1;
        ab2 = ab3 && ab4;
        Thought lo1 = Thought300.getInstance(ad4, fd0, fd1, ld0);
        fb0 = !fb1;
        Thought lo2 = Thought164.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        fd0 *= -1;
        boolean lb3 = true;
        fd1 = ld0 - ad1;
        lb3 = ab1 || ab2;
        ab3 = ab4 && fb0;
        ad2 = ad3 - ad4;
        fd0 = fd1 - ld0;
        ad1 = ad2 + ad3;
        } else {
        boolean lb4 = false;
        lb4 = ad4 < fd0;
        boolean lb5 = true;
        boolean lb6 = true;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd0 = fd1 + fd0;
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    Output.points[8][3] += fd1;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[8][4] += fd0;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    double ld1 = 771.066959961278;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, fb0, fb1);
}
        ld1 = fd0 + fd1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad1, ad2, ad3, ad4);
}
    Thought lo0 = Thought199.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
    fb1 = !fb0;
    Output.points[8][5] -= ad3;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought211.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
    double ld2 = 958.0777255450786;
    Thought lo3 = Thought258.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(fo0 != null){
      ao4 = fo0.m4(ld2, ad1, ad2, ad3);
}
    fb1 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, ld2, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 - fd1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld2, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
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
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab4, fb0, fb1, ab1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao4.m3();
}
    Thought lo0 = Thought139.getInstance(fb0, fb1, ab1, ab2);
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought76.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3, fb0, fb1, ab1, ab2);
}
    boolean lb2 = true;
    Thought lo3 = Thought24.getInstance(ao4, fo0, fo1, ao1);
        Output.points[8][6] -= fd0;
    double ld4 = 775.1378111053201;

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
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab3, ab4, fb0, fb1);
}
    ad1 = ad2 + ad3;
    lb0 = !ab1;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    double ld0 = 967.3659659865784;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = !fb1;
    fb0 = fd1 < ld0;
    boolean lb1 = true;
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(lb2, fb0, fb1, lb1);
}
    fd0 = fd1 + ld0;
    double ld3 = 275.16636789538904;
    ld3 = fd0 - fd1;

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
    ab2 = fd1 > fd0;
    ab3 = fd1 > fd0;
    ab4 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 - fd1;
    double ld0 = 273.85104164177267;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
    fb1 = ld0 > fd0;
    boolean lb1 = false;
if(fo0 != null){
      lb1 = fo0.m2();
}
    fd1 = ld0 + fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo1.m3(ab4, fb0, fb1, lb1);
}
    Thought lo2 = Thought123.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0, fb0, fb1, lb1, ab1);
}
    boolean lb3 = true;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    double ld4 = 188.11252508593122;
    lb1 = fd0 > fd1;
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ld0, ld4, fd0, fd1);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld4, fd0, fd1, ld0);
}
}
Thought.STACK_COUNTER++;
return ld4;
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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    fb0 = ad4 > fd0;
        fb1 = !fb0;
    double ld0 = 928.3737208574123;
    Output.points[8][7] += fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = ad3 > ad4;
        fb0 = fd0 > fd1;
        Thought lo1 = Thought204.getInstance(ld0, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
        boolean lb2 = true;
if(fo1 != null){
          ad4 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb1 = fo1.m2(ld0, ad1, ad2, ad3);
}
        ad4 = fd0 - fd1;
}
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
    ab1 = ad2 < ad3;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
    ad3 = ad4 - fd0;
    boolean lb1 = true;
    fb0 = fd1 < ad1;
    fb1 = ad2 > ad3;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, lb1, ab1, ab2, ab3);
}
    double ld2 = 392.1905129361011;
    ad1 *= -1;
    Output.points[8][8] -= ad2;
        double ld3 = 181.45522203248063;

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
if(ao2 != null){
      ao2.m1(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 || fb0;
    fb1 = !fb0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    if (fb1) {
        fb0 = fd1 > fd0;
if(ao3 != null){
          ao3.m2();
}
if(ao4 != null){
          fd1 = ao4.m3(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fb1 = ao2.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought397.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld1 = 22.2473216586189;
        Thought lo2 = Thought313.getInstance(ao1, ao2, ao3, ao4);
    fd0 = fd1 - ld1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd0, fd1, ld1, ad1);
}
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      ad2 = fo1.m3();
}
    Thought lo3 = Thought392.getInstance(fb0, fb1, fb0, fb1);
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = ld1 < ad1;
    Thought lo4 = Thought161.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
    Output.points[0][0] -= fd1;
    double ld5 = 955.3033550209021;
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
    fb0 = ld5 > ad1;
    Thought lo6 = Thought397.getInstance(fo0, fo1, ao1, ao2);
if(ao3 != null){
      ao3.m1(ad2, ad3, ad4, fd0);
}
    fb1 = fd1 > ld1;
if(ao4 != null){
      fb0 = ao4.m2(fo0, fo1, ao1, ao2, ld5, ad1, ad2, ad3);
}
if(ao3 != null){
      ao3.m3();
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
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao2.m2(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
    boolean lb2 = true;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fb0, fb1, lb0, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
    if (lb2) {
        ab1 = fd1 > fd0;
if(fo1 != null){
          fo0 = fo1.m4();
}
        fd1 = fd0 + fd1;
        ab2 = fd0 < fd1;
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb0 = false;
    boolean lb1 = false;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb1, ab1, ab2, ab3);
}
    ad3 = ad4 + fd0;
    fd1 *= -1;
    boolean lb2 = false;
    double ld3 = 100.9502117184842;
if(ao4 != null){
      ao3 = ao4.m4(ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = ad4 > fd0;
    Output.points[0][1] -= fd1;
if(fo0 != null){
          fo0.m1(fo1, ao1, ao2, ao3, lb1, lb2, ab1, ab2);
}
    double ld4 = 341.34405781728196;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld3, ld4, ad1, ad2);
}
    double ld5 = 135.19201801108542;
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld3;
    ab3 = ab4 && fb0;
    ld4 *= -1;

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
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld0 = 267.73814357660046;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[0][2] -= fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ld0, fd0, fd1, ld0);
}
    if (fb0) {
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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought89.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m1();
}
        fd0 *= -1;
        fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(lb1, ab1, ab2, ab3);
}
        Output.points[0][3] -= fd0;
        boolean lb2 = false;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          lb2 = fo1.m2(fd0, fd1, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb2);
}
        double ld3 = 148.77337204786707;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(ld3, fd0, fd1, ld3);
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
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fd1 < ad1;
    Output.points[0][4] -= ad2;
    double ld0 = 8.628010396274364;
if(fo1 != null){
      fb0 = fo1.m2(fb1, fb0, fb1, fb0);
}
    ad2 = ad3 - ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought307.getInstance(ld0, ad1, ad2, ad3);
    boolean lb2 = true;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    boolean lb4 = false;
if(fo1 != null){
      lb3 = fo1.m2();
}
    lb4 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 - ad3;
        ad4 = fd0 + fd1;
        ld0 = ad1 - ad2;
if(fo0 != null){
          ad3 = fo0.m3(lb2, lb3, lb4, fb0);
}
        boolean lb5 = true;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0, fb0, fb1, lb5, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, lb3, lb4, fb0, fb1);
}
        fd0 *= -1;
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
    boolean lb0 = false;
    double ld1 = 838.4942023809085;
    lb0 = ab1 && ab2;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    ab1 = ab2 || ab3;
    Thought lo2 = Thought311.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ab3 && ab4;
if(fo1 != null){
          fo1.m2(fb0, fb1, lb0, ab1);
}
    ab2 = ad3 > ad4;

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
    boolean lb0 = true;
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao1 != null){
      ao1.m1(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
    double ld1 = 894.5009061660545;
    lb0 = fd0 < fd1;
    Thought lo2 = Thought315.getInstance(ld1, fd0, fd1, ld1);
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld1, fd0);
}
    boolean lb3 = false;
if(ao1 != null){
      fd1 = ao1.m3();
}
    Output.points[0][5] += ld1;
    Thought lo4 = Thought325.getInstance(lb3, fb0, fb1, lb0);
    double ld5 = 960.2434869344492;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld5, fd0, fd1, ld1, lb3, fb0, fb1, lb0);
}
if(ao2 != null){
      lb3 = ao2.m2(ld5, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
    Thought lo6 = Thought4.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, lb3);
    if (fb0) {
        ld5 = fd0 - fd1;
        ld1 *= -1;
        fb1 = ld5 < fd0;
        for(int i0=0; i0<10; i0++){
            fd1 *= -1;
            Thought lo7 = Thought351.getInstance(ao1, ao2, ao3, ao4);
            lb0 = !lb3;
            ld1 = ld5 + fd0;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = fb1 && fb0;
    ad3 *= -1;
    ad4 = fd0 + fd1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    fb1 = ad2 < ad3;
if(ao2 != null){
      ad4 = ao2.m3();
}
    Output.points[0][6] += fd0;
    fd1 *= -1;
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
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    ab1 = ab2 || ab3;
    boolean lb0 = false;
    ab3 = ab4 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, ab1, ab2);
}
    double ld1 = 479.8405499043702;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(ao4 != null){
      fd1 = ao4.m3(ld1, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    boolean lb2 = true;
    lb0 = !lb2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    double ld3 = 738.3737882814385;
    fb0 = fb1 && lb0;
    lb2 = ab1 && ab2;
    ab3 = !ab4;
    boolean lb4 = true;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
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
if(ao2 != null){
      ao2.m1(ad2, ad3, ad4, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3);
}
    boolean lb0 = true;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = !lb0;
    Output.points[0][7] += ad2;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ab3 = fd0 > fd1;
    ab4 = !fb0;
    double ld1 = 342.2384226194873;
    fb1 = lb0 && ab1;
    ld1 = ad1 + ad2;
    ad3 *= -1;
    double ld2 = 956.6217311131996;
    if (ab2) {
        ab3 = ad3 > ad4;
if(ao1 != null){
          ab4 = ao1.m2(fd0, fd1, ld1, ld2);
}
        fb0 = !fb1;
        lb0 = ab1 && ab2;
if(ao2 != null){
          ab3 = ao2.m2(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
        ab4 = fb0 && fb1;
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
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[0][8] -= fd1;
    double ld0 = 338.0439947630141;
    ld0 = fd0 - fd1;
    ld0 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought152.getInstance(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    Thought lo2 = Thought364.getInstance(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    Output.points[1][0] += fd1;
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m1();
}
if(fo0 != null){
      fo1 = fo0.m4(lb1, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb1, fb0, fb1, lb0);
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought75.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld1 = 828.889331953714;
    fb1 = ld1 > fd0;
    double ld2 = 135.60575020530823;
    double ld3 = 181.58077321305112;
    ld3 = fd0 + fd1;
    fb0 = ld1 < ld2;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld1);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
    ld1 = ld2 - ld3;

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
