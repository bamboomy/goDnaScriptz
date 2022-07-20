package genetic;
import java.util.ArrayList;
class Thought148 extends Thought{
private static ArrayList<Thought148> instances = new ArrayList<>();
private static int instanceCounter = 0;
private boolean fb0 = true;
private boolean fb1 = false;
private double fd0 = 191.95870856344644;
private double fd1 = 619.5496802468409;
private Thought fo0 = null;
private Thought fo1 = null;
Thought148 (){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
Thought.STACK_COUNTER++;
}
Thought148 (boolean ab1, boolean ab2, boolean ab3, boolean ab4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fb0 = ab1; 
fb1 = ab2; 
Thought.STACK_COUNTER++;
}
Thought148 (double ad1, double ad2, double ad3, double ad4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fd0 = ad1; 
fd1 = ad2; 
Thought.STACK_COUNTER++;
}
Thought148 (double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought148 (Thought ao1, Thought ao2, Thought ao3, Thought ao4){
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
fo0 = ao1; 
fo1 = ao2; 
Thought.STACK_COUNTER++;
}
Thought148 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
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
Thought148 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
Thought148 (Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
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
public static Thought148 getInstance(){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 (); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ao1,  ao2,  ao3,  ao4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ao1,  ao2,  ao3,  ao4,  ab1,  ab2,  ab3,  ab4); 
instances.add(instance); 
return instance; 
} 
}
public static Thought148 getInstance(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4){
if (instances.size() >= 10) { 
instanceCounter++; 
instanceCounter%=10; 
return instances.get(instanceCounter); 
} else { 
Thought148 instance = new Thought148 ( ao1,  ao2,  ao3,  ao4,  ad1,  ad2,  ad3,  ad4,  ab1,  ab2,  ab3,  ab4); 
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
    double ld0 = 283.3586843546698;
    boolean lb1 = true;
    Thought lo2 = Thought224.getInstance(fd0, fd1, ld0, fd0, lb1, fb0, fb1, lb1);
    double ld3 = 389.73797713584486;
    fd0 = fd1 - ld0;
    ld3 *= -1;
    fb0 = fb1 && lb1;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fb0, fb1, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    Thought lo4 = Thought77.getInstance(fd0, fd1, ld0, ld3);
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
}
    fd0 = fd1 - ld0;
    boolean lb5 = false;
if(fo1 != null){
      ld3 = fo1.m3();
}
    Thought lo6 = Thought139.getInstance(fb0, fb1, lb1, lb5);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld0, ld3, fb0, fb1, lb1, lb5);
}
    fb0 = fd0 < fd1;
    Thought lo7 = Thought232.getInstance(ld0, ld3, fd0, fd1, fb1, lb1, lb5, fb0);
    boolean lb8 = true;
    boolean lb9 = false;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0, lb9, fb0, fb1, lb1);
}
    Output.points[0][7] += ld0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0);
}
    ld3 = fd0 + fd1;
    lb5 = ld0 < ld3;
    lb8 = lb9 || fb0;
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
void m1(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ab2 = fd1 < fd0;
    boolean lb0 = true;
if(fo1 != null){
      fo1.m1(fd1, fd0, fd1, fd0);
}
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
}
    ab2 = fd0 > fd1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    Thought lo1 = Thought40.getInstance(ab3, ab4, fb0, fb1);
    lb0 = ab1 && ab2;
    fd0 = fd1 - fd0;
    ab3 = ab4 && fb0;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, fb1, lb0, ab1, ab2);
}
    double ld2 = 881.6803935440565;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld2, fd0, ab3, ab4, fb0, fb1);
}
    lb0 = !ab1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
}
    fb1 = lb0 && ab1;
    ld2 = fd0 - fd1;
    ab2 = ld2 > fd0;
if(fo0 != null){
      ab3 = fo0.m2(fo1, fo0, fo1, fo0);
}
    Output.points[1][0] -= fd1;
    Output.points[1][1] -= ld2;

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
if(fo0 != null){
      fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
    Output.points[1][2] -= fd1;
    ad1 = ad2 - ad3;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad4, fd0, fd1, ad1);
}
    boolean lb0 = true;
    boolean lb1 = false;
    lb0 = !lb1;
    ad2 = ad3 + ad4;
    Thought lo2 = Thought166.getInstance();
    double ld3 = 550.5421767402632;
    fb0 = ad4 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      ld3 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, fb1, lb0, lb1, fb0);
}
    double ld4 = 669.7802441457144;
if(fo0 != null){
      fo1 = fo0.m4(ad4, fd0, fd1, ld3, fb1, lb0, lb1, fb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fb1, lb0, lb1, fb0);
}
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    fb1 = !lb0;
    lb1 = !fb0;
    ld4 = ad1 + ad2;
    Output.points[1][3] += ad3;

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
    ad2 = ad3 - ad4;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ad1, ad2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1);
}
    ad1 = ad2 + ad3;
if(fo0 != null){
      fo0.m1();
}
    ad4 *= -1;
    fd0 *= -1;
    Output.points[1][4] -= fd1;
    ab2 = ab3 || ab4;
