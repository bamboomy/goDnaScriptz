package genetic;
import java.util.ArrayList;
class Thought254 extends Thought{
private static ArrayList<Thought254> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 168.89153676269697;
private double fd1 = 542.1897618710977;
private Thought fo0 = null;
private Thought fo1 = null;
Thought254 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought254 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought254 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought254 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought254 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought254 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought254 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought254 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought254 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought254 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought254 instance = new Thought254 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought347.getInstance(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[8][5] += fd1;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought264.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought134.getInstance(fo0, fo1, fo0, fo1);
    fb0 = fb1 && fb0;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    Thought lo4 = Thought28.getInstance();
    fb0 = fd1 < fd0;
    Thought lo5 = Thought297.getInstance(fb1, lb3, fb0, fb1);
    Output.points[8][6] -= fd1;
    boolean lb6 = true;

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
    boolean lb0 = false;
    if (lb0) {
        boolean lb1 = true;
        lb0 = ab1 || ab2;
        } else if (ab4) {
        fb0 = fb1 || lb0;
        fd0 = fd1 - fd0;
        boolean lb2 = false;
        fd1 = fd0 + fd1;
        fd0 *= -1;
if(fo1 != null){
          lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          fo0.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb2, lb0);
}
        boolean lb3 = false;
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
    Thought lo0 = Thought308.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fb0 = ad2 < ad3;
    Output.points[8][7] += ad4;
    fb1 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    ad3 *= -1;
    Thought lo1 = Thought236.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ad2 *= -1;
    fb0 = fb1 && fb0;
    ad3 *= -1;
    Thought lo2 = Thought203.getInstance();

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
    double ld0 = 74.0778244055013;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        double ld2 = 387.7180687077063;
if(fo1 != null){
          ld0 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, lb1, ab1);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              fo0.m1(fd0, fd1, ld2, ld0, ab2, ab3, ab4, fb0);
}
            fb1 = !lb1;
            ab1 = !ab2;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = fd0 > fd1;
    Thought lo0 = Thought385.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought63.getInstance(fo1, ao1, ao2, ao3);
if(ao4 != null){
      ao4.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fo0 = fo1.m4();
}
    fb0 = fd1 < fd0;
    fd1 *= -1;
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 > fd1;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
    fb1 = fb0 || fb1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[8][8] -= ad2;
    fb0 = ad3 < ad4;
    if (fb1) {
if(ao1 != null){
          ao1.m1(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
        double ld0 = 928.1297443567928;
if(fo1 != null){
          fo1.m1(ao1, ao2, ao3, ao4);
}
        fb0 = ad4 > fd0;
        fb1 = !fb0;
        boolean lb1 = false;
        Thought lo2 = Thought359.getInstance(fd1, ld0, ad1, ad2);
        boolean lb3 = false;
        lb3 = ad3 > ad4;
        fb0 = fd0 > fd1;
if(fo0 != null){
          ld0 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
        fb1 = !lb1;
        Thought lo4 = Thought218.getInstance();
        lb3 = fb0 || fb1;
        Thought lo5 = Thought121.getInstance(lb1, lb3, fb0, fb1);
        fd0 *= -1;
        fd1 = ld0 - ad1;
if(ao4 != null){
          ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, lb1, lb3, fb0, fb1);
}
if(ao3 != null){
          ao3.m2(ld0, ad1, ad2, ad3, lb1, lb3, fb0, fb1);
}
        lb1 = ad4 < fd0;
if(ao4 != null){
          lb3 = ao4.m2(fo0, fo1, ao1, ao2, fb0, fb1, lb1, lb3);
}
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1);
}
        Thought lo6 = Thought128.getInstance(fd1, ld0, ad1, ad2);
        fb0 = ad3 > ad4;
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, ld0, ad1);
}
        double ld7 = 823.7038524776478;
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
    fd0 = fd1 - fd0;
