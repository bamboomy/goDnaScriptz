package genetic;
import java.util.ArrayList;
class Thought225 extends Thought{
private static ArrayList<Thought225> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 256.2138334636411;
private double fd1 = 491.3624483764484;
private Thought fo0 = null;
private Thought fo1 = null;
Thought225 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought225 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought225 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought225 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought225 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought225 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought225 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought225 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought225 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought225 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought225 instance = new Thought225 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = true;
    fd0 *= -1;
    Output.points[8][3] += fd1;
    lb0 = fd0 > fd1;
    Thought lo1 = Thought370.getInstance(fd0, fd1, fd0, fd1);
    Output.points[8][4] += fd0;
    fb0 = fb1 && lb0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    Output.points[8][5] += fd0;
    fb0 = fb1 || lb0;
    fb0 = fb1 || lb0;
    fb0 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
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
    ab1 = ab2 && ab3;
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
        Thought lo0 = Thought199.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
        fd0 = fd1 - fd0;
        }
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[8][6] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought238.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    ab1 = !ab2;
    Thought lo2 = Thought125.getInstance();

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
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ad1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
}
    Output.points[8][7] -= ad4;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    double ld0 = 247.83857877132138;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fb1 || fb0;
if(fo0 != null){
      fb1 = fo0.m2(ad4, fd0, fd1, ld0);
}
    Output.points[8][8] -= ad1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = fb1 || fb0;
    double ld1 = 35.98768430258162;
if(fo1 != null){
      fo0 = fo1.m4();
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
    Thought lo0 = Thought264.getInstance(ab2, ab3, ab4, fb0);
    boolean lb1 = true;
    fb0 = ad1 < ad2;
    boolean lb2 = false;
    Thought lo3 = Thought227.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    boolean lb4 = false;
    ab4 = fd0 < fd1;
    fb0 = fb1 && lb1;
    double ld5 = 923.1312441366758;
    lb2 = !lb4;
    ab1 = ld5 < ad1;

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
    Thought lo0 = Thought70.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    Thought lo1 = Thought321.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    double ld3 = 764.2092434318209;
if(fo0 != null){
      ld3 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, ld3, fd0);
}
    boolean lb4 = false;
    lb2 = lb4 || fb0;
