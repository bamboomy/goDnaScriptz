package genetic;
import java.util.ArrayList;
class Thought386 extends Thought{
private static ArrayList<Thought386> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 125.70969235250296;
private double fd1 = 713.5199753487311;
private Thought fo0 = null;
private Thought fo1 = null;
Thought386 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought386 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought386 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought386 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought386 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought386 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought386 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought386 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought386 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought386 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought386 instance = new Thought386 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    fd0 *= -1;
    Thought lo0 = Thought177.getInstance();
    fd1 = fd0 + fd1;
    boolean lb1 = false;
        fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb2, fb0, fb1, lb1);
}
    fd0 = fd1 - fd0;
    Output.points[3][8] += fd1;
    double ld3 = 715.6488515111337;
    lb2 = !fb0;
    Thought lo4 = Thought317.getInstance(ld3, fd0, fd1, ld3, fb1, lb1, lb2, fb0);
    Output.points[4][0] += fd0;
    fb1 = fd1 > ld3;
    fd0 *= -1;
    fd1 = ld3 + fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    fd1 *= -1;
    ld3 = fd0 - fd1;

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
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = false;
    fd1 = fd0 + fd1;
    double ld1 = 427.8049471419188;
    ab1 = !ab2;
if(fo0 != null){
      ld1 = fo0.m3(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    ld1 = fd0 - fd1;
    ld1 = fd0 - fd1;

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
    boolean lb0 = true;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
    Output.points[4][1] += ad1;
    ad2 = ad3 - ad4;
    Output.points[4][2] -= fd0;
    fb1 = lb0 || fb0;
    fd1 *= -1;
    fb1 = ad1 < ad2;
    ad3 = ad4 + fd0;
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
    boolean lb1 = false;

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
      ab1 = fo1.m2();
}
    ab2 = ab3 || ab4;
    ad2 *= -1;
    fb0 = fb1 && ab1;
    if (ab2) {
        ab3 = ab4 && fb0;
        Thought lo0 = Thought148.getInstance(fb1, ab1, ab2, ab3);
        ad3 = ad4 + fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
        } else {
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
          ad2 = fo1.m3(fo0, fo1, fo0, fo1);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 123.1022372381988;
if(ao1 != null){
      fb1 = ao1.m2(ld0, fd0, fd1, ld0);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
        fd1 = ld0 - fd0;
if(ao1 != null){
      ao1.m3();
}
if(ao2 != null){
      ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd1 *= -1;
    fb0 = ld0 > fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao2.m3(ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    Output.points[4][3] += fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        fb0 = fd1 > ld0;
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
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = ad3 < ad4;
    fd0 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    lb0 = fb0 && fb1;
    Thought lo1 = Thought230.getInstance();
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        ad3 = ad4 + fd0;
        fd1 = ad1 + ad2;
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
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    Output.points[4][4] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Output.points[4][5] -= fd1;
    if (fb1) {
        fd0 = fd1 + fd0;
        boolean lb0 = true;
        double ld1 = 104.39561404515345;
        fd0 *= -1;
        double ld2 = 602.354462440654;
        lb0 = fd0 > fd1;
if(ao4 != null){
          ao4.m3(ld1, ld2, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
          ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
        ab4 = !fb0;
        boolean lb3 = false;
if(ao3 != null){
          ld1 = ao3.m3(ld2, fd0, fd1, ld1);
}
if(ao4 != null){
          ld2 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld2);
}
        Output.points[4][6] += fd0;
        fb0 = fd1 < ld1;
if(ao4 != null){
          ao3 = ao4.m4();
}
        fb1 = lb0 || lb3;
        Thought lo4 = Thought181.getInstance(ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ld2, fd0, fd1, ld1, fb0, fb1, lb0, lb3);
}
        } else {
if(ao4 != null){
          ao4.m2(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fo0.m3(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
        fd1 = fd0 + fd1;
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
      ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ab1 = ao1.m2();
}
    Thought lo0 = Thought395.getInstance(ab2, ab3, ab4, fb0);
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
}
    double ld1 = 60.985541442198354;
    ad3 *= -1;
    ad4 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ad1, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    boolean lb2 = true;
    ab4 = !fb0;
    double ld3 = 142.05702831173542;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb2, ab1, ab2);
}
    ad1 *= -1;
    Output.points[4][7] -= ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1);
}
    ab3 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ld3, ad1);
}
    ab4 = !fb0;
        fb1 = !lb2;
    ab1 = ad2 > ad3;
    ad4 *= -1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, ld3);
}
    for(int i0=0; i0<10; i0++){
if(ao4 != null){
          ao4.m1();
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
    fd0 = fd1 + fd0;
    Output.points[4][8] += fd1;
        Thought lo0 = Thought12.getInstance(fb0, fb1, fb0, fb1);
    fd0 = fd1 + fd0;
            fd1 = fd0 - fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    Thought lo2 = Thought61.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, lb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    boolean lb3 = false;
    lb1 = lb3 || fb0;
    fb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo4 = Thought28.getInstance(fd1, fd0, fd1, fd0);
    lb3 = fb0 || fb1;
    Thought lo5 = Thought29.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
    ab1 = fd1 > fd0;
    Output.points[5][0] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    fb0 = fd1 < fd0;
    Thought lo0 = Thought392.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = true;
    boolean lb2 = true;
        fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Thought lo3 = Thought69.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
    ab4 = fb0 && fb1;
    boolean lb4 = false;
    fd1 *= -1;
    lb1 = lb2 && lb4;
    ab1 = ab2 && ab3;
    ab4 = fd0 < fd1;

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      lb0 = fo1.m2(fb0, fb1, lb0, fb0);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
    lb0 = fb0 || fb1;
    Output.points[5][1] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, lb0, fb0, fb1, lb0);
}
    Output.points[5][2] -= ad4;
    Thought lo1 = Thought231.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    boolean lb2 = true;
    double ld3 = 568.9793273033883;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3);
}
    Thought lo4 = Thought7.getInstance();
    lb2 = ad4 < fd0;
    fb0 = fd1 < ld3;