if(fo1 != null){
      fo1.m3(fb0, fb1, ab1, ab2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad1, ad2, ad3, ad4, ab3, ab4, fb0, fb1);
}
    Thought lo0 = Thought71.getInstance(fd0, fd1, ad1, ad2, ab1, ab2, ab3, ab4);
    fb0 = ad3 < ad4;
if(fo0 != null){
      fo0.m1(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3(fo0, fo1, fo0, fo1);
}
    Thought lo1 = Thought6.getInstance(ad1, ad2, ad3, ad4);
    boolean lb2 = true;
    ab3 = fd0 < fd1;

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
    double ld0 = 892.1409830046465;
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ld0, fd0, fd1, ld0);
}
    boolean lb1 = false;
    lb1 = fb0 || fb1;
if(ao1 != null){
      fo1 = ao1.m4();
}
if(ao3 != null){
      ao2 = ao3.m4(lb1, fb0, fb1, lb1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, ld0, fd0, fb0, fb1, lb1, fb0);
}
if(ao4 != null){
      fd1 = ao4.m3(ld0, fd0, fd1, ld0, fb1, lb1, fb0, fb1);
}
    Thought lo2 = Thought338.getInstance(fo0, fo1, ao1, ao2, lb1, fb0, fb1, lb1);
    fd0 = fd1 + ld0;
    Thought lo3 = Thought242.getInstance(ao3, ao4, fo0, fo1);
    fb0 = fd0 < fd1;
    Output.points[1][5] += ld0;
if(ao2 != null){
      ao1 = ao2.m4(fd0, fd1, ld0, fd0);
}
    fb1 = !lb1;
    fd1 = ld0 - fd0;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fd1, ld0, fd0, fd1);
}
    Thought lo4 = Thought234.getInstance();

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
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
    ad1 = ad2 - ad3;
    ad4 *= -1;
    fb1 = fd0 < fd1;
    fb0 = fb1 && fb0;
    fb1 = !fb0;
    Thought lo0 = Thought163.getInstance(ao3, ao4, fo0, fo1, ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
    fd0 *= -1;
    Thought lo1 = Thought57.getInstance(fd1, ad1, ad2, ad3, fb1, fb0, fb1, fb0);
if(ao1 != null){
      fb1 = ao1.m2(ao2, ao3, ao4, fo0, fb0, fb1, fb0, fb1);
}
    ad4 = fd0 + fd1;
    ad1 *= -1;
    ad2 = ad3 - ad4;
    Thought lo2 = Thought79.getInstance(fo1, ao1, ao2, ao3);

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
      ao2 = ao3.m4(fd0, fd1, fd0, fd1);
}
if(fo0 != null){
      ao4 = fo0.m4(fo1, ao1, ao2, ao3, fd0, fd1, fd0, fd1);
}
    fd0 = fd1 + fd0;
    boolean lb0 = true;
    fd1 = fd0 + fd1;
if(ao4 != null){
      ao4.m3();
}
if(fo1 != null){
      fo0 = fo1.m4(lb0, ab1, ab2, ab3);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd0, fd1, fd0, fd1, ab4, fb0, fb1, lb0);
}
    fd0 *= -1;
    fd1 = fd0 + fd1;
    ab1 = ab2 || ab3;
if(ao1 != null){
      fd0 = ao1.m3(fd1, fd0, fd1, fd0, ab4, fb0, fb1, lb0);
}
    ab1 = fd1 < fd0;
    fd1 = fd0 + fd1;
    ab2 = ab3 && ab4;
    boolean lb1 = false;
    ab4 = fb0 || fb1;
    lb0 = fd0 > fd1;
    lb1 = fd0 < fd1;
    boolean lb2 = true;
    lb2 = fd0 < fd1;
    ab1 = ab2 || ab3;
    fd0 *= -1;
if(ao2 != null){
      fd1 = ao2.m3(ao3, ao4, fo0, fo1, ab4, fb0, fb1, lb0);
}
    lb1 = fd0 > fd1;
    lb2 = fd0 > fd1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
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
    boolean lb0 = false;
    boolean lb1 = true;
    double ld2 = 144.4269034884494;
    lb1 = ab1 && ab2;
if(ao1 != null){
      ao1.m1(ld2, ad1, ad2, ad3);
}
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad4, fd0, fd1, ld2);
}
    ab3 = ab4 || fb0;
    fb1 = ad1 > ad2;
    Output.points[1][6] += ad3;
    ad4 = fd0 + fd1;
    ld2 *= -1;
    lb0 = !lb1;
    ad1 *= -1;
if(ao2 != null){
      ad2 = ao2.m3();
}
if(ao3 != null){
      ao3.m2(ab1, ab2, ab3, ab4);
}
if(ao4 != null){
      ad3 = ao4.m3(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ld2, fb0, fb1, lb0, lb1);
}
    ad1 *= -1;
    Thought lo3 = Thought387.getInstance(ad2, ad3, ad4, fd0, ab1, ab2, ab3, ab4);

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
    fb0 = fb1 && fb0;
        fb1 = fb0 && fb1;
    double ld0 = 251.96996450722935;
    double ld1 = 120.15584878094336;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
}
    ld0 *= -1;
    Output.points[1][7] -= ld1;
