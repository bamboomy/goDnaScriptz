package genetic;
import java.util.ArrayList;
class Thought183 extends Thought{
private static ArrayList<Thought183> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 390.8369772608288;
private double fd1 = 672.0497287403132;
private Thought fo0 = null;
private Thought fo1 = null;
Thought183 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought183 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought183 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought183 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought183 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought183 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought183 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought183 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought183 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought183 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought183 instance = new Thought183 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    boolean lb0 = false;
    Thought lo1 = Thought65.getInstance(lb0, fb0, fb1, lb0);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, lb0, fb0, fb1, lb0);
}
    fb0 = fd0 < fd1;
    double ld2 = 78.93132690615955;
    Output.points[6][2] -= ld2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
}
    fd0 = fd1 + ld2;
    lb0 = fb0 || fb1;
    lb0 = fd0 < fd1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
    lb0 = !lb3;
    ld2 = fd0 + fd1;
    boolean lb4 = false;
    double ld5 = 881.9215984867019;
    lb4 = ld2 > ld5;
    boolean lb6 = false;
    fd0 = fd1 - ld2;
    ld5 = fd0 - fd1;
    lb6 = fb0 && fb1;
    Thought lo7 = Thought182.getInstance(fo0, fo1, fo0, fo1);
    lb0 = lb3 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(ld2, ld5, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld2, ld5, fd0, fd1);
}
    lb6 = ld2 > ld5;

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
if(fo1 != null){
      ab4 = fo1.m2();
}
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    Thought lo1 = Thought144.getInstance(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb0);
    fd1 = fd0 - fd1;
    ab1 = fd0 > fd1;
    Thought lo2 = Thought87.getInstance(fo1, fo0, fo1, fo0);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo1.m3(fd0, fd1, fd0, fd1);
}
        ab2 = ab3 && ab4;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        fd0 = fd1 + fd0;
        fd1 = fd0 - fd1;
        fb0 = !fb1;
