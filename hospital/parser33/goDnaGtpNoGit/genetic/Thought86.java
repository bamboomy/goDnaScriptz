package genetic;
import java.util.ArrayList;
class Thought86 extends Thought{
private static ArrayList<Thought86> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 574.5290004629861;
private double fd1 = 468.95970524821655;
private Thought fo0 = null;
private Thought fo1 = null;
Thought86 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought86 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought86 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought86 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought86 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought86 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought86 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought86 instance = new Thought86 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought371.getInstance(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
        fb0 = fd1 < fd0;
        boolean lb1 = true;
        Thought lo2 = Thought293.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
          fo1.m2(fd1, fd0, fd1, fd0);
}
        double ld3 = 862.7059972991926;
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld3, fd0);
}
        lb1 = fb0 && fb1;
        fd1 = ld3 + fd0;
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
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 857.5740002781987;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb1, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fb0 && fb1;
    fd1 = ld0 - fd0;
    lb1 = ab1 && ab2;
        boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fd1, ld0, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb1, lb2, ab1);
}
    Output.points[6][7] += ld0;
    ab2 = fd0 < fd1;
    ld0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = !fb1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo1.m3(fb0, fb1, fb0, fb1);
}
    Output.points[6][8] -= ad4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
        Thought lo0 = Thought216.getInstance(ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb1 = true;
        boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
    Output.points[7][0] += ad1;
    ad2 = ad3 + ad4;
    lb1 = fd0 < fd1;
    ad1 *= -1;
    for(int i0=0; i0<10; i0++){
        boolean lb3 = false;
        boolean lb4 = false;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
        Output.points[7][1] += ad3;
        lb4 = lb1 || lb2;
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
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    for(int i0=0; i0<10; i0++){
        ad2 = ad3 + ad4;
        ab1 = fd0 < fd1;
        ad1 = ad2 - ad3;
        double ld0 = 420.4341304904261;
if(fo1 != null){
          fo1.m1(ad3, ad4, fd0, fd1);
}
        boolean lb1 = false;
        boolean lb2 = true;
        ld0 = ad1 - ad2;
        ad3 = ad4 + fd0;
        lb2 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, ad1, ad2);
}
        boolean lb3 = true;
        ab3 = ad3 < ad4;
if(fo1 != null){
          fo1.m2();
}
        boolean lb4 = true;
        fd0 *= -1;
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
    fb0 = fb1 || fb0;
if(ao1 != null){
      fb1 = ao1.m2(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd0 > fd1;
    fb0 = !fb1;
    fd0 *= -1;
        fd1 = fd0 + fd1;
    lb0 = !fb0;
    fd0 *= -1;
    fb1 = lb0 && fb0;
    boolean lb1 = true;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = ad1 < ad2;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ad4 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo0 = Thought74.getInstance();
if(fo1 != null){
      ad4 = fo1.m3(fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = true;
    double ld2 = 984.909909524566;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld2, lb1, lb3, fb0, fb1);
}
    lb1 = ad1 > ad2;
    Output.points[7][2] += ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb1);
}
    lb3 = ad4 > fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld2, ad1, ad2);
}
    boolean lb4 = true;
    lb4 = fb0 && fb1;
    Output.points[7][3] -= ad3;

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
    ab1 = ab2 && ab3;
if(ao2 != null){
      ab4 = ao2.m2(fb0, fb1, ab1, ab2);
}
    boolean lb0 = false;