if(fo1 != null){
      fo1.m2(fb1, lb0, lb2, fb0);
}
    fb1 = lb0 && lb2;
    ad1 = ad2 + ad3;
    fb0 = fb1 && lb0;
    lb2 = fb0 || fb1;
    lb0 = ad4 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld3, ad1, ad2, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb0);
}
    lb2 = fb0 || fb1;
    Thought lo5 = Thought387.getInstance(fo0, fo1, fo0, fo1, lb0, lb2, fb0, fb1);

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
    ab2 = ad1 > ad2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    boolean lb0 = false;
    fb0 = ad3 < ad4;
    Output.points[5][3] += fd0;
if(fo0 != null){
      fo0.m2(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
    double ld1 = 675.191316052997;

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
    fb0 = !fb1;
    double ld0 = 951.877282755245;
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, fb0, fb1);
}
    ld0 = fd0 - fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    double ld1 = 184.6444369130448;
    fb0 = fb1 && fb0;
    ld1 = fd0 + fd1;
    ld0 *= -1;
    ld1 = fd0 + fd1;
    fb1 = ld0 > ld1;
    Output.points[5][4] -= fd0;
    boolean lb2 = false;
    Thought lo3 = Thought42.getInstance(fd1, ld0, ld1, fd0, lb2, fb0, fb1, lb2);
    fb0 = fb1 || lb2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    fb1 = lb2 || fb0;
    fb1 = lb2 || fb0;
    Output.points[5][5] -= fd1;
    ld0 = ld1 - fd0;
    Output.points[5][6] -= fd1;

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
    boolean lb0 = false;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought14.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2);
    ad3 = ad4 - fd0;
    lb0 = fb0 || fb1;
    lb0 = fd1 > ad1;
    Thought lo2 = Thought51.getInstance();
    boolean lb3 = true;
            Output.points[5][7] -= ad2;
    boolean lb4 = false;
    ad3 *= -1;
    lb3 = lb4 || fb0;
    Output.points[5][8] += ad4;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb3, lb4);
}
    fb0 = fd1 < ad1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb1, lb0, lb3, lb4);
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
    ab1 = ab2 || ab3;
    ab4 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = fd1 < fd0;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ab4, fb0, fb1, ab1);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao2 != null){
      ao2.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought153.getInstance(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
    if (ab1) {
if(ao2 != null){
          ao1 = ao2.m4();
}
if(ao3 != null){
          ao3.m1(ab2, ab3, ab4, fb0);
}
        fb1 = fd1 < fd0;
        fd1 *= -1;
        lb0 = ab1 && ab2;
        Thought lo2 = Thought360.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
        lb0 = fd0 > fd1;
        Thought lo3 = Thought39.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
        double ld4 = 862.8873627134288;
        fb0 = !fb1;
        boolean lb5 = false;
if(ao2 != null){
          ld4 = ao2.m3(ao3, ao4, fo0, fo1, lb5, lb0, ab1, ab2);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    for(int i0=0; i0<10; i0++){
        }
    ab2 = ad2 < ad3;
if(ao1 != null){
      ab3 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ad1);
}
    ad2 *= -1;
    Thought lo0 = Thought123.getInstance(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
    ab4 = ad1 > ad2;
if(ao1 != null){
      fo1 = ao1.m4();
}
    ad3 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, ab1, ab2);
}
    double ld1 = 49.00509408160404;
    ad3 = ad4 + fd0;
    double ld2 = 858.6958037613167;
    ab3 = fd0 < fd1;
    double ld3 = 521.2289245549733;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, ld2, ld3, ad1, ab4, fb0, fb1, ab1);
}
    Output.points[6][0] += ad2;
    ab2 = ad3 > ad4;
    ab3 = ab4 && fb0;
        fd0 *= -1;
    fb1 = ab1 || ab2;
    ab3 = !ab4;
    fd1 = ld1 - ld2;
    double ld4 = 114.76753518539688;
    fb0 = fb1 && ab1;
    Output.points[6][1] -= ld3;
