package genetic;
import java.util.ArrayList;
class Thought87 extends Thought{
private static ArrayList<Thought87> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 60.93913091297175;
private double fd1 = 665.5149314377086;
private Thought fo0 = null;
private Thought fo1 = null;
Thought87 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought87 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought87 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought87 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought87 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought87 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought87 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought87 instance = new Thought87 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought342.getInstance(fo1, fo0, fo1, fo0);
    if (fb0) {
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        fb1 = fd1 > fd0;
        fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
        double ld1 = 274.86403452141764;
if(fo0 != null){
          fb0 = fo0.m2();
}
if(fo1 != null){
          fo1.m3(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
          fb1 = fo0.m2(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        fb0 = ld1 > fd0;
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
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[1][6] -= fd1;
    fd0 = fd1 + fd0;
    fb1 = fd1 < fd0;
    if (ab1) {
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
        boolean lb0 = true;
        ab1 = !ab2;
if(fo0 != null){
          ab3 = fo0.m2(fd1, fd0, fd1, fd0);
}
        boolean lb1 = true;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
          fd1 = fo1.m3();
}
        fd0 = fd1 + fd0;
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
    fb0 = fb1 && fb0;
    fb1 = ad2 > ad3;
    Output.points[1][7] += ad4;
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought225.getInstance(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ad1, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
    for(int i0=0; i0<10; i0++){
        fb0 = fb1 && lb1;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1);
}
        fb0 = ad2 > ad3;
        boolean lb2 = true;
if(fo1 != null){
          fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
        Output.points[1][8] += ad2;
        fb0 = ad3 > ad4;
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2);
}
        ad3 *= -1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo0 != null){
          fb0 = fo0.m2(fb1, lb2, lb3, lb1);
}
        fb0 = fb1 && lb2;
        lb3 = lb1 || fb0;
        boolean lb4 = false;
        double ld5 = 911.9613828329209;
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
    Thought lo0 = Thought27.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
    fb1 = !ab1;
    fd1 *= -1;
    ab2 = ad1 < ad2;
    ad3 = ad4 - fd0;
    Output.points[2][0] -= fd1;
    boolean lb1 = false;
if(fo1 != null){
      fo1.m1(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fb1 = !lb1;
    Output.points[2][1] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    Output.points[2][2] -= ad1;
    Thought lo2 = Thought386.getInstance(fo1, fo0, fo1, fo0);
    fb0 = ad2 > ad3;

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
    boolean lb0 = false;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    double ld1 = 632.6963687274773;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, ld1, fd0, fd1, ld1);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    Thought lo2 = Thought129.getInstance(lb0, fb0, fb1, lb0);
    fb0 = !fb1;
    Thought lo3 = Thought270.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, lb0, fb0, fb1, lb0);
    fd1 = ld1 + fd0;
if(ao3 != null){
      ao3.m1(fd1, ld1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 && fb0;
    fb1 = !lb0;
    fb0 = !fb1;
    ld1 = fd0 + fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, lb0, fb0, fb1, lb0);
}
    boolean lb4 = false;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
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
    boolean lb0 = true;
    Thought lo1 = Thought203.getInstance(ad1, ad2, ad3, ad4);
    Output.points[2][3] += fd0;
    double ld2 = 310.3133509700054;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld2, ad1);
}
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(ao2 != null){
      lb0 = ao2.m2();
}
    boolean lb4 = true;
    lb3 = lb4 && fb0;
    boolean lb5 = false;
if(ao3 != null){
      ad2 = ao3.m3(fb0, fb1, lb0, lb3);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad3, ad4, fd0, fd1, lb4, lb5, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        lb0 = ld2 > ad1;
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
if(ao2 != null){
      fd0 = ao2.m3(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    boolean lb0 = false;
    double ld1 = 490.8766313459379;
    fb0 = fd0 > fd1;
    ld1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, lb0, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    double ld2 = 314.3878868484596;
    double ld3 = 634.0014752750836;
    ab3 = ab4 && fb0;
    fb1 = lb0 && ab1;
    ld2 = ld3 - fd0;
if(ao3 != null){
      fd1 = ao3.m3(ld1, ld2, ld3, fd0);
}
    fd1 *= -1;
    ab2 = ab3 || ab4;
    boolean lb4 = false;
    ld1 *= -1;
        Thought lo5 = Thought28.getInstance(ao4, fo0, fo1, ao1, ld2, ld3, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      ao4.m3(ab4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ld1, ld2, ld3, fd0, lb4, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    double ld6 = 972.0843831570498;

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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    fd1 = ad1 + ad2;
    double ld0 = 584.396147347989;
    boolean lb1 = true;
    ab2 = ad2 > ad3;
    Thought lo2 = Thought366.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(ad4, fd0, fd1, ld0);
}
    ab3 = ad1 < ad2;
    for(int i0=0; i0<10; i0++){
        if (ab4) {
            ad3 = ad4 - fd0;
if(ao3 != null){
              ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
}
            boolean lb3 = true;
            boolean lb4 = false;
            Thought lo5 = Thought209.getInstance();
            boolean lb6 = true;
            Output.points[2][4] += ad3;
            ab2 = ab3 || ab4;
            fb0 = fb1 || lb3;
if(ao3 != null){
              ao2 = ao3.m4(lb4, lb6, lb1, ab1);
}
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
            fb1 = ad1 > ad2;
if(fo0 != null){
              ao4 = fo0.m4(ad3, ad4, fd0, fd1, lb3, lb4, lb6, lb1);
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
boolean m2() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fb1 = fd0 > fd1;
    fb0 = fb1 && fb0;
    fd0 = fd1 - fd0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && fb0;

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
    ab1 = fd0 < fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      ab2 = fo1.m2();
}
if(fo0 != null){
      fo0.m1(ab3, ab4, fb0, fb1);
}
    ab1 = ab2 || ab3;
    ab4 = !fb0;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 || ab4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd1 = fd0 - fd1;
    ab3 = fd0 < fd1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ab4 = !fb0;
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fb0 = fd1 > fd0;
    fd1 = fd0 + fd1;
    fb1 = lb0 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    ab3 = ab4 || fb0;
    fb1 = lb0 || ab1;

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
    ad1 = ad2 + ad3;
    fb1 = ad4 < fd0;
    fd1 *= -1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      ad4 = fo0.m3();
}
    fb0 = fb1 || fb0;
    if (fb1) {
        boolean lb0 = true;
        boolean lb1 = false;
        lb0 = lb1 && fb0;
        Thought lo2 = Thought14.getInstance(fb1, lb0, lb1, fb0);
        } else {
        boolean lb3 = true;
        double ld4 = 228.19182073697567;
        for(int i0=0; i0<10; i0++){
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4, fb0, fb1, lb3, fb0);
}
            Output.points[2][5] -= ad1;
            ad2 = ad3 + ad4;
            fd0 *= -1;
            fb1 = lb3 || fb0;
            fb1 = !lb3;
            boolean lb5 = true;
            Output.points[2][6] -= fd1;
            boolean lb6 = false;
            lb6 = ld4 > ad1;
            boolean lb7 = false;
if(fo1 != null){
              fo1.m1(ad2, ad3, ad4, fd0, lb7, lb3, fb0, fb1);
}
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
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    ad2 *= -1;
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1);
}
    if (fb0) {
        ad1 = ad2 - ad3;
        fb1 = lb0 || ab1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
        ad2 = ad3 + ad4;
if(fo1 != null){
          ab2 = fo1.m2();
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][7] -= fd0;
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    fd0 *= -1;
    fb0 = fd1 < fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    double ld0 = 21.806843609990302;
if(ao4 != null){
      ao3 = ao4.m4(fd0, fd1, ld0, fd0, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought218.getInstance(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
    fb1 = fd1 > ld0;
    fd0 = fd1 - ld0;

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
    fb1 = ad2 < ad3;
if(ao1 != null){
      ad4 = ao1.m3(ao2, ao3, ao4, fo0);
}
    fb0 = !fb1;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0);
}
    Output.points[2][8] -= fd1;
    lb0 = ad1 < ad2;
    double ld1 = 725.3728869031195;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    fb0 = !fb1;
    lb0 = fd1 < ld1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    double ld2 = 274.2164096258938;
    fb0 = !fb1;
    boolean lb3 = true;
    ld2 *= -1;
    for(int i0=0; i0<10; i0++){
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
if(ao2 != null){
      ao1 = ao2.m4(ab2, ab3, ab4, fb0);
}
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
}
    double ld0 = 217.3430955827587;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld0, fd0, ab4, fb0, fb1, ab1);
}
        Output.points[3][0] -= fd1;
    ld0 *= -1;
    Output.points[3][1] -= fd0;
    fd1 *= -1;
    Output.points[3][2] -= ld0;
    boolean lb1 = true;
    fd0 = fd1 - ld0;
if(ao4 != null){
      ab1 = ao4.m2(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
    double ld2 = 984.4984654560557;
    boolean lb3 = true;
    Thought lo4 = Thought341.getInstance(ao3, ao4, fo0, fo1);

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
    boolean lb0 = true;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    ab1 = ab2 && ab3;
    fd1 *= -1;
    boolean lb1 = true;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4);
}
    ab3 = fd0 < fd1;
    boolean lb2 = false;
    if (ab3) {
        ab4 = !fb0;
if(ao3 != null){
          ao3.m1();
}
        fb1 = !lb0;
if(fo0 != null){
          ao4 = fo0.m4(lb1, lb2, ab1, ab2);
}
if(fo1 != null){
          ab3 = fo1.m2(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, ad1, ad2, lb1, lb2, ab1, ab2);
}
        Thought lo3 = Thought24.getInstance(ao1, ao2, ao3, ao4, ab3, ab4, fb0, fb1);
        boolean lb4 = true;
        ad3 = ad4 + fd0;
        Thought lo5 = Thought43.getInstance(fo0, fo1, ao1, ao2);
        double ld6 = 219.1194586336221;
        Thought lo7 = Thought206.getInstance(fd0, fd1, ld6, ad1);
        lb4 = lb0 || lb1;
        if (lb2) {
            ad2 = ad3 + ad4;
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    boolean lb0 = false;
    Output.points[3][3] -= fd0;
    Output.points[3][4] += fd1;
    double ld1 = 401.2408765280382;
    fb0 = ld1 < fd0;
    fb1 = fd1 > ld1;
    if (lb0) {
        double ld2 = 471.8157752977075;
        fb0 = fb1 && lb0;
if(fo1 != null){
          fo1.m2();
}
        boolean lb3 = true;
        if (lb0) {
            fb0 = !fb1;
if(fo1 != null){
              fo0 = fo1.m4(lb3, lb0, fb0, fb1);
}
            ld1 = fd0 + fd1;
            double ld4 = 100.01102507040125;
            boolean lb5 = true;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld4, ld2, ld1, fd0, lb5, lb3, lb0, fb0);
}
            fb1 = lb5 || lb3;
            Output.points[3][5] -= fd1;
if(fo0 != null){
              lb0 = fo0.m2(ld4, ld2, ld1, fd0, fb0, fb1, lb5, lb3);
}
            lb0 = fd1 > ld4;
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought27.getInstance(fo0, fo1, fo0, fo1);
    fd0 = fd1 - fd0;
    fd1 = fd0 + fd1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld1 = 289.19804534374873;
if(fo1 != null){
      fo1.m2();
}
    double ld2 = 229.22896257241763;
    fb1 = ab1 || ab2;
    ld1 *= -1;

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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad1 > ad2;
        fb1 = ad3 < ad4;
    double ld0 = 917.0757804481376;
    boolean lb1 = true;
    lb1 = fb0 && fb1;
    lb1 = fb0 && fb1;
    ad4 = fd0 - fd1;
    ld0 = ad1 - ad2;
    Output.points[3][6] += ad3;
if(fo0 != null){
      fo0.m2(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
    fb1 = ad1 > ad2;
    boolean lb2 = false;
    Thought lo3 = Thought347.getInstance(ad3, ad4, fd0, fd1, lb1, lb2, fb0, fb1);
    double ld4 = 838.2163106857798;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld5 = 888.6056724156574;

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
if(fo0 != null){
      fo0.m2(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
    Thought lo0 = Thought30.getInstance(ab1, ab2, ab3, ab4);
    fd1 = ad1 + ad2;
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo1 != null){
      ad1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = ab1 && ab2;
    ad2 = ad3 + ad4;
    ab3 = ab4 && fb0;
    boolean lb1 = true;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2);
}
    fb1 = ad3 < ad4;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(fo0 != null){
      ao4 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd0 = fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 > fd0;
    fb0 = fb1 && lb0;
    double ld1 = 696.0349907826642;
    fb0 = !fb1;
    double ld2 = 40.08759355569809;
    lb0 = ld2 > fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
    fb1 = ld1 > ld2;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
    boolean lb3 = true;

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
    fb0 = fb1 && fb0;
    fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 - ad1;
        ad2 = ad3 + ad4;
        fd0 = fd1 + ad1;
        lb0 = ad2 > ad3;
        Thought lo1 = Thought340.getInstance(ad4, fd0, fd1, ad1);
        boolean lb2 = false;
        double ld3 = 162.2862067409552;
        lb0 = fb0 && fb1;
        }
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao1 != null){
      fd1 = ao1.m3();
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao2.m3(ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ab1 = ao3.m2(fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought140.getInstance(ao4, fo0, fo1, ao1, fb1, ab1, ab2, ab3);
        boolean lb1 = false;
    fd1 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
    ab3 = fd0 < fd1;

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
    Thought lo0 = Thought146.getInstance(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0);
    ab1 = !ab2;
    ab3 = ab4 && fb0;
if(fo1 != null){
      fb1 = fo1.m2();
}
    ab1 = !ab2;
    double ld1 = 846.8932937041232;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
    boolean lb2 = false;
    fd0 = fd1 + ld1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
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
    boolean lb0 = false;
    lb0 = fd0 > fd1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[3][7] -= fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    lb0 = fd1 < fd0;
    if (fb0) {
        boolean lb1 = false;
        boolean lb2 = false;
        Thought lo3 = Thought117.getInstance(fo0, fo1, fo0, fo1);
        lb0 = fb0 || fb1;
        lb1 = fd1 < fd0;
        Thought lo4 = Thought154.getInstance(fd1, fd0, fd1, fd0);
        boolean lb5 = true;
        boolean lb6 = true;
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
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 < fd0;
    ab1 = fd1 > fd0;
        boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4();
}
    ab1 = fd1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = ab3 && ab4;
    fb0 = fb1 || lb0;
    fd0 = fd1 + fd0;
    lb1 = ab1 && ab2;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    boolean lb2 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, lb0, lb1, lb2, ab1);
}
    double ld3 = 790.9399036308316;
    ab2 = ab3 && ab4;
    fb0 = !fb1;
    ld3 = fd0 + fd1;
    lb0 = !lb1;
        ld3 = fd0 + fd1;
    ld3 = fd0 + fd1;

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
    Thought lo0 = Thought69.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought96.getInstance(ad1, ad2, ad3, ad4);
    double ld2 = 427.098120548458;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2);
}
    Thought lo3 = Thought294.getInstance();
    ad1 *= -1;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo4 = Thought152.getInstance(fd1, ld2, ad1, ad2, fb0, fb1, fb0, fb1);
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
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
    ab1 = !ab2;
    ad1 *= -1;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 - ad2;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo1 != null){
      ad4 = fo1.m3();
}
    double ld0 = 66.6010518435005;
    ad4 = fd0 - fd1;
    Thought lo1 = Thought366.getInstance(fb0, fb1, ab1, ab2);
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ld0, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    ab2 = ab3 && ab4;

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
    fb0 = !fb1;
    fd0 *= -1;
    fd1 = fd0 + fd1;
    double ld0 = 946.5761236464857;
    fb0 = ld0 < fd0;
    double ld1 = 720.9565793625475;
    fd0 *= -1;
if(ao1 != null){
      fd1 = ao1.m3(ld0, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
    fb1 = ld0 < ld1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][8] += ad1;
if(ao1 != null){
      ad2 = ao1.m3(ad3, ad4, fd0, fd1);
}
    boolean lb0 = true;
    lb0 = !fb0;
    boolean lb1 = true;
    boolean lb2 = false;
    ad1 = ad2 + ad3;
    lb2 = ad4 < fd0;
    fb0 = !fb1;
    lb0 = lb1 || lb2;
    double ld3 = 796.8203962548422;
    boolean lb4 = false;
    fd0 = fd1 - ld3;
    lb4 = fb0 || fb1;
    lb0 = lb1 && lb2;
    ad1 = ad2 - ad3;
    boolean lb5 = false;
if(ao2 != null){
      lb4 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld3);
}
    double ld6 = 560.386798173842;
    lb5 = ld6 > ad1;
    ad2 = ad3 - ad4;
    fb0 = fd0 < fd1;
    boolean lb7 = false;
if(ao1 != null){
      fb0 = ao1.m2();
}
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb1, lb2);
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
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    Thought lo1 = Thought362.getInstance(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ab2, ab3, ab4, fb0);
}
    fd1 = fd0 - fd1;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb4 = true;
        ab4 = fd0 > fd1;
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
    ad1 *= -1;
    double ld0 = 440.3446157958039;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
        boolean lb1 = false;
    lb1 = fd0 > fd1;
if(ao3 != null){
      ab1 = ao3.m2(ab2, ab3, ab4, fb0);
}
    Output.points[4][0] += ld0;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, fb1, lb1, ab1, ab2);
}
    double ld2 = 120.80816238948323;
if(ao4 != null){
      ao4.m2(ad4, fd0, fd1, ld0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(ld2, ad1, ad2, ad3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao4 != null){
      ao3 = ao4.m4(lb1, ab1, ab2, ab3);
}
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ld2, ad1, ad2, ad3, ab4, fb0, fb1, lb1);
}
    Thought lo3 = Thought3.getInstance(ad4, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
    ld2 = ad1 + ad2;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb0, fb1, lb1, ab1);
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
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought371.getInstance();
    boolean lb1 = true;
    boolean lb2 = false;
    boolean lb3 = false;
    lb2 = fd0 < fd1;
    lb3 = fd0 < fd1;
    fb0 = fd0 > fd1;
if(fo1 != null){
          fd0 = fo1.m3(fb1, lb1, lb2, lb3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
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
    fd1 *= -1;
    Output.points[4][1] += fd0;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
    double ld0 = 305.13550144365684;
    fd0 = fd1 + ld0;
    fb1 = fd0 > fd1;
    double ld1 = 1000.3784845841595;
    fb0 = fb1 || fb0;
    boolean lb2 = true;
if(fo1 != null){
              fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ld0 = fo0.m3(ld1, fd0, fd1, ld0);
}
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
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
void other() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought178.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
if(fo1 != null){
          fo1.m1(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    boolean lb2 = true;
    fb0 = fb1 && lb0;
    lb2 = fb0 && fb1;

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