if(ao4 != null){
      fd1 = ao4.m3();
}
    boolean lb5 = false;
    for(int i0=0; i0<10; i0++){
        ld3 *= -1;
        Output.points[0][0] += fd0;
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, lb2, lb4);
}
        fd1 = ld3 + fd0;
        boolean lb6 = false;
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
    ad1 = ad2 + ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
    fb0 = ad3 > ad4;
    double ld0 = 648.9510684328411;
    ad4 = fd0 - fd1;
    double ld1 = 61.70226836013116;
    double ld2 = 924.4750734057446;
    double ld3 = 8.576385362977442;
    boolean lb4 = false;
    Thought lo5 = Thought206.getInstance(ld0, ld1, ld2, ld3, fb0, fb1, lb4, fb0);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, lb4, fb0, fb1);
}
if(fo1 != null){
      lb4 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(ad1, ad2, ad3, ad4);
}
    fd0 *= -1;
    fb0 = fb1 && lb4;
    Output.points[0][1] += fd1;
    Output.points[0][2] += ld0;

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
    for(int i0=0; i0<10; i0++){
        ab2 = ab3 && ab4;
        }
    Thought lo0 = Thought86.getInstance(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
    Output.points[0][3] += fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fd1 = fo1.m3();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
if(ao3 != null){
      fd0 = ao3.m3(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
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
      ao2.m1(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    double ld0 = 337.63388320446774;
    ad1 = ad2 + ad3;
    boolean lb1 = true;
    ad4 = fd0 - fd1;
    boolean lb2 = true;
    boolean lb3 = false;
    ab2 = ld0 < ad1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    Output.points[0][4] += ad3;
if(fo0 != null){
      ao4 = fo0.m4(ab3, ab4, fb0, fb1);
}
    Thought lo4 = Thought157.getInstance(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, lb1, lb2, lb3, ab1);
    ab2 = ad1 < ad2;
if(ao4 != null){
      ao4.m2(ad3, ad4, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo5 = Thought100.getInstance(fo0, fo1, ao1, ao2, lb1, lb2, lb3, ab1);
    ab2 = ld0 > ad1;
    Thought lo6 = Thought270.getInstance(ao3, ao4, fo0, fo1);
    Output.points[0][5] -= ad2;
    ab3 = ab4 && fb0;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          ao1.m2(ad3, ad4, fd0, fd1);
}
        fb1 = lb1 && lb2;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
    fb1 = !fb0;
    fd0 = fd1 - fd0;
    Thought lo0 = Thought69.getInstance();
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    Output.points[0][6] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Output.points[0][7] -= fd0;
    Output.points[0][8] += fd1;
    double ld1 = 673.6349474235274;
if(fo1 != null){
      fo0 = fo1.m4(ld1, fd0, fd1, ld1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought261.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld3 = 13.880432400704429;
if(fo0 != null){
      fo1 = fo0.m4(ld3, fd0, fd1, ld1);
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
        Thought lo0 = Thought319.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
    double ld1 = 918.6011181146819;
    ab1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab2 = ld1 < fd0;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    boolean lb2 = false;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, lb2, ab1);
}
if(fo1 != null){
          ld1 = fo1.m3(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
}
        Thought lo3 = Thought132.getInstance(fo0, fo1, fo0, fo1, fb1, lb2, ab1, ab2);
        fd1 = ld1 - fd0;
        double ld4 = 359.52516555677875;
        ab3 = !ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        fb0 = !fb1;
        lb2 = fd0 < fd1;
        Thought lo5 = Thought62.getInstance(ld4, ld1, fd0, fd1);
        boolean lb6 = true;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ld4 = fo0.m3(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld4);
}
            lb2 = ld1 > fd0;
}}
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
if(fo1 != null){
      fb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    if (fb1) {
        Thought lo0 = Thought60.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
        ad3 = ad4 + fd0;
        if (fb0) {
            boolean lb1 = true;
            boolean lb2 = false;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            lb2 = !fb0;
            fb1 = lb1 || lb2;
if(fo0 != null){
              fo1 = fo0.m4(fd1, ad1, ad2, ad3);
}
            Thought lo3 = Thought64.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}}
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 < ad3;
    ab3 = ad4 < fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
        lb0 = ad1 > ad2;
    Thought lo1 = Thought116.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
    fb0 = ad1 > ad2;
    fb1 = lb0 && ab1;
    ad3 = ad4 + fd0;
    boolean lb2 = true;
    double ld3 = 920.4210715042178;
    ab1 = fd0 < fd1;
if(fo1 != null){
      ab2 = fo1.m2(ld3, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    lb0 = ad4 > fd0;
    Thought lo4 = Thought199.getInstance(fo0, fo1, fo0, fo1, lb2, ab1, ab2, ab3);

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    double ld1 = 835.416379702513;
    fb0 = fb1 || lb0;
    Thought lo2 = Thought372.getInstance();
    fb0 = fb1 || lb0;
if(ao2 != null){
      ld1 = ao2.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    double ld3 = 507.95751155495617;
    lb0 = ld1 > ld3;
    fd0 *= -1;

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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = ad1 + ad2;
    double ld0 = 551.3269556088427;
    ad2 = ad3 + ad4;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ad1, fb0, fb1, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        ad2 *= -1;
        boolean lb1 = true;
if(ao3 != null){
          lb1 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb1, fb0);
}
        boolean lb2 = true;
if(ao2 != null){
          ad3 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao1 != null){
          ao1.m3(ad4, fd0, fd1, ld0);
}
        ad1 = ad2 + ad3;
        ad4 *= -1;
if(ao2 != null){
          fb0 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
        fb1 = !lb1;
if(ao1 != null){
          ao1.m2();
}
        Thought lo3 = Thought79.getInstance(lb2, fb0, fb1, lb1);
        lb2 = ad2 > ad3;
        double ld4 = 489.37918056579497;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, lb1, lb2);
}
if(ao2 != null){
          fb0 = ao2.m2(ld4, ld0, ad1, ad2, fb1, lb1, lb2, fb0);
}
        }
        Output.points[1][0] -= ad4;
    fd0 = fd1 + ld0;

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
    Thought lo0 = Thought95.getInstance(ao1, ao2, ao3, ao4, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    ab2 = fd1 < fd0;
    boolean lb1 = true;
    Thought lo2 = Thought322.getInstance(fo0, fo1, ao1, ao2);
    ab2 = ab3 || ab4;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0);
}
    fb0 = fd1 > fd0;
    fb1 = !lb1;
    boolean lb3 = false;
    lb3 = fd1 < fd0;
    ab1 = fd1 < fd0;
    ab2 = fd1 > fd0;
    if (ab3) {
if(ao4 != null){
          ab4 = ao4.m2();
}
        fb0 = !fb1;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      ao1.m1(ab2, ab3, ab4, fb0);
}
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao1 != null){
      ao1.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ad4 < fd0;
    ab3 = fd1 < ad1;
    double ld0 = 452.7852428592818;
    boolean lb1 = false;
    Thought lo2 = Thought74.getInstance(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
    boolean lb3 = true;
    ad1 = ad2 + ad3;
    double ld4 = 954.3564566692179;
    lb1 = !lb3;
    Output.points[1][1] -= ad3;
    Output.points[1][2] -= ad4;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    Thought lo5 = Thought231.getInstance(fd0, fd1, ld0, ld4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fo1 = ao1.m4();
}
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    fb0 = ld0 > ld4;
    Thought lo6 = Thought242.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, lb1, lb3, ab1);
    ab2 = !ab3;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, ld4, ab4, fb0, fb1, lb1);
}
    ad1 *= -1;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
        boolean lb0 = true;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 + fd0;
    fb1 = !lb0;
    boolean lb1 = true;
    lb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1);
}
    fb1 = lb0 && lb1;
    fb0 = fb1 && lb0;
    Thought lo2 = Thought178.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);

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
    Output.points[1][3] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fd0 = fd1 + fd0;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      ab4 = fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;

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
    Output.points[1][4] += ad2;
    fb0 = ad3 < ad4;
    double ld0 = 633.3272686371699;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        double ld2 = 459.60442641430063;