if(ao1 != null){
      fd1 = ao1.m3();
}
if(ao2 != null){
      fd0 = ao2.m3(ab2, ab3, ab4, fb0);
}
    if (fb1) {
        ab1 = fd1 > fd0;
        double ld0 = 886.1088052791124;
        ab2 = ab3 && ab4;
        fb0 = fd0 > fd1;
        fb1 = ld0 < fd0;
        Output.points[0][0] += fd1;
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
    ad1 *= -1;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, lb0, ab1, ab2, ab3);
}
    fd1 *= -1;
    ab4 = fb0 && fb1;
    lb0 = ab1 || ab2;
    ab3 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(fd1, ad1, ad2, ad3, ab4, fb0, fb1, lb0);
}
if(ao3 != null){
      ab1 = ao3.m2(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    ad4 = fd0 + fd1;
if(ao2 != null){
      ad1 = ao2.m3(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    fb1 = ad3 > ad4;
    for(int i0=0; i0<10; i0++){
        boolean lb1 = false;
        lb1 = lb0 && ab1;
        fd0 = fd1 - ad1;
        double ld2 = 405.62511043478327;
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
        boolean lb3 = true;
        double ld4 = 400.0728171759688;
if(ao3 != null){
          ab1 = ao3.m2();
}
if(ao4 != null){
          ad4 = ao4.m3(ab2, ab3, ab4, fb0);
}
        }
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
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
    fb0 = fb1 || fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = fb1 || lb0;
    Thought lo1 = Thought104.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    boolean lb2 = true;
    lb0 = !lb2;
    boolean lb3 = false;
    Thought lo4 = Thought52.getInstance(fd1, fd0, fd1, fd0);
    lb3 = !fb0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 - fd0;
    lb0 = !lb2;

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
    Thought lo0 = Thought388.getInstance();
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      ab1 = fo1.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 < fd0;
    ab1 = fd1 < fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought267.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 851.2540749016374;
    fb1 = ab1 && ab2;
    ab3 = fd0 > fd1;
    Output.points[0][1] += ld2;
    ab4 = fd0 < fd1;
    ld2 = fd0 + fd1;
    boolean lb3 = false;
    Thought lo4 = Thought208.getInstance(ld2, fd0, fd1, ld2);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld2, fd0);
}
        ab4 = fd1 > ld2;
    fd0 = fd1 + ld2;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, lb3, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld2, fd0, fd1, ab3, ab4, fb0, fb1);
}

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[0][2] += ad1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    Output.points[0][3] += fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = false;
    ad1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ad2 = fo0.m3(ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
    fb1 = !lb0;
    boolean lb1 = false;
    Thought lo2 = Thought137.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
    ad2 *= -1;
    ad3 = ad4 - fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    double ld3 = 489.63921978071494;
    lb1 = !fb0;
if(fo1 != null){
      fo1.m1(fb1, lb0, lb1, fb0);
}
    double ld4 = 26.925159204041982;
    fb1 = !lb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld3, lb1, fb0, fb1, lb0);
}
    ld4 *= -1;
    lb1 = fb0 || fb1;
    ad1 = ad2 + ad3;
    Thought lo5 = Thought100.getInstance(ad4, fd0, fd1, ld3, lb0, lb1, fb0, fb1);
    lb0 = lb1 && fb0;
    Thought lo6 = Thought311.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, fb0);

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
    Thought lo0 = Thought316.getInstance(fo0, fo1, fo0, fo1);
    Output.points[0][4] += ad2;
    double ld1 = 588.5398546816667;
    ad2 = ad3 - ad4;
    double ld2 = 890.8227241775401;
    double ld3 = 602.1130008314115;
    ab1 = !ab2;
if(fo0 != null){
      fo0.m1(ad3, ad4, fd0, fd1);
}
    ab3 = ld1 > ld2;
    ab4 = fb0 && fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld3, ad1, ad2, ad3);
}
    ab1 = !ab2;
        ab3 = ab4 && fb0;
    fb1 = ab1 && ab2;
    Output.points[0][5] += ad4;
    if (ab3) {
        boolean lb4 = false;
if(fo0 != null){
          fo1 = fo0.m4();
}
if(fo1 != null){
          ab3 = fo1.m2(ab4, fb0, fb1, lb4);
}
        fd0 = fd1 - ld1;
        boolean lb5 = false;
if(fo0 != null){
          fo0.m3(fo1, fo0, fo1, fo0, ld2, ld3, ad1, ad2, lb5, ab1, ab2, ab3);
}
        boolean lb6 = true;
        ab3 = ad3 < ad4;
        fd0 = fd1 - ld1;
        ab4 = !fb0;
if(fo0 != null){
          fo1 = fo0.m4(ld2, ld3, ad1, ad2, fb1, lb4, lb5, lb6);
}
        Output.points[0][6] -= ad3;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought217.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo1.m3();
}
    double ld1 = 54.659649669040924;
    fb1 = fd0 < fd1;

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
    boolean lb0 = true;
    Thought lo1 = Thought276.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought356.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = ad3 > ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fb1, lb0, fb0, fb1);
}
    fd1 = ad1 - ad2;
    ad3 *= -1;
    lb0 = ad4 < fd0;
