package genetic;
import java.util.ArrayList;
class Thought85 extends Thought{
private static ArrayList<Thought85> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = false;
private boolean fb1 = true;
private double fd0 = 817.9442235383281;
private double fd1 = 971.215214994115;
private Thought fo0 = null;
private Thought fo1 = null;
Thought85 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought85 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought85 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought85 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought85 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought85 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought85 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought85 instance = new Thought85 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    Thought lo0 = Thought218.getInstance(fo0, fo1, fo0, fo1);
    Thought lo1 = Thought144.getInstance(fd0, fd1, fd0, fd1);
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb1 = fd1 > fd0;
    fb0 = fd1 < fd0;
    fb1 = fd1 > fd0;
    fb0 = fb1 && fb0;
    boolean lb2 = false;
if(fo1 != null){
      fb0 = fo1.m2();
}
    double ld3 = 565.9300796499665;
    fb1 = lb2 && fb0;
if(fo0 != null){
      fo0.m2(fb1, lb2, fb0, fb1);
}
    lb2 = fd0 < fd1;
    fb0 = fb1 && lb2;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, ld3, fd0, fd1, ld3, fb1, lb2, fb0, fb1);
}
    Thought lo4 = Thought257.getInstance(fd0, fd1, ld3, fd0, lb2, fb0, fb1, lb2);
    fd1 = ld3 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb2, fb0);
}
    fb1 = lb2 && fb0;
    boolean lb5 = false;
    Output.points[2][6] += fd1;
    fb0 = !fb1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
    lb2 = ld3 < fd0;
    fd1 *= -1;
    ld3 = fd0 + fd1;
    double ld6 = 39.738566485559446;
if(fo1 != null){
      ld3 = fo1.m3(ld6, fd0, fd1, ld3);
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
    boolean lb0 = false;
    fd1 = fd0 - fd1;
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab4 = fb0 || fb1;
    lb0 = ab1 && ab2;
if(fo0 != null){
      fd0 = fo0.m3(ab3, ab4, fb0, fb1);
}
    fd1 = fd0 + fd1;
    lb0 = ab1 && ab2;

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
    Output.points[2][7] += ad1;
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    Thought lo0 = Thought37.getInstance(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought82.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    Thought lo2 = Thought348.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      fd0 = fo0.m3(fd1, ad1, ad2, ad3);
}
    ad4 = fd0 + fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ad1;
if(fo1 != null){
      fo1.m1();
}
    boolean lb3 = false;
    boolean lb4 = false;
    boolean lb5 = true;
    if (lb3) {
        boolean lb6 = true;
        for(int i0=0; i0<10; i0++){
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
void m1(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
    fb1 = ad3 > ad4;
    Thought lo0 = Thought154.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
if(fo0 != null){
      fo0.m3(ad3, ad4, fd0, fd1, fb0, fb1, ab1, ab2);
}
    boolean lb1 = false;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fb1, lb1, ab1, ab2);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    fd1 *= -1;
    ab2 = ad1 > ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    Output.points[2][8] += fd0;
if(fo0 != null){
      fo0.m2();
}
if(fo1 != null){
      ab3 = fo1.m2(ab4, fb0, fb1, lb1);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, lb2, ab1, ab2, ab3);
}
    fd0 *= -1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought368.getInstance(ao4, fo0, fo1, ao1, fb1, lb0, fb0, fb1);
    boolean lb2 = true;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    for(int i0=0; i0<10; i0++){
        boolean lb3 = true;
if(ao2 != null){
          ao2.m3(fd0, fd1, fd0, fd1);
}
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1);
}
        lb3 = !lb0;
        fd0 *= -1;
        fd1 *= -1;
        Thought lo4 = Thought217.getInstance();
if(ao3 != null){
          ao3.m2(lb2, fb0, fb1, lb3);
}
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1, lb0, lb2, fb0, fb1);
}
            for(int i2=0; i2<10; i2++){
                lb3 = fd0 > fd1;
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ao2.m2(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    fb1 = fb0 && fb1;
    double ld0 = 957.9985979319238;
    boolean lb1 = false;
    boolean lb2 = true;
    Thought lo3 = Thought21.getInstance(ao3, ao4, fo0, fo1);
if(ao2 != null){
      ao1 = ao2.m4(ad4, fd0, fd1, ld0);
}
    boolean lb4 = false;
    ad1 = ad2 + ad3;
    lb1 = lb2 || lb4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
      ao3.m1();
}
    Output.points[3][0] -= ad1;
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao4.m3(fb0, fb1, lb1, lb2);
}
    lb4 = !fb0;
    fb1 = lb1 && lb2;

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
    boolean lb0 = false;
    fd1 *= -1;
    fd0 *= -1;
    lb0 = !ab1;
    Output.points[3][1] -= fd1;
    ab2 = fd0 > fd1;
    ab3 = ab4 || fb0;
    Thought lo1 = Thought371.getInstance(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb1, lb0, ab1, ab2);
    Thought lo2 = Thought107.getInstance(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
    fd0 = fd1 - fd0;
    fd1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
    fb0 = fd1 > fd0;
        Thought lo3 = Thought198.getInstance(fd1, fd0, fd1, fd0);
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao3 != null){
      fd1 = ao3.m3();
}
    boolean lb4 = true;
    fd0 *= -1;
    fb0 = fb1 && lb0;
    Thought lo5 = Thought165.getInstance(lb4, ab1, ab2, ab3);
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
void m1(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    double ld0 = 725.9672829995769;
    ad1 *= -1;
    double ld1 = 402.575928521018;
    boolean lb2 = true;
    boolean lb3 = true;
    Thought lo4 = Thought192.getInstance(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4, lb3, ab1, ab2, ab3);
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ld1, ab4, fb0, fb1, lb2);
}
    boolean lb5 = true;
    Thought lo6 = Thought339.getInstance(ao1, ao2, ao3, ao4, lb3, lb5, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    boolean lb7 = true;
        ab2 = ad1 > ad2;
    ab3 = !ab4;
if(ao1 != null){
      ad3 = ao1.m3(ao2, ao3, ao4, fo0, ad4, fd0, fd1, ld0);
}
    Output.points[3][2] += ld1;
if(fo1 != null){
      fb0 = fo1.m2();
}
if(ao1 != null){
      ao1.m2(fb1, lb2, lb3, lb5);
}
    lb7 = ad1 < ad2;
    boolean lb8 = true;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld0, lb8, ab1, ab2, ab3);
}
    ld1 = ad1 - ad2;