if(fo0 != null){
          ad4 = fo0.m3(fd0, fd1, ld2, ld0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
          fb0 = fo1.m2();
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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = ad1 > ad2;
if(fo0 != null){
      ab2 = fo0.m2(ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought64.getInstance(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    double ld2 = 621.5850019274784;
    lb1 = ad4 > fd0;
    for(int i0=0; i0<10; i0++){
        ab1 = fd1 < ld2;
        ab2 = ad1 < ad2;
if(fo1 != null){
          ad3 = fo1.m3(fo0, fo1, fo0, fo1);
}
        ad4 = fd0 - fd1;
        double ld3 = 700.0920448988328;
        double ld4 = 216.4259500730086;
if(fo0 != null){
          ab3 = fo0.m2(ld3, ld4, ld2, ad1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        double ld5 = 527.7166196708762;
        boolean lb6 = true;
        ab3 = ab4 || fb0;
        double ld7 = 668.0347955816768;
}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      fd0 = ao2.m3();
}
if(ao3 != null){
      fb0 = ao3.m2(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    double ld0 = 958.9394550222121;
    fb0 = fd0 < fd1;
    Output.points[1][5] -= ld0;
    double ld1 = 35.18239543305557;
    ld1 = fd0 + fd1;
    if (fb1) {
if(fo0 != null){
          ao4 = fo0.m4(ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        ld0 = ld1 + fd0;
        fb0 = fb1 || fb0;
        for(int i0=0; i0<10; i0++){
            for(int i1=0; i1<10; i1++){
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb1, fb0, fb1, fb0);
}
                double ld2 = 670.1855313970983;
                boolean lb3 = true;
if(ao1 != null){
                  fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
}}}
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
    fb1 = fb0 || fb1;
    boolean lb0 = false;
    lb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ad1, ad2, ad3);
}
    double ld1 = 524.6257495345104;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1);
}
    double ld2 = 315.506074628455;
if(fo0 != null){
      ao4 = fo0.m4();
}
    boolean lb3 = true;
    Output.points[1][6] += ld1;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ab1 = fd0 < fd1;
    boolean lb1 = true;
        if (ab1) {
if(ao2 != null){
          ao2.m2(ab2, ab3, ab4, fb0);
}
        double ld2 = 732.4815214496886;
        ld2 = fd0 - fd1;
        ld2 = fd0 + fd1;
        fb1 = !lb0;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld2, lb1, ab1, ab2, ab3);
}
        boolean lb3 = false;
        Output.points[1][7] -= fd0;
        Output.points[1][8] += fd1;
        boolean lb4 = true;
if(ao2 != null){
          ld2 = ao2.m3(fd0, fd1, ld2, fd0, ab2, ab3, ab4, fb0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 + ad4;
    ab2 = fd0 > fd1;
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    if (ab3) {
if(fo1 != null){
          ad2 = fo1.m3(ad3, ad4, fd0, fd1);
}
        ab4 = !fb0;
        ad1 = ad2 - ad3;
if(ao1 != null){
          fb1 = ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ad1);
}
        ab1 = ab2 || ab3;
        boolean lb0 = true;
        Output.points[2][0] += ad2;
        double ld1 = 386.0988804523725;
        ab3 = ab4 && fb0;
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
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fb0 && fb1;
    fd1 = fd0 - fd1;
        Thought lo0 = Thought254.getInstance(fb0, fb1, fb0, fb1);
    fb0 = fd0 < fd1;
    fb1 = fb0 && fb1;
    fd0 *= -1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought291.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fb0 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[2][1] += fd0;
    fd1 *= -1;
    boolean lb2 = false;
    boolean lb3 = false;
    Thought lo4 = Thought273.getInstance();
    Thought lo5 = Thought6.getInstance(lb2, lb3, fb0, fb1);
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    double ld6 = 42.07853641975244;
if(fo0 != null){
      fo1 = fo0.m4(ld6, fd0, fd1, ld6, lb3, fb0, fb1, lb2);
}
    lb3 = fd0 < fd1;
    Thought lo7 = Thought42.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb2, lb3);
    double ld8 = 13.112370232690754;

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
    ab1 = fd0 < fd1;
    double ld0 = 470.7764116187413;
    boolean lb1 = true;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = ld0 > fd0;
    fd1 = ld0 - fd0;
    Output.points[2][2] -= fd1;
    ab2 = ab3 && ab4;
    fb0 = ld0 < fd0;
    fd1 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(ld0, fd0, fd1, ld0);
}
    lb1 = ab1 || ab2;
    fd0 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1);
}
    ab4 = ld0 > fd0;

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
    boolean lb0 = true;
    Thought lo1 = Thought110.getInstance();
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    Thought lo3 = Thought241.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
    Output.points[2][3] += fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, fb0, fb1, lb0, lb2);
}
    ad4 *= -1;
    fb0 = fd0 < fd1;
    fb1 = ad1 > ad2;
    double ld4 = 52.730739938882415;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb0, lb2, fb0, fb1);
}
        lb0 = lb2 && fb0;
    fb1 = ad2 > ad3;
    lb0 = ad4 < fd0;
    double ld5 = 162.90316418183937;
    lb2 = fb0 && fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld4, ld5, ad1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      lb2 = fo0.m2();
}
if(fo1 != null){
      fo1.m1(fb0, fb1, lb0, lb2);
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
    Thought lo0 = Thought276.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fo1.m1(fd1, ad1, ad2, ad3, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    ab2 = ad1 > ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab3, ab4, fb0, fb1);
}
    lb1 = !ab1;
    ab2 = !ab3;
    ab4 = ad3 < ad4;
    fb0 = fb1 || lb1;
    Thought lo2 = Thought161.getInstance(fo1, fo0, fo1, fo0);
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
        double ld3 = 574.5478330268719;
    boolean lb4 = true;
    lb4 = fd0 > fd1;