if(fo1 != null){
          fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    fd1 = ad1 - ad2;

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
    ab1 = fd0 > fd1;
    fd0 *= -1;
    ab2 = ab3 || ab4;
    fd1 *= -1;
    fb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    lb0 = ab1 || ab2;
    ab3 = fd1 > fd0;
    Output.points[0][7] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = false;
        ab3 = !ab4;
    Thought lo2 = Thought182.getInstance(fb0, fb1, lb0, lb1);
    ab1 = !ab2;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1);
}
    ab4 = !fb0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m1(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 + ad1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb1 = !ab1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    ab2 = fd1 < ad1;
if(ao3 != null){
      ab3 = ao3.m2(ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
    boolean lb0 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
    double ld2 = 889.6626672626821;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
    fb0 = fd0 < fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought238.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb0 = lb2 && fb0;
    fd1 *= -1;

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
    boolean lb0 = true;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Output.points[0][8] += fd0;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
}
    boolean lb1 = true;
    if (ab3) {
        ab4 = fb0 || fb1;
        double ld2 = 568.3062045442721;
        Output.points[1][0] -= fd0;
        boolean lb3 = true;
        Thought lo4 = Thought160.getInstance(fd1, ld2, fd0, fd1, lb3, lb0, lb1, ab1);
        Thought lo5 = Thought296.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
        boolean lb6 = true;
        if (fb0) {
            ld2 = fd0 + fd1;
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
            Thought lo7 = Thought325.getInstance(ld2, fd0, fd1, ld2);
            fb1 = fd0 > fd1;
if(fo1 != null){
              ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
            Thought lo8 = Thought178.getInstance();
}}
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
    ad2 = ad3 - ad4;
    fb0 = fb1 || fb0;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fd0 *= -1;
    Thought lo0 = Thought324.getInstance(fb1, fb0, fb1, fb0);
    fb1 = fb0 && fb1;
    fb0 = fd1 > ad1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo1 = Thought10.getInstance(fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought239.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
    ad4 = fd0 - fd1;
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb3 = true;
if(fo0 != null){
          fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    ad4 = fd0 - fd1;

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
double m3(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      ad2 = fo1.m3(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 || ab2;
    ab3 = fd0 < fd1;
    ad1 *= -1;
    ab4 = fb0 || fb1;
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    boolean lb1 = true;
    Thought lo2 = Thought375.getInstance(fo0, fo1, fo0, fo1);
    lb0 = !lb1;
    ab1 = !ab2;
    Thought lo3 = Thought287.getInstance(fd0, fd1, ad1, ad2);
    boolean lb4 = false;
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb5 = true;
if(fo1 != null){
      fo1.m3();
}
if(fo0 != null){
      fo0.m3(ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb4);
}
    lb5 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    double ld6 = 347.79387007714524;
    boolean lb7 = false;

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
    Output.points[1][1] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 > fd1;
    fd0 = fd1 + fd0;
    double ld0 = 532.0143426390676;
    Thought lo1 = Thought306.getInstance(fd0, fd1, ld0, fd0);
    fb1 = fd1 > ld0;
    double ld2 = 600.3239428587598;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ld2, fd0, fd1, ld0);
}
if(fo1 != null){
      fo1.m1();
}
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    boolean lb3 = false;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
}
    ad4 *= -1;
    Output.points[1][2] += fd0;
    fb1 = !fb0;
    Output.points[1][3] += fd1;
    boolean lb0 = false;
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      ad2 = fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[1][4] += ad3;
    fb1 = ad4 < fd0;
    double ld1 = 227.19933540332107;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1);
}
    Output.points[1][5] += ad2;
    lb0 = ad3 < ad4;
    fd0 = fd1 - ld1;
    ad1 *= -1;
    Output.points[1][6] -= ad2;
    ad3 *= -1;

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
    fd1 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
    ab3 = fd0 > fd1;
    Output.points[1][7] -= fd0;
    ab4 = fd1 < fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb0 = fb1 || ab1;
    ab2 = fd1 > fd0;
if(ao3 != null){
      fd1 = ao3.m3(ab3, ab4, fb0, fb1);
}
    fd0 = fd1 + fd0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
if(ao4 != null){
      ab4 = ao4.m2(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab2, ab3, ab4, fb0);
}
        fd1 *= -1;
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    if (lb0) {
        boolean lb1 = true;
        } else if (ab1) {
        ab2 = ad1 < ad2;
        ad3 = ad4 + fd0;
if(ao2 != null){
          ao2.m2(fd1, ad1, ad2, ad3);
}
        ab3 = ad4 > fd0;
        Output.points[1][8] += fd1;
if(ao3 != null){
          ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fd0 *= -1;
        Output.points[2][0] += fd1;
        } else if (ab4) {
        fb0 = ad1 > ad2;
        fb1 = lb0 || ab1;
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
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    fb0 = !fb1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = fd1 < fd0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought11.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    double ld2 = 740.1261167696741;
    fb0 = fb1 || lb1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0);
}
    Output.points[2][1] += fd1;
    fb0 = ld2 > fd0;
    fd1 *= -1;
    double ld3 = 846.4338189667703;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, ld2, ld3, fd0, fd1);
}
    lb1 = !fb0;

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
    ab1 = ab2 && ab3;
    boolean lb0 = false;