if(fo0 != null){
          fo0.m2();
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
if(fo1 != null){
      fo1.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought24.getInstance(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
    fd0 = fd1 + ad1;
    boolean lb1 = false;
    ad2 = ad3 + ad4;
if(fo0 != null){
      lb1 = fo0.m2(fd0, fd1, ad1, ad2, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    fb0 = ad3 > ad4;
    boolean lb2 = true;
    Output.points[6][3] -= fd0;
    fd1 = ad1 + ad2;
    ad3 = ad4 + fd0;
    Thought lo3 = Thought230.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
    fd1 = ad1 + ad2;
    boolean lb4 = false;
    lb4 = fb0 && fb1;
    lb1 = ad3 > ad4;
    Thought lo5 = Thought153.getInstance(fo1, fo0, fo1, fo0);
    lb2 = fd0 < fd1;

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
    Output.points[6][4] -= ad1;
    ab1 = ad2 < ad3;
    ab2 = ad4 > fd0;
    fd1 = ad1 + ad2;
if(fo1 != null){
      ad3 = fo1.m3(ad4, fd0, fd1, ad1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0);
}
    ab3 = ab4 && fb0;
    fd1 = ad1 - ad2;
    double ld0 = 908.942446594362;
    fb1 = ad2 > ad3;
    boolean lb1 = false;
    ad4 = fd0 + fd1;
    lb1 = !ab1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ab2 = ld0 > ad1;
    Output.points[6][5] += ad2;
    ab3 = ad3 > ad4;
    Thought lo2 = Thought111.getInstance(ab4, fb0, fb1, lb1);
    fd0 *= -1;
    ab1 = fd1 < ld0;
if(fo0 != null){
      ab2 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    lb1 = fd0 < fd1;
    Thought lo3 = Thought29.getInstance(ld0, ad1, ad2, ad3, ab1, ab2, ab3, ab4);
    boolean lb4 = false;
    ad4 *= -1;
    fd0 = fd1 + ld0;

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
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    fb1 = fb0 && fb1;
    fb0 = fb1 && fb0;
    double ld0 = 241.03177006647294;
    fb1 = fb0 && fb1;
    boolean lb1 = true;
if(ao3 != null){
      ao2 = ao3.m4(ld0, fd0, fd1, ld0);
}
    Thought lo2 = Thought122.getInstance(ao4, fo0, fo1, ao1, fd0, fd1, ld0, fd0);
    Thought lo3 = Thought264.getInstance();
    Output.points[6][6] += fd1;
    lb1 = fb0 && fb1;
if(ao2 != null){
      ao2.m1(lb1, fb0, fb1, lb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, fb0, fb1, lb1, fb0);
}
if(ao3 != null){
      ao3.m3(fd0, fd1, ld0, fd0, fb1, lb1, fb0, fb1);
}
    double ld4 = 178.66498952671188;
    double ld5 = 425.95695726316706;

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
    ad1 = ad2 - ad3;
    ad4 = fd0 + fd1;
    boolean lb0 = true;
    lb0 = ad1 < ad2;
    Output.points[6][7] -= ad3;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, lb0, fb0);
}
    Output.points[6][8] += ad4;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo1 = Thought327.getInstance(fd0, fd1, ad1, ad2);
    fb1 = ad3 > ad4;
    boolean lb2 = false;
if(ao1 != null){
      fd0 = ao1.m3(ao2, ao3, ao4, fo0, fd1, ad1, ad2, ad3);
}
    Thought lo3 = Thought4.getInstance();
if(fo1 != null){
      lb0 = fo1.m2(lb2, fb0, fb1, lb0);
}
        lb2 = fb0 || fb1;
    ad4 *= -1;
    fd0 = fd1 - ad1;
    lb0 = !lb2;
    Output.points[7][0] -= ad2;
if(ao1 != null){
      fb0 = ao1.m2(ao2, ao3, ao4, fo0, ad3, ad4, fd0, fd1, fb1, lb0, lb2, fb0);
}
    fb1 = lb0 || lb2;
if(ao1 != null){
      fo1 = ao1.m4(ad1, ad2, ad3, ad4, fb0, fb1, lb0, lb2);
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
      ao2.m2(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fd0 = fd1 - fd0;
    fb0 = fb1 || ab1;
    fd1 = fd0 + fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    ab1 = fd0 < fd1;
    fd0 = fd1 - fd0;
    ab2 = ab3 || ab4;
if(ao3 != null){
              fd1 = ao3.m3(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    fb0 = fb1 && lb0;
    ab1 = ab2 || ab3;
    boolean lb1 = true;
    ab3 = !ab4;
    Output.points[7][1] -= fd0;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb1);
}
    Output.points[7][2] += fd1;

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
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && ab1;
    boolean lb0 = false;
    fd0 = fd1 + ad1;
    boolean lb1 = true;
    lb1 = ab1 || ab2;
if(ao3 != null){
      ao2 = ao3.m4(ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = fd1 < ad1;
    boolean lb2 = true;
    ad2 = ad3 + ad4;
    double ld3 = 239.31107353922985;
    ad4 = fd0 + fd1;
if(ao4 != null){
          ld3 = ao4.m3(fo0, fo1, ao1, ao2, lb1, lb2, ab1, ab2);
}
    double ld4 = 966.6979383822671;
    ab3 = ab4 && fb0;
    if (fb1) {
if(ao4 != null){
          ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
        lb0 = !lb1;
if(ao3 != null){
          lb2 = ao3.m2(ld4, ad1, ad2, ad3);
}
        ab1 = ab2 || ab3;
        ab4 = !fb0;
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
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fd0 *= -1;
    double ld0 = 355.70945956899095;
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fd0 < fd1;
    Output.points[7][3] += ld0;
    fb1 = fb0 || fb1;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - ld0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, fd0, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    fb0 = fb1 || fb0;
    Thought lo1 = Thought244.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fd0 = fo1.m3(fd1, ld0, fd0, fd1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
}
    fb1 = !fb0;
if(fo0 != null){
      fo1 = fo0.m4();
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
    ab1 = ab2 || ab3;
if(fo1 != null){
      fd1 = fo1.m3(ab4, fb0, fb1, ab1);
}
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
    fb1 = fd0 < fd1;
    Thought lo0 = Thought202.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
    double ld1 = 374.27872155708917;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      ld1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    fd0 = fd1 - ld1;
    Output.points[7][4] -= fd0;
    ab3 = fd1 > ld1;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld1, fd0);
}
    ab4 = fd1 < ld1;
    fb0 = fb1 || ab1;
    boolean lb2 = true;
if(fo1 != null){
      ab1 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0);
}
    fd1 = ld1 - fd0;
    ab2 = fd1 < ld1;
    fd0 = fd1 + ld1;
    boolean lb3 = false;

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
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4();
}
    double ld0 = 142.97065861136605;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    double ld1 = 238.66527326625308;
    boolean lb2 = true;
    boolean lb3 = true;
    boolean lb4 = false;
    boolean lb5 = true;

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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    ab1 = fd0 < fd1;
    double ld0 = 472.028783897709;
if(fo0 != null){
      ld0 = fo0.m3(ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd1 = ld0 - ad1;
    Thought lo1 = Thought92.getInstance(fo1, fo0, fo1, fo0);
    ab4 = ad2 < ad3;
    ad4 = fd0 + fd1;
if(fo1 != null){
      fb0 = fo1.m2(ld0, ad1, ad2, ad3);
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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought303.getInstance();
if(ao2 != null){
      ao1 = ao2.m4(fb0, fb1, fb0, fb1);
}
if(ao3 != null){
      fb0 = ao3.m2(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fb0 = fd1 > fd0;
    fd1 *= -1;
    double ld1 = 287.99526302169795;
if(ao3 != null){
      ao2 = ao3.m4(ld1, fd0, fd1, ld1, fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    fb1 = fb0 || fb1;
    boolean lb2 = false;
    Output.points[7][5] += fd1;
if(ao4 != null){
      ao3 = ao4.m4(ld1, fd0, fd1, ld1);
}
    boolean lb3 = false;
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld1, fd0, fd1);
}
    Thought lo4 = Thought279.getInstance();
    Thought lo5 = Thought114.getInstance(lb2, lb3, fb0, fb1);
    ld1 = fd0 + fd1;
    Output.points[7][6] -= ld1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao2 != null){
      ad2 = ao2.m3(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    Thought lo0 = Thought47.getInstance(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
    Output.points[7][7] += fd0;
    double ld1 = 64.21439884367986;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Output.points[7][8] -= fd0;
    fb1 = fd1 < ld1;
    ad1 *= -1;
    ad2 *= -1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Output.points[8][0] -= ad3;
    ad4 = fd0 + fd1;
        Output.points[8][1] -= ld1;
    boolean lb2 = false;
if(ao1 != null){
      ao1.m3(ad1, ad2, ad3, ad4);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, ld1, ad1);
}
if(ao3 != null){
      ao2 = ao3.m4();
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
if(ao3 != null){
      ao2 = ao3.m4(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 - fd0;
    ab3 = ab4 || fb0;
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb0, ab1);
}
    double ld1 = 518.8279582314561;
if(fo0 != null){
      fo0.m2(fo1, ao1, ao2, ao3, ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3);
}
    fd0 *= -1;
    Thought lo2 = Thought384.getInstance(fd1, ld1, fd0, fd1);

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
    ab1 = ad1 < ad2;
    ad3 = ad4 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ad1, ad2, ad3);
}
    ab2 = ad4 < fd0;
if(ao2 != null){
      fd1 = ao2.m3();
}
    boolean lb0 = false;
if(ao4 != null){
      ao3 = ao4.m4(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fo1, ao1, ao2, ao3, ad1, ad2, ad3, ad4, lb0, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    boolean lb1 = false;
    ab4 = ad1 < ad2;

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
double m3() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Thought lo0 = Thought26.getInstance(fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
    fb1 = !lb1;
    boolean lb2 = true;
    boolean lb3 = true;
    lb2 = fd0 > fd1;
    fd0 = fd1 - fd0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    fd0 *= -1;
    double ld4 = 879.2616795188206;
if(fo1 != null){
      lb3 = fo1.m2(fd0, fd1, ld4, fd0);
}
    double ld5 = 380.8452680477225;
    Thought lo6 = Thought241.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, ld4, ld5);
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd0 = fd1 + ld4;
    ld5 = fd0 + fd1;
    boolean lb7 = true;
if(fo0 != null){
      ld4 = fo0.m3(lb7, fb0, fb1, lb1);
}
    Output.points[8][2] -= ld5;
    lb2 = !lb3;
    double ld8 = 749.3593455161057;

Thought.STACK_COUNTER++;
return ld8;
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
    ab2 = !ab3;
    fd1 *= -1;
if(fo1 != null){
          ab4 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
if(fo0 != null){
      fo0.m2(fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
    ab1 = ab2 && ab3;
    fd0 = fd1 - fd0;
    ab4 = fd1 > fd0;
    fb0 = fb1 || ab1;
    for(int i0=0; i0<10; i0++){
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
        boolean lb0 = true;
        boolean lb1 = false;
        ab4 = fb0 || fb1;
if(fo1 != null){
          fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
          fo0.m3(fd0, fd1, fd0, fd1);
}
        lb0 = fd0 > fd1;
        double ld2 = 192.84546254378924;
        lb1 = ld2 > fd0;
        fd1 *= -1;
        ld2 = fd0 + fd1;
if(fo1 != null){
          ld2 = fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
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
double m3(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
      ad2 = fo0.m3();
}
    ad3 = ad4 - fd0;
    fd1 = ad1 + ad2;
    ad3 *= -1;
    double ld0 = 383.24887324577503;
    ad3 = ad4 + fd0;
    fb0 = fd1 < ld0;
if(fo0 != null){
      fo1 = fo0.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    boolean lb1 = false;
    fb0 = fb1 || lb1;
if(fo1 != null){
      fo1.m3(fd0, fd1, ld0, ad1, fb0, fb1, lb1, fb0);
}
    ad2 = ad3 - ad4;
    fd0 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, ld0, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    double ld2 = 914.5955068699815;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ld0 *= -1;
    double ld3 = 379.5986280105951;
    ld2 = ld3 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(fb1, lb1, fb0, fb1);
}
    boolean lb4 = true;

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
    boolean lb0 = true;
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, ab3, ab4, fb0, fb1);
}
    Thought lo1 = Thought399.getInstance(fd1, ad1, ad2, ad3, lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, lb0);
}
    double ld2 = 984.0866905388596;
    ad3 = ad4 + fd0;
    ab1 = !ab2;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
        Thought lo0 = Thought112.getInstance(fd0, fd1, fd0, fd1);
    fb0 = fd0 < fd1;
    fd0 *= -1;
    fb1 = !fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    fb1 = fb0 || fb1;
if(ao2 != null){
      fd0 = ao2.m3();
}
        fb0 = fd1 < fd0;
    fb1 = !fb0;
    fb1 = fd1 < fd0;
    fb0 = fb1 || fb0;

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
    ad1 *= -1;
if(ao1 != null){
      ao1.m3(fb1, fb0, fb1, fb0);
}
    fb1 = ad2 > ad3;
    ad4 *= -1;
    boolean lb0 = true;
    double ld1 = 445.8481130548885;
if(ao2 != null){
      lb0 = ao2.m2(ao3, ao4, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, fb0);
}
    fb1 = ad1 < ad2;
    Thought lo2 = Thought95.getInstance(ad3, ad4, fd0, fd1, lb0, fb0, fb1, lb0);
if(ao1 != null){
      ld1 = ao1.m3(ao2, ao3, ao4, fo0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4);
}
    Output.points[8][3] -= ad1;
    boolean lb3 = false;
    fb0 = ad2 < ad3;
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld1);
}
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m2();
}
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, lb3, fb0);
}
    boolean lb4 = true;
    Output.points[8][4] -= fd0;
    fd1 = ld1 + ad1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb3);
}
if(ao3 != null){
      fd1 = ao3.m3(ld1, ad1, ad2, ad3, lb4, fb0, fb1, lb0);
}
    boolean lb5 = false;
    ad4 *= -1;
    lb3 = lb4 && lb5;
    fb0 = fb1 && lb0;
    Thought lo6 = Thought70.getInstance(ao4, fo0, fo1, ao1, lb3, lb4, lb5, fb0);
    fb1 = lb0 && lb3;

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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 + fd0;
    ab1 = fd1 < fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
if(ao3 != null){
      ao2 = ao3.m4(fd1, fd0, fd1, fd0);
}
    ab2 = ab3 || ab4;
    fb0 = fb1 && ab1;
if(ao4 != null){
      ab2 = ao4.m2(fo0, fo1, ao1, ao2, fd1, fd0, fd1, fd0);
}
if(ao4 != null){
      ao3 = ao4.m4();
}
    ab3 = !ab4;
    fb0 = fd1 < fd0;
if(fo0 != null){
      fb1 = fo0.m2(ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1, fb0, fb1, ab1, ab2);
}
    Thought lo0 = Thought340.getInstance(fo1, ao1, ao2, ao3, ab3, ab4, fb0, fb1);
    double ld1 = 390.38870083180313;
if(ao4 != null){
      ld1 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo2 = Thought217.getInstance(fd0, fd1, ld1, fd0);

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
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4);
}
if(ao1 != null){
      ao1.m3();
}
    ab1 = !ab2;
    boolean lb0 = false;
    ab2 = fd0 > fd1;
    double ld1 = 995.2317785494564;
    ld1 = ad1 + ad2;
    ad3 = ad4 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ab3, ab4, fb0, fb1);
}
    Thought lo2 = Thought225.getInstance(ao4, fo0, fo1, ao1, fd1, ld1, ad1, ad2, lb0, ab1, ab2, ab3);
    Thought lo3 = Thought297.getInstance(ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);

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
    boolean lb0 = false;
    double ld1 = 216.54980790850064;
    fd0 = fd1 - ld1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    boolean lb2 = true;
    fd1 = ld1 + fd0;
        fb0 = fb1 && lb0;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb0 = fb1 && lb0;
    Output.points[8][5] -= fd1;
    lb2 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1);
}
    lb0 = lb2 && fb0;
        Thought lo3 = Thought153.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0);
    fb1 = !lb0;
    boolean lb4 = true;
    fd1 = ld1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4();
}
    lb2 = lb4 || fb0;
    fb1 = lb0 && lb2;
    fd1 = ld1 - fd0;

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
    Thought lo0 = Thought206.getInstance(ab1, ab2, ab3, ab4);
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb0, fb1, ab1, ab2);
}
    if (ab3) {
        Output.points[8][6] -= fd1;
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab4, fb0, fb1, ab1);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
if(fo1 != null){
          fb1 = fo1.m2(fo0, fo1, fo0, fo1);
}
        ab1 = fd0 < fd1;
        ab2 = ab3 || ab4;
        fb0 = fd0 < fd1;
        fd0 *= -1;