if(fo0 != null){
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo0 != null){
          fo1 = fo0.m4(fd0, fd1, ld0, ld1);
}
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0);
}
    Thought lo2 = Thought326.getInstance();
    Thought lo3 = Thought254.getInstance(fb0, fb1, fb0, fb1);
    boolean lb4 = true;
    lb4 = ld1 < fd0;
    fb0 = fd1 > ld0;
    Thought lo5 = Thought279.getInstance(fo0, fo1, fo0, fo1, ld1, fd0, fd1, ld0, fb1, lb4, fb0, fb1);
    Thought lo6 = Thought218.getInstance(ld1, fd0, fd1, ld0, lb4, fb0, fb1, lb4);
    Thought lo7 = Thought55.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, lb4, fb0);
if(fo0 != null){
      fb1 = fo0.m2(fo1, fo0, fo1, fo0);
}
    lb4 = ld1 < fd0;
    Thought lo8 = Thought38.getInstance(fd1, ld0, ld1, fd0);
    Output.points[1][8] += fd1;
    if (fb0) {
        Output.points[2][0] -= ld0;
        fb1 = ld1 > fd0;
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ld0, ld1, fd0);
}
}
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
boolean m2(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
if(fo0 != null){
          fo1 = fo0.m4();
}
    Thought lo0 = Thought382.getInstance(ab2, ab3, ab4, fb0);
    Output.points[2][1] += fd1;
    fb1 = !ab1;
    fd0 = fd1 - fd0;
if(fo1 != null){
      ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd1, fd0, fd1, fd0, ab3, ab4, fb0, fb1);
}
if(fo1 != null){
      fo0 = fo1.m4(fd1, fd0, fd1, fd0, ab1, ab2, ab3, ab4);
}
    double ld1 = 750.5210880483634;
    fb0 = fd0 > fd1;
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      ab4 = fo1.m2(fo0, fo1, fo0, fo1);
}
    boolean lb2 = false;
    boolean lb3 = true;
    ab3 = ab4 || fb0;
    fb1 = fd0 < fd1;
    boolean lb4 = false;
    Output.points[2][2] += ld1;
    boolean lb5 = false;
    boolean lb6 = true;
    boolean lb7 = true;
    boolean lb8 = false;
    boolean lb9 = false;
    double ld10 = 67.89128801466724;
    Output.points[2][3] += ld10;
    fd0 = fd1 - ld1;
    Output.points[2][4] += ld10;
    lb2 = !lb3;

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
boolean m2(double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = ad1 < ad2;
if(fo1 != null){
      fo0 = fo1.m4(ad3, ad4, fd0, fd1);
}
    boolean lb0 = false;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4);
}
    Thought lo1 = Thought353.getInstance();
    fd0 *= -1;
    lb0 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4(lb0, fb0, fb1, lb0);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd1, ad1, ad2, ad3, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
          fo1.m2(ad4, fd0, fd1, ad1, fb1, lb0, fb0, fb1);
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
boolean m2(double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
    double ld0 = 585.8994575113579;
    Thought lo1 = Thought85.getInstance(fo0, fo1, fo0, fo1, ab2, ab3, ab4, fb0);
    Thought lo2 = Thought37.getInstance(fo0, fo1, fo0, fo1);
    ad2 = ad3 + ad4;
if(fo0 != null){
      fo0.m2(fd0, fd1, ld0, ad1);
}
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
}
if(fo1 != null){
      fb1 = fo1.m2();
}
    double ld3 = 828.5330753685938;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    if (fb1) {
if(fo0 != null){
          fo1 = fo0.m4(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3, ab1, ab2, ab3, ab4);
}
        Output.points[2][5] += ad1;
        fb0 = !fb1;
        ad2 *= -1;
if(fo1 != null){
          fo1.m2(ad3, ad4, fd0, fd1, ab1, ab2, ab3, ab4);
}
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, fb0, fb1, ab1, ab2);
}
        ab3 = !ab4;
        Thought lo4 = Thought197.getInstance(fo1, fo0, fo1, fo0);
        fb0 = !fb1;
        ab1 = ld3 > ad1;
