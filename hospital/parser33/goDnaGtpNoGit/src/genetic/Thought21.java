package genetic;
import java.util.ArrayList;
class Thought21 extends Thought{
private static ArrayList<Thought21> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 46.72390770416324;
private double fd1 = 35.862713955197215;
private Thought fo0 = null;
private Thought fo1 = null;
Thought21 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought21 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought21 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought21 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought21 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought21 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought21 instance = new Thought21 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
      fd0 = fo0.m3(fd1, fd0, fd1, fd0, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 && fb1;
    boolean lb0 = true;
    lb0 = !fb0;
    fb1 = !lb0;
    Output.points[1][5] -= fd1;
    Thought lo1 = Thought187.getInstance(fo1, fo0, fo1, fo0, fb0, fb1, lb0, fb0);
    Output.points[1][6] -= fd0;
    fd1 = fd0 + fd1;
    fb1 = fd0 < fd1;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    fd1 *= -1;
    lb0 = !lb2;
if(fo0 != null){
      fd0 = fo0.m3(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0);
}
    fb0 = !fb1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    lb0 = !lb2;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m1(lb3, fb0, fb1, lb0);
}
    lb2 = fd0 > fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 + fd1;
    Thought lo4 = Thought152.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1, lb3, fb0, fb1, lb0);

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
    boolean lb0 = true;
    Thought lo1 = Thought327.getInstance(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0);
}
    fd1 = fd0 - fd1;
    Thought lo2 = Thought253.getInstance(fd0, fd1, fd0, fd1);
    fd0 = fd1 - fd0;
    ab2 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
    fb0 = fd0 < fd1;
    Thought lo3 = Thought1.getInstance();
    fb1 = fd0 < fd1;
    lb0 = ab1 && ab2;
    ab3 = !ab4;
    fb0 = !fb1;
    Thought lo4 = Thought148.getInstance(lb0, ab1, ab2, ab3);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    ab1 = !ab2;
    ab3 = !ab4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1, fb0, fb1, lb0, ab1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
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
    Thought lo0 = Thought28.getInstance(fo1, fo0, fo1, fo0);
    boolean lb1 = false;
    lb1 = ad2 > ad3;
    ad4 = fd0 + fd1;
    ad1 *= -1;
    double ld2 = 283.4882561715509;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, ld2, ad1, ad2);
}
    ad3 = ad4 - fd0;
    boolean lb4 = false;
    fd1 = ld2 + ad1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    boolean lb5 = true;
if(fo1 != null){
      fo0 = fo1.m4(lb3, lb4, lb5, fb0);
}
    fb1 = ad2 < ad3;
    lb1 = lb3 && lb4;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld2, lb5, fb0, fb1, lb1);
}
    Output.points[1][7] += ad1;
    lb3 = lb4 && lb5;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4(ad2, ad3, ad4, fd0, lb1, lb3, lb4, lb5);
}
    Thought lo6 = Thought306.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb1, lb3);
if(fo0 != null){
      lb4 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      lb5 = fo1.m2(fd1, ld2, ad1, ad2);
}
    double ld7 = 194.58980121441076;
    fb0 = fb1 && lb1;
    double ld8 = 818.4037729465203;

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
    ab2 = ad2 < ad3;
    ab3 = ab4 && fb0;
    double ld0 = 698.9764238287248;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
if(fo0 != null){
      ld0 = fo0.m3();
}
    Output.points[1][8] += ad1;
if(fo1 != null){
      fo1.m1(fb1, ab1, ab2, ab3);
}
    boolean lb1 = true;
    boolean lb2 = false;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    ld0 = ad1 + ad2;
    Thought lo3 = Thought345.getInstance(ad3, ad4, fd0, fd1, fb1, lb1, lb2, ab1);
    ld0 *= -1;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fo0.m2(ad1, ad2, ad3, ad4);
}
    fd0 = fd1 - ld0;
    lb1 = !lb2;
    double ld4 = 935.5206963387834;
    boolean lb5 = false;
    lb5 = ld4 > ad1;
    Output.points[2][0] += ad2;
    ab1 = !ab2;
    boolean lb6 = false;
    ab2 = !ab3;

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
    fb1 = fb0 && fb1;
    fd0 = fd1 + fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb0 = fb1 && fb0;
    Output.points[2][1] -= fd1;
    fb1 = fb0 && fb1;
    double ld0 = 240.16396077106026;
    double ld1 = 732.33787453942;