if(fo0 != null){
          fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
        fb1 = ab1 && ab2;
if(fo1 != null){
          fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
        ab3 = fd1 > fd0;
if(fo0 != null){
          ab4 = fo0.m2();
}
        Thought lo1 = Thought372.getInstance(fb0, fb1, ab1, ab2);
        boolean lb2 = false;
        ab2 = fd1 < fd0;
if(fo1 != null){
          fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
        lb2 = ab1 && ab2;
if(fo1 != null){
          fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
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
Thought m4(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 = ad3 - ad4;
    fd0 = fd1 + ad1;
    Thought lo0 = Thought129.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1);
}
    double ld1 = 146.97079627329632;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0);
}
    boolean lb2 = false;
    lb2 = fd1 < ld1;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3();
}
    Thought lo3 = Thought169.getInstance(fb1, lb2, fb0, fb1);
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0, fd1, ld1, ad1, ad2, fb0, fb1, lb2, fb0);
}
if(fo1 != null){
      fo1.m3(ad3, ad4, fd0, fd1, fb1, lb2, fb0, fb1);
}
    ld1 = ad1 - ad2;
    boolean lb4 = false;

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
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = false;
    boolean lb1 = false;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ad2 = ad3 + ad4;
    Output.points[8][7] += fd0;
    fd1 = ad1 + ad2;
    Thought lo2 = Thought8.getInstance(ad3, ad4, fd0, fd1);
    boolean lb3 = true;
    Thought lo4 = Thought148.getInstance(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
    ab2 = ab3 || ab4;
    fd0 *= -1;
    boolean lb5 = true;
    Output.points[8][8] += fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Output.points[0][0] += ad1;
    boolean lb6 = true;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ad1;
    Thought lo7 = Thought32.getInstance(ab3, ab4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0, lb0, lb1, lb3, lb5);
}
    Thought lo8 = Thought4.getInstance(fd1, ad1, ad2, ad3, lb6, ab1, ab2, ab3);
    boolean lb9 = false;
    boolean lb10 = false;
    boolean lb11 = true;
    double ld12 = 916.8714635025663;

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
    boolean lb0 = true;
    Output.points[0][1] += fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = fb1 && lb0;
    Thought lo1 = Thought181.getInstance(ao1, ao2, ao3, ao4);
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    fd0 *= -1;
    boolean lb2 = true;
    lb2 = fd1 < fd0;
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0);
}
    boolean lb3 = false;
    fd1 = fd0 - fd1;
    fd0 *= -1;