if(fo0 != null){
          fo1 = fo0.m4(ad2, ad3, ad4, fd0);
}
        ab2 = fd1 < ld0;
        for(int i0=0; i0<10; i0++){
            boolean lb5 = false;
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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    Output.points[2][6] += fd1;
    fb1 = !fb0;
    double ld0 = 488.44560313990144;
if(ao2 != null){
      ld0 = ao2.m3(ao3, ao4, fo0, fo1, fd0, fd1, ld0, fd0);
}
    fd1 = ld0 + fd0;
    Output.points[2][7] -= fd1;
    ld0 = fd0 - fd1;
    ld0 *= -1;
    fb1 = fd0 < fd1;
if(ao1 != null){
      ao1.m3();
}
    fb0 = ld0 < fd0;
    fb1 = fb0 && fb1;
    Output.points[2][8] += fd1;
    ld0 = fd0 + fd1;

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
    boolean lb0 = false;
if(ao3 != null){
      ao2 = ao3.m4(fb0, fb1, lb0, fb0);
}
    Thought lo1 = Thought223.getInstance(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
if(ao2 != null){
      ao2.m3(fd0, fd1, ad1, ad2, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, lb0, fb0, fb1, lb0);
}
if(ao3 != null){
      ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo2 = Thought364.getInstance(ad3, ad4, fd0, fd1);
    fb0 = ad1 < ad2;
if(ao2 != null){
      fb1 = ao2.m2(ao3, ao4, fo0, fo1, ad3, ad4, fd0, fd1);
}
    Thought lo3 = Thought254.getInstance();
    Thought lo4 = Thought67.getInstance(lb0, fb0, fb1, lb0);
if(ao1 != null){
      ad1 = ao1.m3(ao2, ao3, ao4, fo0, ad2, ad3, ad4, fd0, fb0, fb1, lb0, fb0);
}
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, lb0, fb0, fb1);
}
    lb0 = fb0 || fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, lb0, fb0, fb1, lb0);
}
    double ld5 = 958.6786814893737;
    fb0 = ad4 < fd0;
if(ao1 != null){
      fd1 = ao1.m3(ao2, ao3, ao4, fo0);
}
    ld5 = ad1 + ad2;
    fb1 = lb0 && fb0;
if(fo1 != null){
      fb1 = fo1.m2(ad3, ad4, fd0, fd1);
}
if(ao1 != null){
      ld5 = ao1.m3(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
    lb0 = fd0 > fd1;
if(fo1 != null){
      fb0 = fo1.m2();
}
    fb1 = lb0 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(fb1, lb0, fb0, fb1);
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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, fd0, fd1, fd0, fd1, ab2, ab3, ab4, fb0);
}
if(ao1 != null){
      fo1 = ao1.m4(fd0, fd1, fd0, fd1, fb1, ab1, ab2, ab3);
}
    ab4 = fd0 > fd1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb0, fb1, ab1, ab2);
}
    ab3 = ab4 || fb0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(fd1, fd0, fd1, fd0);
}
    Output.points[3][0] += fd1;
    boolean lb0 = false;
    fb0 = fb1 && lb0;
    boolean lb1 = true;
if(ao3 != null){
      fd0 = ao3.m3(ao4, fo0, fo1, ao1, fd1, fd0, fd1, fd0);
}
    lb1 = fd1 > fd0;
    ab1 = fd1 > fd0;
    fd1 = fd0 - fd1;
    fd0 *= -1;

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
boolean m2(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4, boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    ad2 *= -1;
if(ao3 != null){
      ao2 = ao3.m4();
}
    Thought lo0 = Thought323.getInstance(ab1, ab2, ab3, ab4);
    ad3 = ad4 - fd0;
    fb0 = fb1 || ab1;
    fd1 *= -1;
    ad1 = ad2 + ad3;
    ad4 = fd0 + fd1;
    double ld1 = 714.7487851843213;
    ld1 *= -1;
    boolean lb2 = false;
    ad1 *= -1;
    ab1 = ad2 < ad3;

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
    double ld0 = 531.2490823371008;
    Thought lo1 = Thought217.getInstance(fo1, fo0, fo1, fo0, ld0, fd0, fd1, ld0, fb1, fb0, fb1, fb0);
    fb1 = fd0 < fd1;
    boolean lb2 = false;
    lb2 = !fb0;
    fb1 = lb2 && fb0;
    double ld3 = 481.0687664235324;
    Output.points[3][1] += ld0;
    Output.points[3][2] -= ld3;
    fd0 *= -1;
    double ld4 = 738.6420303236364;
    fd0 = fd1 - ld0;
    ld3 *= -1;
    ld4 = fd0 - fd1;
    ld0 = ld3 + ld4;
    fb1 = lb2 && fb0;
    fb1 = !lb2;
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, ld0, ld3, fb0, fb1, lb2, fb0);
}
    ld4 *= -1;
if(fo1 != null){
      fb1 = fo1.m2(fo0, fo1, fo0, fo1, lb2, fb0, fb1, lb2);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
if(fo0 != null){
      fd0 = fo0.m3(fd1, ld0, ld3, ld4);
}
    boolean lb5 = true;
    Thought lo6 = Thought192.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld3);
    lb5 = ld4 > fd0;

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
if(fo1 != null){
      ab1 = fo1.m2();
}
    boolean lb0 = true;
