package genetic;
import java.util.ArrayList;
class Thought320 extends Thought{
private static ArrayList<Thought320> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 346.9099634105104;
private double fd1 = 468.2633040552015;
private Thought fo0 = null;
private Thought fo1 = null;
Thought320 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought320 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought320 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought320 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought320 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought320 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought320 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought320 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought320 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought320 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought320 instance = new Thought320 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought96.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      fd0 = fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, fb0, fb1);
}
        lb1 = fd1 > fd0;
        Output.points[4][2] -= fd1;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 703.763365781102;
    ab2 = !ab3;
    Thought lo1 = Thought147.getInstance(fo0, fo1, fo0, fo1);
    ab4 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1);
}
    if (fb0) {
        boolean lb2 = false;
        if (fb0) {
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0);
}
            fb1 = lb2 || ab1;
            ab2 = fd0 > fd1;
            ld0 = fd0 + fd1;
            boolean lb3 = false;
            boolean lb4 = false;
if(fo1 != null){
              fo0 = fo1.m4();
}
            boolean lb5 = true;
            double ld6 = 667.7218624479277;
            lb2 = ld6 > ld0;
if(fo0 != null){
              ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld6, ld0, fb1, lb3, lb4, lb5);
}
            boolean lb7 = false;
if(fo1 != null){
              lb7 = fo1.m2(fd0, fd1, ld6, ld0, lb2, ab1, ab2, ab3);
}
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb3);
}
            for(int i0=0; i0<10; i0++){
                lb4 = lb5 || lb7;
}}}
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
    fb0 = fb1 && fb0;
    fb1 = ad1 > ad2;
    fb0 = fb1 || fb0;
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    double ld0 = 763.377419917088;
    Thought lo1 = Thought91.getInstance(ad3, ad4, fd0, fd1);
    boolean lb2 = false;
    ld0 = ad1 - ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    lb2 = fb0 || fb1;
    ld0 = ad1 + ad2;
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
    lb2 = !fb0;
    ld0 = ad1 + ad2;
        Thought lo3 = Thought140.getInstance(fb1, lb2, fb0, fb1);
    ad3 = ad4 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3, lb2, fb0, fb1, lb2);
}
    Output.points[4][3] -= ad4;
    boolean lb4 = true;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ad1, ad2, lb4, fb0, fb1, lb2);
}
    Output.points[4][4] += ad3;
    ad4 = fd0 - fd1;

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
    ab3 = ad3 > ad4;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    fd1 *= -1;
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    ad1 = ad2 - ad3;
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
        fd1 = ad1 - ad2;
        double ld0 = 344.6817746917502;
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        fb1 = ab1 && ab2;
        Thought lo1 = Thought17.getInstance(fo0, fo1, fo0, fo1, ld0, ad1, ad2, ad3);
        ab3 = ab4 || fb0;
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
    fb1 = !fb0;
    Thought lo0 = Thought280.getInstance();
    Output.points[4][5] += fd0;
    double ld1 = 808.0106580186042;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    double ld2 = 239.30927437027358;
    Thought lo3 = Thought39.getInstance(ao3, ao4, fo0, fo1, ld2, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
    fb1 = fb0 || fb1;
    fb0 = ld2 > fd0;
    fd1 = ld1 + ld2;
    Thought lo4 = Thought173.getInstance(fd0, fd1, ld1, ld2, fb1, fb0, fb1, fb0);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld1;
    Output.points[4][6] -= ld2;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = ld1 + ld2;
if(fo1 != null){
      fo1.m1(fd0, fd1, ld1, ld2);
}
    fb1 = !fb0;
    fb1 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ld1, ld2, fd0, fd1);
}
if(ao1 != null){
      ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, fb0, fb1);
}
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    double ld5 = 679.5868686014319;
if(ao3 != null){
      fb1 = ao3.m2(ld2, ld5, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[4][7] -= ld1;
    ld2 = ld5 - fd0;
    fd1 = ld1 + ld2;

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
    Thought lo0 = Thought58.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought310.getInstance(fo1, ao1, ao2, ao3);
    Thought lo2 = Thought278.getInstance(ad1, ad2, ad3, ad4);
    fd0 = fd1 + ad1;
    boolean lb3 = false;
    lb3 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    boolean lb4 = true;
    Thought lo5 = Thought56.getInstance(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
    ad4 *= -1;
    fd0 = fd1 - ad1;
    lb4 = fb0 && fb1;
    lb3 = !lb4;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao2.m3();
}
    fb0 = fb1 && lb3;
    lb4 = fd0 > fd1;
    fb0 = ad1 < ad2;
    fb1 = lb3 || lb4;

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
if(ao1 != null){
      ab1 = ao1.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    double ld0 = 806.7446290692749;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ld0, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0, fb1, ab1, ab2, ab3);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > ld0;
    double ld1 = 865.6550547029211;
    ld1 *= -1;
    ab3 = !ab4;
    Output.points[4][8] += fd0;
    fd1 = ld0 - ld1;
    Thought lo2 = Thought278.getInstance(ao3, ao4, fo0, fo1);
    boolean lb3 = false;
    Output.points[5][0] += fd0;
    Output.points[5][1] -= fd1;
    ab4 = ld0 > ld1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, ld0, ld1, fd0);
}
    fb0 = fd1 > ld0;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ld1, fd0, fd1, ld0);
}
    ld1 = fd0 + fd1;