if(ao1 != null){
      ao1.m3(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb2);
}
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, lb3, lb5, lb7, lb8);
}
    ab1 = ab2 && ab3;

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
    boolean lb0 = true;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
        lb0 = !fb0;
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
    lb0 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 - fd0;
    if (fb1) {
        lb0 = fd1 > fd0;
        fb0 = fd1 > fd0;
        fb1 = !lb0;
        boolean lb1 = true;
        lb0 = fd1 < fd0;
        boolean lb2 = false;
        fd1 = fd0 - fd1;
if(fo1 != null){
          fo0 = fo1.m4();
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(ab2, ab3, ab4, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
    fd0 *= -1;
    ab2 = !ab3;
    Thought lo0 = Thought206.getInstance(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
    fd1 *= -1;
    double ld1 = 813.8628567245746;
    boolean lb2 = true;
    ab1 = !ab2;
    Output.points[3][3] -= ld1;
    fd0 = fd1 - ld1;
    Thought lo3 = Thought261.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, ld1, fd0);
}
    double ld4 = 491.0047146149298;
    ab4 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ld4);
}
    double ld5 = 777.6768263481406;
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = ld5 < fd0;
    lb2 = !ab1;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    lb2 = fd1 < ld1;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fb0 = fd0 > fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 || fb0;
    ad3 = ad4 + fd0;
    Thought lo0 = Thought147.getInstance(fo1, fo0, fo1, fo0);
    fb1 = fb0 && fb1;
    fd1 *= -1;
    double ld1 = 666.8574596008731;
