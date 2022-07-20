package genetic;
import java.util.ArrayList;
class Thought249 extends Thought{
private static ArrayList<Thought249> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 620.6778802682086;
private double fd1 = 847.1319706265308;
private Thought fo0 = null;
private Thought fo1 = null;
Thought249 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought249 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought249 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought249 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought249 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought249 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought249 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought249 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought249 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought249 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought249 instance = new Thought249 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || fb0;
    Output.points[0][0] -= fd1;
    Output.points[0][1] -= fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
    fb1 = fd0 < fd1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    double ld0 = 86.59543977032445;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo1 = Thought98.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
    fb1 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ld0, fd0, fd1, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        ld0 = fd0 + fd1;
        Thought lo2 = Thought135.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = ld0 < fd0;
        boolean lb3 = false;
        fb0 = fb1 || lb3;
        double ld4 = 733.3068674999762;
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      ab2 = fo1.m2();
}
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          ab3 = fo0.m2(ab4, fb0, fb1, ab1);
}
        boolean lb0 = true;
        ab1 = fd1 < fd0;
        fd1 = fd0 + fd1;
        ab2 = fd0 < fd1;
        fd0 = fd1 - fd0;
if(fo1 != null){
          ab3 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
        boolean lb1 = true;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, ab1, ab2, ab3);
}
if(fo0 != null){
          fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
}
        lb1 = ab1 || ab2;
if(fo0 != null){
          ab3 = fo0.m2(fd1, fd0, fd1, fd0);
}
        Output.points[0][2] += fd1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fo0 = fo1.m4();
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
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought253.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    boolean lb1 = true;
    ad4 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    fd0 *= -1;
    fb0 = fd1 > ad1;
    boolean lb2 = false;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fb0 = fd1 < ad1;
    boolean lb3 = false;

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
    ab2 = ab3 || ab4;
    ad2 = ad3 + ad4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    fb1 = ad4 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    ad1 *= -1;
    ab1 = ad2 > ad3;
    Thought lo0 = Thought111.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    double ld2 = 449.19358822409913;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, ab1);
}
    ab2 = ab3 && ab4;
    ld2 *= -1;
    boolean lb3 = false;
    Thought lo4 = Thought252.getInstance(ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb1);
    lb3 = fd0 > fd1;

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
    Thought lo0 = Thought176.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    fd0 *= -1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Output.points[0][3] += fd0;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought290.getInstance(fd1, fd0, fd1, fd0);
    Output.points[0][4] -= fd1;
    boolean lb2 = true;
    fb0 = fd0 < fd1;

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
    ad1 = ad2 + ad3;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Thought lo0 = Thought251.getInstance();
    double ld1 = 95.69022734561426;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought30.getInstance(fd0, fd1, ld1, ad1, fb0, fb1, fb0, fb1);
    boolean lb3 = true;
    Thought lo4 = Thought396.getInstance(ao3, ao4, fo0, fo1, lb3, fb0, fb1, lb3);
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[0][5] -= ad2;
    fb0 = !fb1;
    for(int i0=0; i0<10; i0++){
        boolean lb5 = false;
        double ld6 = 400.83160529732805;
        ad2 = ad3 + ad4;
        lb5 = fd0 > fd1;
        double ld7 = 624.2890938951102;
if(ao2 != null){
          ao1 = ao2.m4(ld6, ld7, ld1, ad1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
}
        fd1 = ld6 + ld7;
if(ao3 != null){
          ld1 = ao3.m3();
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    Thought lo1 = Thought159.getInstance(ab1, ab2, ab3, ab4);
    fb0 = !fb1;
    lb0 = fd1 < fd0;
    double ld2 = 573.776676742773;
        fd0 = fd1 - ld2;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, fd0, ab1, ab2, ab3, ab4);
}
    Thought lo3 = Thought125.getInstance(fd1, ld2, fd0, fd1, fb0, fb1, lb0, ab1);
    boolean lb4 = true;
    boolean lb5 = false;
    ld2 = fd0 - fd1;
if(ao2 != null){
      lb5 = ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld6 = 512.9548366466931;
    ld2 = ld6 - fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ld2 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ld6, fd0, fd1, ld2);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld6, fd0, fd1, ld2);
}
    boolean lb7 = true;
    ld6 = fd0 - fd1;

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
    ab2 = ab3 && ab4;
    double ld0 = 465.7663135073144;
    ld0 = ad1 - ad2;
    fb0 = fb1 || ab1;
    boolean lb1 = true;