if(ao1 != null){
      ld0 = ao1.m3();
}
if(ao3 != null){
      ao2 = ao3.m4(lb3, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
    double ld4 = 753.8041899138858;

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
    Output.points[5][2] += ad2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    if (fb0) {
        Thought lo0 = Thought233.getInstance(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
        ab4 = !fb0;
        fb1 = fd0 > fd1;
        ad1 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        ad2 = ad3 + ad4;
        fb0 = fb1 || ab1;
        fd0 = fd1 - ad1;
        double ld1 = 517.5570466356234;
        boolean lb2 = true;
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
        fd1 = fd0 + fd1;
    Thought lo1 = Thought13.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    Output.points[5][3] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
    lb2 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, fb0, fb1);
}
    Output.points[5][4] -= fd1;
    lb0 = !lb2;
    Output.points[5][5] -= fd0;
    Output.points[5][6] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;

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
    boolean lb0 = false;
    ab1 = fd0 < fd1;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    lb0 = ab1 || ab2;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
    Output.points[5][7] += fd0;

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
if(fo0 != null){
      fo0.m1(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    double ld0 = 703.7901695610072;
if(fo0 != null){
      ad4 = fo0.m3(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd1 = fo0.m3(ld0, ad1, ad2, ad3);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ad1);
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
    Output.points[5][8] += ad1;
    ab1 = ad2 < ad3;
    ab2 = !ab3;
    ab4 = ad4 > fd0;
    double ld0 = 795.4016347027429;
    boolean lb1 = false;
    ab4 = fb0 && fb1;
    lb1 = ab1 || ab2;
if(fo0 != null){
      fo0.m3();
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ad1, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    ad2 = ad3 - ad4;
    fd0 = fd1 + ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ad1 *= -1;
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
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
    fb0 = fd0 < fd1;
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fd1 *= -1;
if(ao3 != null){
      ao3.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    fb0 = !fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 > fd0;
    Thought lo1 = Thought275.getInstance(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
    lb0 = fb0 && fb1;
    double ld2 = 693.5959923104494;
    boolean lb3 = true;
if(ao4 != null){
      lb0 = ao4.m2(fo0, fo1, ao1, ao2, lb3, fb0, fb1, lb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    lb3 = fd0 < fd1;

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
    double ld0 = 910.5436420355062;
    Output.points[6][0] -= ld0;
    boolean lb1 = false;
    fb0 = ad1 < ad2;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m2(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld0, ad1, ad2, ad3);
}
    boolean lb3 = false;
    boolean lb4 = true;
    Thought lo5 = Thought39.getInstance();
if(ao3 != null){
      ao2 = ao3.m4(lb3, lb4, fb0, fb1);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0, lb1, lb2, lb3, lb4);
}
if(ao4 != null){
      ao3 = ao4.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb1, lb2);
}
    lb3 = lb4 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb1, lb1, lb2, lb3);
}
    Thought lo6 = Thought367.getInstance(fo0, fo1, ao1, ao2);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m2(fd1, fd0, fd1, fd0);
}
    ab1 = fd1 < fd0;
    ab2 = ab3 || ab4;
    for(int i0=0; i0<10; i0++){
        fb0 = fd1 > fd0;
if(ao2 != null){
          fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fb1 = fd0 < fd1;
        boolean lb0 = true;
if(ao1 != null){
          lb0 = ao1.m2();
}
if(ao2 != null){
          fd0 = ao2.m3(ab1, ab2, ab3, ab4);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
        ab2 = fd1 < fd0;
        double ld1 = 908.2322647654543;
if(ao3 != null){
          ao2 = ao3.m4(fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
        }
    fd0 *= -1;
    for(int i1=0; i1<10; i1++){
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        fb0 = !fb1;
if(ao4 != null){
          ab1 = ao4.m2(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          ab2 = fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
        ab3 = ab4 || fb0;
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
    ad2 = ad3 - ad4;
    boolean lb0 = false;
if(ao2 != null){
      lb0 = ao2.m2();
}
    fd0 *= -1;
    boolean lb1 = true;
    lb1 = ab1 && ab2;
if(ao3 != null){
      ao3.m1(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd1, ad1, ad2, ad3, lb0, lb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    Output.points[6][1] += ad2;
    if (lb0) {
        ad3 *= -1;
if(fo0 != null){
          ad4 = fo0.m3(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
        boolean lb2 = false;
        fd0 = fd1 - ad1;
        boolean lb3 = false;
        boolean lb4 = false;
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
        boolean lb5 = true;
        if (lb1) {
            ab1 = ad2 > ad3;
            boolean lb6 = true;
            ad4 *= -1;
            ab1 = fd0 < fd1;
            boolean lb7 = false;
if(fo0 != null){
              ao4 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
              ab1 = fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, ad1, ad2);
}
if(fo1 != null){
              fo0 = fo1.m4();
}
            boolean lb8 = false;
}}
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb0 = true;
    lb0 = fd1 < fd0;
    for(int i0=0; i0<10; i0++){
        Output.points[6][2] += fd1;
        double ld1 = 192.426791457877;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 < ld1;
        boolean lb2 = false;
if(fo1 != null){
          lb2 = fo1.m2(fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb2);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb2);
}
        boolean lb3 = true;
        }
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - fd0;
    fb1 = fd1 < fd0;
    fd1 *= -1;
    double ld4 = 754.0533401838863;
    lb0 = ld4 > fd0;
if(fo0 != null){
      fo0.m2(fd1, ld4, fd0, fd1);
}
    ld4 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld4, fd0, fd1, ld4);
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
    double ld0 = 384.4850819972487;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 = fd0 - fd1;
    ab1 = ab2 || ab3;
    Output.points[6][3] -= ld0;
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
    Thought lo2 = Thought78.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb1, lb1, ab1, ab2);
if(fo1 != null){
      fo1.m3(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ld0 = fd0 - fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 - ad1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    double ld0 = 997.960571189521;
    fb1 = ad1 < ad2;
    fb0 = ad3 > ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, ad1, ad2);
}
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
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
    ab2 = ad2 > ad3;
    boolean lb0 = true;
if(fo0 != null){
      ad4 = fo0.m3();
}
if(fo1 != null){
      fd0 = fo1.m3(ab2, ab3, ab4, fb0);
}
    fb1 = lb0 || ab1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 > fd1;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    lb0 = !fb0;
    fd0 = fd1 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fd1 *= -1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
    double ld1 = 849.9626710799929;
    fb1 = fd0 > fd1;
if(ao3 != null){
      ld1 = ao3.m3();
}
    fd0 *= -1;
    lb0 = fd1 > ld1;
    Output.points[6][4] -= fd0;
    Thought lo2 = Thought186.getInstance(fb0, fb1, lb0, fb0);
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(ao3 != null){
      lb0 = ao3.m2(fd0, fd1, ld1, fd0, fb0, fb1, lb0, fb0);
}
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    double ld3 = 609.9486450979989;
    fb0 = fb1 && lb0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    boolean lb4 = false;
    lb4 = !fb0;
    boolean lb5 = true;
if(ao3 != null){
      fd0 = ao3.m3(fd1, ld1, ld3, fd0);
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
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    double ld0 = 57.93902143602828;
    fb1 = fb0 || fb1;
    fd0 = fd1 - ld0;
    ad1 *= -1;
    boolean lb1 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      lb1 = ao3.m2(fb0, fb1, lb1, fb0);
}
    Thought lo2 = Thought323.getInstance(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb1, lb1, fb0, fb1);
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld0, ad1, ad2, lb1, lb3, fb0, fb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb1, lb3, fb0, fb1);
}
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2);
}
        Thought lo4 = Thought364.getInstance(ad3, ad4, fd0, fd1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, ad1, ad2, ad3);
}
    Thought lo5 = Thought92.getInstance();
if(ao3 != null){
      ad4 = ao3.m3(lb3, fb0, fb1, lb1);
}
    double ld6 = 580.5595155800453;
    Thought lo7 = Thought112.getInstance(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0, lb3, fb0, fb1, lb1);
    boolean lb8 = false;

Thought.STACK_COUNTER++;
return ld6;
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
      ab2 = ao2.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    double ld0 = 419.9122526796909;
    Thought lo1 = Thought354.getInstance(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
    ld0 = fd0 - fd1;
if(ao1 != null){
      ld0 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fd0 = fd1 + ld0;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, fd0);
}
    fd1 *= -1;
    boolean lb2 = true;
    ld0 *= -1;
if(ao2 != null){
      ab4 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    Output.points[6][5] += fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, lb2, ab1, ab2);
}
    Output.points[6][6] += ld0;
    ab3 = !ab4;
    fd0 = fd1 - ld0;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1, fb0, fb1, lb2, ab1);
}
    Output.points[6][7] -= ld0;
    boolean lb3 = false;
if(ao3 != null){
      ab1 = ao3.m2(fd0, fd1, ld0, fd0, ab2, ab3, ab4, fb0);
}
    fd1 = ld0 - fd0;
    fb1 = lb2 && lb3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
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
        ad1 *= -1;
    ad2 = ad3 + ad4;
        double ld0 = 922.8841138313903;
    ad4 *= -1;
    fd0 = fd1 - ld0;
    boolean lb1 = true;
if(ao1 != null){
      ao1.m2(ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
if(ao1 != null){
      lb1 = ao1.m2();
}
    boolean lb2 = true;
    lb2 = ad2 > ad3;
        ad4 *= -1;
    ab1 = ab2 && ab3;
    boolean lb3 = true;
    boolean lb4 = true;
    ab2 = !ab3;
    fd0 *= -1;
    ab4 = fb0 && fb1;
    lb1 = lb2 || lb3;
    fd1 = ld0 + ad1;
    Output.points[6][8] -= ad2;
    double ld5 = 42.4911763574477;

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
    double ld0 = 849.6097569083536;
    Thought lo1 = Thought267.getInstance(fb1, fb0, fb1, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
          fo1 = fo0.m4(ld0, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld2 = 596.7905298609118;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m1(ld2, fd0, fd1, ld0);
}
if(fo1 != null){
      ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld2);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb3 = true;
    lb3 = fd0 > fd1;
    ld0 *= -1;

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
    ab2 = ab3 && ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
    fd1 = fd0 + fd1;
    Output.points[7][0] -= fd0;
        double ld0 = 785.2119293035768;
    boolean lb1 = false;
    double ld2 = 899.2178383763628;
    double ld3 = 124.36072297392379;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1, fb1, lb1, ab1, ab2);
}
    ab3 = ab4 && fb0;
    Output.points[7][1] -= ld0;
if(fo0 != null){
      ld2 = fo0.m3(ld3, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
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
    boolean lb0 = false;
    fb0 = ad2 < ad3;
    double ld1 = 409.3949144756588;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
    lb0 = ad4 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd1, ld1, ad1, ad2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
    ld1 = ad1 + ad2;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
}
    double ld2 = 708.5240150657138;
    ld1 *= -1;
    ld2 = ad1 - ad2;
    ad3 *= -1;
    boolean lb3 = false;

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
      ad2 = fo1.m3(ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ad1 *= -1;
    double ld0 = 939.6656873497986;
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    Thought lo1 = Thought17.getInstance(fd1, ld0, ad1, ad2);
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ld0 = ad1 + ad2;
    double ld2 = 69.16645982931112;
    double ld3 = 243.34937254349933;
    Output.points[7][2] -= ad1;
    Thought lo4 = Thought383.getInstance(fb0, fb1, ab1, ab2);
    boolean lb5 = true;
    ad2 = ad3 - ad4;
    boolean lb6 = true;
    ab1 = fd0 > fd1;
    ld0 = ld2 + ld3;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld2, ld3, lb5, lb6, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      lb5 = fo1.m2(fo0, fo1, fo0, fo1);
}
    lb6 = ad1 > ad2;
    ab1 = ad3 > ad4;

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
    Thought lo1 = Thought277.getInstance(fd1, fd0, fd1, fd0);
    fb0 = fd1 > fd0;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld2 = 432.3368338071594;
if(ao1 != null){
      fb1 = ao1.m2();
}
    if (lb0) {
        ld2 = fd0 - fd1;
        fb0 = fb1 || lb0;
if(ao3 != null){
          ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
        fb1 = !lb0;
        fb0 = ld2 < fd0;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld2, fb1, lb0, fb0, fb1);
}
        lb0 = fd0 < fd1;
        boolean lb3 = false;
if(ao3 != null){
          ao3.m3(ld2, fd0, fd1, ld2, lb0, fb0, fb1, lb3);
}
        } else {
        Output.points[7][3] -= fd0;
        fb0 = fd1 > ld2;
        if (fb1) {
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
            boolean lb4 = false;
            lb0 = !fb0;
            fd0 = fd1 + ld2;
            boolean lb5 = true;
}}
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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 - ad1;
    boolean lb1 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    lb0 = lb1 || fb0;
    ad2 = ad3 - ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ad1, ad2);
}
    fb1 = !lb0;
    boolean lb2 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(lb1, lb2, fb0, fb1);
}
    boolean lb3 = true;
    lb0 = lb1 && lb2;
if(fo0 != null){
      ad1 = fo0.m3(fo1, ao1, ao2, ao3, ad2, ad3, ad4, fd0, lb3, fb0, fb1, lb0);
}
    boolean lb4 = true;
    Thought lo5 = Thought145.getInstance(fd1, ad1, ad2, ad3, lb1, lb2, lb3, lb4);
    boolean lb6 = true;
    lb6 = fb0 && fb1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, lb1, lb2, lb3);
}
    lb4 = ad4 > fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd1 = ad1 - ad2;
    ad3 = ad4 + fd0;

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
    fd1 = fd0 + fd1;
    Output.points[7][4] -= fd0;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
    Thought lo0 = Thought382.getInstance();
    boolean lb1 = false;
    ab1 = fd1 > fd0;