if(fo1 != null){
      ab3 = fo1.m2();
}
    boolean lb1 = true;
        boolean lb2 = true;
    ab2 = fd0 < fd1;
if(fo0 != null){
      ab3 = fo0.m2(ab4, fb0, fb1, lb0);
}
    lb1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb2, lb3, ab1, ab2);
}
    Output.points[2][2] += fd1;
if(fo1 != null){
      ab3 = fo1.m2(fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, lb1, lb2, lb3, ab1);
}
    fd0 = fd1 - fd0;
    Thought lo4 = Thought188.getInstance(fo1, fo0, fo1, fo0);
    Thought lo5 = Thought188.getInstance(fd1, fd0, fd1, fd0);
    ab2 = !ab3;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab4 = fb0 && fb1;
    lb0 = lb1 || lb2;
    boolean lb6 = false;
    Output.points[2][3] -= fd0;
if(fo1 != null){
      fo0 = fo1.m4();
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
    fb1 = fb0 && fb1;
    fb0 = fb1 || fb0;
    fb1 = ad2 > ad3;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    Thought lo2 = Thought379.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1, lb1, fb0, fb1, lb0);
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, fb0, fb1, lb0);
}
    lb1 = !fb0;
    Output.points[2][4] -= fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
    fb1 = ad1 < ad2;
    Output.points[2][5] -= ad3;
    lb0 = lb1 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
    double ld3 = 89.72989112825175;
    ad3 = ad4 + fd0;