if(ao2 != null){
      ao2.m3();
}
    ab1 = ab2 || ab3;
if(ao4 != null){
          ao3 = ao4.m4(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
    ld0 *= -1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && lb1;
    ab1 = !ab2;

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
    fd1 = fd0 - fd1;
    fb1 = fd0 > fd1;
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    boolean lb0 = true;
    Thought lo1 = Thought79.getInstance(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
    Thought lo2 = Thought374.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    Thought lo3 = Thought61.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
        fd1 = fd0 - fd1;
    boolean lb4 = false;
    boolean lb5 = true;
    Output.points[0][6] += fd0;
    lb5 = fb0 && fb1;
    Output.points[0][7] -= fd1;
    lb0 = fd0 < fd1;
    double ld6 = 506.015227355161;
    lb4 = lb5 || fb0;
    double ld7 = 162.86495283437208;
if(fo1 != null){
      ld6 = fo1.m3(fb1, lb0, lb4, lb5);
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 + fd1;
    ab1 = !ab2;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo0 = Thought326.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, ab1, ab2);
}
    double ld1 = 607.5564792826109;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 < fd1;
    ld1 = fd0 + fd1;
if(fo1 != null){
      fo1.m2(ld1, fd0, fd1, ld1);
}
    boolean lb2 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
if(fo0 != null){
          fo1 = fo0.m4();
}
        Thought lo4 = Thought33.getInstance(lb3, lb2, ab1, ab2);
        fd1 = ld1 + fd0;
        ab3 = ab4 || fb0;
        for(int i1=0; i1<10; i1++){
            fb1 = lb3 && lb2;
if(fo1 != null){
              ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1, ab2, ab3, ab4, fb0);
}
            ld1 = fd0 + fd1;
if(fo1 != null){
              fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb1, lb3, lb2, ab1);
}
            Thought lo5 = Thought215.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
            double ld6 = 577.8502963063825;
            double ld7 = 539.5416082697692;
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        ad2 = ad3 - ad4;
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2);
}
    for(int i0=0; i0<10; i0++){
        ad3 *= -1;
        fb0 = ad4 < fd0;
        fd1 = ad1 - ad2;
        ad3 = ad4 + fd0;
        if (fb1) {
if(fo1 != null){
              fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
              ad4 = fo0.m3();
}
if(fo1 != null){
              fb1 = fo1.m2(fb0, fb1, fb0, fb1);
}
            fd0 *= -1;
            } else if (fb0) {
if(fo0 != null){
              fo0.m1(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
            ad4 = fd0 + fd1;
            boolean lb0 = false;
            fb0 = ad1 < ad2;
if(fo0 != null){
              fo1 = fo0.m4(ad3, ad4, fd0, fd1, fb1, lb0, fb0, fb1);
}
            double ld1 = 65.88859275425122;
            lb0 = fb0 && fb1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
              ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
            Output.points[0][8] -= ad1;
if(fo1 != null){
              fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
              fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2);
}
            double ld2 = 50.9986001218861;
            boolean lb3 = true;
}}
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
    boolean lb0 = false;
        fd0 = fd1 + ad1;
    ad2 *= -1;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab3 = !ab4;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, lb1, ab1, ab2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, ab3, ab4, fb0, fb1);
}
    lb0 = lb1 || ab1;
        boolean lb2 = true;
    double ld3 = 549.6147174083101;
    boolean lb4 = true;
    lb4 = ad1 < ad2;
    ad3 = ad4 + fd0;
    double ld5 = 480.18986226629585;
    ab1 = fd0 > fd1;