if(fo1 != null){
      lb3 = fo1.m2();
}
    Thought lo4 = Thought132.getInstance(fb0, fb1, lb0, lb2);
    lb3 = fb0 && fb1;
    lb0 = lb2 || lb3;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, lb0, lb2, lb3, fb0);
}
    if (fb1) {
        Thought lo5 = Thought252.getInstance(fd1, fd0, fd1, fd0, lb0, lb2, lb3, fb0);
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
    ad2 *= -1;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    Thought lo0 = Thought30.getInstance(ao1, ao2, ao3, ao4);
    Thought lo1 = Thought357.getInstance(ad3, ad4, fd0, fd1);
    boolean lb2 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4);
}
    boolean lb3 = true;
    boolean lb4 = true;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;
    lb3 = !lb4;
    fd0 = fd1 - ad1;
    ad2 = ad3 + ad4;

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
    Output.points[0][2] -= fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 && ab4;
    double ld0 = 418.7001540799111;
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, ab1, ab2);
}
    ld0 *= -1;
    fd0 = fd1 - ld0;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought28.getInstance(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, ab3, ab4, fb0, fb1);
    fd1 *= -1;
    Output.points[0][3] -= ld0;
        fd0 *= -1;

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
    ad1 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);
}
if(ao3 != null){
      ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    double ld0 = 19.042861575346127;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1);
}
    Output.points[0][4] += fd0;