if(fo0 != null){
      ab1 = fo0.m2(ab2, ab3, ab4, fb0);
}
    fb1 = !lb0;
    if (ab1) {
if(fo1 != null){
          ab2 = fo1.m2(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, ab3, ab4, fb0, fb1);
}
        lb0 = fd0 > fd1;
        boolean lb1 = true;
        lb0 = fd0 < fd1;
        fd0 = fd1 - fd0;
        Output.points[3][3] += fd1;
        boolean lb2 = false;
if(fo1 != null){
          fo0 = fo1.m4(fd0, fd1, fd0, fd1, lb0, ab1, ab2, ab3);
}
        boolean lb3 = true;
        ab3 = ab4 && fb0;
        boolean lb4 = false;
        boolean lb5 = true;
        ab4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4(fo0, fo1, fo0, fo1, lb1, lb2, lb3, lb4);
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
    fb0 = fb1 && fb0;
    boolean lb0 = false;
if(fo0 != null){
      fb0 = fo0.m2(fo1, fo0, fo1, fo0);
}
    fb1 = lb0 && fb0;
    ad2 *= -1;
    boolean lb1 = true;
    for(int i0=0; i0<10; i0++){
        ad3 = ad4 - fd0;
        if (fb0) {
            fb1 = lb0 || lb1;
if(fo1 != null){
              fb0 = fo1.m2(fd1, ad1, ad2, ad3);
}
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad4, fd0, fd1, ad1);
}
            double ld2 = 131.07315869642915;
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
if(fo0 != null){
      fo0.m3();
}
    ab2 = ab3 && ab4;
    fb0 = fb1 || ab1;
    ab2 = ad1 < ad2;
if(fo1 != null){
      ad3 = fo1.m3(ab3, ab4, fb0, fb1);
}
    ab1 = ad4 < fd0;
if(fo0 != null){
      fd1 = fo0.m3(fo1, fo0, fo1, fo0, ad1, ad2, ad3, ad4, ab2, ab3, ab4, fb0);
}
    Output.points[3][4] += fd0;
if(fo1 != null){
      fd1 = fo1.m3(ad1, ad2, ad3, ad4, fb1, ab1, ab2, ab3);
}
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ab4, fb0, fb1, ab1);
}
    fd0 = fd1 - ad1;
if(fo0 != null){
      ad2 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld0 = 213.5164864829059;

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
        fb1 = fb0 && fb1;
    fb0 = !fb1;
    Output.points[3][5] += fd1;
    boolean lb0 = false;
    lb0 = fd0 > fd1;
    double ld1 = 658.2931927509626;
    boolean lb2 = false;
    Output.points[3][6] -= ld1;
if(ao3 != null){
      ao2 = ao3.m4(fd0, fd1, ld1, fd0);
}
if(ao4 != null){
      ao4.m2(fo0, fo1, ao1, ao2, fd1, ld1, fd0, fd1);
}
if(ao3 != null){
      lb2 = ao3.m2();
}
if(fo0 != null){
      ao4 = fo0.m4(fb0, fb1, lb0, lb2);
}
if(fo1 != null){
      fb0 = fo1.m2(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, fb1, lb0, lb2, fb0);
}
if(fo0 != null){
      fb1 = fo0.m2(fd0, fd1, ld1, fd0, lb0, lb2, fb0, fb1);
}
    lb0 = fd1 < ld1;
    Output.points[3][7] -= fd0;
    fd1 *= -1;
    lb2 = !fb0;
    ld1 = fd0 + fd1;
    fb1 = ld1 < fd0;
if(fo1 != null){
      fd1 = fo1.m3(ao1, ao2, ao3, ao4, lb0, lb2, fb0, fb1);
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
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
if(ao2 != null){
      ao1 = ao2.m4(ad2, ad3, ad4, fd0);
}
    Thought lo0 = Thought4.getInstance(ao3, ao4, fo0, fo1, fd1, ad1, ad2, ad3);
if(ao2 != null){
      ao1 = ao2.m4();
}
    boolean lb1 = true;
    boolean lb2 = false;
if(ao3 != null){
      lb1 = ao3.m2(lb2, fb0, fb1, lb1);
}
    lb2 = fb0 && fb1;
if(ao4 != null){
      lb1 = ao4.m2(fo0, fo1, ao1, ao2, ad4, fd0, fd1, ad1, lb2, fb0, fb1, lb1);
}
    boolean lb3 = true;
if(ao4 != null){
      ao3 = ao4.m4(ad2, ad3, ad4, fd0, lb2, lb3, fb0, fb1);
}
    lb1 = fd1 < ad1;
    double ld4 = 5.718039419686654;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4, lb2, lb3, fb0, fb1);
}
    lb1 = !lb2;
    ad1 *= -1;
if(fo1 != null){
      fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
    double ld5 = 341.95068302336364;
    lb3 = ad1 < ad2;
    fb0 = fb1 && lb1;
    lb2 = !lb3;
    boolean lb6 = false;
    if (lb6) {
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
if(ao1 != null){
      ao1.m3(fd1, fd0, fd1, fd0);
}
    fd1 = fd0 + fd1;
    fd0 = fd1 + fd0;
    fd1 = fd0 - fd1;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, fd0, fd1, fd0, fd1);
}
if(ao3 != null){
      ao2 = ao3.m4();
}
    boolean lb0 = false;
    double ld1 = 272.3799255134281;
