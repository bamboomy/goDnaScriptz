package genetic;
import java.util.ArrayList;
class Thought292 extends Thought{
private static ArrayList<Thought292> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = true;
private double fd0 = 829.7208099622754;
private double fd1 = 543.1282070597197;
private Thought fo0 = null;
private Thought fo1 = null;
Thought292 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought292 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought292 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought292 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought292 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought292 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought292 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought292 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought292 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought292 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought292 instance = new Thought292 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    fd0 *= -1;
    fd1 = fd0 + fd1;
    fb0 = !fb1;
if(fo0 != null){
          fd0 = fo0.m3();
}
    fb0 = fb1 || fb0;
    fd1 *= -1;
if(fo1 != null){
      fo1.m2(fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - fd0;
    fd1 *= -1;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
    fb0 = !fb1;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fd0 = fo0.m3();
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
    double ld0 = 988.4001470184963;
    ab1 = !ab2;
    Thought lo1 = Thought264.getInstance(ab3, ab4, fb0, fb1);
    fd0 *= -1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo0 != null){
      fo0.m2(ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, ab1, ab2, ab3);
}
    fd0 = fd1 - ld0;
    fd0 *= -1;
    fd1 *= -1;
    ab4 = fb0 && fb1;
    ab1 = ld0 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[0][2] -= fd1;
        Output.points[0][3] -= ld0;
        for(int i1=0; i1<10; i1++){
            ab2 = fd0 < fd1;
            Thought lo2 = Thought173.getInstance(ld0, fd0, fd1, ld0);
            Output.points[0][4] += fd0;
            Thought lo3 = Thought170.getInstance(fo0, fo1, fo0, fo1, fd1, ld0, fd0, fd1);
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
void m1(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
        fb1 = fd1 < ad1;
    ad2 = ad3 + ad4;
    Output.points[0][5] += fd0;
    fd1 = ad1 + ad2;
    lb0 = ad3 > ad4;
    Thought lo1 = Thought367.getInstance(fd0, fd1, ad1, ad2, fb0, fb1, lb0, fb0);
    if (fb1) {
        double ld2 = 47.55917000968831;
        lb0 = fb0 && fb1;
        Thought lo3 = Thought314.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        Thought lo4 = Thought251.getInstance(fo1, fo0, fo1, fo0);
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
    boolean lb0 = false;
    ab1 = ad1 < ad2;
if(fo0 != null){
      fo1 = fo0.m4(ad3, ad4, fd0, fd1);
}
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    Output.points[0][6] += ad1;
    boolean lb2 = false;
    ad2 = ad3 + ad4;
    Output.points[0][7] -= fd0;
    ab3 = fd1 < ad1;
    Thought lo3 = Thought334.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
if(fo1 != null){
      fo1.m2();
}
    fd1 = ad1 + ad2;
    ab4 = !fb0;
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
if(fo0 != null){
      fo0.m1(fb1, lb0, lb1, lb2);
}
    double ld4 = 17.421004657993993;
    ab1 = ad2 < ad3;
    Thought lo5 = Thought314.getInstance(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4, ab2, ab3, ab4, fb0);
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0, fb1, lb0, lb1, lb2);
}
    ab1 = fd1 > ld4;
    ab2 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    Thought lo6 = Thought138.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ad3 = fo0.m3(ad4, fd0, fd1, ld4);
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
    fb0 = !fb1;
    fb0 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
if(ao2 != null){
      ao2.m1();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    boolean lb0 = true;
if(ao4 != null){
      fd1 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
        Thought lo1 = Thought298.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = fb0 || fb1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1, fb0, fb1, lb0, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fd0 < fd1;
    boolean lb2 = true;
    Output.points[0][8] += fd0;

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
    fb0 = ad2 > ad3;
    fb1 = fb0 || fb1;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ad1);
}
    if (fb0) {
        ad2 = ad3 + ad4;
        fb1 = fd0 > fd1;
        fb0 = fb1 || fb0;
        Thought lo0 = Thought27.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
        fd0 *= -1;
        fd1 = ad1 - ad2;
        boolean lb1 = true;
        ad3 = ad4 + fd0;
        boolean lb2 = true;
        double ld3 = 410.7126020965446;
if(ao3 != null){
          ao2 = ao3.m4();
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
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Thought lo0 = Thought393.getInstance(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0, fb1, ab1, ab2, ab3);
if(ao3 != null){
          ao2 = ao3.m4(fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb1 = true;
        double ld2 = 210.91262452070748;
        ab1 = !ab2;
        ab3 = ab4 && fb0;
        Thought lo3 = Thought23.getInstance(ao4, fo0, fo1, ao1, fb1, lb1, ab1, ab2);
        ab3 = fd0 > fd1;
if(ao2 != null){
          ab4 = ao2.m2(ao3, ao4, fo0, fo1);
}
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 141.6426339014616;
    Thought lo2 = Thought76.getInstance(ld1, ad1, ad2, ad3);
    ab1 = ab2 || ab3;
    ab4 = fb0 && fb1;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld1);
}
    Output.points[1][0] += ad1;
    ad2 = ad3 - ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
if(ao1 != null){
      fd1 = ao1.m3(lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ld1 = ao2.m3(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 || ab3;
if(ao1 != null){
      ab4 = ao1.m2(fd0, fd1, ld1, ad1, fb0, fb1, lb0, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    boolean lb3 = true;
    fb0 = ad2 > ad3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          fb1 = ao2.m2(ad4, fd0, fd1, ld1);
}
        boolean lb4 = false;
        lb4 = lb0 || lb3;
        ab1 = ab2 || ab3;
if(ao3 != null){
          ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
}
        fb0 = !fb1;
        lb4 = fd0 < fd1;
        Thought lo5 = Thought9.getInstance();
        lb0 = ld1 > ad1;
        if (lb3) {
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
    fb1 = fb0 || fb1;
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fd0 *= -1;
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    fd1 = fd0 + fd1;
    Thought lo1 = Thought22.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    fd0 *= -1;
    fb1 = lb0 || fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, fb0, fb1);
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought395.getInstance(fo1, fo0, fo1, fo0);
    double ld1 = 320.5371685387262;
    double ld2 = 508.2628516147747;
if(fo0 != null){
      fo1 = fo0.m4(ld2, fd0, fd1, ld1);
}
    ld2 *= -1;
    ab2 = fd0 < fd1;
    if (ab3) {
if(fo1 != null){
          ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld2, fd0, fd1, ld1);
}
        } else {
        boolean lb3 = false;
if(fo0 != null){
          fo0.m2();
}
        ab3 = ld2 > fd0;
        boolean lb4 = false;
        fd1 = ld1 - ld2;
if(fo1 != null){
          fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
        Output.points[1][1] += fd1;
if(fo0 != null){
          ld1 = fo0.m3(fo1, fo0, fo1, fo0, ld2, fd0, fd1, ld1, lb3, lb4, ab1, ab2);
}
        Output.points[1][2] -= ld2;
if(fo1 != null){
          fd0 = fo1.m3(fd1, ld1, ld2, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb3, lb4, ab1, ab2);
}
        ab3 = ld1 < ld2;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    Output.points[1][3] += fd1;
    ad1 = ad2 + ad3;
    Thought lo1 = Thought333.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
    boolean lb2 = true;
    ad2 = ad3 - ad4;
    lb0 = fd0 < fd1;
    Thought lo3 = Thought361.getInstance();
    lb2 = fb0 && fb1;
    ad1 = ad2 + ad3;
    ad4 *= -1;
    double ld4 = 23.60640676831854;
if(fo0 != null){
      fo0.m2(lb0, lb2, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld4, lb0, lb2, fb0, fb1);
}
    ad1 *= -1;
if(fo1 != null){
      fo1.m2(ad2, ad3, ad4, fd0, lb0, lb2, fb0, fb1);
}
    boolean lb5 = false;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, lb0, lb2, lb5, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
    Thought lo6 = Thought220.getInstance(fd1, ld4, ad1, ad2);
    lb2 = lb5 && fb0;
    Thought lo7 = Thought232.getInstance(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
if(fo0 != null){
      ld4 = fo0.m3();
}
    ad1 = ad2 - ad3;
    ad4 = fd0 - fd1;
    Thought lo8 = Thought388.getInstance(fb1, lb0, lb2, lb5);

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
    ab1 = ab2 || ab3;
    ab4 = ad1 < ad2;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ab3 = ad1 > ad2;
if(fo0 != null){
      ab4 = fo0.m2(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    ad1 *= -1;
if(fo1 != null){
      ab3 = fo1.m2(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    boolean lb0 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    ab1 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ad1);
}
    ab2 = ad2 > ad3;
    ab3 = !ab4;
    fb0 = fb1 && lb0;
if(fo0 != null){
      ad4 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo1 != null){
      ad3 = fo1.m3(ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1, fb0, fb1, lb0, ab1);
}
if(fo1 != null){
      fo1.m1(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    fd1 = ad1 + ad2;
    double ld1 = 675.4009914483568;
    ab2 = ab3 && ab4;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    fb1 = fd0 < fd1;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
        fb1 = lb0 || fb0;
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
    lb0 = fb0 || fb1;
    lb0 = !fb0;

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
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    Output.points[1][4] -= fd0;
if(ao1 != null){
      ao1.m2(fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > ad1;
    ad2 *= -1;
    double ld0 = 970.6693192730752;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fd1 > ld0;
    fb0 = ad1 < ad2;
    ad3 = ad4 + fd0;
    fb1 = fd1 < ld0;
if(ao1 != null){
      ad1 = ao1.m3(ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
if(ao2 != null){
      fb0 = ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Output.points[1][5] -= fd1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      ld0 = fo1.m3(ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, ld0, ad1);
}
    Output.points[1][6] += ad2;
    fb0 = fb1 || fb0;
    if (fb1) {
        fb0 = fb1 || fb0;
        fb1 = !fb0;
        fb1 = !fb0;
        fb1 = fb0 && fb1;
        ad3 = ad4 + fd0;
if(ao1 != null){
          fo1 = ao1.m4();
}
if(ao2 != null){
          fb0 = ao2.m2(fb1, fb0, fb1, fb0);
}
        double ld1 = 214.33353832187845;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 < fd1;
if(ao1 != null){
      ab2 = ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought311.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fb0, fb1, ab1, ab2);
}
    Thought lo1 = Thought103.getInstance(fo1, ao1, ao2, ao3);
    boolean lb2 = false;
    Thought lo3 = Thought339.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought88.getInstance();
    ab2 = ab3 && ab4;
    boolean lb5 = true;
    for(int i0=0; i0<10; i0++){
        fd0 = fd1 + fd0;
        boolean lb6 = true;
        ab3 = ab4 || fb0;
        fb1 = lb6 && lb2;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
}
    double ld0 = 530.2347327577663;
    ab4 = fb0 && fb1;
    boolean lb1 = true;
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1, lb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, ao1, ao2, ao3);
}
    double ld2 = 527.2950539320005;
    Output.points[1][7] -= ld0;
if(fo0 != null){
      ao4 = fo0.m4(ld2, ad1, ad2, ad3);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m2();
}
    boolean lb3 = true;
if(ao2 != null){
      ao1 = ao2.m4(ab4, fb0, fb1, lb1);
}
    lb3 = ld2 > ad1;
    ab1 = ab2 || ab3;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad2, ad3, ad4, fd0, fb0, fb1, lb1, lb3);
}
if(ao2 != null){
      fd1 = ao2.m3(ld0, ld2, ad1, ad2, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, lb1, lb3);
}
    ab1 = !ab2;
    ab3 = ad3 < ad4;
        Thought lo4 = Thought217.getInstance(ao2, ao3, ao4, fo0);
    ab4 = fb0 || fb1;

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
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(fo1 != null){
      fo1.m2();
}
if(fo0 != null){
      fd1 = fo0.m3(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
    fb0 = fd1 > fd0;
    Output.points[1][8] -= fd1;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
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
    Thought lo0 = Thought197.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    Output.points[2][0] += fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Output.points[2][1] -= fd0;
    ab3 = ab4 && fb0;
    double ld1 = 710.3005287085374;
    fb1 = fd0 < fd1;
    ld1 = fd0 - fd1;
        ab1 = ab2 && ab3;
    ld1 = fd0 + fd1;
    Output.points[2][2] -= ld1;
    ab4 = fb0 && fb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld1, fd0);
}
    ab1 = !ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    boolean lb0 = true;
    double ld1 = 780.4747318223943;
if(fo1 != null){
      fo0 = fo1.m4();
}
    lb0 = fb0 && fb1;
    ad4 = fd0 + fd1;
    lb0 = ld1 < ad1;
    fb0 = !fb1;
    Thought lo2 = Thought303.getInstance(lb0, fb0, fb1, lb0);
    ad2 *= -1;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, lb0, fb0);
}
    ld1 = ad1 + ad2;
    ad3 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld1, fb1, lb0, fb0, fb1);
}
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Thought lo3 = Thought53.getInstance(fo0, fo1, fo0, fo1);
    ad1 = ad2 + ad3;
    fb1 = ad4 > fd0;
    fd1 = ld1 - ad1;
    boolean lb4 = false;
    double ld5 = 147.57693001610681;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld5);
}
    boolean lb6 = true;
    boolean lb7 = false;
    Thought lo8 = Thought391.getInstance();

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
    ad2 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ab3 = fo1.m2(ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    Thought lo0 = Thought343.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    boolean lb1 = false;
    fb0 = fb1 || lb1;
    ab1 = !ab2;
    ab3 = fd0 < fd1;
if(fo0 != null){
      ab4 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[2][3] += ad1;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 || fb0;
    Output.points[2][4] += fd0;
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4();
}
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    Thought lo1 = Thought73.getInstance(fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(ao3 != null){
      lb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    fb0 = fb1 && lb0;
    boolean lb2 = true;
if(ao2 != null){
      lb2 = ao2.m2(fd0, fd1, fd0, fd1);
}
    double ld3 = 479.4455335908993;
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, ld3, fd0, fd1, ld3);
}
if(ao2 != null){
      fd0 = ao2.m3();
}
    fd1 = ld3 + fd0;
if(ao3 != null){
      fd1 = ao3.m3(fb0, fb1, lb0, lb2);
}
if(ao4 != null){
      ld3 = ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld3, fd0, fb0, fb1, lb0, lb2);
}
    Thought lo4 = Thought265.getInstance(fd1, ld3, fd0, fd1, fb0, fb1, lb0, lb2);
if(ao3 != null){
      ao3.m1(ao4, fo0, fo1, ao1, fb0, fb1, lb0, lb2);
}
    fb0 = !fb1;
        lb0 = !lb2;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 768.5232025498455;
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1);
}
    ad3 = ad4 - fd0;
    fb0 = fd1 > ld0;
    ad1 = ad2 + ad3;
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    Output.points[2][5] -= ad1;
        fb1 = fb0 && fb1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1);
}
    Thought lo1 = Thought270.getInstance();
    ad2 = ad3 + ad4;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;
    Thought lo3 = Thought268.getInstance(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ad1, lb2, fb0, fb1, lb2);
    double ld4 = 399.0929655432755;
if(ao3 != null){
      ao3.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
    fd0 = fd1 - ld0;
    fb1 = ld4 > ad1;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, lb2, fb0, fb1, lb2);
}
    if (fb0) {
        if (fb1) {
            lb2 = ad2 > ad3;
}}
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
    double ld0 = 726.6047952521762;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    double ld1 = 650.9767443379402;
    ab2 = !ab3;
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ld0, ld1);
}
if(ao2 != null){
      fd0 = ao2.m3(ao3, ao4, fo0, fo1, fd1, ld0, ld1, fd0);
}
    boolean lb2 = true;
if(ao2 != null){
      ao1 = ao2.m4();
}
        fd1 = ld0 - ld1;
    fd0 = fd1 - ld0;
if(ao3 != null){
          ld1 = ao3.m3(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld0, ld1, fd0, lb2, ab1, ab2, ab3);
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
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb0, fb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ab3 = fd0 > fd1;
    ab4 = fb0 || fb1;
    Output.points[2][6] += ad1;
    ab1 = ab2 && ab3;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0);
}
    ab4 = fb0 && fb1;
    boolean lb0 = false;
    lb0 = fd1 < ad1;
    ab1 = !ab2;
    ab3 = ab4 && fb0;
    fb1 = !lb0;
    Thought lo1 = Thought274.getInstance(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0);
    boolean lb2 = false;
    Thought lo3 = Thought161.getInstance();
if(ao4 != null){
      ao3 = ao4.m4(lb2, ab1, ab2, ab3);
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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[2][7] += fd1;
    fd0 = fd1 + fd0;
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    fd1 = fd0 - fd1;
    Thought lo1 = Thought103.getInstance(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
    boolean lb2 = false;
    Thought lo3 = Thought123.getInstance(fo0, fo1, fo0, fo1);
    Output.points[2][8] += fd0;
    lb2 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 *= -1;
    fd1 = fd0 + fd1;

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
      fo1.m1(ab1, ab2, ab3, ab4);
}
    fb0 = fb1 || ab1;
    Output.points[3][0] += fd0;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought54.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
    fb0 = fb1 && ab1;
    fd1 = fd0 + fd1;
    boolean lb1 = true;
    ab1 = fd0 > fd1;
    Thought lo2 = Thought161.getInstance(fo0, fo1, fo0, fo1);
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    double ld3 = 439.8148498610845;
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld3, fd0);
}
if(fo1 != null){
      fo1.m1();
}
    Thought lo4 = Thought162.getInstance(ab2, ab3, ab4, fb0);
    boolean lb5 = false;
    double ld6 = 807.8425322275781;
    boolean lb7 = true;
    Thought lo8 = Thought185.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld3, ld6, ab4, fb0, fb1, lb1);
    lb5 = lb7 && ab1;
    Output.points[3][1] += fd0;
    fd1 = ld3 + ld6;

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
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    if (fb0) {
        } else if (fb1) {
        boolean lb0 = false;
        fd0 *= -1;
        Thought lo1 = Thought69.getInstance(fo1, fo0, fo1, fo0, lb0, fb0, fb1, lb0);
        fd1 = ad1 + ad2;
        for(int i0=0; i0<10; i0++){
            Thought lo2 = Thought350.getInstance(fo1, fo0, fo1, fo0);
            Thought lo3 = Thought361.getInstance(ad3, ad4, fd0, fd1);
            fb0 = !fb1;
if(fo1 != null){
              fo1.m1(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(fo0 != null){
              fd0 = fo0.m3();
}
            lb0 = fd1 < ad1;
            fb0 = fb1 || lb0;
            Thought lo4 = Thought106.getInstance(fb0, fb1, lb0, fb0);
            ad2 = ad3 - ad4;
            double ld5 = 991.7309799345082;
            double ld6 = 868.2326638627636;
if(fo1 != null){
              ad3 = fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld5, fb1, lb0, fb0, fb1);
}
            ld6 *= -1;
if(fo0 != null){
              fo0.m2(ad1, ad2, ad3, ad4, lb0, fb0, fb1, lb0);
}
if(fo0 != null){
              fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
              fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
            lb0 = fb0 && fb1;
            Output.points[3][2] -= fd0;
            fd1 = ld5 - ld6;
            ad1 *= -1;
            ad2 = ad3 - ad4;
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
Thought m4(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][3] += ad1;
    boolean lb0 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 = ad1 - ad2;
    lb0 = ad3 > ad4;
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ad1, ad2);
}
    lb1 = ad3 < ad4;
    Output.points[3][4] += fd0;

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
    fd1 *= -1;
    fd0 = fd1 + fd0;
    Thought lo0 = Thought153.getInstance();
    boolean lb1 = true;
    Thought lo2 = Thought214.getInstance(lb1, fb0, fb1, lb1);
    double ld3 = 524.1248543674891;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ld3, fd0, fd1, fb0, fb1, lb1, fb0);
}
if(fo1 != null){
      ld3 = fo1.m3(fd0, fd1, ld3, fd0, fb1, lb1, fb0, fb1);
}
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0, lb1, fb0, fb1, lb1);
}
    ld3 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
      fo0.m1(fd0, fd1, ld3, fd0);
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
    Output.points[3][5] += ad1;
    fb0 = !fb1;
    fb0 = ad2 < ad3;
    fb1 = fb0 || fb1;
    Thought lo0 = Thought218.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