if(fo1 != null){
      fb0 = fo1.m2(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    Thought lo2 = Thought339.getInstance();
    Thought lo3 = Thought69.getInstance(fb1, fb0, fb1, fb0);
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, ad1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb1, fb0, fb1, fb0);
}
    Thought lo4 = Thought67.getInstance(fo0, fo1, fo0, fo1);
    Thought lo5 = Thought39.getInstance(ad2, ad3, ad4, fd0);
    for(int i0=0; i0<10; i0++){
        fb1 = fd1 < ld1;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ld1 - ad1;
        fb0 = ad2 < ad3;
        fb1 = fb0 || fb1;
        ad4 = fd0 - fd1;
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought384.getInstance();
if(fo1 != null){
      fo1.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
    boolean lb1 = false;
    ab1 = ad4 > fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    Output.points[3][4] += fd1;
    fb1 = ad1 > ad2;
    ad3 = ad4 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Output.points[3][5] -= fd1;
if(fo0 != null){
      ad1 = fo0.m3(ad2, ad3, ad4, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      lb1 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(ab1, ab2, ab3, ab4);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[3][6] -= fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought201.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought200.getInstance(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
    boolean lb2 = true;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3);
}
if(ao4 != null){
      fd0 = ao4.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb3 = false;
    lb2 = lb3 || fb0;

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
    ad2 = ad3 - ad4;
if(ao2 != null){
      fb0 = ao2.m2();
}
if(ao3 != null){
      ao3.m2(fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought108.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ad1, ad2, fb1, fb0, fb1, fb0);
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    ad1 *= -1;
    fb1 = ad2 > ad3;
    fb0 = fb1 && fb0;
    boolean lb1 = true;
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fb0, fb1, lb1, fb0);
}
    boolean lb2 = true;
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1);
}
    double ld3 = 519.8244545040382;

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
if(ao2 != null){
      ab1 = ao2.m2(fd1, fd0, fd1, fd0);
}
    double ld0 = 8.318847721466156;
    Output.points[3][7] += fd0;
    double ld1 = 479.2077168398328;
    double ld2 = 335.6751172968395;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld2, fd0, fd1, ld0);
}
    ld1 = ld2 - fd0;
if(ao3 != null){
      fd1 = ao3.m3();
}
    boolean lb3 = false;
    ld0 = ld1 + ld2;
    ab1 = ab2 && ab3;
    ab4 = fb0 && fb1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ad2 > ad3;
    ad4 *= -1;
    boolean lb0 = true;
    ab2 = fd0 < fd1;
    double ld1 = 187.72392429911494;
    boolean lb2 = true;
    double ld3 = 988.7449031488676;
    ld1 = ld3 - ad1;
if(ao3 != null){
      ao2 = ao3.m4(ab2, ab3, ab4, fb0);
}
    Output.points[3][8] += ad2;
    ad3 = ad4 - fd0;
    boolean lb4 = false;
    fd1 *= -1;
    boolean lb5 = true;
    Thought lo6 = Thought390.getInstance(ao4, fo0, fo1, ao1, ld1, ld3, ad1, ad2, ab4, fb0, fb1, lb0);
    ad3 = ad4 - fd0;
    lb2 = !lb4;
if(ao3 != null){
      ao2 = ao3.m4(fd1, ld1, ld3, ad1, lb5, ab1, ab2, ab3);
}
    ab4 = !fb0;
    fb1 = ad2 > ad3;
    Thought lo7 = Thought227.getInstance(ao4, fo0, fo1, ao1, lb0, lb2, lb4, lb5);
    ab1 = ab2 || ab3;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1);
}
    ab4 = !fb0;
if(ao4 != null){
      fb1 = ao4.m2(fo0, fo1, ao1, ao2, ld3, ad1, ad2, ad3);
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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb1 = fb0 || fb1;
    Thought lo0 = Thought64.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    Output.points[4][0] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = !fb1;
if(fo0 != null){
      fb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    Output.points[4][1] += fd0;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    if (fb0) {
        double ld1 = 273.76732293275523;
        fb1 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
if(fo1 != null){
          fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
        Output.points[4][2] += fd0;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
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
double m3(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 = fd0 - fd1;
    boolean lb0 = false;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
    ab4 = fb0 || fb1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, lb0, ab1, ab2, ab3);
}
    ab4 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought214.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
if(fo0 != null){
      fb1 = fo0.m2();
}
if(fo0 != null){
      fo1 = fo0.m4(lb0, ab1, ab2, ab3);
}
    fd0 *= -1;
    ab4 = fb0 && fb1;
    Thought lo2 = Thought120.getInstance(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, ab1, ab2, ab3);
    ab4 = fd1 > fd0;
    fb0 = fb1 || lb0;
    Thought lo3 = Thought235.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    Thought lo4 = Thought349.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, ab1);
    Output.points[4][3] += fd1;
    ab2 = ab3 && ab4;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 > fd0;

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
    boolean lb0 = false;
        lb0 = !fb0;
    double ld1 = 255.17632134782176;
if(fo1 != null){
      fo0 = fo1.m4(ld1, ad1, ad2, ad3);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld1);
}
    fb1 = ad1 > ad2;
    lb0 = fb0 || fb1;
    lb0 = fb0 || fb1;
    lb0 = !fb0;
    fb1 = ad3 > ad4;
if(fo1 != null){
      fo1.m1();
}
if(fo0 != null){
      fo0.m1(lb0, fb0, fb1, lb0);
}
    fb0 = fb1 || lb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld1, ad1, fb0, fb1, lb0, fb0);
}
    ad2 = ad3 - ad4;
    fb1 = !lb0;
    fb0 = !fb1;
    Output.points[4][4] += fd0;
    lb0 = fd1 > ld1;
    ad1 = ad2 - ad3;
    fb0 = ad4 > fd0;
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, ad1, ad2, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
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
    double ld0 = 862.4760026876916;