if(fo0 != null){
      fo0.m2(fd1, ld3, ad1, ad2);
}
    ad3 *= -1;
    Thought lo4 = Thought37.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld3);
    lb0 = lb1 || fb0;

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
      fo0 = fo1.m4();
}
    Output.points[2][6] += ad2;
    if (ab2) {
        if (ab3) {
            ab4 = ad3 > ad4;
if(fo1 != null){
              fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
            ab3 = fd0 < fd1;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
            fd0 *= -1;
if(fo1 != null){
              fo0 = fo1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
            fb1 = ad4 < fd0;
            boolean lb0 = false;
            lb0 = ab1 || ab2;
            fd1 *= -1;
            ab3 = ad1 < ad2;
            ad3 = ad4 + fd0;
            Output.points[2][7] -= fd1;
if(fo0 != null){
              fo0.m3(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
}
            Thought lo1 = Thought31.getInstance(fo1, fo0, fo1, fo0);
            } else {
            boolean lb2 = true;
if(fo0 != null){
              fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
            fd0 = fd1 + ad1;
            ab1 = ad2 < ad3;
            boolean lb3 = true;
if(fo1 != null){
              ab1 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
            ab2 = ab3 && ab4;
            fb0 = fb1 || lb2;
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
    boolean lb0 = true;
if(ao2 != null){
      fd1 = ao2.m3();
}
    for(int i0=0; i0<10; i0++){
if(ao3 != null){
          fb0 = ao3.m2(fb1, lb0, fb0, fb1);
}
if(fo0 != null){
          ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
        boolean lb1 = false;
        fd0 = fd1 - fd0;
        Output.points[2][8] -= fd1;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ao4 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb1);
}
            fd0 = fd1 + fd0;
            fd1 = fd0 + fd1;
if(fo1 != null){
              fd0 = fo1.m3(ao1, ao2, ao3, ao4, lb0, fb0, fb1, lb1);
}
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
      ao2.m3(ao3, ao4, fo0, fo1);
}
    fb1 = fb0 && fb1;
    double ld0 = 886.6323215020014;
    for(int i0=0; i0<10; i0++){
        ad1 = ad2 + ad3;
if(ao2 != null){
          ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
        ad1 = ad2 - ad3;
        double ld1 = 332.88298397854146;
        fb0 = ad3 > ad4;
        fb1 = !fb0;
        fb1 = !fb0;
if(ao3 != null){
          ao3.m1(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ld0);
}
if(ao2 != null){
          ao2.m3();
}
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    double ld0 = 886.0543556145587;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    boolean lb1 = true;
    fb0 = fb1 && lb1;
    double ld2 = 422.5079300006801;
    ld2 = fd0 + fd1;
    ld0 *= -1;
    Thought lo3 = Thought55.getInstance(ao4, fo0, fo1, ao1, ld2, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
if(ao2 != null){
      fb0 = ao2.m2(ld2, fd0, fd1, ld0, fb1, lb1, ab1, ab2);
}
    double ld4 = 975.9073603946439;
if(ao3 != null){
      ld2 = ao3.m3(ao4, fo0, fo1, ao1, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          lb1 = ao2.m2(ao3, ao4, fo0, fo1);
}
        Output.points[3][0] -= ld4;
        boolean lb5 = true;
if(ao2 != null){
          ao1 = ao2.m4(fd0, fd1, ld0, ld2);
}
        double ld6 = 656.919059517405;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ab2 = ao2.m2();
}
    fd0 = fd1 + ad1;
    boolean lb0 = false;
    ab2 = !ab3;
if(ao3 != null){
      ao3.m1(ab4, fb0, fb1, lb0);
}
    ad2 = ad3 - ad4;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
if(ao4 != null){
      ab4 = ao4.m2(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ad1, ad2, ab2, ab3, ab4, fb0);
}
    fb1 = ad3 < ad4;
    fd0 = fd1 - ad1;
    lb0 = ab1 && ab2;
    ad2 = ad3 - ad4;
    if (ab3) {
if(fo0 != null){
          fd0 = fo0.m3(fo1, ao1, ao2, ao3, ab4, fb0, fb1, lb0);
}
        ab1 = ab2 || ab3;
if(ao4 != null){
          fd1 = ao4.m3(fo0, fo1, ao1, ao2);
}
        boolean lb1 = false;
        double ld2 = 130.79023330180954;
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
    double ld0 = 661.7524033755169;
    fb0 = !fb1;
if(fo1 != null){
      ld0 = fo1.m3(fd0, fd1, ld0, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    boolean lb1 = false;
        fd0 = fd1 - ld0;
    lb1 = fd0 > fd1;
    double ld2 = 155.55350875787997;
    fb0 = ld0 < ld2;
if(fo1 != null){
      fo1.m2(fb1, lb1, fb0, fb1);
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
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    double ld1 = 600.5421830967857;
    fd0 *= -1;
    boolean lb2 = true;
    fb0 = fd1 > ld1;
    fb1 = fd0 < fd1;
    boolean lb3 = true;
    Thought lo4 = Thought157.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought103.getInstance(ld1, fd0, fd1, ld1);
    double ld6 = 698.4742412121474;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld6, fd0, fd1, ld1);
}
    ld6 *= -1;
    Output.points[3][1] -= fd0;
if(fo1 != null){
          lb0 = fo1.m2();
}
    lb2 = !lb3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb0, lb2);
}
if(fo0 != null){
          lb3 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ld6, fd0, fb0, fb1, lb0, lb2);
}
    fd1 *= -1;

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
    Thought lo1 = Thought225.getInstance(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
    Thought lo2 = Thought350.getInstance(fo1, fo0, fo1, fo0);
    fb1 = lb0 || fb0;
    fd1 = fd0 - fd1;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3();
}
if(fo0 != null){
      fd0 = fo0.m3(fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
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