if(ao2 != null){
      ld0 = ao2.m3();
}
    ld1 = fd0 + fd1;
if(ao3 != null){
      ld0 = ao3.m3(fb0, fb1, fb0, fb1);
}
    ld1 = fd0 - fd1;
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, ld0, ld1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    boolean lb2 = true;

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
    fb0 = !fb1;
if(ao2 != null){
      fb0 = ao2.m2(ad4, fd0, fd1, ad1, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2);
}
    ad2 *= -1;
    fb1 = !fb0;
    ad3 = ad4 - fd0;
    Thought lo0 = Thought342.getInstance(fd1, ad1, ad2, ad3);
    fb1 = fb0 && fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1);
}
    if (fb0) {
        Output.points[2][2] -= ad2;
        } else {
        Thought lo1 = Thought175.getInstance();
        Thought lo2 = Thought350.getInstance(fb1, fb0, fb1, fb0);
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
    Output.points[2][3] += fd0;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd1, fd0, fd1, fd0, ab2, ab3, ab4, fb0);
}
    fb1 = fd1 > fd0;
    Thought lo0 = Thought235.getInstance(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
    fb0 = fb1 || ab1;
    ab2 = fd1 > fd0;
    ab3 = !ab4;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4, fb0, fb1, ab1, ab2);
}
    fd1 *= -1;
    boolean lb1 = true;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    ab2 = fd0 < fd1;
    ab3 = ab4 && fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    fb1 = fd0 < fd1;