if(fo0 != null){
      ab1 = fo0.m2(ld0, ad1, ad2, ad3);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0);
}
    ad1 = ad2 - ad3;
    ab2 = ad4 > fd0;
    fd1 = ld0 - ad1;
    ab3 = ad2 < ad3;
    boolean lb1 = false;
        ab3 = ab4 && fb0;
    fb1 = lb1 || ab1;
if(fo1 != null){
      ab2 = fo1.m2();
}
    ab3 = !ab4;
    double ld2 = 350.7965777059016;
if(fo0 != null){
      fo0.m2(fb0, fb1, lb1, ab1);
}
    Output.points[4][5] -= ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, ab2, ab3, ab4, fb0);
}
    Thought lo3 = Thought86.getInstance(ld2, ad1, ad2, ad3, fb1, lb1, ab1, ab2);
if(fo1 != null){
      ad4 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
    fd0 *= -1;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    ab1 = fd1 < ld0;
    ab2 = ab3 && ab4;
    fb0 = fb1 && lb1;
    ab1 = ab2 && ab3;
    Thought lo4 = Thought354.getInstance(ld2, ad1, ad2, ad3);

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao2.m3();
}
    fd0 = fd1 + fd0;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought73.getInstance(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
    fb0 = fd1 > fd0;
    fb1 = fb0 && fb1;
    fb0 = fd1 > fd0;
if(ao3 != null){
      fb1 = ao3.m2(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 < fd0;
    fb1 = !fb0;
    double ld1 = 647.1026431841677;
    Output.points[4][6] += fd0;
    boolean lb2 = false;
    fb0 = fb1 && lb2;
    Thought lo3 = Thought214.getInstance(ao4, fo0, fo1, ao1, fb0, fb1, lb2, fb0);
    Thought lo4 = Thought8.getInstance(ao2, ao3, ao4, fo0);
if(ao1 != null){
      fo1 = ao1.m4(fd1, ld1, fd0, fd1);
}
    ld1 *= -1;
    Thought lo5 = Thought154.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, ld1, fd0);
    Output.points[4][7] -= fd1;

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
    boolean lb0 = false;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    ad2 *= -1;
    boolean lb1 = false;
if(ao2 != null){
      ao2.m3();
}
    boolean lb2 = true;
if(ao3 != null){
      lb0 = ao3.m2(lb1, lb2, fb0, fb1);
}
    boolean lb3 = false;
    lb0 = ad3 < ad4;
    boolean lb4 = true;
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd0, fd1, ad1, ad2, lb1, lb2, lb3, lb4);
}
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
    boolean lb0 = true;
    ab1 = fd0 > fd1;
    if (ab2) {
        boolean lb1 = true;
        if (ab2) {
if(ao2 != null){
              ao1 = ao2.m4(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
            fd0 = fd1 + fd0;
            lb1 = lb0 || ab1;
if(ao4 != null){
              ao3 = ao4.m4(fo0, fo1, ao1, ao2, ab2, ab3, ab4, fb0);
}
if(ao3 != null){
              ao3.m1(ao4, fo0, fo1, ao1);
}
            Output.points[4][8] -= fd1;
            Thought lo2 = Thought21.getInstance(fd0, fd1, fd0, fd1);
            boolean lb3 = true;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = !ab2;
    ad2 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ab3 = ad1 < ad2;
    ab4 = ad3 > ad4;
    fb0 = fd0 > fd1;
if(ao1 != null){
      fb1 = ao1.m2();
}
if(ao2 != null){
      ad1 = ao2.m3(ab1, ab2, ab3, ab4);
}
    Thought lo0 = Thought89.getInstance(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, ab1, ab2);
if(ao1 != null){
      ab3 = ao1.m2(fd1, ad1, ad2, ad3, ab4, fb0, fb1, ab1);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ab2, ab3, ab4, fb0);
}
    Output.points[5][0] -= ad4;
    double ld1 = 71.1882179485032;
    fb1 = ab1 && ab2;
    ab3 = ad4 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ab4 = fb0 && fb1;
    ab1 = fd1 > ld1;
    ad1 = ad2 + ad3;
if(ao3 != null){
      ao2 = ao3.m4(ad4, fd0, fd1, ld1);
}
    boolean lb2 = false;
    double ld3 = 818.0465260425028;
    ld3 *= -1;
    double ld4 = 188.75082705739914;
    ab1 = ab2 && ab3;

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
Thought m4() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd1 *= -1;
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fb0 = fd0 > fd1;
    fd0 *= -1;
    Output.points[5][1] += fd1;
    fd0 *= -1;
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo1.m2(fb0, fb1, fb0, fb1);
}
    fd1 *= -1;
    double ld0 = 486.0367909963854;
    fb0 = ld0 < fd0;
    fb1 = !fb0;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
    double ld1 = 637.6329992085206;
    fb0 = fb1 || fb0;
        fb1 = fb0 || fb1;
if(fo1 != null){
      ld0 = fo1.m3(ld1, fd0, fd1, ld0, fb0, fb1, fb0, fb1);
}
    fb0 = ld1 > fd0;
    fb1 = fb0 || fb1;
    fd1 = ld0 + ld1;
    fb0 = fd0 > fd1;
    ld0 = ld1 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
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
    boolean lb0 = true;
    ab1 = ab2 || ab3;
    double ld1 = 800.9168600453509;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fo0.m1(ab4, fb0, fb1, lb0);
}
    ld1 *= -1;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab1, ab2, ab3, ab4);
}
    fd1 *= -1;
    boolean lb2 = false;
    ld1 *= -1;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    lb2 = !ab1;
        Thought lo3 = Thought70.getInstance(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
    Output.points[5][2] -= ld1;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd1, ld1, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
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
    ad2 = ad3 + ad4;
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo0 = Thought163.getInstance(fb0, fb1, fb0, fb1);
    fd1 *= -1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    boolean lb1 = true;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ad1, ad2, lb1, fb0, fb1, lb1);
}
    ad3 *= -1;
    Output.points[5][3] += ad4;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    double ld2 = 235.90343192804178;
    boolean lb3 = false;
    double ld4 = 92.20520066286176;
    boolean lb5 = true;
    ad3 = ad4 - fd0;
    Output.points[5][4] -= fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    boolean lb6 = false;
    double ld7 = 756.1463741583539;

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
    ad1 = ad2 + ad3;
    ad4 = fd0 - fd1;
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4);
}
    Output.points[5][5] -= fd0;
    ab1 = ab2 && ab3;
    Output.points[5][6] -= fd1;
    ad1 = ad2 + ad3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
    Output.points[5][7] += ad2;
        ad3 = ad4 + fd0;
    ab4 = fd1 > ad1;