if(ao3 != null){
      ld4 = ao3.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
    fb0 = !fb1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;
    Thought lo1 = Thought321.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    boolean lb2 = true;
    Output.points[6][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      lb0 = fo1.m2();
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
    boolean lb0 = false;
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + fd0;
    ab3 = fd1 > fd0;
    Thought lo1 = Thought79.getInstance(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
    ab1 = fd1 < fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
    Thought lo2 = Thought43.getInstance(fo0, fo1, fo0, fo1);
    ab2 = ab3 && ab4;
    fd1 = fd0 - fd1;
    boolean lb3 = false;
    fd0 = fd1 - fd0;
    Output.points[6][3] += fd1;
    boolean lb4 = true;
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1);
}
    ab4 = fb0 || fb1;
    lb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb3, lb4, ab1, ab2);
}
    ab3 = fd1 > fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    lb3 = lb4 || ab1;

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
    ad1 = ad2 - ad3;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought342.getInstance(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[6][4] += ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    fb1 = !fb0;
    fb1 = !fb0;
    boolean lb1 = false;
    ad1 *= -1;
    ad2 = ad3 + ad4;
    double ld2 = 796.4840866742691;
    fb0 = fb1 || lb1;
    fb0 = ad4 > fd0;
    boolean lb3 = false;
    fb0 = fd1 < ld2;
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    double ld4 = 708.9518676225902;
    fb1 = lb1 && lb3;
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ld2, ld4, ad1, ad2);
}
    double ld5 = 851.9282769655613;