if(ao3 != null){
      ao3.m1(lb1, ab1, ab2, ab3);
}
    double ld2 = 701.3818024089612;
    ld2 *= -1;
    ab4 = !fb0;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2, fd1, ld2, fd0, fd1, fb1, lb1, ab1, ab2);
}
if(ao4 != null){
      ao3 = ao4.m4(ld2, fd0, fd1, ld2, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      fo0.m3(fo1, ao1, ao2, ao3, lb1, ab1, ab2, ab3);
}
    ab4 = fb0 && fb1;
    lb1 = !ab1;
if(ao4 != null){
      fd0 = ao4.m3(fo0, fo1, ao1, ao2);
}
    Thought lo3 = Thought207.getInstance(fd1, ld2, fd0, fd1);
    ab2 = ld2 < fd0;

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
    ad1 = ad2 - ad3;
    ab2 = ab3 || ab4;
    Thought lo0 = Thought277.getInstance(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
    ad2 = ad3 - ad4;
    fb0 = !fb1;
    boolean lb1 = false;
    lb1 = fd0 < fd1;
if(fo0 != null){
      ad1 = fo0.m3();
}
if(fo1 != null){
      fo1.m3(ab1, ab2, ab3, ab4);
}
        Thought lo2 = Thought180.getInstance(ao1, ao2, ao3, ao4, ad2, ad3, ad4, fd0, fb0, fb1, lb1, ab1);
    Thought lo3 = Thought138.getInstance(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);

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
    fb1 = fd1 < fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    fb0 = fd1 < fd0;
if(fo0 != null){
      fo0.m3(fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    Thought lo0 = Thought353.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 = fd1 + fd0;
if(fo0 != null){
          fo1 = fo0.m4();
}
    fb1 = fb0 || fb1;
    fd1 *= -1;

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
    double ld0 = 274.3235834911781;
if(fo1 != null){
      ab2 = fo1.m2(ab3, ab4, fb0, fb1);
}
    Output.points[2][4] -= ld0;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb1 = false;
    Output.points[2][5] += fd1;
if(fo0 != null){
      fo0.m3(ld0, fd0, fd1, ld0, ab4, fb0, fb1, lb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb1;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0);
}
    ab1 = ld0 > fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, fd0, fd1);
}
    Thought lo2 = Thought71.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0);
if(fo1 != null){
      fo1.m2();
}
    ab2 = !ab3;
    fd0 *= -1;
    fd1 = ld0 + fd0;
if(fo0 != null){
      fd1 = fo0.m3(ab4, fb0, fb1, lb1);
}
    ld0 = fd0 + fd1;
    boolean lb3 = false;
    ld0 = fd0 + fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, ld0, fd0, fd1, ld0, lb3, ab1, ab2, ab3);
}
    boolean lb4 = false;
    ab3 = fd0 < fd1;
    ab4 = !fb0;

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
if(fo1 != null){
      fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
    fb0 = fd0 > fd1;
    ad1 *= -1;
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    double ld0 = 76.19751977048918;
        Thought lo1 = Thought246.getInstance(fo1, fo0, fo1, fo0);
    double ld2 = 411.29893687709375;
    boolean lb3 = false;
if(fo0 != null){
      fo1 = fo0.m4(ld2, ad1, ad2, ad3);
}
    fb0 = !fb1;
if(fo1 != null){
      lb3 = fo1.m2(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb3;
if(fo1 != null){
      fo0 = fo1.m4(fb0, fb1, lb3, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ld2, ad1, ad2, ad3, fb1, lb3, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(ad4, fd0, fd1, ld0, lb3, fb0, fb1, lb3);
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
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      fb0 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4);
}
    double ld0 = 172.9350241449016;
    fb1 = !ab1;
    double ld1 = 975.4257907029686;
    ab2 = !ab3;
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4();
}
    ad3 *= -1;
    boolean lb3 = false;
if(fo0 != null){
      fo0.m2(ab2, ab3, ab4, fb0);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ld0, fb1, lb2, lb3, ab1);
}
if(fo1 != null){
      ab2 = fo1.m2(ld1, ad1, ad2, ad3, ab3, ab4, fb0, fb1);
}
    for(int i0=0; i0<10; i0++){
        Output.points[2][6] -= ad4;
        lb2 = !lb3;
        Thought lo4 = Thought271.getInstance(fo0, fo1, fo0, fo1, ab1, ab2, ab3, ab4);
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
          fb0 = fo1.m2(fd0, fd1, ld0, ld1);
}
        boolean lb5 = true;
if(fo0 != null){
          ad1 = fo0.m3(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
        fd1 = ld0 - ld1;
if(fo1 != null){
          fb0 = fo1.m2();
}
        double ld6 = 312.58633431379275;
}
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 *= -1;
    fd1 *= -1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m1(fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought78.getInstance(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Output.points[2][7] += fd0;
if(ao1 != null){
      fo1 = ao1.m4(fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    Output.points[2][8] += fd1;
    fb0 = fb1 || fb0;
if(ao2 != null){
      ao2.m2(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    if (fb0) {
        fb1 = fb0 && fb1;
        fb0 = fb1 || fb0;
        ad2 = ad3 + ad4;
        Thought lo0 = Thought203.getInstance(fd0, fd1, ad1, ad2);
        ad3 = ad4 + fd0;
        double ld1 = 596.4873755201539;
        } else if (fb1) {
        Thought lo2 = Thought106.getInstance(ao1, ao2, ao3, ao4, fd1, ad1, ad2, ad3);
        } else {
        Output.points[3][0] += ad4;
}
Thought.STACK_COUNTER++;
return fb0;
} catch (StackOverflowExc | NoClassDefFoundError e) { throw new CountDownExc(50);
} 
}
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = ab3 && ab4;
        fb0 = fb1 && ab1;
    boolean lb0 = true;
        fd0 *= -1;
    ab1 = fd1 > fd0;
if(ao2 != null){
      ao1 = ao2.m4();
}
    Thought lo1 = Thought288.getInstance(ab2, ab3, ab4, fb0);
    double ld2 = 870.0266321516509;
    fb1 = fd0 > fd1;
    boolean lb3 = false;
    ld2 = fd0 - fd1;

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
    Thought lo0 = Thought351.getInstance(ao1, ao2, ao3, ao4, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
    Thought lo1 = Thought98.getInstance(fd0, fd1, ad1, ad2, fb1, ab1, ab2, ab3);
    for(int i0=0; i0<10; i0++){
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, ab4, fb0, fb1, ab1);
}
        ad3 = ad4 + fd0;
if(fo0 != null){
          fo0.m2(fo1, ao1, ao2, ao3);
}
        ab2 = ab3 || ab4;
        for(int i1=0; i1<10; i1++){
if(fo0 != null){
              ao4 = fo0.m4(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
              fo1.m3(ao1, ao2, ao3, ao4, ad4, fd0, fd1, ad1);
}
if(fo0 != null){
              fo0.m2();
}
if(fo1 != null){
              fb0 = fo1.m2(fb1, ab1, ab2, ab3);
}
if(ao1 != null){
              ao1.m2(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab4, fb0, fb1, ab1);
}
if(ao1 != null){
              fo1 = ao1.m4(fd1, ad1, ad2, ad3, ab2, ab3, ab4, fb0);
}
            ad4 = fd0 + fd1;
            Thought lo2 = Thought50.getInstance(ao2, ao3, ao4, fo0, fb1, ab1, ab2, ab3);
            boolean lb3 = true;
}}
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
    fb0 = !fb1;
    boolean lb0 = false;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        lb0 = !lb1;
        fd0 *= -1;
        boolean lb2 = false;
        Output.points[3][1] += fd1;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, fd0, fd1);
}
        lb1 = fb0 || fb1;
if(fo1 != null){
          lb2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);
}
        lb0 = fd0 < fd1;
        lb1 = fb0 && fb1;
if(fo0 != null){
          lb2 = fo0.m2();
}
        Output.points[3][2] += fd0;
        lb0 = fd1 < fd0;
if(fo0 != null){
          fo1 = fo0.m4(lb1, fb0, fb1, lb2);
}
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb1, fb0, fb1);
}
        lb2 = !lb0;
        boolean lb3 = true;
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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      ab3 = fo0.m2(fd0, fd1, fd0, fd1);
}
    boolean lb0 = false;
    ab3 = ab4 && fb0;
    fd0 = fd1 + fd0;
        fb1 = fd1 > fd0;
    double ld1 = 973.2770901817659;
    boolean lb2 = false;
    fd0 = fd1 + ld1;
    Output.points[3][3] -= fd0;