if(ao2 != null){
      fd1 = ao2.m3(ld0, ad1, ad2, ad3);
}
    double ld1 = 339.1527013731325;
    boolean lb2 = false;
    ab2 = ab3 || ab4;
    fb0 = ad3 < ad4;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd0, fd1, ld0, ld1);
}
    boolean lb3 = false;
if(ao3 != null){
      ad1 = ao3.m3();
}
    ad2 = ad3 - ad4;
if(ao4 != null){
      ao4.m1(fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, ld0, ld1, ad1, ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad2 = ao4.m3(ad3, ad4, fd0, fd1, fb0, fb1, lb2, lb3);
}
if(fo0 != null){
      fo0.m1(fo1, ao1, ao2, ao3, ab1, ab2, ab3, ab4);
}
    ld0 = ld1 + ad1;
    ad2 = ad3 - ad4;
    double ld4 = 352.6520273649594;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2);
}
if(ao3 != null){
      fb0 = ao3.m2(ad4, fd0, fd1, ld0);
}
    fb1 = lb2 || lb3;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld1, ld4, ad1, ad2);
}
    boolean lb5 = false;

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
    fb0 = fb1 && fb0;
    Output.points[0][5] -= fd1;
if(fo1 != null){
      fo0 = fo1.m4();
}
if(fo0 != null){
      fb1 = fo0.m2(fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
    Output.points[0][6] -= fd1;
    lb0 = fd0 > fd1;
    fb0 = fb1 || lb0;
        fd0 *= -1;
    boolean lb1 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    double ld2 = 786.0155678200675;
if(fo0 != null){
      lb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb0, lb1);
}
    Output.points[0][7] += fd0;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = false;
    lb0 = fb0 && fb1;
    lb0 = fd0 < fd1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fo1.m3(fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb1 = true;
    lb1 = fd1 > fd0;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
    fb1 = lb0 || lb1;
    boolean lb2 = true;
    lb2 = fb0 && fb1;
    lb0 = !lb1;
if(fo0 != null){
      fo1 = fo0.m4(lb2, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, lb1, lb2, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, lb0, lb1, lb2, fb0);
}
    fd1 *= -1;
    Thought lo3 = Thought30.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, lb1, lb2);

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
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fd1 = fd0 + fd1;
    Output.points[0][8] -= fd0;
    fb0 = fb1 && fb0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
    Output.points[1][0] += fd1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, fb1, fb0, fb1, fb0);
}
if(fo1 != null){
      fb1 = fo1.m2(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    fd0 = fd1 - fd0;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    double ld0 = 34.003019371712696;
    double ld1 = 29.74095940919958;
if(fo0 != null){
      fo0.m2(ld1, fd0, fd1, ld0);
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
}