if(fo1 != null){
      ad2 = fo1.m3();
}
        lb3 = ad3 > ad4;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb1, lb3);
}
    Output.points[6][5] += fd0;

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
    ad1 *= -1;
    boolean lb0 = true;
    boolean lb1 = true;
    Output.points[6][6] += ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb1, ab1);
}
    Output.points[6][7] -= fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < ad1;
    ad2 *= -1;

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
    Thought lo0 = Thought255.getInstance(ao2, ao3, ao4, fo0);
    Thought lo1 = Thought356.getInstance(fd1, fd0, fd1, fd0);
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb2 = false;
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb2 = !fb0;
    Thought lo3 = Thought351.getInstance(fb1, lb2, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      lb2 = fo1.m2(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb2, fb0);
}
    double ld4 = 514.3041986213888;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld4, fd0, fb1, lb2, fb0, fb1);
}
    lb2 = !fb0;
    fb1 = fd1 > ld4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      ao1.m1(fd0, fd1, ld4, fd0);
}
    fb0 = fb1 || lb2;
    fb0 = fb1 || lb2;

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
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld0 = 854.8904609061404;
    Output.points[6][8] += ad4;
    fb1 = fb0 || fb1;
    fd0 = fd1 + ld0;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ad4 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    boolean lb1 = false;
    double ld2 = 511.1337606280961;
    fb0 = fb1 || lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb1, fb0, fb1);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m1(ld2, ad1, ad2, ad3, lb1, fb0, fb1, lb1);
}
    boolean lb3 = false;
if(fo1 != null){
      lb3 = fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, lb1, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    fb0 = fb1 || lb1;

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
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
    ab2 = ab3 || ab4;
if(ao3 != null){
      fd0 = ao3.m3();
}
    boolean lb0 = true;
    ab4 = !fb0;
if(ao4 != null){
      fd1 = ao4.m3(fb1, lb0, ab1, ab2);
}
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
    boolean lb1 = true;
    Thought lo2 = Thought313.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fb1 = lb0 || lb1;
if(ao3 != null){
      ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, lb0, lb1, ab1);
}
    ab2 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(ao4 != null){
      ab3 = ao4.m2(fo0, fo1, ao1, ao2);
}
    ab4 = !fb0;

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
    ab2 = !ab3;
    ad1 *= -1;
    Thought lo0 = Thought262.getInstance(ad2, ad3, ad4, fd0);
    double ld1 = 727.3261315222551;
    Output.points[7][0] += fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld1, ad1, ad2);
}
    Output.points[7][1] -= ad3;
    boolean lb2 = false;
    boolean lb3 = false;
    ad4 = fd0 + fd1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought1.getInstance();
    fb1 = fd1 > fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    double ld1 = 153.828628665597;
    fb1 = fb0 && fb1;
    fb0 = ld1 < fd0;
    Thought lo2 = Thought170.getInstance(fb1, fb0, fb1, fb0);
    fd1 = ld1 - fd0;
    fd1 *= -1;
    boolean lb3 = true;
    fb0 = fb1 || lb3;
    double ld4 = 690.6903961159766;
    Thought lo5 = Thought127.getInstance(fo0, fo1, fo0, fo1, ld1, ld4, fd0, fd1, fb0, fb1, lb3, fb0);

Thought.STACK_COUNTER++;
return fo0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
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
    Thought lo0 = Thought214.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
    double ld1 = 62.253995755998645;
    ab3 = ab4 || fb0;
    fb1 = ld1 > fd0;
    ab1 = ab2 && ab3;
    Thought lo2 = Thought243.getInstance(fo1, fo0, fo1, fo0);
    fd1 *= -1;