if(fo0 != null){
      ld3 = fo0.m3(ld5, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
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
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0);
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 < fd0;
if(ao1 != null){
          fd1 = ao1.m3();
}
        fd0 *= -1;
        boolean lb0 = true;
        double ld1 = 434.25406642808264;
        lb0 = !fb0;
        fd0 = fd1 + ld1;
        fd0 = fd1 - ld1;
if(ao3 != null){
          ao2 = ao3.m4(fb1, lb0, fb0, fb1);
}
        }
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    ad1 *= -1;
if(ao1 != null){
      fb1 = ao1.m2(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < ad1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 || fb1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    fd1 = ad1 - ad2;
    fb0 = fb1 && fb0;
if(ao4 != null){
      fb1 = ao4.m2(fb0, fb1, fb0, fb1);
}
    double ld0 = 242.12833368618487;
    fb0 = !fb1;
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought213.getInstance(ld0, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    Thought lo2 = Thought202.getInstance(ao4, fo0, fo1, ao1);
    fb0 = !fb1;
    double ld3 = 90.80408766233143;
    fb0 = ad3 < ad4;
    fb1 = fb0 && fb1;

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
    boolean lb0 = true;
    fd0 *= -1;
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
    Output.points[1][0] += fd1;
    ab3 = !ab4;
    fb0 = !fb1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    boolean lb1 = false;
    boolean lb2 = false;
    fd1 = fd0 - fd1;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(lb0, lb1, lb2, ab1);
}
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, fd0, fd1, fb1, lb0, lb1, lb2);
}
if(ao3 != null){
          fd0 = ao3.m3(ao4, fo0, fo1, ao1, ab1, ab2, ab3, ab4);
}
        boolean lb3 = true;
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
        fb0 = fb1 && lb3;
        if (lb0) {
            lb1 = lb2 && ab1;
if(ao2 != null){
              ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
            boolean lb4 = true;
            fd1 = fd0 + fd1;
            boolean lb5 = true;
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
            double ld6 = 273.046740762956;
}}
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
      ao2.m2();
}
    ad1 = ad2 - ad3;
if(ao3 != null){
      ad4 = ao3.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb0, fb1, ab1, ab2);
}
        ad3 = ad4 + fd0;
    fd1 *= -1;
    boolean lb0 = true;
if(fo0 != null){
      ao4 = fo0.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought329.getInstance(fo1, ao1, ao2, ao3, fb1, lb0, ab1, ab2);
    fd0 = fd1 - ad1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      ab3 = ao4.m2(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, fd1, ad1, ad2, ad3);
}
    lb0 = ad4 > fd0;
    ab1 = fd1 > ad1;

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
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    lb0 = !fb0;
    Thought lo1 = Thought388.getInstance(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
    Thought lo2 = Thought206.getInstance(fd1, fd0, fd1, fd0);
    Thought lo3 = Thought116.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo0 != null){
      fo0.m3();
}
    fd1 *= -1;
    if (lb0) {
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
    ab2 = fd1 < fd0;
    ab3 = fd1 < fd0;
    fd1 *= -1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    ab3 = !ab4;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
          fd0 = fo0.m3(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ad1 = ad2 + ad3;
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 < fd0;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        fb1 = fd1 > ad1;
        fb0 = !fb1;
        ad2 = ad3 + ad4;
        Thought lo0 = Thought272.getInstance(fd0, fd1, ad1, ad2);
        fb0 = ad3 > ad4;
        fb1 = fd0 > fd1;
        boolean lb1 = false;
        lb1 = !fb0;
        Thought lo2 = Thought135.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
        boolean lb3 = true;
        fb0 = !fb1;
        lb1 = fd0 > fd1;
if(fo0 != null){
          fo0.m3();
}
        ad1 *= -1;
if(fo1 != null){
          fo1.m2(lb3, fb0, fb1, lb1);
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad1 = ad2 - ad3;
    double ld0 = 359.60030251237833;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo1 = Thought62.getInstance(ld0, ad1, ad2, ad3, fb1, ab1, ab2, ab3);
    double ld2 = 594.4297226175547;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ab4, fb0, fb1, ab1);
}
    Output.points[1][1] += ad3;
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ab2 = fd0 > fd1;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo0.m2(ld0, ld2, ad1, ad2);
}
if(fo1 != null){
      ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo0 != null){
      ld2 = fo0.m3();
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m2(ab1, ab2, ab3, ab4);
}
    boolean lb3 = false;
    Thought lo4 = Thought154.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb3);
    ab1 = ld0 > ld2;
    ad1 = ad2 + ad3;
    boolean lb5 = false;

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
if(ao1 != null){
      fb0 = ao1.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    boolean lb0 = true;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    lb0 = fd0 < fd1;
        boolean lb2 = true;
    lb1 = !lb2;
    fb0 = fd0 < fd1;
    double ld3 = 952.9988505302917;
    double ld4 = 139.30898152852902;
if(ao1 != null){
      ld3 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld4 = fo1.m3(fd0, fd1, ld3, ld4);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, ld3, ld4);
}
    Thought lo5 = Thought162.getInstance();

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
    fb0 = ad2 > ad3;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    for(int i0=0; i0<10; i0++){
        Output.points[1][2] -= fd0;
        fb1 = fd1 > ad1;
        Thought lo0 = Thought287.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
        fd1 = ad1 + ad2;
        boolean lb1 = false;
if(ao2 != null){
          ao1 = ao2.m4(ad3, ad4, fd0, fd1, lb1, fb0, fb1, lb1);
}
        ad1 = ad2 + ad3;
        boolean lb2 = false;
        lb2 = !fb0;
        boolean lb3 = false;
        Output.points[1][3] -= ad4;
if(ao3 != null){
          fb0 = ao3.m2(ao4, fo0, fo1, ao1, fb1, lb1, lb2, lb3);
}
        fb0 = fb1 && lb1;
        fd0 *= -1;
        Thought lo4 = Thought247.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
          fo1 = ao1.m4(fd1, ad1, ad2, ad3);
}
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
if(ao2 != null){
          ad2 = ao2.m3();
}
if(ao3 != null){
          ad3 = ao3.m3(lb2, lb3, fb0, fb1);
}
        lb1 = ad4 < fd0;
        lb2 = lb3 && fb0;
        fb1 = !lb1;
        lb2 = lb3 || fb0;
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
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab4, fb0, fb1, lb0);
}
    fd1 = fd0 + fd1;
    ab1 = fd0 > fd1;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1);
}
    ab2 = !ab3;
        Output.points[1][4] += fd0;