if(fo1 != null){
      lb0 = fo1.m2(fo0, fo1, fo0, fo1, fd1, ld1, fd0, fd1);
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
    Thought lo0 = Thought176.getInstance();
    if (fb1) {
        Thought lo1 = Thought301.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad2, ad3, ad4, fd0, fb0, fb1, fb0, fb1);
}
        Output.points[3][4] -= fd1;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, fb0, fb1, fb0, fb1);
}
        boolean lb2 = false;
if(fo0 != null){
          lb2 = fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb2, fb0);
}
        for(int i0=0; i0<10; i0++){
            Thought lo3 = Thought382.getInstance(fo1, fo0, fo1, fo0);
            double ld4 = 265.93894728525134;
            ad4 = fd0 + fd1;
if(fo1 != null){
              fb1 = fo1.m2(ld4, ad1, ad2, ad3);
}
            boolean lb5 = false;
            Thought lo6 = Thought246.getInstance(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld4);
}}
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
    boolean lb0 = false;
    if (lb0) {
        } else if (ab1) {
if(fo0 != null){
          fo0.m3();
}
        ab2 = ab3 || ab4;
        ad1 = ad2 - ad3;
        ad4 *= -1;
        fb0 = fb1 && lb0;
        double ld1 = 137.11285767081978;
        Thought lo2 = Thought123.getInstance(ab1, ab2, ab3, ab4);
if(fo1 != null){
          fo1.m3(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld1, fb0, fb1, lb0, ab1);
}
        boolean lb3 = false;
if(fo1 != null){
          fo0 = fo1.m4(ad1, ad2, ad3, ad4, ab1, ab2, ab3, ab4);
}
        Output.points[3][5] += fd0;
        fd1 = ld1 + ad1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, fb0, fb1, lb3, lb0);
}
        double ld4 = 110.12140460574604;
        boolean lb5 = true;
        lb0 = ab1 && ab2;
        ab3 = ad1 > ad2;