if(ao3 != null){
      ab2 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    ab4 = fb0 && fb1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb0 = !fb1;

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
    ad1 = ad2 - ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
    lb0 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fb1 = lb0 || ab1;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
    for(int i0=0; i0<10; i0++){
        fb1 = lb0 || ab1;
if(ao1 != null){
          ab2 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        fd0 = fd1 + ad1;
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
    fb0 = fb1 && fb0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    boolean lb0 = false;
    fb0 = fd1 > fd0;
    Thought lo1 = Thought395.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    Output.points[7][4] += fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && lb0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3();
}
    Output.points[7][5] += fd0;

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
    ab1 = !ab2;
    Thought lo0 = Thought281.getInstance(ab3, ab4, fb0, fb1);
    ab1 = ab2 && ab3;
    Output.points[7][6] += fd1;
    ab4 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
    fb1 = ab1 || ab2;
    if (ab3) {
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ab2 = fd0 < fd1;
        fd0 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
        fd1 = fd0 + fd1;
        Thought lo1 = Thought247.getInstance(fo0, fo1, fo0, fo1);
        ab1 = fd0 < fd1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
        double ld2 = 787.3274934118601;
        ab2 = !ab3;
if(fo1 != null){
          fo1.m3();
}
        ab4 = !fb0;
        ld2 = fd0 + fd1;
if(fo1 != null){
          fo0 = fo1.m4(fb1, ab1, ab2, ab3);
}
}
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
    fb0 = ad1 > ad2;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
    fd0 *= -1;
    double ld1 = 5.861496959800967;
    boolean lb2 = false;
    lb2 = fd0 < fd1;
    fb0 = ld1 > ad1;
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    fd0 = fd1 + ld1;
    ad1 = ad2 - ad3;
    fb1 = lb0 || lb2;
    double ld3 = 834.4579758704668;
    fb0 = !fb1;
    lb0 = !lb2;
    Output.points[7][7] -= ad3;
    fb0 = !fb1;
    Output.points[7][8] -= ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m3(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
    if (ab1) {
if(fo0 != null){
          fo0.m2();
}
        ad4 = fd0 + fd1;
        ad1 *= -1;
        ad2 *= -1;
        ad3 = ad4 - fd0;
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb0, ab1, ab2);
}
        ad4 = fd0 + fd1;
if(fo1 != null){
          fo1.m3(ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
        lb0 = fd0 > fd1;
        Output.points[8][0] += ad1;
        ab1 = ad2 > ad3;
        ab2 = ad4 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
        boolean lb1 = false;
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 + ad4;
if(fo0 != null){
          fo0.m2(fd0, fd1, ad1, ad2);
}
        lb1 = ad3 < ad4;
        boolean lb2 = true;
        boolean lb3 = true;
        lb2 = !lb3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
        lb0 = ab1 && ab2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m1(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
        fd1 *= -1;
    Thought lo1 = Thought301.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
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
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
}
    Output.points[8][1] += fd1;
    boolean lb0 = false;
    fb0 = fb1 || lb0;
if(fo1 != null){
      ad1 = fo1.m3();
}
if(ao1 != null){
      fb0 = ao1.m2(fb1, lb0, fb0, fb1);
}
    ad2 *= -1;
    Thought lo1 = Thought8.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    lb0 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        }
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
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
    boolean lb0 = false;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    Output.points[8][2] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld1 = 21.93021437024533;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1);
}
    Thought lo2 = Thought331.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld1, fd0);

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
    ab1 = ab2 || ab3;
    Output.points[8][3] -= ad1;
    ab4 = fb0 && fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought322.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
    ab3 = ab4 || fb0;
    double ld1 = 399.85265179759955;
    fd0 = fd1 - ld1;
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld1;
    Output.points[8][4] += ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
    double ld2 = 908.4254955416645;
    ad4 *= -1;
    fd0 = fd1 - ld1;
    ld2 = ad1 - ad2;
    boolean lb3 = true;
    ad3 = ad4 + fd0;
    boolean lb4 = false;
    double ld5 = 457.54749298305285;
if(fo0 != null){
      lb4 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ao4.m1(fd0, fd1, ld1, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld5, ad1, ad2, ad3);
}
    Thought lo6 = Thought77.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1, fb0, fb1, lb3, lb4);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[8][5] += fd0;
    fd1 = fd0 + fd1;
    fb1 = fb0 || fb1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought164.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m3();
}
    fd1 *= -1;
    fb0 = !fb1;
    lb1 = fd0 < fd1;
    fd0 = fd1 + fd0;
    if (fb0) {
        double ld2 = 682.0888203931689;
if(fo1 != null){
          fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb1, fb0, fb1, lb1);
}
        boolean lb3 = true;
        lb1 = fb0 || fb1;
        lb3 = fd1 > ld2;
        lb1 = fd0 < fd1;
if(fo0 != null){
          fb0 = fo0.m2(ld2, fd0, fd1, ld2, fb1, lb3, lb1, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb3, lb1, fb0, fb1);
}
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
    Thought lo0 = Thought344.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    boolean lb1 = true;
    lb1 = !ab1;
    ab2 = ab3 || ab4;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    lb1 = ab1 && ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4();
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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[8][6] -= ad1;
    ad2 *= -1;
    ad3 = ad4 + fd0;
    double ld0 = 379.6689782264848;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld0, ad1, fb1, fb0, fb1, fb0);
}
    double ld1 = 157.77644041647216;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fb1 = ad1 > ad2;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    lb2 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ld0 = ld1 + ad1;
    boolean lb3 = false;
    Output.points[8][7] += ad2;
    fb0 = fb1 || lb2;
    lb3 = ad3 > ad4;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ld0, ld1, ad1, ad2);
}
    double ld4 = 507.04949772305497;
    boolean lb5 = false;
    boolean lb6 = true;
if(fo0 != null){
      lb5 = fo0.m2();
}
    boolean lb7 = true;
    ad2 = ad3 - ad4;

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
    Output.points[8][8] -= ad1;
