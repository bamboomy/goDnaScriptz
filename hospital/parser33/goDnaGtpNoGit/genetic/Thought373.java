package genetic;
import java.util.ArrayList;
class Thought373 extends Thought{
private static ArrayList<Thought373> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 353.1347077499826;
private double fd1 = 80.63856672486175;
private Thought fo0 = null;
private Thought fo1 = null;
Thought373 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought373 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought373 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought373 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought373 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought373 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought373 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought373 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought373 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought373 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought373 instance = new Thought373 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought229.getInstance(fd0, fd1, fd0, fd1);
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    if (fb0) {
if(fo0 != null){
          fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
        double ld1 = 387.83109486591906;
        fb0 = ld1 > fd0;
        Thought lo2 = Thought248.getInstance(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
        fb1 = !fb0;
        double ld3 = 79.32620850944691;
if(fo1 != null){
          fo1.m3(ld1, ld3, fd0, fd1, fb1, fb0, fb1, fb0);
}
        ld1 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
        fb0 = fb1 && fb0;
        boolean lb4 = false;
if(fo0 != null){
          fo0.m3(ld3, fd0, fd1, ld1);
}
if(fo1 != null){
          ld3 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld3);
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo0.m2();
}
    Thought lo0 = Thought136.getInstance(ab2, ab3, ab4, fb0);
    Output.points[3][7] -= fd0;
    double ld1 = 205.283257575832;
    Thought lo2 = Thought192.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
    ab4 = fd1 > ld1;
if(fo1 != null){
      fb0 = fo1.m2(fd0, fd1, ld1, fd0, fb1, ab1, ab2, ab3);
}
    Thought lo3 = Thought62.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(ld1, fd0, fd1, ld1);
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
    Thought lo0 = Thought237.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, lb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb1);
}
    fb0 = fb1 || lb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
        fb1 = lb1 || fb0;
    Thought lo2 = Thought86.getInstance(fo1, fo0, fo1, fo0);
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
    boolean lb4 = false;
    fb0 = !fb1;
    lb1 = fd0 > fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb5 = false;
    boolean lb6 = false;
    fd1 = ad1 - ad2;
    lb3 = !lb4;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb5 = lb6 && fb0;
    boolean lb7 = false;
    Thought lo8 = Thought63.getInstance(fb0, fb1, lb1, lb3);

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
    ad1 *= -1;
    ad2 *= -1;
    for(int i0=0; i0<10; i0++){
        ab1 = ab2 && ab3;
        ab4 = !fb0;
        boolean lb0 = false;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, ab1);
}
        ab2 = ad1 < ad2;
        ab3 = !ab4;
        boolean lb1 = true;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo1.m3(ad3, ad4, fd0, fd1, lb0, lb1, ab1, ab2);
}
        ab3 = !ab4;
        fb0 = ad1 > ad2;
        Thought lo2 = Thought272.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, ab1);
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
    double ld0 = 138.48986609324635;
    boolean lb1 = true;
        fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
      fb0 = ao1.m2(ld0, fd0, fd1, ld0);
}
    fb1 = lb1 || fb0;
    fb1 = fd0 < fd1;
    lb1 = !fb0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0);
}
    boolean lb2 = true;
    lb1 = lb2 && fb0;
    Output.points[3][8] -= fd0;
    fb1 = !lb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Output.points[4][0] -= fd1;