if(fo1 != null){
          fo1.m1(fo0, fo1, fo0, fo1);
}
        if (ab4) {
            fb0 = ad3 > ad4;
if(fo0 != null){
              fd0 = fo0.m3(fd1, ld1, ld4, ad1);
}
            fb1 = ad2 < ad3;
            ad4 *= -1;
            fd0 *= -1;
}}
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = fb1 && fb0;
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 - fd0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    fb1 = fb0 && fb1;
if(ao3 != null){
      ao2 = ao3.m4();
}
if(ao4 != null){
      fd1 = ao4.m3(fb0, fb1, fb0, fb1);
}
if(fo0 != null){
      fd0 = fo0.m3(fo1, ao1, ao2, ao3, fd1, fd0, fd1, fd0, fb0, fb1, fb0, fb1);
}
    fb0 = fd1 > fd0;
    fb1 = !fb0;
    fb1 = fd1 > fd0;
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb0 = ad2 < ad3;
    double ld0 = 667.0774963960903;
if(ao3 != null){
      ao2 = ao3.m4(ad3, ad4, fd0, fd1, fb1, fb0, fb1, fb0);
}
    Thought lo1 = Thought123.getInstance(ao4, fo0, fo1, ao1, fb1, fb0, fb1, fb0);
    Thought lo2 = Thought316.getInstance(ao2, ao3, ao4, fo0);
    ld0 = ad1 + ad2;
    ad3 = ad4 + fd0;
    fd1 *= -1;
    fb1 = !fb0;
if(ao1 != null){
      fo1 = ao1.m4(ld0, ad1, ad2, ad3);
}
    fb1 = !fb0;
    fb1 = fb0 && fb1;
    Output.points[3][6] += ad4;
    fb0 = fb1 || fb0;
    fd0 *= -1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd1, ld0, ad1, ad2);
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
double m3(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(ao3 != null){
      ao2 = ao3.m4();
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    double ld0 = 715.9240801516154;
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = !ab3;
    ab4 = ld0 > fd0;
    fb0 = fd1 > ld0;
    boolean lb1 = true;
        Output.points[3][7] -= fd0;
    boolean lb2 = false;
    ab4 = fd1 < ld0;
    boolean lb3 = true;
if(ao4 != null){
      fd0 = ao4.m3(ab4, fb0, fb1, lb1);
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
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, ab2, ab3, ab4, fb0);
}
    fd1 *= -1;
    fb1 = ad1 > ad2;
    ad3 *= -1;
    boolean lb0 = true;
    lb0 = ad4 > fd0;
    Output.points[3][8] += fd1;
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad1, ad2, ad3, ad4, fb0, fb1, lb0, ab1);
}
        ab2 = fd0 > fd1;
    Output.points[4][0] -= ad1;
if(ao1 != null){
      ao1.m3(ao2, ao3, ao4, fo0, ab3, ab4, fb0, fb1);
}
    lb0 = ab1 && ab2;
if(fo1 != null){
      fo1.m2(ao1, ao2, ao3, ao4);
}
    boolean lb1 = false;
    ad2 = ad3 + ad4;

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
    fb1 = fb0 && fb1;