if(fo0 != null){
      ao4 = fo0.m4(lb0, ab1, ab2, ab3);
}
if(fo1 != null){
      fo1.m3(ao1, ao2, ao3, ao4, ld1, fd0, fd1, ld1, ab4, fb0, fb1, lb0);
}
    ab1 = ab2 && ab3;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld1, fd0, ab4, fb0, fb1, lb0);
}
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ab1, ab2, ab3, ab4);
}
    fb0 = !fb1;
    lb0 = fd1 < ld1;
    ab1 = ab2 || ab3;
    fd0 = fd1 - ld1;
    Thought lo2 = Thought276.getInstance(ao1, ao2, ao3, ao4);
    Output.points[3][8] += fd0;

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
if(ao2 != null){
      ao1 = ao2.m4(ad1, ad2, ad3, ad4);
}
    lb0 = ab1 && ab2;
    Thought lo1 = Thought123.getInstance(ao3, ao4, fo0, fo1, fd0, fd1, ad1, ad2);
    double ld2 = 32.54778146174045;
if(ao1 != null){
      ad2 = ao1.m3();
}
        ab3 = !ab4;
if(ao2 != null){
      ao2.m2(fb0, fb1, lb0, ab1);
}
    ad3 = ad4 - fd0;
    Thought lo3 = Thought296.getInstance(ao3, ao4, fo0, fo1, fd1, ld2, ad1, ad2, ab2, ab3, ab4, fb0);
    boolean lb4 = false;
    double ld5 = 467.36623692926736;
        Thought lo6 = Thought33.getInstance(ad2, ad3, ad4, fd0, fb0, fb1, lb0, lb4);
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0, ab1, ab2, ab3, ab4);
}
if(ao1 != null){
      fo1 = ao1.m4(ao2, ao3, ao4, fo0);
}
if(fo1 != null){
      fd1 = fo1.m3(ld2, ld5, ad1, ad2);
}
    fb0 = !fb1;
    ad3 = ad4 - fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, fd1, ld2, ld5, ad1);
}
    ad2 *= -1;
    lb0 = !lb4;

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
if(fo0 != null){
      fd1 = fo0.m3();
}
if(fo0 != null){
      fo1 = fo0.m4(fb0, fb1, fb0, fb1);
}
    fb0 = fb1 && fb0;
    fb1 = fd0 > fd1;
if(fo1 != null){
      fo1.m1(fo0, fo1, fo0, fo1, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
    Thought lo0 = Thought20.getInstance(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
    Thought lo1 = Thought165.getInstance(fo0, fo1, fo0, fo1, fb0, fb1, fb0, fb1);
    double ld2 = 542.3577106815289;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    Thought lo3 = Thought52.getInstance(ld2, fd0, fd1, ld2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0);
}
    fb0 = !fb1;
    if (fb0) {
        fd1 = ld2 + fd0;
        Output.points[4][0] += fd1;
        fb1 = fb0 || fb1;
        ld2 = fd0 + fd1;
        boolean lb4 = false;
        Output.points[4][1] += ld2;
        lb4 = fb0 && fb1;
if(fo1 != null){
          fo0 = fo1.m4();
}
        for(int i0=0; i0<10; i0++){
            Thought lo5 = Thought246.getInstance(lb4, fb0, fb1, lb4);
            boolean lb6 = false;
if(fo1 != null){
              fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld2, fd0, lb4, fb0, fb1, lb6);
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
Thought m4(boolean ab1, boolean ab2, boolean ab3, boolean ab4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    boolean lb0 = true;
    double ld1 = 884.5925418370831;
if(fo0 != null){
      fo1 = fo0.m4(ld1, fd0, fd1, ld1, ab1, ab2, ab3, ab4);
}
    fb0 = fb1 && lb0;
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ab1, ab2, ab3, ab4);
}
if(fo1 != null){
      fb0 = fo1.m2(fo0, fo1, fo0, fo1);
}
        fb1 = fd1 > ld1;
if(fo0 != null){
      lb0 = fo0.m2(fd0, fd1, ld1, fd0);
}
    boolean lb2 = false;
    Output.points[4][2] += fd1;
    boolean lb3 = true;
if(fo0 != null){
      fo1 = fo0.m4(fo1, fo0, fo1, fo0, ld1, fd0, fd1, ld1);
}
if(fo1 != null){
      fo1.m3();
}
    Thought lo4 = Thought311.getInstance(lb2, lb3, ab1, ab2);
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, fd0, fd1, ld1, fd0, ab3, ab4, fb0, fb1);
}
    boolean lb5 = true;
    double ld6 = 901.6920463839472;
    Thought lo7 = Thought344.getInstance(fd0, fd1, ld1, ld6, lb0, lb2, lb3, lb5);
    fd0 = fd1 - ld1;
    boolean lb8 = false;
if(fo0 != null){
      ld6 = fo0.m3(fo1, fo0, fo1, fo0, lb8, ab1, ab2, ab3);
}
    boolean lb9 = true;
    ab3 = fd0 > fd1;
    boolean lb10 = false;

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
      fo0.m3(fo1, fo0, fo1, fo0);
}
if(fo1 != null){
      ad1 = fo1.m3(ad2, ad3, ad4, fd0);
}
    double ld0 = 110.47325154123862;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ad1);
}
    if (fb1) {
if(fo1 != null){
          fo1.m2();
}
        Thought lo1 = Thought118.getInstance(fb0, fb1, fb0, fb1);
        boolean lb2 = false;
        ad2 *= -1;
if(fo0 != null){
          fo0.m1(fo1, fo0, fo1, fo0, ad3, ad4, fd0, fd1, lb2, fb0, fb1, lb2);
}
        double ld3 = 952.5142592674678;
        boolean lb4 = false;
if(fo1 != null){
          fo1.m3(ld3, ld0, ad1, ad2, lb4, fb0, fb1, lb2);
}
        for(int i0=0; i0<10; i0++){
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
    boolean lb0 = false;
    ab1 = ab2 && ab3;
    boolean lb1 = true;
    Output.points[4][3] += ad1;
if(fo1 != null){
      ad2 = fo1.m3(fo0, fo1, fo0, fo1, ab3, ab4, fb0, fb1);
}
if(fo0 != null){
      ad3 = fo0.m3(fo1, fo0, fo1, fo0);
}
    double ld2 = 1.8357816493173282;
    lb0 = lb1 && ab1;
    ab2 = ad3 < ad4;
    Thought lo3 = Thought75.getInstance(fd0, fd1, ld2, ad1);
    Thought lo4 = Thought382.getInstance(fo1, fo0, fo1, fo0, ad2, ad3, ad4, fd0);
    Thought lo5 = Thought74.getInstance();
    double ld6 = 151.02435090025125;
if(fo1 != null){
      fd0 = fo1.m3(ab3, ab4, fb0, fb1);
}
    boolean lb7 = false;
    lb0 = fd1 < ld2;
        ld6 = ad1 + ad2;
    lb1 = lb7 && ab1;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1, ad3, ad4, fd0, fd1, ab2, ab3, ab4, fb0);
}
    Thought lo8 = Thought304.getInstance(ld2, ld6, ad1, ad2, fb1, lb0, lb1, lb7);
    ab1 = !ab2;

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
    fb1 = fd0 < fd1;
    fb0 = fd0 < fd1;