if(ao1 != null){
              ao1.m1(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, lb1, ab1, ab2);
}
    ab3 = fd1 < fd0;
    fd1 *= -1;
    Thought lo2 = Thought211.getInstance(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb1);
    ab1 = ab2 && ab3;
    ab4 = fd0 > fd1;

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
    ab2 = ab3 || ab4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ad1 *= -1;
    ab3 = ad2 > ad3;
    boolean lb0 = true;
    double ld1 = 822.6273595225598;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    ad3 *= -1;
    ab3 = ad4 > fd0;
    double ld2 = 152.86253033622785;
    boolean lb3 = false;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld1, ld2);
}
    ab3 = ab4 && fb0;
    double ld4 = 275.23321593893195;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld4, ad1, ad2, ad3);
}
    ad4 = fd0 - fd1;
    fb1 = lb0 && lb3;
    ab1 = ab2 || ab3;
    Output.points[7][5] += ld1;
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
    fb1 = fb0 && fb1;
    fb0 = !fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    Output.points[7][6] -= fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought389.getInstance();

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
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 584.5838670295863;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 + ld0;
if(fo0 != null){
      fo0.m3(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = !fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = false;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(ld0, fd0, fd1, ld0);
}
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0);
}
    lb2 = !fb0;
    boolean lb3 = false;
    fb0 = !fb1;
    lb1 = lb2 || lb3;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[7][7] -= fd1;

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
      fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
    Output.points[7][8] += fd0;
    fb0 = !fb1;
    boolean lb0 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    fd1 *= -1;
    boolean lb2 = false;
    lb1 = !lb2;
    fb0 = fd0 > fd1;
    fb1 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = !lb0;
    fd0 = fd1 - fd0;

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