if(ao1 != null){
      fd1 = ao1.m3(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    ab4 = !fb0;
if(ao2 != null){
      ao2.m2();
}
if(ao3 != null){
      ao3.m3(fb1, lb0, ab1, ab2);
}
    ab3 = fd1 > fd0;
    ab4 = fb0 && fb1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
if(ao3 != null){
      ab4 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    Thought lo1 = Thought271.getInstance(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1);
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
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
    Output.points[1][5] += fd0;
    fd1 *= -1;
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
    boolean lb0 = false;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      ao1.m1();
}
    boolean lb1 = false;
    fd1 *= -1;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Output.points[1][6] += fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 892.4242770087841;
    fb1 = fd0 < fd1;
    ld0 = fd0 - fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 > fd0;
    Output.points[1][7] += fd1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, fd0);
}
    fb1 = fd1 > ld0;
    double ld1 = 448.9299059632336;
    ld1 = fd0 + fd1;
    fb0 = !fb1;
if(fo1 != null){
      ld0 = fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    Thought lo2 = Thought388.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    Output.points[1][8] += ld1;
    double ld3 = 778.0891613209997;
    boolean lb4 = true;
if(fo1 != null){
      fo0 = fo1.m4(ld3, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
}
    Output.points[2][0] -= ld1;

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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
    lb0 = fd1 < fd0;
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3();
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb0, ab1, ab2);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    for(int i0=0; i0<10; i0++){
        double ld1 = 342.58070875954326;
        lb0 = ab1 || ab2;
        ld1 *= -1;
        double ld2 = 395.4414179570271;
        ld2 *= -1;
        fd0 = fd1 - ld1;
        ab3 = ld2 < fd0;
        double ld3 = 854.410622956683;
        Thought lo4 = Thought340.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld1, ld2, ab4, fb0, fb1, lb0);
        boolean lb5 = false;
        Thought lo6 = Thought158.getInstance(ld3, fd0, fd1, ld1, lb0, ab1, ab2, ab3);
        Output.points[2][1] -= ld2;
if(fo0 != null){
          ld3 = fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb5);
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
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Output.points[2][2] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 - ad1;
    fb0 = ad2 > ad3;
    boolean lb0 = true;
    fb0 = fb1 && lb0;
    Thought lo1 = Thought226.getInstance(fb0, fb1, lb0, fb0);
    ad4 = fd0 + fd1;
    boolean lb2 = false;
    if (fb0) {
        fb1 = lb0 || lb2;
        Output.points[2][3] += ad1;
        fb0 = fb1 || lb0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
          fo1.m3(fd1, ad1, ad2, ad3, lb2, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb0);
}
        lb2 = fb0 && fb1;
        boolean lb3 = true;
        double ld4 = 570.2031962427371;
        lb3 = ad3 < ad4;
        fd0 = fd1 + ld4;
        boolean lb5 = true;
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
    ad2 = ad3 - ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab2 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
    Output.points[2][4] -= fd0;
    Thought lo0 = Thought358.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
    ad4 = fd0 + fd1;
    ab3 = ab4 || fb0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ad1 > ad2;
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    ab2 = ab3 || ab4;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought221.getInstance(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Output.points[2][5] -= ad1;
    double ld2 = 505.42625062653553;
    fb0 = ad1 > ad2;
    fb1 = ad3 > ad4;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 *= -1;

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
    Thought lo0 = Thought171.getInstance(fd0, fd1, fd0, fd1);
    fd0 *= -1;
    Output.points[2][6] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    double ld1 = 773.763615006637;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb2 = true;
    boolean lb3 = false;
    double ld4 = 472.17115836968514;
if(ao3 != null){
      lb2 = ao3.m2(lb3, fb0, fb1, lb2);
}
    lb3 = ld1 < ld4;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, ld1, ld4, fb0, fb1, lb2, lb3);
}
if(ao3 != null){
      ao3.m1(fd0, fd1, ld1, ld4, fb0, fb1, lb2, lb3);
}
    fb0 = fd0 > fd1;
    boolean lb5 = false;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb2, lb3);
}
    lb5 = fb0 && fb1;
    for(int i0=0; i0<10; i0++){
        lb2 = lb3 || lb5;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        boolean lb6 = false;
if(ao3 != null){
          lb5 = ao3.m2(ld4, fd0, fd1, ld1);
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ad2 = ao1.m3(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1);
}
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    boolean lb0 = false;
    fd0 = fd1 - ad1;
    boolean lb1 = false;
    double ld2 = 736.0953703054661;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m2();
}
        lb0 = ad1 < ad2;
        lb1 = fb0 || fb1;