if(fo1 != null){
      ad2 = fo1.m3(ab2, ab3, ab4, fb0);
}
    Output.points[0][0] -= ad3;
    fb1 = ad4 > fd0;
    double ld0 = 285.70878597705433;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1, ab1, ab2, ab3, ab4);
}
    ad2 = ad3 + ad4;
    fb0 = fd0 > fd1;
    fb1 = !ab1;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    Output.points[0][1] -= ad1;
    Thought lo1 = Thought238.getInstance(fo0, fo1, fo0, fo1);
    ab4 = fb0 || fb1;
    ab1 = ad2 < ad3;
    ad4 = fd0 + fd1;
    boolean lb2 = true;
    Thought lo3 = Thought347.getInstance(ld0, ad1, ad2, ad3);
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ab4 = fo0.m2();
}
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb2;
    double ld4 = 80.644607721287;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb2;
    ad3 = ad4 + fd0;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    double ld1 = 676.4186868844168;
    for(int i0=0; i0<10; i0++){
        Output.points[0][2] -= ld1;
        fd0 *= -1;
        boolean lb2 = true;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, ld1, fd0, fd1, lb0, fb0, fb1, lb2);
}
        boolean lb3 = false;
if(ao1 != null){
          ld1 = ao1.m3(fd0, fd1, ld1, fd0, lb3, lb0, fb0, fb1);
}
        lb2 = fd1 < ld1;