if(fo0 != null){
      fd1 = fo0.m3(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    Thought lo0 = Thought118.getInstance();
    boolean lb1 = true;
if(fo1 != null){
      fd0 = fo1.m3(lb1, fb0, fb1, lb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, fb0, fb1, lb1, fb0);
}
    boolean lb2 = false;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, fb0, fb1, lb1, lb2);
}
    fb0 = !fb1;
    boolean lb3 = true;
    lb1 = lb2 && lb3;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, lb1, lb2);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
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
    fd0 *= -1;
    ab1 = fd1 > fd0;
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0);
}
    ab2 = fd1 > fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      fo1 = fo0.m4();
}
if(fo0 != null){
      fo1 = fo0.m4(ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    boolean lb0 = true;
    fd1 *= -1;
    fd0 = fd1 - fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;
    Output.points[4][1] += fd1;

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
    fb0 = ad1 > ad2;
    ad3 = ad4 - fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m2(fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
    fb1 = lb0 || fb0;
    Thought lo1 = Thought155.getInstance(fo0, fo1, fo0, fo1, fb1, lb0, fb0, fb1);
    lb0 = !fb0;
    boolean lb2 = true;
    ad4 = fd0 - fd1;
    ad1 = ad2 + ad3;
        fb0 = fb1 || lb0;
if(fo0 != null){
      lb2 = fo0.m2(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad4 = fo1.m3(fd0, fd1, ad1, ad2);
}
    ad3 = ad4 - fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd1, ad1, ad2, ad3);
}
if(fo1 != null){
      fo0 = fo1.m4();
}
    fb0 = fb1 && lb0;
    boolean lb3 = true;
    Output.points[4][2] -= ad4;
    fd0 = fd1 + ad1;
if(fo1 != null){
      fo0 = fo1.m4(lb2, lb3, fb0, fb1);
}
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb0, lb2, lb3, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(ad1, ad2, ad3, ad4, fb1, lb0, lb2, lb3);
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
    double ld0 = 887.5720964941289;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ab2, ab3, ab4, fb0);
}
    fb1 = !ab1;
    boolean lb1 = false;
    Thought lo2 = Thought302.getInstance(fo1, fo0, fo1, fo0);
if(fo1 != null){
      fo1.m3(ld0, ad1, ad2, ad3);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ld0);
}
    ab4 = fb0 && fb1;
    ad1 *= -1;
    lb1 = !ab1;
if(fo0 != null){
      ab2 = fo0.m2();
}
    ad2 = ad3 - ad4;
    ab3 = ab4 || fb0;
    boolean lb3 = false;
    boolean lb4 = true;
    ab4 = !fb0;
if(fo1 != null){
      fo1.m2(fb1, lb1, lb3, lb4);
}
if(fo0 != null){
      ab1 = fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1, ab2, ab3, ab4, fb0);
}
    fb1 = lb1 && lb3;
    ad2 = ad3 + ad4;
    boolean lb5 = true;
    boolean lb6 = false;
if(fo1 != null){
      lb4 = fo1.m2(fd0, fd1, ld0, ad1, lb5, lb6, ab1, ab2);
}
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0, ab4, fb0, fb1, lb1);
}
    lb3 = ad2 > ad3;