if(fo1 != null){
      ld1 = fo1.m3(fd0, fd1, ld1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo0 != null){
      ld1 = fo0.m3();
}
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb1) {
        fb0 = !fb1;
        ad2 = ad3 + ad4;
        boolean lb0 = true;
        lb0 = fd0 < fd1;
        Output.points[7][2] -= ad1;
        Thought lo1 = Thought221.getInstance(fb0, fb1, lb0, fb0);
        fb1 = !lb0;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
        ad1 = ad2 - ad3;
if(fo1 != null){
          fb1 = fo1.m2(ad4, fd0, fd1, ad1, lb0, fb0, fb1, lb0);
}
        boolean lb2 = true;
        lb2 = fb0 && fb1;
        lb0 = lb2 || fb0;
        double ld3 = 410.73076467454285;
        } else if (fb1) {
if(fo0 != null){
          fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (ab2) {
        if (ab3) {
            Output.points[7][3] += ad2;
            Thought lo0 = Thought285.getInstance(ad3, ad4, fd0, fd1);
            Thought lo1 = Thought221.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
            Thought lo2 = Thought180.getInstance();
            fd0 *= -1;
            fd1 *= -1;
            ad1 = ad2 + ad3;
            Output.points[7][4] -= ad4;
if(fo0 != null){
              fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
            Thought lo3 = Thought111.getInstance(ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
            ad1 *= -1;
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
    fd1 = fd0 - fd1;
    double ld0 = 861.0255889930677;
    Output.points[7][5] -= ld0;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought366.getInstance(ao2, ao3, ao4, fo0);
if(fo1 != null){
      fo1.m2(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 < ld0;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fb1 = !fb0;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought385.getInstance();
if(ao1 != null){
      fd1 = ao1.m3(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      fd0 = ao2.m3(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Output.points[7][6] -= ld0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fd0 *= -1;
    double ld3 = 707.6334981311759;
if(ao3 != null){
      ao3.m3(fd0, fd1, ld0, ld3);
}
    fb1 = fd0 < fd1;
    ld0 *= -1;

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
    boolean lb1 = false;
    boolean lb2 = false;
    ad2 *= -1;
    lb0 = ad3 > ad4;
    lb1 = lb2 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
}
    fb1 = lb0 || lb1;
    Output.points[7][7] -= ad3;
    Output.points[7][8] += ad4;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      ao3.m3(lb2, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
if(ao4 != null){
      lb2 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb1);
}
if(ao3 != null){
      lb2 = ao3.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb0);
}
    Thought lo3 = Thought123.getInstance(ao3, ao4, fo0, fo1);
    ad3 *= -1;
    boolean lb4 = true;
    Thought lo5 = Thought187.getInstance(ad4, fd0, fd1, ad1);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
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
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    Output.points[8][0] += fd1;
    fd0 = fd1 - fd0;
    ab1 = fd1 < fd0;
if(ao4 != null){
      ab2 = ao4.m2(ab3, ab4, fb0, fb1);
}
    lb0 = ab1 || ab2;
    ab3 = !ab4;
    fb0 = fd1 > fd0;
    fb1 = fd1 > fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fd1 < fd0;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ab2, ab3, ab4, fb0);
}
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    ab1 = ab2 && ab3;
    ab4 = ad3 < ad4;
    fb0 = fb1 && lb0;
    fd0 = fd1 - ad1;
    boolean lb1 = false;
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0);
}
    double ld2 = 836.1238285913845;
if(fo1 != null){
      lb1 = fo1.m2(ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, ld2, ad1, ad2, ad3);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || lb0;
if(ao4 != null){
      ad4 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld2, ad1, lb1, ab1, ab2, ab3);
}
    boolean lb3 = false;
if(ao3 != null){
      ad2 = ao3.m3(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, lb3, ab1);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    Output.points[8][1] += fd0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fd1 = fd0 - fd1;
    fb1 = !lb0;

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
      fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
        lb0 = fd1 > fd0;
    double ld1 = 143.97430374670412;
    Thought lo2 = Thought66.getInstance(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
    fb1 = fd1 > ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 > fd1;
    fb1 = ld1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld3 = 717.4575758468474;

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
    fd0 = fd1 + fd0;
    Output.points[8][2] -= fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb0 = fo0.m2();
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    boolean lb0 = true;
    fb0 = !fb1;
    fd1 = fd0 + fd1;
    fd0 *= -1;
    Output.points[8][3] -= fd1;
    lb0 = !fb0;
        fb1 = lb0 || fb0;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    Output.points[8][4] -= fd0;

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