if(fo1 != null){
      ld3 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo5 = Thought353.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 - ld3;
    ad1 = ad2 - ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3, fb0, fb1, lb1, lb4);
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
      ao2 = ao3.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    double ld0 = 857.6202061663851;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld0, fd0, fd1, ld0);
}
    double ld1 = 459.1207930393688;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ld1, fd0, fd1, ld0);
}
    fb0 = fb1 && fb0;
    fb1 = ld1 > fd0;
if(fo0 != null){
      ao4 = fo0.m4();
}
    fd1 *= -1;
    boolean lb2 = false;
if(ao1 != null){
      fo1 = ao1.m4(lb2, fb0, fb1, lb2);
}
    Output.points[2][4] += ld0;
    boolean lb3 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ld1, fd0, fd1, ld0, lb3, fb0, fb1, lb2);
}
    ld1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ld0, ld1, fd0, fd1, lb3, fb0, fb1, lb2);
}
    lb3 = ld0 > ld1;
    Thought lo4 = Thought66.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb2, lb3);
    if (fb0) {
        fd0 = fd1 - ld0;
        ld1 = fd0 + fd1;
        ld0 *= -1;
if(ao3 != null){
          ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
        for(int i0=0; i0<10; i0++){
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    Output.points[2][5] -= ad4;
    boolean lb1 = true;
if(ao2 != null){
      lb1 = ao2.m2();
}
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, lb1);
}
    fb0 = fb1 || lb0;
    lb1 = fd0 < fd1;
    fb0 = ad1 < ad2;
    fb1 = ad3 < ad4;
    Thought lo2 = Thought373.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb0, lb1, fb0, fb1);
    ad3 = ad4 - fd0;

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
    ab1 = fd1 > fd0;
    Thought lo0 = Thought291.getInstance(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
    fd1 = fd0 + fd1;
    fb1 = ab1 && ab2;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ab3, ab4, fb0, fb1);
}
    boolean lb1 = false;
    Output.points[2][6] -= fd0;
        lb1 = !ab1;
        Thought lo2 = Thought104.getInstance(ao1, ao2, ao3, ao4);
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fd0 *= -1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ab3 = ab4 || fb0;
    double ld0 = 288.4782145698878;
    fb1 = ab1 || ab2;
    ab3 = ad1 > ad2;
    if (ab4) {
        double ld1 = 922.7389527987659;
        if (fb0) {
            fb1 = ab1 && ab2;
if(ao1 != null){
              ao1.m3();
}
            ab3 = ad2 > ad3;
            ab4 = !fb0;
if(ao3 != null){
              ao2 = ao3.m4(fb1, ab1, ab2, ab3);
}
            Output.points[2][7] -= ad4;
            ab4 = fd0 > fd1;
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld0, ad1, ad2, fb0, fb1, ab1, ab2);
}
            ad3 = ad4 + fd0;
            double ld2 = 877.1390049297606;
            fd0 *= -1;