if(ao2 != null){
          fd0 = ao2.m3(ao3, ao4, fo0, fo1, lb3, lb0, fb0, fb1);
}
        Output.points[0][3] += fd1;
        lb2 = ld1 < fd0;
        boolean lb4 = false;
        lb3 = fd1 > ld1;
        fd0 = fd1 + ld1;
        lb4 = lb0 && fb0;
        boolean lb5 = true;
        fd0 = fd1 - ld1;
        fb0 = fb1 && lb2;
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
    ad1 *= -1;
    fb1 = ad2 < ad3;
    ad4 *= -1;
    fb0 = fb1 || fb0;
    fd0 *= -1;
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    Thought lo1 = Thought254.getInstance(ao1, ao2, ao3, ao4);
    lb0 = fb0 || fb1;
    fd1 *= -1;
    Thought lo2 = Thought66.getInstance(ad1, ad2, ad3, ad4);
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2);
}
    double ld3 = 991.7656059965055;
    ad2 = ad3 + ad4;
    Thought lo4 = Thought175.getInstance();
    lb0 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(lb0, fb0, fb1, lb0);
}
    fd0 = fd1 - ld3;
    fb0 = !fb1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, ld3, ad1, lb0, fb0, fb1, lb0);
}
    Output.points[0][4] -= ad2;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      lb0 = ao4.m2(ad3, ad4, fd0, fd1);
}
    boolean lb5 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || ab1;
    if (ab2) {
if(fo1 != null){
          fd0 = fo1.m3();
}
if(ao1 != null){
          fd1 = ao1.m3(ab3, ab4, fb0, fb1);
}
        boolean lb0 = true;
        lb0 = ab1 && ab2;
        fd0 *= -1;
        ab3 = !ab4;
        boolean lb1 = false;
        fd1 *= -1;
        ab4 = fb0 && fb1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, lb0, lb1, ab1, ab2);
}
        Thought lo2 = Thought202.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, lb0, lb1, ab1, ab2);
}
        ab3 = fd0 > fd1;
        Thought lo3 = Thought4.getInstance(ao1, ao2, ao3, ao4);
        ab4 = fd0 > fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
        fd1 *= -1;
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
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
if(ao2 != null){
      ab1 = ao2.m2();
}
if(ao3 != null){
      ad1 = ao3.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    fd1 = ad1 - ad2;
if(ao4 != null){
      ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 < ad2;
    if (ab4) {
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
        ad3 *= -1;
        ad4 *= -1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
        fd0 *= -1;
        Output.points[0][5] -= fd1;
if(fo0 != null){
          fo0.m2(ad1, ad2, ad3, ad4);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    double ld0 = 431.5897810347375;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        fb1 = ld0 > fd0;
        fb0 = !fb1;
        fb0 = fb1 || fb0;
        double ld1 = 688.1887441274368;
if(fo1 != null){
          fo1.m3(fd0, fd1, ld1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ld1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        fb0 = fb1 || fb0;
        fd0 = fd1 - ld1;
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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    ab2 = fd0 < fd1;
    Thought lo0 = Thought328.getInstance(fd0, fd1, fd0, fd1);
    Output.points[0][6] += fd0;
    ab3 = fd1 < fd0;
    ab4 = fd1 > fd0;
    boolean lb1 = false;
    double ld2 = 96.79307552123981;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab4, fb0, fb1, lb1);
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    Output.points[0][7] += fd1;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    Thought lo0 = Thought164.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
    Thought lo1 = Thought278.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
        ad1 = ad2 + ad3;
        fb1 = ad4 < fd0;
        fb0 = fd1 > ad1;
        boolean lb2 = true;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        boolean lb3 = true;
        fd1 *= -1;
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    if (ab2) {
        ab3 = ab4 || fb0;
        fd0 = fd1 + ad1;
        fb1 = ad2 < ad3;
        ab1 = ab2 && ab3;
if(fo0 != null){
          ad4 = fo0.m3();
}
if(fo0 != null){
          fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
        ad1 = ad2 + ad3;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        Output.points[0][8] -= ad4;
        Thought lo0 = Thought282.getInstance(fo1, fo0, fo1, fo0);
        fb1 = fd0 > fd1;
if(fo1 != null){
          ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
        ab1 = fd0 > fd1;
        Thought lo1 = Thought11.getInstance();
if(fo0 != null){
          fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
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
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
    fb0 = fd1 < fd0;
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      fb0 = ao3.m2();
}
    Output.points[1][0] += fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb1, fb0, fb1, fb0);
}
    double ld0 = 378.87437189161113;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought250.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    Thought lo1 = Thought14.getInstance(ao2, ao3, ao4, fo0);
    fb1 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 < ad1;
if(ao1 != null){
          fo1 = ao1.m4(ad2, ad3, ad4, fd0);
}
        fb1 = fb0 || fb1;
if(ao2 != null){
          ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
          ao3 = ao4.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ad1 *= -1;
        Output.points[1][1] += ad2;
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
    fd0 = fd1 + fd0;
        fd1 = fd0 + fd1;
    ab2 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    ab1 = fd1 > fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 && ab4;
    if (fb0) {
        double ld0 = 757.5578427759805;
        fb1 = ld0 > fd0;
        fd1 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
}
if(fo1 != null){
          ld0 = fo1.m3(ab1, ab2, ab3, ab4);
}
        fb0 = fd0 < fd1;
        ld0 *= -1;
        Thought lo1 = Thought366.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
        ab4 = !fb0;
if(fo1 != null){
          fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, ab1, ab2, ab3);
}
        Thought lo2 = Thought95.getInstance(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
        ab2 = ab3 || ab4;
        ld0 = fd0 + fd1;
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3);
}
        boolean lb3 = false;
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
    ad1 = ad2 + ad3;
    double ld0 = 92.11924704690848;
if(ao1 != null){
      ab2 = ao1.m2(ad3, ad4, fd0, fd1);
}
    if (ab3) {
        ld0 = ad1 - ad2;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
        if (ab4) {
            ld0 = ad1 - ad2;
            Output.points[1][2] -= ad3;
            boolean lb1 = true;
            ad4 = fd0 + fd1;
if(ao1 != null){
              ao1.m1();
}
            ld0 = ad1 + ad2;
            ab4 = !fb0;
if(ao3 != null){
              ao2 = ao3.m4(fb1, lb1, ab1, ab2);
}
            ab3 = ad3 < ad4;
if(ao4 != null){
              fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ad1, ad2, ab4, fb0, fb1, lb1);
}
            ab1 = ad3 > ad4;
}}
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
    Output.points[1][3] -= fd1;
    fb0 = fd0 > fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 174.26718707889648;
    boolean lb1 = false;
    double ld2 = 574.3782726103601;
    lb1 = fb0 || fb1;
    ld0 = ld2 + fd0;
    lb1 = fd1 > ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ld2 = fd0 + fd1;

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
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 *= -1;
    double ld1 = 389.4392803399989;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fd1 = ld1 + fd0;
    fb0 = fd1 > ld1;
    boolean lb2 = false;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
    fb1 = fd0 > fd1;
    boolean lb3 = false;
    double ld4 = 31.17794151975571;
if(fo1 != null){
      fo1.m2();
}
    ld1 *= -1;
    lb0 = lb2 && lb3;

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
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    double ld1 = 270.051290871205;
    fb0 = fd0 > fd1;
    boolean lb2 = false;
    Output.points[1][4] += ld1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, ld1, fd0, fb1, lb0, lb2, fb0);
}
    double ld3 = 974.3652405200476;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb2, fb0);
}
    Output.points[1][5] -= fd0;
    double ld4 = 287.9029577579602;
    Thought lo5 = Thought44.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld1, ld3, ld4);
}
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, ld3, ld4, fd0);
}
    lb0 = !lb2;
    double ld6 = 837.3720206064712;
    fd0 *= -1;
    fb0 = fd1 > ld1;
    ld3 = ld4 - ld6;
    fb1 = lb0 || lb2;
    double ld7 = 856.372408780519;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo8 = Thought384.getInstance(fb0, fb1, lb0, lb2);
    boolean lb9 = true;
    lb9 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld7, fd0, fd1, ld1, fb1, lb0, lb2, lb9);
}
if(fo0 != null){
      ld3 = fo0.m3(ld4, ld6, ld7, fd0, fb0, fb1, lb0, lb2);
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