if(ao2 != null){
          ao1 = ao2.m4(lb0, lb1, fb0, fb1);
}
        lb0 = ad3 < ad4;
        lb1 = !fb0;
        Thought lo3 = Thought15.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ld2, ad1, fb1, lb0, lb1, fb0);
if(ao1 != null){
          ad2 = ao1.m3(ad3, ad4, fd0, fd1, fb1, lb0, lb1, fb0);
}
        ld2 = ad1 + ad2;
        fb1 = lb0 && lb1;
        Output.points[2][7] += ad3;
        fb0 = ad4 < fd0;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, lb0, lb1, fb0);
}
        fb1 = lb0 && lb1;
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        double ld0 = 393.6922657210545;
        boolean lb1 = false;
        boolean lb2 = true;
        lb1 = !lb2;
        ab1 = ab2 || ab3;
        double ld3 = 378.36174789696423;
if(ao2 != null){
          ao1 = ao2.m4(ld0, ld3, fd0, fd1);
}
        double ld4 = 522.1356544050941;
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
    ad1 *= -1;
    Thought lo0 = Thought90.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    ab2 = !ab3;
    Output.points[2][8] += fd1;
    ab4 = fb0 || fb1;
    Output.points[3][0] -= ad1;
    Output.points[3][1] += ad2;
    ad3 *= -1;
    Output.points[3][2] -= ad4;
    fd0 *= -1;
    ab1 = fd1 > ad1;
    ab2 = !ab3;
    ad2 *= -1;
    Thought lo1 = Thought155.getInstance();
    ad3 *= -1;
if(ao1 != null){
      fo1 = ao1.m4(ab4, fb0, fb1, ab1);
}
    ab2 = !ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    Output.points[3][3] += fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, ab1, ab2, ab3);
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
    fd0 *= -1;
    fd1 *= -1;
    Output.points[3][4] += fd0;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
    fb0 = fd1 < fd0;
    fb1 = lb0 || fb0;
    Thought lo1 = Thought35.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        lb0 = fb0 && fb1;
    Output.points[3][5] -= fd1;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo2 = Thought166.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);

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
      fo1.m3();
}
    fb1 = fb0 || fb1;
    fb0 = !fb1;
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Thought lo0 = Thought205.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
    Output.points[3][6] += fd0;
if(fo0 != null){
      lb1 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
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
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Output.points[3][7] -= fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo0.m1();
}
    fd0 = fd1 + fd0;
    fb0 = fb1 || fb0;
    Thought lo0 = Thought34.getInstance(fb1, fb0, fb1, fb0);

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