if(fo0 != null){
      ad2 = fo0.m3();
}
    fb0 = fb1 && ab1;
if(fo0 != null){
      fo1 = fo0.m4(ab2, ab3, ab4, fb0);
}
    ad3 = ad4 + fd0;
    double ld0 = 131.0352057175631;
    double ld1 = 910.8384591843102;
    boolean lb2 = true;
    double ld3 = 247.7374986155373;

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
    boolean lb0 = false;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb0, fb0);
}
    Output.points[5][8] -= fd1;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, fb1, lb0, fb0, fb1);
}
    fd1 = fd0 + fd1;
    boolean lb1 = false;
    boolean lb2 = false;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, lb0, lb1, lb2, fb0);
}
    Output.points[6][0] -= fd0;
    fb1 = lb0 && lb1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1);
}
    lb2 = fd0 < fd1;
    boolean lb3 = false;
    lb3 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    Thought lo4 = Thought167.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    fd1 *= -1;
if(ao1 != null){
      ao1.m2();
}
    Output.points[6][1] -= fd0;
    fd1 = fd0 + fd1;
if(ao3 != null){
      ao2 = ao3.m4(fb1, lb0, lb1, lb2);
}
    Output.points[6][2] -= fd0;

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
    ad2 = ad3 - ad4;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    ad4 *= -1;
    boolean lb1 = false;
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, ad1, ad2, fb0, fb1, lb0, lb1);
}
    Thought lo2 = Thought9.getInstance(ao2, ao3, ao4, fo0, fb0, fb1, lb0, lb1);
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    Thought lo3 = Thought333.getInstance(fd1, ad1, ad2, ad3);
    for(int i0=0; i0<10; i0++){
        fb0 = ad4 > fd0;
if(fo0 != null){
          fd1 = fo0.m3(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4);
}
        Thought lo4 = Thought41.getInstance();
        }
    Output.points[6][3] -= fd0;

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
    ab2 = ab3 || ab4;