if(ao4 != null){
      ao3 = ao4.m4(lb2, fb0, fb1, lb1);
}
    Output.points[4][1] -= ld0;
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, lb2, fb0, fb1, lb1);
}
    fd1 = ld0 + fd0;

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
    Thought lo0 = Thought161.getInstance(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][2] -= fd0;
    if (fb0) {
        fd1 *= -1;
if(ao1 != null){
          ad1 = ao1.m3(ao2, ao3, ao4, fo0);
}
        fb1 = !fb0;
        fb1 = ad2 < ad3;
        fb0 = ad4 > fd0;
        fd1 *= -1;
        if (fb1) {
            ad1 = ad2 + ad3;
if(fo1 != null){
              ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
            ad1 *= -1;
            Output.points[4][3] -= ad2;
if(fo1 != null){
              ad3 = fo1.m3();
}
            fb0 = fb1 && fb0;
            ad4 = fd0 - fd1;
if(ao2 != null){
              ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
            Thought lo1 = Thought214.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[4][4] -= fd0;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    fd0 *= -1;
    for(int i0=0; i0<10; i0++){
        for(int i1=0; i1<10; i1++){
            double ld1 = 883.3589039178815;
if(fo1 != null){
              fo1.m3(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
              ao1.m3(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(ao1 != null){
              fo1 = ao1.m4();
}
            ab1 = ab2 && ab3;
if(ao3 != null){
              ao2 = ao3.m4(ab4, fb0, fb1, lb0);
}
            boolean lb2 = false;
            lb0 = !ab1;
if(ao4 != null){
              ab2 = ao4.m2(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(ao4 != null){
              ao3 = ao4.m4(fd0, fd1, ld1, fd0, lb2, lb0, ab1, ab2);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
if(fo1 != null){
      ad1 = fo1.m3(ao1, ao2, ao3, ao4);
}
    double ld1 = 418.14972527168857;
    ab4 = ad1 < ad2;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1);
}
    ad1 *= -1;
    fb0 = fb1 || lb0;
    double ld2 = 1000.7566724227447;
    boolean lb3 = false;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
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
    boolean lb0 = true;
    Thought lo1 = Thought14.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
        fb0 = fb1 && lb0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    lb2 = fd0 < fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = true;
        fd1 = fd0 + fd1;
        fb0 = fb1 || lb0;
    lb2 = fd0 < fd1;

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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    Output.points[4][5] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought88.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - fd0;
    ab2 = !ab3;
    Thought lo1 = Thought103.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought290.getInstance(ad4, fd0, fd1, ad1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    Thought lo2 = Thought386.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = !lb0;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, lb0, fb0);
}
    double ld3 = 831.9638788680096;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fb0 && fb1;
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    double ld4 = 702.3262855968891;

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
    Thought lo0 = Thought17.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        double ld1 = 710.5606889467505;
        ab2 = ab3 || ab4;
if(fo0 != null){
          fo1 = fo0.m4();
}
        for(int i1=0; i1<10; i1++){
            boolean lb2 = false;
            ab4 = fb0 || fb1;
if(fo1 != null){
              fo1.m3(lb2, ab1, ab2, ab3);
}
            ab4 = !fb0;
            fd0 *= -1;
if(fo0 != null){
              fd1 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ad1, ad2, ad3, fb1, lb2, ab1, ab2);
}
            ab3 = ab4 && fb0;
            Thought lo3 = Thought86.getInstance(ad4, fd0, fd1, ld1, fb1, lb2, ab1, ab2);
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
            lb2 = ad1 > ad2;
            boolean lb4 = true;
            ad3 = ad4 - fd0;
            fd1 = ld1 - ad1;
if(fo1 != null){
              fo1.m2(fo0, fo1, fo0, fo1);
}
            Output.points[4][6] += ad2;
            double ld5 = 64.12863148272578;
            lb4 = ad2 < ad3;
            Thought lo6 = Thought342.getInstance(ad4, fd0, fd1, ld5);
            }
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        fd1 = ld1 + ad1;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1();
}
if(ao2 != null){
      fd0 = ao2.m3(fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    Output.points[4][7] -= fd1;
    boolean lb0 = false;
    fd0 = fd1 + fd0;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(ao2 != null){
      fd1 = ao2.m3(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd0 = fd1 + fd0;
    boolean lb1 = true;
if(ao3 != null){
      lb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = ad2 < ad3;
    boolean lb0 = true;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 = ad3 + ad4;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    double ld1 = 204.66880221775304;
    lb0 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1);
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
    double ld0 = 295.420215195252;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, fd0, fd1);
}
    if (ab2) {
        double ld1 = 410.5141120351581;
        Thought lo2 = Thought367.getInstance();
        ab3 = ld1 < ld0;
        ab4 = fb0 || fb1;
        fd0 = fd1 - ld1;
        ab1 = !ab2;
        boolean lb3 = false;
        double ld4 = 414.7380506828762;
        Output.points[4][8] += ld4;
        } else if (ab3) {
        Thought lo5 = Thought240.getInstance(ab4, fb0, fb1, ab1);
        ab2 = fd1 < ld0;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
}
        Output.points[5][0] -= fd1;
if(ao2 != null){
          ao1 = ao2.m4(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
        fd0 *= -1;
        fb0 = fb1 && ab1;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
        fd1 = ld0 + fd0;
        fb1 = ab1 && ab2;
if(ao3 != null){
          ab3 = ao3.m2(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(fd1, ld0, fd0, fd1);
}
        ld0 = fd0 - fd1;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, fd0, fd1, ld0);
}
        fd0 *= -1;
if(fo0 != null){
          ao4 = fo0.m4();
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
    boolean lb0 = false;
    ad1 = ad2 + ad3;
if(ao2 != null){
      lb0 = ao2.m2(ab1, ab2, ab3, ab4);
}
    Thought lo1 = Thought316.getInstance(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
    ad2 *= -1;
    ab2 = ad3 < ad4;
    ab3 = !ab4;
    fb0 = fb1 && lb0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
}
    ad3 *= -1;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought160.getInstance(ao3, ao4, fo0, fo1, fb0, fb1, lb0, ab1);
    ab2 = ab3 || ab4;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fb1 = ad1 < ad2;
    ad3 *= -1;
if(fo1 != null){
      lb0 = fo1.m2(ad4, fd0, fd1, ad1);
}
    boolean lb3 = false;
    lb3 = !ab1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = fd1 > fd0;
    boolean lb0 = true;
    fd1 = fd0 - fd1;
    fb0 = fb1 || lb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    boolean lb1 = true;
    Thought lo2 = Thought382.getInstance(lb1, fb0, fb1, lb0);
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, lb1);
}
    fb0 = fd1 < fd0;

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
    Thought lo0 = Thought359.getInstance(fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    double ld1 = 586.6717504692122;
    ld1 = fd0 - fd1;
    boolean lb2 = false;
    ab4 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(ld1, fd0, fd1, ld1);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    if (lb2) {
        lb3 = !ab1;
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
      fo1.m2();
}
    Thought lo0 = Thought199.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    fb1 = ad2 < ad3;
    double ld1 = 762.9364137788147;
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    double ld2 = 646.7780697751278;
    fb0 = fb1 && fb0;
    ld2 = ad1 + ad2;
    fb1 = ad3 < ad4;
    fd0 = fd1 - ld1;
    ld2 = ad1 + ad2;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
        boolean lb3 = true;
        lb3 = ad4 < fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fd1 = ld1 + ld2;
if(fo0 != null){
          fo0.m3(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld2);
}
if(fo1 != null){
          ad1 = fo1.m3();
}
        }
    Output.points[5][1] -= ad2;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
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
    boolean lb0 = false;
    ab1 = !ab2;
    ab3 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, lb0);
}
    Thought lo1 = Thought57.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
}
    fd1 *= -1;
    ab2 = ad1 > ad2;
    ab3 = !ab4;
    fb0 = ad3 > ad4;
    fd0 = fd1 + ad1;
    fb1 = !lb0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    lb2 = ad2 > ad3;
if(fo0 != null){
      ab1 = fo0.m2(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab2 = fd1 < ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab3 = ad2 < ad3;
    Thought lo3 = Thought3.getInstance(ab4, fb0, fb1, lb0);
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, ab1, ab2, ab3, ab4);
}
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
    fb0 = fb1 && fb0;
if(ao2 != null){
      ao2.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld0 = 146.6935819365591;
    double ld1 = 169.153205952024;
    if (fb1) {
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
          ao2 = ao3.m4(ld0, ld1, fd0, fd1);
}
        boolean lb2 = false;
if(ao4 != null){
          ld0 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld0);
}
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
    ad1 = ad2 + ad3;
    fb0 = !fb1;
if(ao2 != null){
          ao1 = ao2.m4();
}
    boolean lb0 = true;
if(ao4 != null){
      ao3 = ao4.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(ad2, ad3, ad4, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, ao1, ao2, ao3);
}
    ad1 = ad2 + ad3;
    fb1 = lb0 || fb0;
if(ao4 != null){
      ad4 = ao4.m3(fd0, fd1, ad1, ad2);
}
    Thought lo1 = Thought10.getInstance(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    fb0 = ad1 < ad2;
    ad3 = ad4 - fd0;
    fb1 = lb0 || lb2;
    Output.points[5][2] += fd1;
if(ao4 != null){
      ao3 = ao4.m4();
}
if(fo0 != null){
      ad1 = fo0.m3(fb0, fb1, lb0, lb2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought190.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    Thought lo1 = Thought380.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
    Output.points[5][3] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
    boolean lb3 = false;
    lb2 = lb3 || ab1;
    ab2 = fd1 > fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo4 = Thought91.getInstance(fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    ab3 = fd1 < fd0;
    Thought lo5 = Thought105.getInstance();
if(ao4 != null){
      ao4.m2(ab4, fb0, fb1, lb2);
}
    fd1 = fd0 + fd1;
    Output.points[5][4] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, lb3, ab1, ab2, ab3);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought235.getInstance(ao3, ao4, fo0, fo1, fb1, ab1, ab2, ab3);
if(ao1 != null){
      ab4 = ao1.m2(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 - ad1;
    fb0 = fb1 || ab1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3);
}
    boolean lb1 = true;
    ab1 = !ab2;
    ad4 = fd0 - fd1;
    Thought lo2 = Thought246.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
    fd0 *= -1;
if(fo0 != null){
      fo0.m1();
}
    double ld3 = 485.4235029783921;
    ab3 = !ab4;
    fd0 *= -1;
    fb0 = !fb1;
    Thought lo4 = Thought106.getInstance(lb1, ab1, ab2, ab3);

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
    fd0 = fd1 - fd0;
        Output.points[5][5] += fd1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo0.m3();
}
    fd0 *= -1;
    fb1 = fb0 && fb1;
    Output.points[5][6] -= fd1;
    boolean lb0 = true;
    boolean lb1 = true;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fd0 = fo1.m3(fb1, lb0, lb1, fb0);
}
    boolean lb2 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, lb1, lb2);
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
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    boolean lb0 = true;
    fd0 *= -1;
    ab3 = fd1 > fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld1 = 289.3016479637033;
    Output.points[5][7] -= fd0;
    fd1 *= -1;
if(fo1 != null){
      ab4 = fo1.m2(ld1, fd0, fd1, ld1);
}
    fb0 = fd0 > fd1;
    fb1 = ld1 > fd0;
    boolean lb2 = false;
    fd1 = ld1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
    lb0 = !lb2;
    ab1 = ld1 < fd0;
    boolean lb3 = true;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      lb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, lb2, lb3, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb2, lb3, ab1);
}
    boolean lb4 = true;
    Thought lo5 = Thought231.getInstance(fo1, fo0, fo1, fo0);
    ab1 = !ab2;
    ab3 = ab4 || fb0;

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
      fb1 = fo0.m2(ad2, ad3, ad4, fd0);
}
    double ld0 = 14.552057664446288;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad4 = fo1.m3(fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, ad1, ad2, fb0, fb1, lb1, fb0);
}
    ad3 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, fb0, fb1, lb1);
}
    ad1 = ad2 - ad3;
    fb0 = ad4 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb1 = fd1 < ld0;
    ad1 = ad2 + ad3;
    boolean lb2 = true;
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ld0, ad1);
}
    Thought lo3 = Thought54.getInstance(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
if(fo0 != null){
      fd1 = fo0.m3();
}
    lb2 = !fb0;
    ld0 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(lb1, lb2, fb0, fb1);
}
    lb1 = lb2 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, lb2, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ad1, fb1, lb1, lb2, fb0);
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
    ab2 = ad1 < ad2;
    ab3 = !ab4;
    double ld0 = 877.2744777459852;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought398.getInstance(fo1, fo0, fo1, fo0);
    if (ab3) {
if(fo1 != null){
          fo1.m2(ad2, ad3, ad4, fd0);
}
        ab4 = fb0 || fb1;
        ab1 = ab2 || ab3;
        fd1 *= -1;
        ab4 = ld0 < ad1;
if(fo0 != null){
          ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo1 != null){
          fo1.m2();
}
if(fo0 != null){
          ld0 = fo0.m3(fb0, fb1, ab1, ab2);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought279.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    Output.points[5][8] += fd1;
    fb0 = fd0 > fd1;
    fd0 *= -1;
    double ld1 = 288.1825850711084;
    fd0 = fd1 + ld1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0);
}
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1();
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
      ao2 = ao3.m4(fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 = fd0 + fd1;
    fb1 = fb0 && fb1;
    Output.points[6][0] -= ad1;
    ad2 = ad3 - ad4;
    Thought lo0 = Thought157.getInstance(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ad1, ad2);
}
    fb0 = ad3 > ad4;
    Thought lo1 = Thought222.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2);