if(fo0 != null){
      ad2 = fo0.m3();
}
    double ld1 = 342.5942288548259;
    fb0 = !fb1;
if(ao1 != null){
      fo1 = ao1.m4(fb0, fb1, fb0, fb1);
}
    boolean lb2 = false;
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
if(ao2 != null){
      ld1 = ao2.m3(ad1, ad2, ad3, ad4, fb0, fb1, lb2, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, lb2, fb0, fb1, lb2);
}
    fb0 = fd0 > fd1;
    ld1 = ad1 + ad2;
    fb1 = ad3 < ad4;
    lb2 = !fb0;
    fb1 = lb2 || fb0;
    boolean lb3 = false;
    fb0 = fb1 || lb2;
    lb3 = fb0 && fb1;
    Thought lo4 = Thought379.getInstance(ao2, ao3, ao4, fo0);
    fd0 = fd1 + ld1;
        lb2 = lb3 || fb0;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    fb1 = fd0 < fd1;

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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    boolean lb1 = true;
if(ao1 != null){
      lb0 = ao1.m2(fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    lb1 = fd1 < fd0;
    ab1 = ab2 || ab3;
if(ao2 != null){
      fd1 = ao2.m3();
}
    boolean lb2 = false;
    Output.points[3][6] -= fd0;
if(ao3 != null){
      fd1 = ao3.m3(ab3, ab4, fb0, fb1);
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
    ab1 = ab2 && ab3;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, ab1, ab2, ab3);
}
    ab4 = fd1 > ad1;
    fb0 = ad2 > ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    fb1 = ab1 || ab2;
    ad4 = fd0 - fd1;
    ad1 = ad2 - ad3;
    ab3 = ab4 || fb0;
if(ao3 != null){
      fb1 = ao3.m2(ad4, fd0, fd1, ad1);
}
    ab1 = ad2 > ad3;
    ad4 *= -1;
    fd0 = fd1 + ad1;
if(ao4 != null){
      ad2 = ao4.m3(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1);
}
    Thought lo0 = Thought340.getInstance();
if(ao3 != null){
      ao3.m3(ab2, ab3, ab4, fb0);
}
if(ao4 != null){
      ad1 = ao4.m3(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(ao3 != null){
      ao3.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
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
    fb1 = fd1 > fd0;
    fb0 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fd1 *= -1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fb1 = fo0.m2(fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb0 = false;
if(fo1 != null){
      fd1 = fo1.m3();
}
    Thought lo1 = Thought244.getInstance(fb0, fb1, lb0, fb0);
    Thought lo2 = Thought21.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
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
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb1 = fb0 && fb1;
    Thought lo0 = Thought32.getInstance(fd0, fd1, fd0, fd1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Output.points[3][7] -= fd0;
    double ld1 = 128.03695568592954;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fd0 = fo0.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    ld1 = fd0 + fd1;
    fb0 = ld1 > fd0;
    fb1 = !fb0;
if(fo1 != null){
      fo1.m1(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo2 = Thought284.getInstance(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
    ld1 *= -1;
        fd0 = fd1 + ld1;
        double ld3 = 204.40407374626452;
    ld3 = fd0 + fd1;
    Thought lo4 = Thought186.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fo0.m1(ld1, ld3, fd0, fd1);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld1);
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
    fd1 = fd0 - fd1;
    Output.points[3][8] -= fd0;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 *= -1;
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    fd0 *= -1;
    boolean lb1 = false;
    fd1 *= -1;
    double ld2 = 684.4003500724519;
    ld2 = fd0 + fd1;
    lb1 = ld2 > fd0;

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