if(fo0 != null){
              ao4 = fo0.m4(fd1, ld2, ld1, ld0, ab3, ab4, fb0, fb1);
}
            ad1 = ad2 - ad3;
            Thought lo3 = Thought240.getInstance(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
            fb0 = ad4 > fd0;
if(fo0 != null){
              ao4 = fo0.m4(fd1, ld2, ld1, ld0);
}
            ad1 = ad2 + ad3;
            ad4 = fd0 + fd1;
}}
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
    fb1 = !fb0;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    lb0 = fb0 || fb1;
    boolean lb1 = false;
    boolean lb2 = false;
    lb0 = lb1 && lb2;
    double ld3 = 537.0909154462925;
    double ld4 = 657.7047271762356;
    Thought lo5 = Thought52.getInstance();
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb0, lb1);
}
    boolean lb6 = false;

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
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 744.3835056488198;
    fb1 = !fb0;
    fb1 = fd0 > fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(fo0 != null){
      ld0 = fo0.m3(fd0, fd1, ld0, fd0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      lb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb1);
}
    Output.points[2][8] -= fd1;

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
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    fb0 = fb1 && lb0;
    Output.points[3][0] += fd0;
        fd1 *= -1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    double ld1 = 639.090893786936;
    boolean lb2 = false;
    lb0 = fd0 < fd1;
    double ld3 = 162.0009169510317;

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