if(ao1 != null){
      ao1.m1(fb0, fb1, ab1, ab2);
}
    ab3 = fd1 > fd0;
    ab4 = !fb0;
    fb1 = !ab1;
    for(int i0=0; i0<10; i0++){
if(ao2 != null){
          ao2.m2(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
        fb1 = ab1 || ab2;
        boolean lb0 = false;
        double ld1 = 521.8960967484393;
        Thought lo2 = Thought199.getInstance(fd0, fd1, ld1, fd0, ab2, ab3, ab4, fb0);
        double ld3 = 146.43530808632937;
if(ao2 != null){
          ao1 = ao2.m4(ao3, ao4, fo0, fo1, fb1, lb0, ab1, ab2);
}
        fd0 = fd1 - ld1;
        ab3 = ld3 > fd0;
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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    ad2 *= -1;
    ab1 = ad3 < ad4;
if(ao2 != null){
      ab2 = ao2.m2(fd0, fd1, ad1, ad2);
}
    ab3 = ad3 < ad4;
    double ld0 = 723.294994195907;
if(ao3 != null){
      ab4 = ao3.m2(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld0);
}
if(ao3 != null){
          ao2 = ao3.m4();
}
    fb0 = !fb1;

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
    fd1 = fd0 + fd1;
    Thought lo0 = Thought213.getInstance(fb0, fb1, fb0, fb1);
    double ld1 = 575.3444480916238;
    Output.points[6][4] -= ld1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, fb0, fb1, fb0, fb1);
}
    Thought lo2 = Thought233.getInstance(fd1, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
    boolean lb3 = true;
    lb3 = fb0 || fb1;
        Output.points[6][5] += ld1;
    fd0 = fd1 - ld1;
if(fo0 != null){
      lb3 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, ld1, fd0);
}
    fd1 *= -1;
    lb3 = !fb0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld1);
}
if(fo0 != null){
      fd0 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb1, lb3, fb0, fb1);
}
    fd1 *= -1;
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, lb3, fb0, fb1, lb3);
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 = fd0 - fd1;
    double ld0 = 757.8443992036559;
    boolean lb1 = false;
    ld0 = fd0 + fd1;
    double ld2 = 525.1208341364202;
    fb0 = fb1 && lb1;
    ld0 = ld2 - fd0;
    double ld3 = 850.3275070094485;
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld2, ld3, fb0, fb1, lb1, fb0);
}
    double ld4 = 350.63561754240106;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb1, fb0, fb1);
}
    Output.points[6][6] += ld4;
    fd0 *= -1;
    fd1 = ld0 - ld2;

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
    Thought lo0 = Thought226.getInstance(fo1, fo0, fo1, fo0);
    Thought lo1 = Thought4.getInstance(fd0, fd1, fd0, fd1);
    boolean lb2 = true;
    boolean lb3 = false;
    fd0 = fd1 + fd0;
    lb2 = lb3 && fb0;
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fb1 = fo0.m2();
}
    fd1 = fd0 - fd1;
    lb2 = fd0 > fd1;
        lb3 = !fb0;
    Thought lo4 = Thought79.getInstance(fb1, lb2, lb3, fb0);
    Thought lo5 = Thought46.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, lb2, lb3, fb0);

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