if(fo1 != null){
      lb4 = fo1.m2(fo0, fo1, fo0, fo1);
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
    Thought lo0 = Thought73.getInstance(fd0, fd1, fd0, fd1);
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    double ld1 = 462.4458007951911;
    ld1 *= -1;
    fb1 = !fb0;
    Thought lo2 = Thought64.getInstance(fb1, fb0, fb1, fb0);
if(ao4 != null){
      ao4.m3(fo0, fo1, ao1, ao2, fd0, fd1, ld1, fd0, fb1, fb0, fb1, fb0);
}
if(ao4 != null){
      ao3 = ao4.m4(fd1, ld1, fd0, fd1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fb0 = ld1 < fd0;
    fd1 = ld1 - fd0;
    fd1 = ld1 - fd0;
    fb1 = fb0 && fb1;

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
        fb0 = ad1 > ad2;
if(ao2 != null){
      ad3 = ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fo1.m1(ad4, fd0, fd1, ad1);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
    boolean lb0 = false;
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = fd1 > ad1;
if(ao4 != null){
      ao3 = ao4.m4(fb0, fb1, lb0, fb0);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab1 = fd1 < fd0;
    ab2 = fd1 < fd0;
    ab3 = fd1 > fd0;
if(ao2 != null){
      ao2.m1(ao3, ao4, fo0, fo1, fd1, fd0, fd1, fd0, ab4, fb0, fb1, ab1);
}
    ab2 = fd1 > fd0;
    double ld0 = 440.2572666442779;
    for(int i0=0; i0<10; i0++){
if(ao1 != null){
          fd0 = ao1.m3(fd1, ld0, fd0, fd1, ab3, ab4, fb0, fb1);
}
        }
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    ld0 = fd0 - fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    double ld1 = 428.49637802639086;

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
    ad1 = ad2 - ad3;
if(ao2 != null){
      ad4 = ao2.m3(fd0, fd1, ad1, ad2);
}
    ab1 = ab2 || ab3;
    ab4 = ad3 < ad4;
    fd0 = fd1 - ad1;
    fb0 = fb1 || ab1;
    Output.points[4][3] += ad2;
if(ao3 != null){
      ad3 = ao3.m3(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ad1);
}
    double ld0 = 650.827144649373;
    boolean lb1 = true;
    ab1 = ad1 < ad2;
    ab2 = ab3 || ab4;

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
    boolean lb0 = true;
    double ld1 = 492.4818601513553;
    fb0 = !fb1;
if(fo1 != null){
      fo0 = fo1.m4();
}
    Thought lo2 = Thought245.getInstance(lb0, fb0, fb1, lb0);
        fd0 = fd1 + ld1;
    boolean lb3 = false;
    lb3 = fb0 && fb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld1, fd0, lb0, lb3, fb0, fb1);
}
    boolean lb4 = false;
    fd1 = ld1 - fd0;
    lb0 = !lb3;
    fd1 = ld1 + fd0;
    boolean lb5 = false;
    fd1 *= -1;
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
void own() throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fd0 = fd1 - fd0;
    Output.points[4][4] -= fd1;
        boolean lb0 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo1 = fo0.m4(fd1, fd0, fd1, fd0, lb0, fb0, fb1, lb0);
}
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, fb0, fb1, lb0, fb0);
}
    fb1 = fd0 > fd1;
    Thought lo1 = Thought50.getInstance(fo0, fo1, fo0, fo1);
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, fd0, fd1);
}
    fb0 = fb1 && lb0;
    boolean lb2 = false;
if(fo1 != null){
      fd0 = fo1.m3(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0);
}
    fd1 *= -1;
    boolean lb3 = false;
    lb2 = fd0 < fd1;
    boolean lb4 = true;
    lb3 = lb4 || fb0;
    Output.points[4][5] += fd0;
if(fo0 != null){
      fo0.m1();
}
    fb1 = lb0 || lb2;
    Thought lo5 = Thought95.getInstance(lb3, lb4, fb0, fb1);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb0, lb2, lb3, lb4);
}
if(fo1 != null){
      fb0 = fo1.m2(fd1, fd0, fd1, fd0, fb1, lb0, lb2, lb3);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, lb4, fb0, fb1, lb0);
}
if(fo1 != null){
      fo1.m2(fo0, fo1, fo0, fo1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, fd0, fd1);
}
    Thought lo6 = Thought54.getInstance(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1);

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
    fb0 = fb1 && lb0;
if(fo0 != null){
      fd0 = fo0.m3();
}
    fb0 = fb1 && lb0;
if(fo1 != null){
      fd1 = fo1.m3(fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb1, lb0, fb0, fb1);
}
    double ld1 = 561.8631943463671;
    lb0 = !fb0;
    ld1 *= -1;
    Output.points[4][6] += fd0;
    boolean lb2 = true;
    fb0 = fd1 < ld1;
    boolean lb3 = true;
    boolean lb4 = true;
    Output.points[4][7] += fd0;

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