if(ao2 != null){
      ad3 = ao2.m3();
}
    double ld2 = 439.7340708045338;
    fb1 = ad3 < ad4;
    double ld3 = 708.0732656598652;
if(ao3 != null){
      ao3.m3(fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;

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
    Thought lo0 = Thought269.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    double ld1 = 83.05129802716561;
    Thought lo2 = Thought247.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m1(ld1, fd0, fd1, ld1);
}
    Output.points[6][1] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, ld1, fd0, fd1);
}
    boolean lb3 = true;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fo1.m3(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld1, fb1, lb3, ab1, ab2);
}
    ab3 = ab4 && fb0;
    boolean lb4 = false;
    fb0 = fb1 || lb3;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ld1, fd0, fd1, lb4, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, lb3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb4 = ab1 || ab2;
if(ao3 != null){
      ao3.m3(ld1, fd0, fd1, ld1);
}
    ab3 = ab4 && fb0;
    fb1 = lb3 && lb4;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld1, fd0);
}
    ab1 = fd1 > ld1;
    fd0 = fd1 + ld1;
    fd0 = fd1 - ld1;
    boolean lb5 = true;

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
    ad2 = ad3 + ad4;
if(ao2 != null){
          ao1 = ao2.m4();
}
    fd0 = fd1 + ad1;
    ab2 = ab3 && ab4;
    fb0 = ad2 > ad3;
    Thought lo0 = Thought276.getInstance(fb1, ab1, ab2, ab3);
if(ao3 != null){
      ad4 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    boolean lb2 = true;
    boolean lb3 = false;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought25.getInstance(ao4, fo0, fo1, ao1);
    lb1 = lb2 && lb3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0);
}
        ab1 = !ab2;
    ab3 = ab4 && fb0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4();
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
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fb0 = fo0.m2(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m1(fd0, fd1, fd0, fd1);
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
        boolean lb0 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo1 = Thought102.getInstance(fb0, fb1, lb0, fb0);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
    lb0 = lb2 || fb0;
    fd0 *= -1;
    fb1 = !lb0;
    fd1 = fd0 + fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo3 = Thought134.getInstance();
    lb2 = fd0 < fd1;
    double ld4 = 585.106737936895;

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
    Output.points[6][2] += fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    Output.points[6][3] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    lb0 = fd0 > fd1;
    fd0 *= -1;
    fb0 = fb1 || lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    double ld1 = 619.9093895997003;
    fb0 = fd0 > fd1;

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