if(ao2 != null){
      ao2.m3(ao3, ao4, fo0, fo1, fb1, fb0, fb1, fb0);
}
    fb1 = fb0 || fb1;
    fd0 = fd1 + fd0;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1);
}
    Thought lo0 = Thought252.getInstance(fd1, fd0, fd1, fd0);
    fd1 = fd0 + fd1;
    fb0 = fd0 < fd1;
    fd0 = fd1 + fd0;
    for(int i0=0; i0<10; i0++){
        fb1 = fb0 || fb1;
        Thought lo1 = Thought23.getInstance(ao1, ao2, ao3, ao4, fd1, fd0, fd1, fd0);
        fb0 = fd1 > fd0;
        Output.points[4][4] += fd1;
if(fo0 != null){
          fb1 = fo0.m2();
}
        Thought lo2 = Thought22.getInstance(fb0, fb1, fb0, fb1);
if(fo1 != null){
          fo1.m2(ao1, ao2, ao3, ao4, fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        double ld3 = 339.53438486414205;
        Thought lo4 = Thought377.getInstance(ld3, fd0, fd1, ld3, fb0, fb1, fb0, fb1);
        fb0 = fd0 < fd1;
        fb1 = ld3 > fd0;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4, fb0, fb1, fb0, fb1);
}
        fb0 = !fb1;
if(fo1 != null){
          fo0 = fo1.m4(ao1, ao2, ao3, ao4);
}
if(fo0 != null){
          fb0 = fo0.m2(fd1, ld3, fd0, fd1);
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
Thought m4(Thought ao1, Thought ao2, Thought ao3, Thought ao4, double ad1, double ad2, double ad3, double ad4) throws CountDownExc {
Thought.STACK_COUNTER--;
if(Thought.STACK_COUNTER <=0){
throw new StackOverflowExc();
}
try {
if (false) { throw new CountDownExc(-1); }
    fb1 = !fb0;
if(ao1 != null){
      ao1.m1(ao2, ao3, ao4, fo0, ad1, ad2, ad3, ad4);
}
if(fo1 != null){
      fo1.m3();
}
    double ld0 = 248.742376811873;
    ad4 = fd0 - fd1;
    ld0 = ad1 + ad2;
if(ao2 != null){
      ao1 = ao2.m4(fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1, ad3, ad4, fd0, fd1, fb0, fb1, fb0, fb1);
}
    fb0 = ld0 < ad1;
    ad2 = ad3 + ad4;
    fd0 = fd1 + ld0;
if(ao2 != null){
      ao2.m3(ad1, ad2, ad3, ad4, fb1, fb0, fb1, fb0);
}
    fd0 = fd1 - ld0;
    ad1 = ad2 - ad3;
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, fb1, fb0, fb1, fb0);
}
if(ao3 != null){
      fb1 = ao3.m2(ao4, fo0, fo1, ao1);
}
    Thought lo1 = Thought299.getInstance(ad4, fd0, fd1, ld0);
    fb0 = fb1 && fb0;
if(ao3 != null){
      ao2 = ao3.m4(ao4, fo0, fo1, ao1, ad1, ad2, ad3, ad4);
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
        double ld0 = 705.9960924091275;
    fd0 = fd1 - ld0;
    Thought lo1 = Thought7.getInstance();
    ab2 = fd0 < fd1;
if(ao2 != null){
      ao1 = ao2.m4(ab3, ab4, fb0, fb1);
}
if(ao4 != null){
      ao3 = ao4.m4(fo0, fo1, ao1, ao2, ld0, fd0, fd1, ld0, ab1, ab2, ab3, ab4);
}
    fb0 = fd0 < fd1;
        ld0 = fd0 - fd1;
    fb1 = ld0 < fd0;
    fd1 = ld0 + fd0;
    Thought lo2 = Thought213.getInstance(fd1, ld0, fd0, fd1, ab1, ab2, ab3, ab4);
if(ao3 != null){
      ld0 = ao3.m3(ao4, fo0, fo1, ao1, fb0, fb1, ab1, ab2);
}
    fd0 = fd1 + ld0;

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
if(ao1 != null){
      ao1.m2(ao2, ao3, ao4, fo0);
}
    ab1 = ab2 || ab3;
if(fo1 != null){
      ab4 = fo1.m2(ad2, ad3, ad4, fd0);
}
    boolean lb0 = true;
    ab4 = fd1 > ad1;
    fb0 = !fb1;
if(ao2 != null){
      ao1 = ao2.m4(ao3, ao4, fo0, fo1, ad2, ad3, ad4, fd0);
}
if(ao2 != null){
      ao1 = ao2.m4();
}
    lb0 = fd1 < ad1;
if(ao3 != null){
          ad2 = ao3.m3(ab1, ab2, ab3, ab4);
}
    boolean lb1 = true;
if(ao4 != null){
      ao4.m1(fo0, fo1, ao1, ao2, ad3, ad4, fd0, fd1, ab4, fb0, fb1, lb0);
}
    double ld2 = 551.012676460264;
    boolean lb3 = false;
    boolean lb4 = true;
    lb1 = ld2 < ad1;
    double ld5 = 719.8340291233029;

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
if(fo0 != null){
      fo1 = fo0.m4(fd0, fd1, fd0, fd1, fb0, fb1, fb0, fb1);
}
        boolean lb0 = false;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1, lb0, fb0, fb1, lb0);
}
    fb0 = !fb1;
    fd0 = fd1 + fd0;
if(fo1 != null){
      fo0 = fo1.m4(fo0, fo1, fo0, fo1);
}
    lb0 = fd1 < fd0;
    fd1 *= -1;
    Output.points[4][5] -= fd0;
    fd1 = fd0 - fd1;
    fb0 = fd0 > fd1;
if(fo0 != null){
      fo0.m1(fd0, fd1, fd0, fd1);
}
    Thought lo1 = Thought337.getInstance(fo1, fo0, fo1, fo0, fd0, fd1, fd0, fd1);
    fd0 *= -1;
if(fo1 != null){
      fd1 = fo1.m3();
}
    boolean lb2 = true;
    boolean lb3 = false;
    boolean lb4 = false;
    Output.points[4][6] -= fd0;

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
    fb0 = !fb1;
    fb0 = fb1 || fb0;
    double ld0 = 81.96717286433292;
    fb1 = !fb0;
    fb1 = !fb0;
    fd0 = fd1 + ld0;
    fd0 *= -1;
    fd1 = ld0 + fd0;
    double ld1 = 745.6015913011549;
    fd0 = fd1 - ld0;
if(fo1 != null){
      fo0 = fo1.m4(fb1, fb0, fb1, fb0);
}
if(fo0 != null){
      ld1 = fo0.m3(fo1, fo0, fo1, fo0, fd0, fd1, ld0, ld1, fb1, fb0, fb1, fb0);
}
    fd0 *= -1;
if(fo0 != null){
      fo1 = fo0.m4(fd1, ld0, ld1, fd0, fb1, fb0, fb1, fb0);
}
    double ld2 = 403.675006343053;
    Thought lo3 = Thought154.getInstance(fo1, fo0, fo1, fo0, fb1, fb0, fb1, fb0);
    Output.points[4][7] += fd0;
    Output.points[4][8] -= fd1;
if(fo1 != null){
      fo1.m3(fo0, fo1, fo0, fo1);
}
    ld0 = ld1 - ld2;
if(fo1 != null){
      fo0 = fo1.m4(fd0, fd1, ld0, ld1);
}
    fb1 = fb0 && fb1;
    ld2 = fd0 + fd1;
    double ld4 = 724.5216395546796;
if(fo0 != null){
          ld0 = fo0.m3(fo1, fo0, fo1, fo0, ld1, ld2, ld4, fd0);
}
    Output.points[5][0] += fd1;

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
    fd0 = fd1 - fd0;
    fb0 = fb1 && fb0;
    fb1 = fb0 || fb1;
if(fo0 != null){
      fo1 = fo0.m4();
}
    boolean lb0 = false;
    fd1 = fd0 - fd1;
if(fo1 != null){
      fo1.m1(lb0, fb0, fb1, lb0);
}
    boolean lb1 = true;
    fd0 = fd1 + fd0;
if(fo0 != null){
      fo0.m2(fo1, fo0, fo1, fo0, fd1, fd0, fd1, fd0, lb1, fb0, fb1, lb0);
}
    Output.points[5][1] += fd1;
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
}
